/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

import java.util.Scanner;

/**
 *
 * @author Mery Padilla
 */
public class Ordenar_numeros {

    int a, b, c;//estas variables son las que serviran para poder ordenar las 3 entradas

    public void mayor_menor() {//como ya dije en metodos anteriores, este es el nombre del metodo por el cual llamare 
//        en la clase de Menu, del menu principal
        while (true) {
            Scanner mn = new Scanner(System.in);//como siempre el codigo scanner para poder capturar la entrada del teclado
            System.out.println("1.Ignresar numeros");
            System.out.println("2.Mostrar ordenados");
            System.out.println("3.Menú Principal");
            int omn = mn.nextInt();
            switch (omn) {
                case 1:
                    System.out.println("Ingresar los 3 números");//el switch para la eleccion, y luego el ingreso de los 3 numeros, seran 
//                    asignados a las variables del principio
                    Scanner num1 = new Scanner(System.in);
                    a = num1.nextInt();
//                    System.out.println("Ingresar segundo numero");
                    Scanner num2 = new Scanner(System.in);
                    b = num2.nextInt();
//                    System.out.println("Ingresar tercer numero");
                    Scanner num3 = new Scanner(System.in);
                    c = num3.nextInt();
                    break;
                case 2:
                    if (a > b && b > c && a > c) {//a traves de las permutaciones de 3P3 se que se haran 6 combinaciones, y asi he puesto
//                        6 casos tipo condicional para ordenar los numeros ingresados por el usuario
                        System.out.println("Mayor a menor: " + a + "," + b + "," + c);
                    } else if (a > c && c > b && a > b) {
                        System.out.println("Mayor a menor: " + a + "," + c + "," + b);
                    } else if (b > a && a > c && b > c) {
                        System.out.println("Mayor a menor: " + b + "," + a + "," + c);
                    } else if (b > c && c > a && b > a) {
                        System.out.println("Mayor a menor: " + b + "," + c + "," + a);
                    } else if (c > a && a > b && c > b) {
                        System.out.println("Mayor a menor: " + c + "," + a + "," + b);
                    } else if (c > b && b > a && c > a) {
                        System.out.println("Mayor a menor: " + c + "," + b + "," + a);
                    }
                    break;
                case 3:
                    Menu cualquiera = new Menu();//por ultimo, el llamado del metodo de menu principal
                    cualquiera.Menu_Principal();

            }
        }
    }
}

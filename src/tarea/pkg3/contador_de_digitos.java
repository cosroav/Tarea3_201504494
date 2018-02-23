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
public class contador_de_digitos {

    int numero2;

    public void ingresarnumero() {
        //esto es para guardar el valor de lo que fue ingresado
        while (true) {
            System.out.println("1.Igresar numero");
            System.out.println("2.Mostrar numero de digitos");
            System.out.println("3.Menu Principal");
            Scanner entrada = new Scanner(System.in);
            int numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    Scanner var = new Scanner(System.in);
                    numero2 = var.nextInt();
                    break;
                case 2:
                    if (numero2 >= 0 && numero2 <= 9) {
                        System.out.println("1 digito");
                    } else if (numero2 >= 10 && numero2 <= 99) {
                        System.out.println("2 digitos");
                    } else if (numero2 >= 100 && numero2 <= 999) {
                        System.out.println("3 digitos");
                    } else if (numero2 >= 1000 && numero2 <= 9999) {
                        System.out.println("4 digitos");
                    } else if (numero2 >= 10000 && numero2 <= 99999) {
                        System.out.println("5 digitos");
                    } else if (numero2 >= 100000 && numero2 <= 999999) {
                        System.out.println("6 digitos");
                    } else if (numero2 >= 10000000 && numero <= 99999999) {
                        System.out.println("Digito muy alto");
                    }
                    break;
                case 3:
                    Menu cualquiera = new Menu();
                    cualquiera.Menu_Principal();
            }

        }
    }
}



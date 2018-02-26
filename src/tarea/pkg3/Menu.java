/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

import static java.lang.System.exit;
import java.util.Scanner;// es to es para obtener la entrada al teclado es decir tomar el valor que se introduzca

/**
 *
 * @author Mery Padilla
 */
public class Menu {// esto es para darle nombre a la clase

    public void Menu_Principal() {// aqui cree el metodo para poder llamarla en la clase pricncipal del metodo main
        System.out.println("[IPC1]Tarea3_201504494");// todos estos son el menu principal, 
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de dígitos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        Scanner lector = new Scanner(System.in);//aqui es donde pongo el comando para tomar valores del teclado
        int seleccion = lector.nextInt();//esto es para asignar a una variable el valor de la entrada del teclado

        switch (seleccion) {//este sirve para hacer las seleccion entre las opciones del principio
                    //todos los case, son llamadas de los metodos de las opciones del menu, hice esto para no  saturar todo en una sola clase
            case 1:
                Usuarios otro2 = new Usuarios();
                otro2.Usuario();
                break;//utilize breaks para que el sistema deje de evaluar si se agarro una opcion
            case 2:
                contador_de_digitos otro = new contador_de_digitos();
                otro.ingresarnumero();
                break;
            case 3:
                Ordenar_numeros otro1 = new Ordenar_numeros();
                otro1.mayor_menor();
                break;
            case 4:
                Promedio otro4 = new Promedio();
                otro4.Obtener_Promedios();
                break;
            case 5:
                System.out.println("");
                exit(0);// este exit me si sirve para que el switch tenga un fin y no siga corriendo
                break;

        }
    }

}

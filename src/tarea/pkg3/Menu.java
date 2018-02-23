/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Mery Padilla
 */
public class Menu {

    public void Menu_Principal() {
        System.out.println("[IPC1]Tarea3_201504494");
        System.out.println("1.Usuarios");
        System.out.println("2.Contador de digitos");
        System.out.println("3.Tres numeros mayor");
        System.out.println("4.Calcular promedio");
        System.out.println("5.Salir");
        Scanner lector = new Scanner(System.in);
        int seleccion = lector.nextInt();

        switch (seleccion) {

            case 1:
                Usuarios otro2 = new Usuarios();
                otro2.Usuario();
                break;
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
                exit(0);
                break;

        }
    }

}

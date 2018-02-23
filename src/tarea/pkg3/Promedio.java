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
public class Promedio {

    String[] ID = new String[6];

    public void Obtener_Promedios() {
        while (true) {
            Scanner intro = new Scanner(System.in);
            System.out.println("1. Ingresa tu ID");
            System.out.println("2. Ingresar Notas");
            System.out.println("3. Mostrar Tabla");
            System.out.println("4. Menu Principal");
            int oh = intro.nextInt();
            switch (oh) {
                case 1:
                    ID[0] = "";
                    ID[1] = "";
                    ID[2] = "";
                    ID[3] = "";
                    ID[4] = "";
                    ID[5] = "";
                    Scanner read = new Scanner(System.in);
                    String in;

//                    for (int u = 0; u < usuario.length; u++) {
//                        System.out.println("Ingrese el ID" + (u + 1) + ":");
//                        in = "";
//                        in = read.nextLine();
//
//                        if (usuario[0].equals("")) {
//                            usuario[0] = in;
//                        } else {
//                            for (int x = 0; x < u; x++) {
//                                if (usuario[x].equals(in)) {
//                                    System.out.println("Invalido");
//                                    System.out.println("Ingrese el Usuario de nuevo");
//                                    in = "";
//                                    in = read.nextLine();
//                                    usuario[u] = in;
//                                } else {
//                                    usuario[u] = in;
//
//                                }
                                break;

                            }

                        }
                    }
            }
//        }
//    }
//}

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
public class Usuarios {

    String[] usuario = new String[5];

    public void Usuario() {
        while (true) {
            Scanner var = new Scanner(System.in);
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Usuarios Ascendentes");
            System.out.println("3. Mostrar Usuarios Descendentes");
            System.out.println("4. Menu Principal");
            int ajl = var.nextInt();
            switch (ajl) {
                case 1:
                    usuario[0] = "";
                    usuario[1] = "";
                    usuario[2] = "";
                    usuario[3] = "";
                    usuario[4] = "";
                    Scanner read = new Scanner(System.in);
                    String in;

                    for (int u = 0; u < usuario.length; u++) {
                        System.out.println("Ingrese el nombre del Usuario" + (u + 1) + ":");
                        in = "";
                        in = read.nextLine();

                        if (usuario[0].equals("")) {
                            usuario[0] = in;
                        } else {
                            for (int x = 0; x < u; x++) {
                                if (usuario[x].equals(in)) {
                                    System.out.println("Invalido");
                                    System.out.println("Ingrese el Usuario de nuevo");
                                    in = "";
                                    in = read.nextLine();
                                    usuario[u] = in;
                                } else {
                                    usuario[u] = in;

                                }
                            }
                        }
                    }
                    break;
                case 2:
                    for (int as = 4; as <= usuario.length && as >= 0; as--) {
                        System.out.println(usuario[as]);
                    }
                    break;
                case 3:
                    for (int des = 0; des < usuario.length; des++) {
                        System.out.println(usuario[des]);
                    }
                    break;
                case 4:
                    Menu cualquiera = new Menu();
                    cualquiera.Menu_Principal();
                    break;
            }

        }
    }

}

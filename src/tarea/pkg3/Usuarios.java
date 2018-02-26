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

    String[] usuario = new String[5];//aqui cree el arreglo, un vector de 5 para los 5 usuarios que se ingresaran, los he puesto hasta 
//    para que tengan validez en todos los case, como decir una variable general

    public void Usuario() {// aqui otra vez el metodo, para poder llamar el metodo en la clase Menu
        while (true) {//este while me sirve para que el sistema siga coriendo aun cuando ya se haya acabado su recorrido, es como despues que 
//            ya se mostro los resultados, que siga por si el usuario quiere de nuevo calcular o ingresar
            Scanner var = new Scanner(System.in);
            System.out.println("1. Ingresar Usuarios");// aqui el menu, de usuarios, 
            System.out.println("2. Mostrar Usuarios Ascendentes");
            System.out.println("3. Mostrar Usuarios Descendentes");
            System.out.println("4. Menú Principal");
            int ajl = var.nextInt();
            switch (ajl) {
                case 1:
                    usuario[0] = "";//estos son los valores del arreglo que se hizo, al pirncipio
                    usuario[1] = "";
                    usuario[2] = "";
                    usuario[3] = "";
                    usuario[4] = "";
                    Scanner read = new Scanner(System.in);
                    String in;// he asigando una variable para que pueda leer la entrada al teclado y luego asignarla a cada usuario, a cada arreglo

                    for (int u = 0; u < usuario.length; u++) {//utilize un ciclo for para que se ingrese cada usuariom el .lenght ayuda para no escribir de nuevo
//                        el tamaño del vector
                        System.out.println("Ingrese el nombre del Usuario " + (u + 1) + ":");
                        in = "";//limpio la variable para que el nuevo usuario pueda ingresar, la inicializo 
                        in = read.nextLine();

                        if (usuario[0].equals("")) {//entonces aqui es la condicion si el usuario 0 no tiene valor que le asigne el de la variable in, la cual 
//                            tiene la entrada del taclado
                            usuario[0] = in;
                        } else {//y si sucede que que el usuario 1 o cualquier, es igual que el usuario 0 o cualquier, entonces marcara Invalido,
//                            todo en un ciclo parecido al anterior, solo que aqui ocupe el parametro .equals, que es decir igual a
                            for (int x = 0; x < u; x++) {
                                if (usuario[x].equals(in)) {
                                    System.out.println("Inválido");
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
                    for (int as = 4; as <= usuario.length && as >= 0; as--) {//este ciclo me sirve para que los usuario que han sido ingresados
//                        puedan ser ordenados de manera ascendente o en otras palabras de manera inversa a la que se ingresaron
                        System.out.println(usuario[as]);
                    }
                    break;
                case 3:
                    for (int des = 0; des < usuario.length; des++) {//parecido al for anterior, este me sirve para que los usuarios sean ordenados
//                        de manera descendente o de manera igual a la que fueron ordenados
                        System.out.println(usuario[des]);
                    }
                    break;
                case 4:
                    Menu cualquiera = new Menu();
                    cualquiera.Menu_Principal();// este case es para llamar el metodo del menu primcipal, y asi poder hacer otras operaciones
                    break;
            }

        }
    }

}

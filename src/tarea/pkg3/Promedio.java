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

    
    int fila;//si se que son muchas variables, pero estas variables las ulilize en case 1 y case 2 por lo tanto, tuve que hacerlas generales
    int columna;//esta variable es para la posicion de la columna y fila de caso 2 de la matriz de alumnos
    int contador = 1;//esto es para que pueda seguir moviendose de posicion y asi ingresar nuevos valores a la matriz
    int matriz[][] = new int[6][6];//este es el arreglo de la matriz 6 por 6
    int calif[] = new int[4];//hice un arreglo para las calificacione de vector tamaño 4
    int calif1[] = new int[4];
    int calif2[] = new int[4];
    int calif3[] = new int[4];
    int calif4[] = new int[4];
    int calif5[] = new int[4];
    int promedio;//y declare una variable para cada promedio y asi poder ingresarlo en la matriz
    int promedio1;
    int promedio2;
    int promedio3;
    int promedio4;
    int promedio5;
    int[] ID = new int[6];//este es el arreglo para el ingreso de los usuarios

    public void Obtener_Promedios() {
        while (true) {//aqui esta el menu, el cual creo que seria lo mas indicado , y el while para que se haga un ciclo y no pare cuando llegue al ultimo case
            Scanner intro = new Scanner(System.in);
            System.out.println("1. Ingresar el ID");//las opciones del menu interno, dicidi que fueran solo tres, porque las notas y promedio iran implicitamente
            System.out.println("2. Mostrar Tabla de calificaciones");
            System.out.println("3. Menú Principal");
            int oh = intro.nextInt();
            switch (oh) {
                case 1:
                    Scanner input = new Scanner(System.in);/*aqui fue muy extenso mi metodo, pero primero hice la entrada del teclado
                            para que pudiera ingresar el id del usuario, luego de que el usuario ingresara su id puse que el usuario, ingresara
                            sus notas, esto lo hice de la misma manera en que se ingresaron los usuarios, y conjunto a un ciclo for, para
                            que pudiera obtener la suma de las cuatro y hacer el calculo de promedio; para ello declare un promedio por usuario
                            y declare suma como variable para guardar el valor de las cuatro calificaciones sumadas
                            por ultimo se le muestra el promedio al usuario de sus cuatro notas*/

                    System.out.println("Ingresar ID 1");
                    ID[0] = input.nextInt();
                    
                    Scanner into = new Scanner(System.in);
                    int suma = 0;
                    System.out.println("Ingrese sus 4 notas");

                    calif[0] = into.nextInt();
                    calif[1] = into.nextInt();
                    calif[2] = into.nextInt();
                    calif[3] = into.nextInt();
                    for (int j = 0; j < calif.length; j++) {/* este ciclo for es cuando j es 0 esto quiere decir que esta en la posicion 0 ó primera posicion
                        y j es menor que la longitud del vector calif, entonces j tendria un incremento, y esto es para que es ususario pueda ingresar sus
                        notas y poder ser guardadas en el arreglos y luego ser promediadas*/
                        suma += calif[j];
                    } promedio = (suma / calif.length);/*este es la operacion para obtener el promedio que es cociente entrela suma de las calificaciones
                    y la longitud del vector y eso seria igual al promedio*/
                    System.out.println("El promedio de tus calificaciones es de: " + promedio);
                       /*todo este "metodo" lo he repetido por cada usuario, por lo tanto hay 2 arreglos por usuario y son 6 en total son 12 
                    areglos que he utilizado para el case 1*/
                    
                    System.out.println("Ingresar ID 2");
                    ID[1] = input.nextInt();
                    
                    System.out.println("Ingrese sus 4 notas");
                    suma = 0;

                    calif1[0] = into.nextInt();
                    calif1[1] = into.nextInt();
                    calif1[2] = into.nextInt();
                    calif1[3] = into.nextInt();
                    for (int k = 0; k < calif1.length; k++) {
                        suma += calif1[k];
                    }promedio1 = (suma / calif1.length);
                    System.out.println("El promedio de tus calificaciones es de:" + promedio1);
                    
                    
                    System.out.println("Ingresar ID 3");
                    ID[2] = input.nextInt();
                    
                    suma = 0;
                    System.out.println("Ingrese sus 4 notas");

                    calif2[0] = into.nextInt();
                    calif2[1] = into.nextInt();
                    calif2[2] = into.nextInt();
                    calif2[3] = into.nextInt();
                    for (int k = 0; k < calif1.length; k++) {
                        suma += calif2[k];
                    }promedio2 = (suma / calif2.length);
                    System.out.println("El promedio de tus calificaciones es de:" + promedio2);
                    
                    
                    System.out.println("Ingresar ID 4");
                    ID[3] = input.nextInt();
                    
                    suma = 0;
                    System.out.println("Ingrese sus 4 notas");

                    calif3[0] = into.nextInt();
                    calif3[1] = into.nextInt();
                    calif3[2] = into.nextInt();
                    calif3[3] = into.nextInt();
                    for (int k = 0; k < calif3.length; k++) {
                        suma += calif3[k];
                    }promedio3 = (suma / calif3.length);
                    System.out.println("El promedio de tus calificaciones es de:" + promedio3);
                    
                    
                    System.out.println("Ingresar ID 5");
                    ID[4] = input.nextInt();
                    
                    suma = 0;
                    System.out.println("Ingrese sus 4 notas");

                    calif4[0] = into.nextInt();
                    calif4[1] = into.nextInt();
                    calif4[2] = into.nextInt();
                    calif4[3] = into.nextInt();
                    for (int k = 0; k < calif4.length; k++) {
                        suma += calif4[k];
                    }promedio4 = (suma / calif4.length);
                    System.out.println("El promedio de tus calificaciones es de:" + promedio4);

                    
                    System.out.println("Ingresar ID 6");
                    ID[5] = input.nextInt();
                    
                    suma = 0;
                    System.out.println("Ingrese sus 4 notas");

                    calif5[0] = into.nextInt();
                    calif5[1] = into.nextInt();
                    calif5[2] = into.nextInt();
                    calif5[3] = into.nextInt();
                    for (int k = 0; k < calif5.length; k++) {
                        suma += calif5[k];
                    }promedio5 = (suma / calif5.length);
                    System.out.println("El promedio de tus calificaciones es de:" + promedio5);
                    break;

                case 2:

                    int alumno1[] = {ID[0], calif[0], calif[1], calif[2], calif[3], promedio};/*la matriz de este arreglo la he declarado al principio
                    pero como como es del tipo int, solo podia colocar variables del tipo int por ello es que los id solo pueden ser numeros
                    
                    pero cada int de alumno desde el 1 hasta el 6 tiene entre sus valores el id del usuario, las 4 calificaciones, y por ultimo el 
                    promedio en la ultima columna, por ellos es que tanta variable en verde, porque no se puede dejar espacios en blanco a la 
                    hora de hacer el poner mostrar la matriz de forma matricial, valga la redundancia
                    por ellos es que cada alumno tiene las variables correspondientes de cada usuario desde el 1 hasta 6 */
                    int alumno2[] = {ID[1], calif1[0], calif1[1], calif1[2], calif1[3], promedio1};
                    int alumno3[] = {ID[2], calif2[0], calif2[1], calif2[2], calif2[3], promedio2};
                    int alumno4[] = {ID[3], calif3[0], calif3[1], calif3[2], calif3[3], promedio3};
                    int alumno5[] = {ID[4], calif4[0], calif4[1], calif4[2], calif4[3], promedio4};
                    int alumno6[] = {ID[5], calif5[0], calif5[1], calif5[2], calif5[3], promedio5};

                    for (fila = 0; fila < matriz.length; fila++) {/**bueno con este ciclo for me sirve para darme la posicion en la matriz y agregarle un
                     resultado, por ejemplo cuando fila es 0 y esta es menor que la longitud de la matriz, fila aumenta 1 sale de esa statement, y entra 
                     a otro for que ahora determinara la posicion en la columna, usa el mismo statement que el de la fial, por lo tanto tendra al 
                     principio la posicion 0,0*/
                        for (columna = 0; columna < matriz.length; columna++) {
                            if (fila == 0) {/* aqui donde entra la condicion que si la fila es 0 entonces la matriz en la posicion fila, columna, 
                                retomando el ejemplo anterior de 0,0 sera igual a el valor declarado en el arreglo alumno1 lo que tiene en la columna 1
                                en este caso seria ID[1], y asi sera sucesivamente hasta que llene toda la fila*/
                                matriz[fila][columna] = alumno1[columna];
                            } else if (fila == 1) {/*y aqui sucedera lo mismo que el if anterior solo que ahora rellenara la fial 1 con sus respectivas
                                columnas y asi agrgando el ID luego las 4 notas y por ultimo el promedio de ellas, hasta que toda la matriz sea 
                                rellenada*/
                                matriz[fila][columna] = alumno2[columna];
                            } else if (fila == 2) {
                                matriz[fila][columna] = alumno3[columna];
                            } else if (fila == 3) {
                                matriz[fila][columna] = alumno4[columna];
                            } else if (fila == 4) {
                                matriz[fila][columna] = alumno5[columna];
                            } else if (fila == 5) {
                                matriz[fila][columna] = alumno6[columna];
                            }
                        }
                    }
                    for (fila = 0; fila < matriz.length; fila++) {/*por ultimo esta el este for, que me servira para imprimir la columna, y de manera
                        centrada, segun indica el  \t  y entonces se imprimira la matriz junto con todos los datos*/

                        for (columna = 0; columna < matriz.length; columna++) {
                            System.out.print("\t" + matriz[fila][columna] + " ");

                        }
                        System.out.println("");

                    }
                    break;
                case 3:
                    Menu cualquiera = new Menu();//por ultimo, el llamado del metodo de menu principal
                    cualquiera.Menu_Principal();


            }

        }
    }
}

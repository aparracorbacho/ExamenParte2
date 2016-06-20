package examenfinalparte2;

import java.util.Scanner;

public class Main {

    public static boolean mostrar = false;

    public static void main(String arg[]) {
        /*
         * cantidaddigitos corresponde a la cantidad de digitos maximo y minimo de los numeros que se van a mostrar, inicializamos la variable
         * cantidaddigitosmostrados es una variable que inicializamos y que usaremos a lo largo del programa
         */
        int cantidaddigitos = 0;
        int cantidaddigitosmostrados = 0;

        /*
         * Pedimos el numero de digitos que queremos
         */
        System.out.println("Introduce la cantidad de digitos de cada numero impar a mostrar");
        Scanner cantidaddigitosTeclado = new Scanner(System.in);
        cantidaddigitos = cantidaddigitosTeclado.nextInt();

        /*
         * Si el numero de digitos a mostrar es menor que 0 mostramos mensaje de error ya que no mostrara nada el programa
         */
        if (cantidaddigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        /*
         * Comenzamos un for para recorrer un maximo de 99999 numeros
         */
        for (int loops = 1; loops <= 99999; loops++) {
            /*
             * Llamamos al metodo contador de la clase metodos y le pasamos el numero de loops
             */
            cantidaddigitosmostrados = Metodos.contador(loops);

            /*
             * Si el numero de digitos que se van a mostrar es igual al numero de digitos que queremos
             * entrará en el if
             */
            if (cantidaddigitosmostrados == cantidaddigitos) {
                /*
                 * Si el numero de loop en el que nos encontramos es menor que 4
                 * @param mostrar será true y se mostrará el numero
                 */
                if (loops < 4) {
                    mostrar = true;
                } else {
                    /*
                     * Si el numero de loop en el que estamos es divisible entre dos y mayor que 3
                     * @param mostrar será false y no se mostrara ese numero
                     */
                    if (loops % 2 == 0) {
                        mostrar = false;
                    } else {
                        /*
                         * Si el numero del loop en el que estamos es impar y mayor que 3 entrara en el else 
                         * El metodo Metodo.contador2(loops) siempre devuelve true por lo que se podria omitir
                         */
                        mostrar = Metodos.contador2(loops);
                    }
                    /*
                     * Si mostrar es true se mostrara el numero
                     */
                    if (mostrar == true) {
                        System.out.println(loops);
                    }
                }
            }
        }

    }
}

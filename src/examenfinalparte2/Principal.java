package examenfinalparte2;

import java.util.Scanner;

public class Principal {

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
        System.out.println("Introduce la cantidad de digitos de cada numero");
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
        for (int i = 1; i <= 99999; i++) {
            int aux = i;
            
            /*
            * Llamamos al metodo contador de la clase metodos y le pasamos la variable aux
            */
            cantidaddigitosmostrados = metodos.contador(aux);
            
            /*
            * Si el numero de digitos que se van a mostrar es igual al numero de digitos que queremos
            * entrará en el if
            */
                   
            if (cantidaddigitosmostrados == cantidaddigitos) {
                /*
                * Si el numero de loop en el que nos encontramos es menor que 4
                * @param mostrar será true y se mostrará el numero
                */
                if (i < 4) {
                    mostrar = true;
                } else {
                    /*
                    * Si el numero de loop en el que estamos es divisible entre dos y mayor que 3
                    * @param mostrar será false y no se mostrara ese numero
                    */
                    if (i % 2 == 0) {
                        mostrar = false;
                    /*
                    * Si el numero del loop en el que estamos es impar y mayor que 3 entrara en el else    
                    */
                    } else {
                    
                       mostrar = metodos.contador2(i);
                }
                
                /*
                * Si mostrar es true se mostrara el numero
                */
                if (mostrar == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
}

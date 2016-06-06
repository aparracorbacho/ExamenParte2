package examenfinalparte2;

public class Principal {

    public static boolean mostrar = false;

    public static void main(String arg[]) {
        /*
        * cantidaddigitos corresponde a la cantidad de digitos maximo y minimo de los numeros que se van a mostrar
        * cantidaddigitosmostrados es una variable que inicializamos y que usaremos a lo largo del programa
        */
        int cantidaddigitos = 2;
        int cantidaddigitosmostrados = 0;
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
                        /*
                        * Definimos una variable1 contador y la inicializamos en 0
                        * 
                        */
                        int contador = 0;
                        int variable1 = 1;
                        /*
                        * Creamos una variable variable2 que será igual al numero de loop menos 1 dividido entre dos
                        */
                        int variable2 = (i - 1) / 2;
                        /*
                        * Si la variable variable es divisible entre dos, le restamos uno
                        */
                        if (variable2 % 2 == 0) {
                            variable2--;
                        }
                        
                        /*
                        * Si la variable variable1 es menor o igual que variable entramos en el while
                        */
                        while (variable1 <= variable2) {
                            /*
                            * Si el numero de loops es divisible entre id sumamos 1 al contador
                            */
                            if (i % variable1 == 0) {
                                contador++;
                            }
                            /*
                            * Sumamos dos a variable1
                            */
                            variable1 += 2;
                            /*
                            * Si el contador es igual a dos igualamos variable1 a variable mas uno
                            */
                            if (contador == 2) {
                                variable1 = variable2 + 1;
                            }
                        }
                        /*
                        * Si el contador es 1, colocamos mostrar igual a true
                        */
                        if (contador == 1) {
                            mostrar = true;
                        }
                    }
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

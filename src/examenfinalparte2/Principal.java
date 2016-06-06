package examenfinalparte2;

public class Principal {

    public static boolean mostrar = false;

    public static void main(String arg[]) {
        /*
        * cantidaddigitos corresponde a la cantidad de digitos maximo y minimo de los numeros que se van a mostrar
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
            * @param mostrar será true para mostrar el numero generado
            */
                   
            if (cantidaddigitosmostrados == cantidaddigitos) {
                if (i < 4) {
                    mostrar = true;
                } else {
                    /*
                    * Si el numero de digitos que se van a mostrar es igual al numero de digitos que queremos
                    * @param mostrar será true
                    */
                    if (i % 2 == 0) {
                        mostrar = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
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

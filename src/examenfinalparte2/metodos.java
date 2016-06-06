/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalparte2;

/**
 *
 * @author aparracorbacho
 */
public class metodos {
    /*
    * @param aux es la variable que se envia para comprobar si es o no distinta a 0 y aumentar el contador
    */
    public static int contador(int aux){
            /*
            * Colocamos el contador a cero
            */
            int contador = 0;
            
            /*
            * Si la variable aux que corresponde al numero de loops que llevamos es distinta de cero
            * Dividimos la variable aux entre 10 y agregamos 1 al contador
            */
            while (aux != 0) {
                aux = aux / 10;
                contador++;
                
            }
            return contador;
    }
}

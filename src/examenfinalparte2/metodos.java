/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalparte2;

import static examenfinalparte2.Principal.mostrar;


/**
 *
 * @author aparracorbacho
 */
public class metodos {
    public static boolean mostrar = false;
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
            * Dividimos la variable aux entre 10 y agregamos 1 al contador hasta que aux sea 0
            */
            while (aux != 0) {
                aux = aux / 10;
                contador++;
                
            }
            return contador;
    }
    
    /*
    * @param i Introducimos el numero de loop en el que nos encontramos
    */
    public static boolean contador2(int i){
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
                        return mostrar;
                    }
    
    }
    
    


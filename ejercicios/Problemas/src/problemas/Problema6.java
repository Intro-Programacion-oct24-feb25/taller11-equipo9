/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {
        
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        
        int media = mediaAritmetica(informacion);
        
        System.out.printf("La media del arreglo es: %d\n", media);
        
    }
    
    public static int mediaAritmetica(int [] media) {
        
        int suma = 0;
        int promedio;
        
        for (int i = 0; i <= media.length; i++) {
            suma = suma + media[i];
        }
        // promedio = suma/media.length;
        return suma;
    }
}

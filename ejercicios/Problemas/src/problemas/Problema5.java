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
public class Problema5 {

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion3 = new int[3][3];
        
        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[i].length; j++) {
                informacion3[i][j] = obtenerSuma(informacion[i][j], 
                        informacion2[i][j]);
            }
        }

        String mensaje1 = obtenerReporte(informacion);
        String mensaje2 = obtenerReporte(informacion2);
        String mensaje3 = obtenerReporte(informacion3);
        
        System.out.printf("%s\t" + "\n%s\t" + "\n%s\t", mensaje1,
                mensaje2, mensaje3);
        
    }

    public static String obtenerReporte(int[][] arreglo) {
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        return cadena;
    }   
    
    public static int obtenerSuma (int a, int b){
        int operacion;
        operacion = a + b;
        
        return operacion;
    }
}

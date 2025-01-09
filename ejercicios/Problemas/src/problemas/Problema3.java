/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        String mensaje = "";

        System.out.println("Ingrese la nota 1");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese la nota 2");
        nota2 = entrada.nextInt();
        System.out.println("Ingrese la nota 3");
        nota3 = entrada.nextInt();
        System.out.println("Ingrese la nota 4");
        nota4 = entrada.nextInt();

        mensaje = obtenerPromedio(nota1, nota2, nota3, nota4);
        mensaje = String.format("El promedio de las notas" + nota1 + ", "
                + nota2 + ", " + nota3 + ", " + nota2 + " es " + mensaje);
        System.out.printf("%s\n", mensaje);
    }

    public static String obtenerPromedio(double a, double b, double c, double d) {
        
        double promedio;
        double suma;
        String mensaje = "";

        suma = a + b + c + d;
        promedio = suma / 4;

        if (promedio >= 0 && promedio
                <= 5) {
            mensaje = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                mensaje = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    mensaje = "Muy bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        mensaje = "Sobresaliente";
                    }
                }
            }
        }
        return mensaje;
    }
}

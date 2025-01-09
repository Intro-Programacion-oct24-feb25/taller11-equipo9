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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int area;

        System.out.println("Ingrese el número de la figura (1 para cuadrado),"
                + " (2 para triángulo), (3 para rectangulo)");
        area = entrada.nextInt();

        if (area == 1) {
            obtenerAreaCuadrado();
        } else {
            if (area == 2) {
                obtenerAreaTriangulo();
            } else {
                if (area == 3) {
                    obtenerAreaRectangulo();
                }
            }
        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int area;
        int lado;
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado = entrada.nextInt();
        
        area = lado * lado;
        
        System.out.printf("El área del cuadrado es: %d\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        int area;
        int base;
        int altura;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextInt();
        
        area = (base * altura)/2;
        
        System.out.printf("El área del triángulo es: %d\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int area;
        int base;
        int altura;
        
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextInt();
        
        area = base * altura;
        
        System.out.printf("El área del rectangulo es: %d\n", area);
    }

}

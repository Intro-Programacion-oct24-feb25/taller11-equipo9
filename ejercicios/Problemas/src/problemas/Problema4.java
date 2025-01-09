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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String cedula;
        int tipo;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cédula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese 1 para calcular el valor de luz y  2 "
                + "para calcular el predio");
        tipo = entrada.nextInt();
        
        if (tipo == 1){
            calcularValorLuz(nombre, cedula);
        } else {
            if (tipo == 2){
                calcularPredio(nombre, cedula);
            }
        }
    }
    
    public static void calcularValorLuz(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroK;
        int valorK;
        int proceso;
        String mensaje;
        
        System.out.println("Ingrese el número de kilowatios consumidos");
        numeroK = entrada.nextInt();
        System.out.println("Ingrese el valor del kilowatio");
        valorK = entrada.nextInt();
        
        proceso = numeroK * valorK;
        
        mensaje = "Cliente " + n + " con cédula " + c + " debe cancelar el "
                + "valor de $" + proceso;
        
        System.out.printf("%s\n", mensaje);
    }
    
    public static void calcularPredio(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        
        int valorI;
        double proceso;
        String mensaje;
        
        System.out.println("Ingrese el valor del inmueble");
        valorI = entrada.nextInt();
        
        proceso = valorI * 0.2;
        
        mensaje = "Cliente " + n + " con cédula" + c + " tiene un bien inmueble"
                + " valorado en $ " + valorI + " y tiene que pagar de predio $"
                + proceso;
        
        System.out.printf("%s\n", mensaje);
    }
}

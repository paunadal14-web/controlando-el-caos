package projecte_java;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear objeto Scanner para leer del teclado
        
        System.out.println("=== Calculadora Básica ===");
        
        // Pedir los números al usuario
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        
        // Controlar la división por cero
        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("División: No se puede dividir entre 0");
        }
        
        sc.close();
    }
}



package projecte_java;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double a, b, resultado = 0;

        System.out.println("=== Calculadora Básica ===");

        // Pedir los números
        System.out.print("Introduce el primer número: ");
        a = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        b = sc.nextDouble();

        // Mostrar menú
        System.out.println("\nElige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada del primer número");

        System.out.print("\nOpción: ");
        opcion = sc.nextInt();

        // Ejecutar la operación
        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println("Resultado (suma): " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("Resultado (resta): " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("Resultado (multiplicación): " + resultado);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado (división): " + resultado);
                }
                break;
            case 5:
                resultado = Math.pow(a, b);
                System.out.println("Resultado (potencia): " + resultado);
                break;
            case 6:
                if (a < 0) {
                    System.out.println("Error: no se puede calcular la raíz de un número negativo.");
                } else {
                    resultado = Math.sqrt(a);
                    System.out.println("Resultado (raíz cuadrada): " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
        System.out.println("\nGracias por usar la Calculadora Básica!");
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



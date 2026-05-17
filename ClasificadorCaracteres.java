/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasificadorCaracteres;

/**
 *
 * @author riosc
 */import java.util.Scanner;

/**
 * Programa para clasificar caracteres.
 * Autor: Carlos Eduardo Medrano Santiago
 */
public class ClasificadorCaracteres {

    public static void main(String[] args) {
        // Inicializamos el Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("      Clasificador de Caracteres     ");
        System.out.println("=====================================");
        System.out.print("Introduce un carácter: ");
        
        // Leemos el texto ingresado y tomamos solo el primer carácter
        char caracter = scanner.next().charAt(0);
        
        System.out.println("\n--- Resultado de la Depuración ---");
        
        // Estructura de control para clasificar el carácter
        if (Character.isLetter(caracter)) {
            // Si es una letra, la convertimos a minúscula para facilitar la comparación
            char letra = Character.toLowerCase(caracter);
            
            // Verificamos si la letra está dentro de la cadena de vocales
            if ("aeiou".indexOf(letra) != -1) {
                System.out.println("El carácter '" + caracter + "' es una VOCAL.");
            } else {
                System.out.println("El carácter '" + caracter + "' es una CONSONANTE.");
            }
            
        } else if (Character.isDigit(caracter)) {
            // Si no es letra, verificamos si es un número del 0 al 9
            System.out.println("El carácter '" + caracter + "' es un DÍGITO.");
            
        } else {
            // Si no es letra ni número, por descarte es un carácter especial
            System.out.println("El carácter '" + caracter + "' es un CARÁCTER ESPECIAL.");
        }
        
        // Cerramos el scanner por buenas prácticas
        scanner.close();
    }
}
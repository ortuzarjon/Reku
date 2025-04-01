package base;

import java.util.Scanner;

public class JonOrtuzar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] palabras = {"java", "eclipse", "programacion", "codigo", "desarrollo"};
        String secreto = palabras[(int) (Math.random() * palabras.length)];
        int intentos = 0;
        String palabra;
        
        System.out.println("¡Bienvenido al juego de adivinanza de palabras!");
        System.out.println("Intenta adivinar la palabra secreta (o escribe 'salir' para terminar):");
        
        palabra = input.nextLine().toLowerCase();
        while (!palabra.equals(secreto) && !palabra.equals("salir")) {
            intentos++;
            System.out.println("Incorrecto. Intenta de nuevo:");
            palabra = input.nextLine().toLowerCase();
        }
        
        if (palabra.equals(secreto)) {
            System.out.println("¡Felicidades! Acertaste tras " + (intentos + 1) + " intentos.");
        } else {
            System.out.println("Juego terminado. La palabra secreta era " + secreto);
        }
        
        input.close();
    }
}
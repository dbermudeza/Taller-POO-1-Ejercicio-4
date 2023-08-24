package com.mycompany.pootaller1ej4;
//Este codigo lee un número dado y devuelve su cuadrado y su cubo

import java.util.Scanner;

public class POOtaller1ej4 {

    public static void main(String[] args) {
        float x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de x:");
        x = entrada.nextFloat();
        System.out.println("El cuadrado de x es: " + Math.pow(x, 2));
        System.out.println("El cubo de x es: " + Math.pow(x, 3));
    }
}

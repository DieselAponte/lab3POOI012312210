
package javaapplication4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        // Solicitar al usuario que ingrese un numero N
       do{
        try {
        System.out.print("Ingresa un numero: ");
        int N = scanner.nextInt();

        // Verificar si N está dentro del rango
        
        if (N >= 2 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                int resultado = N * i;
                System.out.println(N + " x " + i + " = " + resultado);
            }       
        } else {
            System.out.println("El numero ingresado esta fuera del rango");            
        }
        } catch(Exception e){
            System.out.println("Coloque un numero");
            scanner.nextLine();
        }
       }while(continuar);
    }
}

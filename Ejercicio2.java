
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        double conteo = 0;
        while (true) {
            System.out.println("Ingresa un numero (Si quieres parar pon -1): ");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            suma = suma + num;
            conteo++;
        }
        
        
        double promedio = suma / conteo;
        System.out.println("La suma total de los " + conteo + " numeros ingresados es " + suma);
        System.out.println("El promedio de los " + conteo + " numeros ingresados es " + promedio);
    }
}
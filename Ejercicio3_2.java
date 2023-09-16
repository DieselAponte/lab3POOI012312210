
package ejercicio.pkg3;

import java.util.Scanner;
public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (count < 10) {
            System.out.println(count + " " + Math.sqrt(count));
            count++;
        }
    }
}

      
 //Se inicializa una variable llamada count con el valor 1.
//Se inicia un bucle while que se ejecutará mientras la variable count sea menor que 10.
//En cada iteración del bucle, se imprime en la consola el valor de count y la raíz cuadrada de count calculada utilizando Math.sqrt(count). La función Math.sqrt se utiliza para calcular la raíz cuadrada de un número en Java.
//Se incrementa el valor de count en 1 en cada iteración del bucle.
//El bucle continuará ejecutándose hasta que count sea igual o mayor que 10.
    
package ejercicio.pkg3;

import java.util.Scanner;
public class Ejercicio3_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero: ");
        int count = scanner.nextInt();
        do {
            System.out.println(count + " " + Math.sqrt(count));
            count++;
        } while (count < 10);
    }
}

//Se importa la clase Scanner para permitir la entrada de datos desde el teclado.

//Se crea una instancia de Scanner llamada scanner para leer la entrada del usuario.

//Se muestra el mensaje "Numero: " en la consola, solicitando al usuario que ingrese un número.

//Se utiliza scanner.nextInt() para leer un número entero ingresado por el usuario y se almacena en la variable count.

//Se inicia un bucle do-while con la siguiente condición: count < 10. Esto significa que el bucle continuará ejecutándose mientras el valor de count sea menor que 10.

//Dentro del bucle do-while, se ejecutan las siguientes instrucciones en cada iteración:

// Se utiliza System.out.println(count + " " + Math.sqrt(count)); para imprimir en la consola el valor actual de count y su raíz cuadrada calculada utilizando Math.sqrt(count). Esto muestra una línea que contiene el número y su raíz cuadrada.

// Luego, se incrementa el valor de count en 1 unidad utilizando count++. Esto aumenta el valor de count para la siguiente iteración del bucle.

//El bucle do-while continuará ejecutándose mientras la condición count < 10 sea verdadera.

//Una vez que count alcanza el valor de 10 o más, la condición count < 10 ya no es verdadera, y el bucle se detiene.
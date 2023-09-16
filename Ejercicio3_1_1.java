/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio3_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Importamos la herramienta Scanner para poder ingresar datos
        Scanner valores = new Scanner(System.in);
        //Inicializamos la x variable de tipo entero
        int x;
        System.out.println("Ingrese el numero de y: ");
        //Permitimos gracias al Scanner que el usuario pueda ingresar el numero  
        //que desee,imprimiendo el mensaje "Ingrese el numero de Y: "
        int y = valores.nextInt();
        //Inicializamos la variable Y de tipo entero 
        for (int i = 0; i < 10; i++) {
            //Se crea un for que su inicialización es la variable i = 0
            //La expresión logica o condición sentencia que i < 10
            //Y por ultimo el incremento unitario cada vez que llegue a iterar
            x = 2 * i - 10;
            if (x<0)
                // La variable x debe de ser menor para proceder a la siguiente 
                //operación
                x = (-1) * x;
            System.out.println(x + " " + y);
            //El compilador imprime el valor de x con un espacio y el valor de y
        }

    }
}

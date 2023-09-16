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
public class Ejercicio3_1_2 {

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
        //Inicializamos a variable y de tipo entero
        int i = 0;
        //Declaramos la variable i de tipo entero y le damos el valor 0
        do {
        //la palabra "do" indica el primer proceso que se ejecutara antes de 
        //que se evalue la expresión logica
            x = 2 * i - 10;
            if (x < 0) 
            // La variable x debe de ser menor para proceder a la siguiente 
            //operación
            {
                x = (-1) * x;
            }
            System.out.println(x + " " + y);
            //El compilador imprime el valor de x con un espacio y el valor de y
            i++;
            //Incremento unitario
        } while (i < 10);
        //Expresión logica que declara que mientras i menor que 10 seguira 
        //iterando
        } default{
            System.out.println("el valor ingresado no es valido, coloque un numero entero");}
    
    }

    

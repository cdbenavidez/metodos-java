//1. Imprimir nombre: Crea un método llamado 
//imprimeNombre() que reciba por parámetro un nombre y 
//luego imprima el mensaje "Mi nombre es [nombre]". 
//Invocar dicho método desde el método main para ver 
//el mensaje por consola

import java.util.Scanner;

public class imprimirNombre {
 public static void main(String[] args) {
    String nombre = obtenerNombre(args);
    System.out.println("mi nombre es "+ nombre);
 } 
 public static String obtenerNombre(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ingrese nombre");
    String nombre = sc.nextLine();
    sc.close();
    return nombre;
 } 
}

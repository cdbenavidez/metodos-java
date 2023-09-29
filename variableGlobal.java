import java.util.Scanner;
//2. Usar una variable global: Modifica los métodos 
//"obtenerNombre()" y "obtenerEdad()" para que no 
//necesiten recibir el Scanner por parámetro. En su 
//lugar, utiliza una variable global para acceder al 
//Scanner y obtener los datos necesarios.

public class variableGlobal {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerNombre(sc);
        int edad = obtenerEdad(sc);
        System.out.println("mi nombre es " + nombre + " y mi edad es " + edad);
    }

    private static String obtenerNombre(Scanner sc) {

        System.out.println("ingrese nombre");
        String nombre = sc.nextLine();

        return nombre;
    }

    private static int obtenerEdad(Scanner sc) {
        System.out.println("ingrese su edad");
        int edad = sc.nextInt();
        return edad;
    }
}

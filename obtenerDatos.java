import java.util.Scanner;
//1. Obtener datos: Crea dos métodos para obtener el
// nombre y la edad, respectivamente. Ambos métodos 
//deben recibir por parámetro un objeto de tipo "Scanner".

public class obtenerDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

import java.util.Scanner;
//2. Imprimir nombre y edad: Crea el método
// imprimeNombreYEdad(String nombre, int edad) que 
//reciba dos parámetros, el nombre y la edad, y luego
// imprima el mensaje "Me llamo [nombre] y tengo [edad] 
//años"
public class imprimirNombreyEdad {
    public static void main(String[] args) {
          String nombreyApellido = obtenerNombreyEdad(args);
    System.out.println("mi nombre es "+ nombreyApellido);
 } 
 private static String obtenerNombreyEdad(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ingrese nombre");
    String nombre = sc.nextLine();
    System.out.println("ingrese su edad");
int edad = sc.nextInt();
    sc.close();
    return nombre +" y mi edad es  "+ edad;
 } 
    }

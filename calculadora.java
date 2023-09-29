import java.util.Scanner;
//Calculadora: Vuelve a realizar el ejercicio de la 
//calculadora, pero esta vez crea un método llamado 
//"menu()" que no reciba ningún parámetro y se encargue 
//de generar la lógica de mostrar el menú de opciones 
//y producir el bucle para seguir mostrando el menú 
//hasta seleccionar la opción de "salir". Solicita dos 
//números al usuario y realiza la operación matemática 
//seleccionada, teniendo en cuenta las validaciones
// necesarias como la división por cero.

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero ;
        int numero2 ;
        int opcion ;

        System.out.println("ingrese un numero");
            numero = sc.nextInt();
        System.out.println("ingrese otro numero");
            numero2 = sc.nextInt();
            opcion = menu(sc);
            operaciones(numero, numero2, opcion);

        sc.close();
    }

    public static int menu(Scanner sc){
        System.out.println("eliga una opcion ");
         System.out.println("1- suma");
            System.out.println("2- resta");
            System.out.println("3- multiplicacion");
            System.out.println("4- division");
            System.out.println("5- salir");
          return sc.nextInt();
    }

    public static void operaciones(int numero , int numero2, int opcion ){

    
            switch (opcion) {
                case 1:
                    System.out.println("la suma de "+ numero + " + "+numero2 +" es igual a  " +(numero+numero2));
                  break;
                  case 2:
                    System.out.println("la resta de "+ numero + " - "+numero2 +" es igual a  " +(numero-numero2));
                  break;
                  case 3:
                    System.out.println("la multiplicacion de "+ numero + " * "+numero2 +" es igual a  " +(numero*numero2));
                  break;
                  case 4:
                    if(numero2 !=0){
                        System.out.println("la division de "+ numero + " / "+numero2 +" es igual a  " +(numero/numero2));
                    }else{
                        System.out.println("el numero no se puede dividir por 0");
                    }
                        break;            
                default:
                System.out.println("seleccione una opcion valida");
                    break;
            }
    }
}

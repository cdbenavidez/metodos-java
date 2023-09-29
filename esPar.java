import java.util.Scanner;
//Es par: Reemplaza la lógica de pedir un número por un 
//método llamado "solicitarNumero()" que no reciba 
//parámetros y devuelva un entero. También reemplaza la 
//condición del if por un método llamado "esPar()" que 
//reciba por parámetro un entero y devuelva un booleano.

public class esPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero = solicitarNumero();
        if(EsPar(numero)){
            System.out.println("el "+ numero +" es par");
            sc.close();
        }else {
            System.out.println("el "+ numero + " ingresado es inpar");
        }
    }
    public static Integer solicitarNumero(){
        Scanner sc = new Scanner(System.in);
        Integer numero = null;
        System.out.println("por favor ingrese un numero");
        do{
            try{
                numero = sc.nextInt();
            } catch(Exception e){
                sc.nextLine();
                System.out.println("no ingreso un numero intentelo nuevamente");
            }sc.close();
            } while(numero == null);
            return numero;
           
        }
        public static boolean EsPar(int numero){
                return numero % 2 == 0 ;
                
        } 
    }




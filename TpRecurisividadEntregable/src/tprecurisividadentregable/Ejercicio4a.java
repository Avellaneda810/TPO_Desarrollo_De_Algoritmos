/*
 * a) Escribir los algoritmos recursivos necesarios para que dado un número entero y un carácter,
    genere las siguientes pirámides de caracteres:
	Por ejemplo: si n =4 y el caracter es un * (asterisco)
        a) Pirámide 1  b) Pirámide 2  c) Pirámide 3
             *             ****          *
             **             ***          ***  
             ***             **          *****
             ****             *          *******                                                 */
package tprecurisividadentregable;

/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class Ejercicio4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* dado un número entero y un carácter, genere las siguientes pirámides de caracteres:
        Por ejemplo: si n =4 y el caracter es un * (asterisco)
        a) Pirámide 1  b) Pirámide 2  c) Pirámide 3
             *             ****         *
             **             ***         ***  
             ***             **         *****
             ****             *         *******                 */
        int n, i;
        char c;
        String [] piramide; 
        System.out.println("Ingrese la altura de la piramide");
        n = sc.nextInt();
        piramide = new String [n];
        System.out.println("Ingrese un caracter");
        c = sc.next().charAt(0); 
            System.out.println("Piramide 1: ");
            for(i=1;i<=n;i++){
                System.out.println(piramide(i,c));
            }
            System.out.println("Piramide 2: ");
            for(i=n;i>=1;i--){
                System.out.println(piramide(i,c));
            }
            System.out.println("Piramide 3: ");
            for(i=1;i<=n;i++){
                System.out.println(piramide3(i,c));
            }
    }
    public static String piramide(int num, char car){
        /*Retorna la piramide 1 
        por ejemplo: si n = 4 y el caracter es un * (asterisco):
        *
        **
        ***
        ****                                                   */
        String cad;
         if(num==1){
                cad=""+car;
            }else{
                cad = piramide(num-1,car)+car; 
            }
        return cad;
    }
    public static String piramide3( int num, char car){
        /*Retorna la piramide 3
        por ejemplo: si n =4 y el caracter es un * (asterisco):
        *
        ***
        *****
        *******                                               */
         String cad;
            if(num==1){
                cad= ""+car;
            }else{
                cad = car+" "+piramide3(num-1,car)+" "+car; 
            }
      return cad;
    }
}

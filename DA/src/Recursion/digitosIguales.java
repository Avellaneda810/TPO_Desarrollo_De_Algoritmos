package Recursion;

/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class digitosIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num, longitud;
        String numero;
        System.out.println("Ingrese un numero natural");
        num=sc.nextInt();
        numero = Integer.toString(num);
        longitud=numero.length();
        iguales(numero, longitud);
    }
    public static boolean  iguales(String num, int lon){
        //verifica si todos los dígitos del numero ingresado son iguales.
        boolean valor=false;
        int p, p2;
            if (lon==0){
                valor = true;
            }else if (lon>0){
                p=num.charAt(lon-1);
                p2=num.charAt(lon);
                if (p==p2 && p>=0){
                    valor=iguales(num, lon-1);
                }else{
                    valor = false;
                }
            }
        return valor;
    }
}

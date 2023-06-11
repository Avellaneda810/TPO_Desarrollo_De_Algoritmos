/*
 * 1)Con números enteros:
    c) Ejemplo
        Número dígito retorna 
        3024        0       1 
        1224        2       2
 */
package tpRecurisividadEntregable;

/**
 *
 * @author Angel 
 */
import java.util.Scanner;
public class Ejercicio1c {
    public static void main(String[] args) {
        //Dado un número y un dígito cuenta la cantidad de veces que aparece ese dígito en el número. 
        Scanner sc=new Scanner(System.in);
        int numero, digito, contador;
        
        System.out.println("Ingrese un numero entero positivo");
        numero = sc.nextInt();
        System.out.println("Ingrese un numero de un solo digito positivo y menor a 10");
        digito = sc.nextInt();
        if (digito>0&&digito<10){
            if(numero<0){
                numero=numero*(-1);
                contador = contarDigito(numero, digito);
                System.out.println("La cantidad de veces que aparece el digito en el numero ingresado es: "+contador);
            }else{
                contador = contarDigito(numero, digito);
                System.out.println("La cantidad de veces que aparece el digito en el numero ingresado es: "+contador);
            }
        }    
    }
    public static int contarDigito(int n, int d){
        //Retorna la cantidad de ocurrencias de un digito dentro de otro numero 
        int cont = 0, n2=0;
            if(n==d){
                cont = 1;
            }else if(n>10){
                n2 = n%10;
                if(n2==d){
                    n = n/10;
                    cont = contarDigito(n, d) +1;
                }else{
                    n = n/10;
                    cont = contarDigito(n,d);
                }
            }
        return cont;        
    }
}

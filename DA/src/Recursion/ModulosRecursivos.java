package Recursion;

/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class ModulosRecursivos {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aplicar modulos!
         Scanner sc= new Scanner (System.in);
        int a, b, c, d;
        
        System.out.println("Ingrese un numero numero");
            d = sc.nextInt();
                if (d>0){
                        System.out.println(func(d));
               
                }
        System.out.println("ingrese un numero");
            a= sc.nextInt();
                m1(a);
            
            System.out.println("ingrese un numero");
            b= sc.nextInt();
                m2(b);
                
                System.out.println("ingrese un numero");
                c= sc.nextInt();
                    System.out.println(contarDigito(c));
                    
                    
    }
    
    public static void m1(int i){
        //Si i es igual a 3 entonces muestra la recursion 3 2 1 por ejemplo.
        if (i>0){
            System.out.println(""+i);
            m1(i-1); 
        }
    }
    
    public static void m2(int i){
        //Si i es igual a 3 entonces muestra la recursion 1 2 3 por ejemplo.
        if(i>0){
            m2(i-1);
            System.out.println(""+i);
        }
    }
    
    public static int contarDigito (int nro){
        //Cuenta la cantidad de digitos de un numero recursivamente.
        int cant = 0;
        if (nro>0){
            cant= contarDigito(nro/10)+1;
        }
        return cant;
    }
     public static int func(int n){
         //precondicion: n es un entero positivo
         int aux;
         if (n==0){
             aux =0;
         }else{
             aux = n+ func(n-1);
         }
         return aux;
     }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        int num, result;
        System.out.println("Ingrese un numero");
        num=sc.nextInt();
        result = factorial(num);
        System.out.println("Su factorial es: "+ result);
    }
    public static int factorial(int n){
        //Realiza el calculo factorial del numero ingresado por parametro
        int fact;
        if (n>1){
            fact= factorial(n-1) * n;
        }else{
            fact = 1;
        }
        return fact;
    }
}

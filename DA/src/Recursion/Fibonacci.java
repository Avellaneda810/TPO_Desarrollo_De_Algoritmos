/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Angel
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int fibonacci (int n){
        //
        int fib;
        if (n>2){
            fib = fibonacci(n-1)+fibonacci(n-2);
        }else if(n==2){
            fib=1;
        }else{
            fib = 0;
        }
        return fib;
    }
}

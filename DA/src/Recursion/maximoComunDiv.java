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
public class maximoComunDiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int mcd(int a, int b){
        //Calculla el maximo omun ivisor de un numero
        int max;
        if (a>=b){
            if (a%b==0){
                return b;//caso base;
            }else{
                return mcd(b, a%b);//caso recursivo 1
            }
        }else{
          return mcd(b,a);//caso recurisvo 2
        }
    }
}

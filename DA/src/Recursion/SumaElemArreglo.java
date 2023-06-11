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
public class SumaElemArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int sumaElemArr(int [] arr, int n){
        //suma los elementos de un arreglo
        int sum;
        if(n==0){
            sum=arr[n];
        }else{
            sum= sumaElemArr(arr, n-1) + arr[n];
        }
        return sum;
    }
}

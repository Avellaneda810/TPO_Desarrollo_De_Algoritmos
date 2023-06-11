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
import java.util.Arrays;
import java.util.Scanner;
public class ejer3parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Algoritmo principal. Resolución del ejercicio 3 del 2do parcial
Scanner sc = new Scanner(System.in);
int[] array1 = {102, 101, 0}; //salida1: (0, 3, 1)
int[] array2 = {210, 11, 0}; //salida2: (0, 3, 1)
int[] array3 = {120, 110, 0}; //salida3: (0, 3, 1)
int[] array4 = {111, 122, 0}; //salida4: (4, 0, 1)
int[] array5 = {101, 10, 1}; //salida5: (3, 2, 2)
int[] array6 = {20, 100, 0}; //salida6: (0, 2, 1)
int[] array7 = {22, 1, 111}; //salida7: (0, 2, 4)
int[] array8 = {12, 1, 11}; //salida8: (0, 2, 3)
System.out.println("Elija qué arreglo desea transformar según su índice");
int n = sc.nextInt();
    switch (n) {
        case 1: System.out.println("Arreglo 1:" + "\n" + Arrays.toString(array1));
                int[] newArray1 = transformArreglo(array1);
                System.out.println("Arreglo 1 transformado:" + "\n" + Arrays.toString(newArray1));
                break;
        case 2:
                System.out.println("Arreglo 2:" + "\n" + Arrays.toString(array2));
                int[] newArray2 = transformArreglo(array2);
                System.out.println("Arreglo 2 transformado:" + "\n" +Arrays.toString(newArray2));
                break;
        case 3:
            System.out.println("Arreglo 3:" + "\n" + Arrays.toString(array3));
            int[] newArray3 = transformArreglo(array3);
            System.out.println("Arreglo 3 transformado:" + "\n" +Arrays.toString(newArray3));
            break;
        case 4:
            System.out.println("Arreglo 4:" + "\n" + Arrays.toString(array4));
            int[] newArray4 = transformArreglo(array4);
            System.out.println("Arreglo 4 transformado:" + "\n" +Arrays.toString(newArray4));
            break;
        case 5:
            System.out.println("Arreglo 5:" + "\n" + Arrays.toString(array5));
            int[] newArray5 = transformArreglo(array5);
            System.out.println("Arreglo 5 transformado:" + "\n" +Arrays.toString(newArray5));
            break;
        case 6:
            System.out.println("Arreglo 6:" + "\n" + Arrays.toString(array6));
            int[] newArray6 = transformArreglo(array6);
            System.out.println("Arreglo 6 transformado:" + "\n" +Arrays.toString(newArray6));
            break;
        case 7:
            System.out.println("Arreglo 7:" + "\n" + Arrays.toString(array7));
            int[] newArray7 = transformArreglo(array7);
            System.out.println("Arreglo 7 transformado:" + "\n" +Arrays.toString(newArray7));
            break;
        case 8:
            System.out.println("Arreglo 8:" + "\n" + Arrays.toString(array8));
            int[] newArray8 = transformArreglo(array8);
            System.out.println("Arreglo 8 transformado:" + "\n" +Arrays.toString(newArray8));
            break;
        default:
            break;
        }
    }
    
    public static int [] transformArreglo(int [] arr){
        //
        boolean esUnoCero;
        int longi=arr.length;
        int [] newArr = new int [longi];
        for (int i =0; i<longi;i++){
            esUnoCero= verifUnoCero(arr[i]);
            if (esUnoCero){
                newArr[i]=EjercicioRecursivoLegajo.indicePersonal(arr[i]);
            }else{
                newArr[i]=0;
            }
        }
        return newArr;
    }
    
    public static boolean verifUnoCero (int n){
        //
        int aux, result, n2;
        boolean esUnoCero;
        //caso base
        if (n>=10){
            n2=n%10;
            if(n2==0||n2==1){
                esUnoCero=verifUnoCero(n/10);
            }else{
                return false; // si al menos un numero es distinto a 0 y 1, retorna falso
            }
        }else{
            esUnoCero = (n==1||n==0);
        }
        return esUnoCero;
    }
}

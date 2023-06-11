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

public class igualAlLado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n, numF;
        int [][] mat ;
        System.out.println("ingrese el orden de la matriz");
        n=sc.nextInt();
        mat=new int [n][n];
        cargarMatriz(mat,n,n);
        numF=elemPegIgual(mat);
        if(numF>0){
            System.out.println("los numeros iguales pegados se encuentran en la fila: "+(numF+1));
        }else {
            System.out.println("No existen elementos pegados iguales");
        }
    }       
    public static void cargarMatriz(int[][] mat, int fila, int columna) {
    	//carga la matriz con los valores que ingresa el usuario, incluye caracteres
    	Scanner sc = new Scanner(System.in);
    	int i, j,n;
    	for (i = 0; i < fila; i++) {
        	//recorre las filas
        	for (j = 0; j < columna; j++) {
            	//recorre las columnas
            	System.out.println("Ingrese un numero o caracter en fila: " + (i + 1) + " y columna: " + (j + 1));
            	n = sc.nextInt();
            	mat[i][j] = n;
        	}
    	}
	}
    public static void mostrarArreglo(int []arr, int longitud){
        //Muestra los elementos  dentro del arreglo
        int i;
        for(i=0;i<longitud;i++){
            System.out.println("El elemento en la posicion "+(i+1)+" es: "+arr[i]);
        }
    }
    public static int elemPegIgual(int[][]mat){
        //Dada una matriz de enteros n*n retorna la primera fila que tenga al menos un elemento con dos digitos iguales pegados,
        //en caso contrario retorna -1
        int n=mat.length-1, fila;
        int i=n;
        boolean encontrado = false;
        while(i>0 && !encontrado){
            fila = vecinoIgual(mat[i],i);
            if(fila>0){
                encontrado=true;
                i=-1;
                return fila;
            }
        }
        return -1;
    }
    public static int vecinoIgual(int arr[],int i){
        //Verifica si existe almenos dos numeros vecinos iguales.
        if (i>0){
            if(arr[i]==arr[i-1]){
               return i;
            }else{
                vecinoIgual(arr,i-1);
            }
        }
        return -1;
    }
}

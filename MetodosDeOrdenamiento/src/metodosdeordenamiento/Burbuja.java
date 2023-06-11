/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeordenamiento;

/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class Burbuja{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementa el metodo de ordenamiento burbuja.
        Scanner sc = new Scanner(System.in);
        int cant;
        int[]a;
        System.out.println("Ingrese la longitud del arreglo");
        cant=sc.nextInt();
        a=new int [cant];
        cargarArreglo(a, cant);
        ordenarBurbuja(a);
        mostrarArreglo(a,cant);
    }
    public static void cargarArreglo(int[] arr, int pos) {
    	//carga el arreglo con los valores que ingresa el usuario, incluye solo enteros
    	Scanner sc = new Scanner(System.in);
    	int i, n;
    	for (i = 0; i < pos; i++) {
            	System.out.println("Ingrese un numero en la posicion: " + (i + 1));
            	n = sc.nextInt();
            	arr[i] = n;
    	}
    }
    public static void mostrarArreglo(int []arr, int longitud){
        //Muestra los elementos  dentro del arreglo
        int i;
        for(i=0;i<longitud;i++){
            System.out.println("El elemento en la posicion "+(i+1)+" es: "+arr[i]);
        }
    }
    public static void ordenarBurbuja(int[] arr){
        //arr es un arreglo de enteros desordenado.
        int i, j, n = arr.length;
        for(i=0;i<n;i++){
            for(j=0;j<(n-i-1);j++){
                if (arr[j]>arr[j+1]){
                  intercambio(j,j+1,arr);  
                }
            }
        }
    }
    public static void intercambio(int a,int b, int[]arr){
        //intercambia dos posiciones en un arreglo
        int aux = arr[a];
        arr[a]=arr[b];
        arr[b]=aux;
    }
}

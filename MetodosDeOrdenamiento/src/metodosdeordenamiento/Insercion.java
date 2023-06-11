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
public class Insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int cant;
        int[]a;
        System.out.println("Ingrese la longitud del arreglo");
        cant=sc.nextInt();
        a=new int [cant];
        cargarArreglo(a, cant);
        insercion(a);
        mostrarArreglo(a,cant);
    }
    public static void cargarArreglo(int[] arr, int pos) {
    	//carga la matriz con los valores que ingresa el usuario, incluye solo enteros
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
    public static void insercion(int[]arr){
        //Metodo de ordenamiento por insercion
        int i, j, temp, n=arr.length-1;
        for (i=1 ; i <=n; i++ ){
          temp = arr[i];
          j = i;
          while (j>0 && temp<arr[j-1]){
              arr[j] = arr[j-1];
              j--;
          }
          arr[j]= temp;
       } 
    }
}

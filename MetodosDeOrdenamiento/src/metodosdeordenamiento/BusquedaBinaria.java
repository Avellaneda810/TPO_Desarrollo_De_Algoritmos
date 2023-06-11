package metodosdeordenamiento;
/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class BusquedaBinaria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [] arreglo; 
        int lon, elemento, posEncontrada;
        System.out.println("Ingrese la longitud del arreglo");
        lon = sc.nextInt();
        arreglo = new int [lon];
        cargarArreglo(arreglo, lon);
        System.out.println("Ingrese el numero que quiere buscar dentro del arreglo de enteros");
        elemento = sc.nextInt();
        posEncontrada = busquedaBinaria(arreglo, elemento);
        if (posEncontrada>=0){
            System.out.println("El elemento fue encontrado y se encuentra en la posicion " + (posEncontrada+1));
        }else{
            System.out.println("El elemento no se encuentra dentro del arreglo");
        }
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
    public static int busquedaBinaria(int arr [], int elem){
        //Realiza busqueda de un elemento de forma binaria.
        int medio, ini=0, fin=arr.length-1, ubicacion=-1;
        boolean encontrado = false;
        while(encontrado==false && ini< fin){
            medio=(ini+fin)/2;
            if (elem < arr[medio]){
                fin = medio-1;
            }else if(elem==arr[medio]){
                encontrado=true;
                ubicacion=medio;
            }else{
                ini=medio+1;
            }
        }
        return ubicacion;
    }
}

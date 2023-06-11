
package metodosdeordenamiento;
/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class BusquedaSecuencial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [] arreglo; 
        int lon, elem, posEncontrada;
        System.out.println("Ingrese la longitud del arreglo");
        lon = sc.nextInt();
        arreglo = new int [lon];
        cargarArreglo(arreglo, lon);
        System.out.println("Ingrese el numero que quiere buscar dentro del arreglo de enteros");
        elem = sc.nextInt();
        posEncontrada = busquedaSecuencial(arreglo, elem);
        if (posEncontrada>=0){
            System.out.println("El elemento fue encontrado y se encuentra en la posicion " + (posEncontrada+1));
        }else{
            System.out.println("El elemento no se encuentra dentro del arreglo");
        }
    }
    public static int busquedaSecuencial (int arr[], int elemento){
        //Realiza la busqueda de un elemento, dentro de un arreglo de forma secuencial. 
        int i, longitud = arr.length;
        boolean encontrado = false;
        for (i = 0; i< longitud && encontrado == false; i++){
            if ( elemento == arr[i]){
                encontrado = true;
                return i;
            }
        }
        return -1;
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
    
}

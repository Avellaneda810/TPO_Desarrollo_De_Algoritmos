package metodosdeordenamiento;
import javax.swing.JOptionPane;
/**
 *
 * @author Angel
 */
public class TiempoEjecucionQuickSort {
    public static void main(String[] args) {
        // TODO code application logic here
        int op, vf, vi, largo = 100000;
        int [] arr = new int [largo];
        generar(arr, largo);
        do{
           op = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opcion \n"
               + "1.- Imprimir Numeros Aleatorios \n"
               + "2.-Imprimir Numeros Ordenados con quick sort \n"
               + "3.-Salir"));
           switch(op){
               case 1: 
                   System.out.println("Numeros generados aleatoriamente");
                   imprimir(arr);
                   break;
               case 2: 
                   vi= (int) System.currentTimeMillis();
                   System.out.println("Numeros ordenados con el metodo Quick"); 
                   quickSort(arr, 0, largo-1);
                   imprimir(arr);
                   vf = (int) System.currentTimeMillis();
                   tiempo(vi, vf);
                   break;
               case 3:
                   break;
           }
       }while(op!=3);
    }
    //METODO PARA GENERAR NUMEROS ALEATORIOS
    public static void generar (int [] arr, int largo){
        for (int i = 0; i < largo; i++){
            arr[i] = (int) (Math.random()*largo);
        }
    }
    //METODO DE ORDENAMIENTO QUICK SORT
    public static void quickSort(int[] arr, int izq, int der){
       //PIVOTE
       int pivote = arr[izq];
       //LOS ELEMENTOS MAYORES AL PIVOTE VAN A LA DERREHA Y LOS MENORES A LA IZQUIERDA
       int i=izq, j=der, aux;
       //SE EVALUAN LOS ELEMENTOS PARA UBICAR EL PIVOTE
       while(i<j){
           //MIENTRAS QUE ARR[I]<PIVOTE SE AUMENTA i
           while (arr[i]<=pivote && i<j){
               i++;
           }
           while(arr[j]>pivote){
               j--;
           }
           if( i < j){
               aux= arr[i];
               arr[i]=arr[j];
               arr[j]=aux;
           }
       }
       arr[izq]=arr[j];
       arr[j]=pivote;
       if(izq<j-1){
           quickSort(arr, izq, j-1);
       }
       if (j+1 < der){
           quickSort(arr, j+1, der);
       }
    }
    
    //METODO PARA MOSTRAR ARREGLO
    public static void imprimir ( int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
     //METODO PARA MOSTRAR EL TIEMPO DE EJECUCION
    public static void tiempo (int vi, int vf){
        int tiempo = vf -vi;
        tiempo = tiempo/1000;
        System.out.println("Tardo "+tiempo+" Segundos");
    }
}

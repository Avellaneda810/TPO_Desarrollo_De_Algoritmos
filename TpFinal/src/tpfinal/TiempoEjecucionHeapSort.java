package metodosdeordenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class TiempoEjecucionHeapSort {
    //LLAMADO A LOS METODOS
    public static void main(String[] args) {
       int [] arr;
       int op, vf, vi, numElem = 10000;
       arr = new int [numElem];
       generar(arr, numElem);
       do{
           op = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opcion \n"
               + "1.- Imprimir Numeros Aleatorios \n"
               + "2.-Imprimir Numeros Ordenados con heap sort \n"
               + "3.-Salir"));
           switch(op){
               case 1: 
                   System.out.println("Numeros generados aleatoriamente");
                   imprimir(arr);
                   break;
               case 2: 
                   vi= (int) System.currentTimeMillis();
                   System.out.println("Numeros ordenados con el metodo Heap");
                   ordenarHeap(arr);
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
    //METODO DE ORDENACION HEAP SORT
    public static void ordenarHeap (int [] arr){
        final int n = arr.length;
        for(int ini = n/2; ini>=0; ini--){
            hacerHeap ( arr, ini, n-1);
        }
        for(int j =n-1; j >= 0 ; j--){
            int tmp = arr[0];
            arr[0] = arr[j];
            arr[j] = tmp;
            hacerHeap(arr, 0, j-1);
        }
    }
    public static void hacerHeap(int [] arr, int ini, int fin){
        int izq = 2*ini+1;
        int der = izq +1;
        int may;
        if (izq>fin){}
        if(der > fin){
            may = izq;
        }else{
            may = arr[izq] > arr[der]?izq:der;
            if(arr[ini]<arr[may]){
                int temp = arr[ini];
                arr[ini]= arr[may];
                arr[may]=temp;
                hacerHeap(arr, may, fin);
            }
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
        System.out.println("Tarde "+tiempo+" Segundos");
    }
}

package metodosdeordenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class TiempoEjecucionMergeSort {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] arr;
       int op, vf, vi, numElem = 100000;
       arr = new int [numElem];
       generar(arr, numElem);
       
       do{
           op = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opcion \n"
               + "1.- Imprimir Numeros Aleatorios \n"
               + "2.-Imprimir los 100.000 numeros ordenados con merge sort y ver su tiempo de ejecucion de este metodo \n"
               + "3.-Salir"));
           switch(op){
               case 1: 
                   System.out.println("Numeros generados aleatoriamente");
                   imprimir(arr);
                   break;
               case 2: 
                   vi= (int) System.currentTimeMillis();
                   System.out.println("Numeros ordenados con el metodo Merge sot");
                   imprimir(mezclar(arr));
                   vf = (int) System.currentTimeMillis();
                   tiempo(vi, vf);
                   break;
               case 3:
                   break;
           }
       }while(op!=3);
    }
    //METODO QUE REALIZA EL ORDENAMIENTO MERGE SORT
   /* public static int [] mergeSort(int [] arr, int prim, int ult){
        int cen;
        if(prim<ult){
            cen = (prim + ult)/2;
            mergeSort(arr, prim, cen);
            mergeSort(arr, cen+1, ult);
            mezclar(arr);
        }
        return arr;
    }*/
    //METODO PARA MEZCLAR ELEMENTOS DEL ARREGLO 
    public static int [] mezclar(int [] arr){
    int i, j, k, largo= arr.length;
        if (largo > 1){
            int izq = largo /2;
            int der = largo -izq;
            int [] arrIzq = new int [izq];
            int [] arrDer = new int [der];
            //COPIA LOS ELEMENTOS DE LA PRIMERA PARTE AL ARRIZQ
            for(i = 0; i < izq ; i++){
                arrIzq[i] = arr[i];
            }
            //COPIA LOS ELEMENTOS DE LA SEGUNDA PARTE AL ARRDER
            for (i=izq; i<largo; i++){
                arrDer[i-izq] = arr[i];
            }
            //RECURSIVIDAD
            arrIzq=mezclar(arrIzq);
            arrDer=mezclar(arrDer);
            i=0; 
            j=0;
            k=0;
            while ( arrIzq.length != j && arrDer.length != k ){
                if( arrIzq[j]<arrDer[k]){
                    arr[i] = arrIzq[j];
                    i++;
                    j++;
                }else{
                    arr[i]=arrDer[k];
                    i++;
                    k++;
                }
            }
            //ARREGLO FINAL
            while (arrIzq.length != j){
                arr[i]= arrIzq[j];
                i++;
                j++;
            }
            while ( arrDer.length != k){
                arr[i]=arrDer[k];
                i++;
                k++;
            }
        }//FIN DEL IF
        return arr;
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
    //METODO PARA GENERAR NUMEROS ALEATORIOS
    public static void generar (int [] arr, int largo){
        for (int i = 0; i < largo; i++){
            arr[i] = (int) (Math.random()*largo);
        }
    }
}

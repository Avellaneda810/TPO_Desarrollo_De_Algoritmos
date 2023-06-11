/*
 * 5)Otros:
a) Una red de mensajes en cadena ha encontrado una forma de repartir los mismos 
  de manera que se pueda cubrir a la mayor gente posible......
   Para ello han decidido usar una teoría, la misma que empieza enviando X
  mensajes, y a partir de este número se van enviando los mensajes de acuerdo
  a una teoría progresiva. Se termina de entregar los mensajes una vez que se
  encuentra 1. Sin embargo, no se sabe a ciencia cierta la teoría, lo único que
  se tiene son algunas fórmulas sueltas:
  X/2 y X ∗ 3 + 1 y ejemplos de cómo se aplica:
  CASO 1: 5, 16, 8, 4, 2, 1
  CASO 2: 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2 , 1 
  CASO 3: 10, 5, 16, 8, 4, 2, 1 
  CASO 4: 6, 3, 10, 5, 16, 8, 4, 2, 1
  CASO 5: 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 
   a. En base a los casos deduce la teoría que se aplica para enviar los mensajes.
   b. Escribe el (los) método(s) RECURSIVO(S) necesario(s) para saber cuántos 
     mensajes se han enviado en total si se empieza con X mensajes.
     Este resultado se obtiene sumando la cantidad de mensajes sucesivos que se
    envían. Para dar un ejemplo: en el CASO 1: se envían 36 mensajes.  */

package tprecurisividadentregable;
/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n, cantMensajes=0;
        boolean valor;
        System.out.println("Ingrese un numero entero");
        n = sc.nextInt();
       cantMensajes =  formulaSuelta(n);
        System.out.println("La cantidad de mensajes es: "+cantMensajes);
    }
    public static int formulaSuelta(int n){
        //Si un numero es par se divide por dos, si es impar se multiplica por 3 y se le suma uno, hasta llegar al valor 1.
        int cont = n, num;
        System.out.println("valor actual "+n);
        if (n==1){
            cont=n;
            return cont;
        }else if(n%2==0){
            num = n/2;
           cont+=formulaSuelta(num);
        }else{
            num=3*n+1;
             cont+=formulaSuelta(num);

        }
        return cont;
    }
}

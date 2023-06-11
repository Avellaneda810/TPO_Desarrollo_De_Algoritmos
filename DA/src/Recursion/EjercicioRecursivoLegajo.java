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
import java.util.Scanner;
public class EjercicioRecursivoLegajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int legajo;
        System.out.println("Ingrese el numero de legajo");
        legajo= sc.nextInt();
        System.out.println("Su indice es: "+indicePersonal(legajo));
    }
    
    public static int indicePersonal (int legajo){
        //Modulo que calcula el indice personal siguiendo la formula:
        // suma digitos (legajo mod 8) +1
        int indice;
        indice = sumaDigitos(legajo % 8) + 1;
        return indice;
    }
    public static int sumaDigitos(int leg){
        //
        int aux, resultado;
        if (leg<8){ //Caso base
            resultado=leg;
        }else{ //Paso recursivo
            aux = leg % 8;
            resultado = sumaDigitos(leg/8 + aux);
        }
        return resultado;
    }
}

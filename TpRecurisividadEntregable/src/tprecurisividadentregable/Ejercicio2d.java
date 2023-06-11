/*
 * 2)Con matrices/arreglos:
 *   d) Retorna verdadero si la matriz nxn es igual a su traspuesta.
 *      nota: si una matriz A es cuadrada y es simetrica entonces A = At
 */
package tprecurisividadentregable;

/**
 *
 * @author Angel
 */
import java.util.Scanner;
public class Ejercicio2d {

	public static void main(String[] args) {
    	// Retorna verdadero si la matriz nxn es igual a su traspuesta.
    	Scanner sc = new Scanner(System.in);
    	int m, n;
    	boolean esIgual = false;
    	char[][] matriz;//Es una matriz de numeros e incognitas. creada con caracteres.
    	char[][] traspuesta;

    	System.out.println("Ingrese la cantidad de filas de la matriz");
    	m = sc.nextInt();
    	System.out.println("Ingrese la cantidad de columnas de la matriz");
    	n = sc.nextInt();
    	matriz = new char[m][n];
    	if (esCuadrada(m, n)) {
        	cargarMatriz(matriz, m, n);
        	System.out.println("Matriz ingresada:");
        	mostrarMatriz(matriz, 0, 0);
        	System.out.println("");
        	traspuesta = trasponer(matriz, m, n);
        	System.out.println("Matriz traspuesta:");
        	mostrarMatriz(traspuesta, 0, 0);
        	System.out.println("");
        	esIgual = esSimetrica(matriz, traspuesta, 0, 0);
    	}
    	System.out.println("la matriz es igual a su traspuesta: " + esIgual);
	}

	public static boolean esCuadrada(int fila, int columna) {
    	//verifica si la matriz es cuadrada
    	boolean valor = false;
    	if (fila == columna) {
        	valor = true;
    	}
    	return valor;
	}

	public static void cargarMatriz(char[][] mat, int fila, int columna) {
    	//carga la matriz con los valores que ingresa el usuario, incluye caracteres
    	Scanner sc = new Scanner(System.in);
    	int i, j;
    	char c;
    	for (i = 0; i < fila; i++) {
        	//recorre las filas
        	for (j = 0; j < columna; j++) {
            	//recorre las columnas
            	System.out.println("Ingrese un numero o caracter en fila: " + (i + 1) + " y columna: " + (j + 1));
            	c = sc.next().charAt(0);
            	mat[i][j] = c;
        	}
    	}
	}

	public static void mostrarMatriz(char[][] m, int i, int j) {
    	//Módulo que muestra los valores de cada elemento de la matriz de caracteres

    	System.out.print(m[i][j] + " ");

    	if (i != m.length - 1 || j != m[i].length - 1) {

        	if (j == m[i].length - 1) {
            	i++;
            	j = 0;
            	System.out.println("");
        	} else {
            	j++;
        	}
        	mostrarMatriz(m, i, j);
    	}
	}

	public static char[][] trasponer(char[][] mat, int m, int n) {
    	//Módulo que muestra los valores de cada elemento de la matriz de caracteres
    	Scanner entrada = new Scanner(System.in);
    	char[][] trasp = new char[m][n];
    	int i, j;
    	for (i = 0; i < mat.length; i++) {
        	for (j = 0; j < mat[0].length; j++) {
            	trasp[i][j] = mat[j][i];
        	}
    	}
    	return trasp;
	}

	public static boolean esSimetrica(char[][] mat, char[][] trasp, int i, int j) {
    	//verifica si la matriz es simetrica con un metodo recursivo.
    	boolean simetrica = false;
   	 
    	if (i != mat.length - 1 || j != mat[i].length - 1) {
        	if (j == mat[i].length - 1) {
            	i++;
            	j = 0;
            	System.out.println("");
        	} else {
            	j++;
        	}
        	esSimetrica(mat, trasp, i, j);
    	}
    	simetrica = mat[i][j] == trasp[i][j];
    	return simetrica;
	}
}


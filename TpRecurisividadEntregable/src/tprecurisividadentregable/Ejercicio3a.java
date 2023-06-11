/*
 * Con String:
a) Retorna un texto en jerigonza agregándole p+la vocal cada vez que se utilice una vocal. No se consideran mayúsculas o minúsculas.
	Palabra jeringoza
	Ejemplo epejepemplopo
	Fui fupuipi
 */
package tprecurisividadentregable;

/**
 * 
 * @author Angel
 */
import java.util.Scanner;
public class Ejercicio3a {
    public static void main(String[] args) {
        // Retorna un texto en jerigonza agregándole p+la vocal cada vez que se utilice una vocal. No se consideran mayúsculas o minúsculas.
         Scanner sc = new Scanner(System.in);
        String texto;
        int longitud;
        String nuevoTexto;
        System.out.println("Ingrese un texto");
        texto = sc.nextLine();
        longitud = texto.length() - 1;
        nuevoTexto = textoEnJeringoza(texto, longitud);
        System.out.println("El texto ingresado en jeringoza es: " + nuevoTexto);
    }

    public static String textoEnJeringoza(String txt, int lon) {
        String nuevoTxt = "";
        if (lon > -1) {
            if (txt.toLowerCase().charAt(lon)=='a' || txt.toLowerCase().charAt(lon) == 'e' || txt.toLowerCase().charAt(lon) == 'i' || txt.toLowerCase().charAt(lon) == 'o' || txt.toLowerCase().charAt(lon) == 'u') {
                nuevoTxt = txt.charAt(lon) + "p" + txt.charAt(lon) + nuevoTxt;
                nuevoTxt = textoEnJeringoza(txt, (lon - 1)) + nuevoTxt;
            } else {
                nuevoTxt = txt.charAt(lon) + nuevoTxt;
                nuevoTxt = textoEnJeringoza(txt, (lon - 1)) + nuevoTxt;
            }
        }
        return nuevoTxt;
    }
}

    
    


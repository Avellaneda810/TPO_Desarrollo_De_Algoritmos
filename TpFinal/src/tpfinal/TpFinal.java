package tpfinal;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author Angel Gabriel, Avellaneda
 */
public class TpFinal {
    public static void main(String[] args) {
        int elec;
        int numEst, largo;
        String nombreEst;
        boolean continuar;
        Scanner sc = new Scanner(System.in);
        //2)
        Estadio [] estadios = new Estadio [100];
        cargarArreglo(estadios);
        //3)
        System.out.println("¿Desea ver el menu de opciones?");
        continuar = sc.nextBoolean();
        while(continuar){
             System.out.println("Ingrese el Numero 1 para Ordenar por Seleccion Ascendente");
             System.out.println("Ingrese el Numero 2 para Ordenar por Seleccion Descendente");
             System.out.println("Ingrese el Numero 3 para ver el Nombre de un Estadio Abreviado");
             System.out.println("Ingrese el Numero 4 para ");
             System.out.println("Ingrese el Numero 5 para");
             System.out.println("Ingrese el Numero 6 para ver el Arreglo de Estadios por Orden Numerico");
             System.out.println("¡Advertencia! ¡Sino ingresa un numero valido debera ejecutar nuevamente el codigo!");
             elec=sc.nextInt();
            switch (elec)
            {
                case 1://3) Seleccion Ascendente
                    mostrarArreglo(seleccionAsc(estadios), 100);
                    break;
                case 2://3) Seleccion Descendente
                    mostrarArreglo(seleccionDes(estadios), 100);
                    break;
                case 3: //4) Abreviatura de Nombre de Estadio
                    System.out.println("Ingrese el numero de estadio");
                    numEst = sc.nextInt();
                    nombreEst=estadios[numEst-1].getNombre().trim();
                    largo = nombreEst.length()-1;
                    System.out.println(abreviaturaNombre(nombreEst, largo));
                    break;
                case 4: //merge/heap/quick sort ascendente 5)
                    
                    break;
                case 5: //merge/heap/quick sort descendente 5)
                    break;
                case 6: //1) Estadios lectura del Archivo 
                    mostrarArreglo(estadios, 100);
                    break;
                default://Numero no valido
                    System.out.println("Vuelva a ejecutar el programa e ingrese un numero valido");
                    break;
            }
            System.out.println("¿Desea volver al menu de opciones?");
            continuar = sc.nextBoolean();
        }
    }
   
    //2) Arreglo/matriz
    public static void cargarArreglo (Estadio [] estadios){
        //Carga los datos de los estadios al arreglo a traves de un archivo de texto.
        String nombreArchivo = "C:\\Users\\Angel\\Documents\\NetBeansProjects\\TpFinal\\src\\tpfinal\\BDEstadios.txt";
        String linea = null;
        String [] datos = new String [5];
        int n=0, largo = estadios.length;
        int num, cap;
        String nom, ciu, dis;
        try {
             FileReader lector = new FileReader(nombreArchivo);
            try (BufferedReader bufferLectura = new BufferedReader(lector))
            {
                while ((linea = bufferLectura.readLine())!= null && n<largo){
                    datos = linea.split("\\|");
                    num = Integer.parseInt(datos[0].trim());
                    nom = datos[1].trim();
                    ciu = datos[2].trim();
                    cap = Integer.parseInt(datos[3].trim());
                    dis = datos[4].trim();
                    estadios[n] = new Estadio(num, nom, ciu, cap, dis);
                    n++;
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo algun archivo.");
        }
    }
    public static void mostrarArreglo(Estadio []arr, int longitud){
        //Muestra los elementos  dentro del arreglo
        for(int i=0 ; i<longitud ; i++){
            System.out.println("El elemento en la posicion "+(i+1)+" es: "+arr[i].toString());
        } 
    }
    
    //3) Ordenamiento
    public static Estadio [] seleccionAsc(Estadio [] est){
        // //Aplica el método de ordenamiento por Seleccion, ordena el arreglo ascendentemente por nombre de ciudad.
        //Si hay más de un  estadio por ciudad, por nombre del estadio.
        Estadio [] copiaEst;
        copiaEst = est.clone();//Copia de Arreglo
        int i, posMenor, n= est.length;
        for (i=0; i<n;i++){
            posMenor = buscarMenor(i, copiaEst);
            intercambiar(i, posMenor, copiaEst);        
        }
        return copiaEst;
    }
    public static Estadio [] seleccionDes(Estadio [] est){
        //Aplica el método de ordenamiento por Seleccion, ordena el arreglo descendentemente por nombre de ciudad.
        //Si hay más de un  estadio por ciudad, por nombre del estadio.
        Estadio [] copiaEst; 
        copiaEst = est.clone();//Copia de Arreglo
        int i, posMayor, n = est.length;
        for (i=0; i<n;i++){
            posMayor=buscarMayor(i,copiaEst);
            intercambiar(i, posMayor, copiaEst);
        }
        return copiaEst;
    }
    
    public static void intercambiar(int pos1, int pos2, Estadio [] arr){
        //Intercambia los valores de dos posiciones de un arreglo
        Estadio aux = arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=aux;
    }
    public static int buscarMayor (int desde, Estadio [] est){
        //busca el numero mayor dentro de un arreglo y retorna la posicion en que se encuentra
        int i;
        Estadio mayor = est[desde];
        int posMayor = desde, longi=est.length;
        for (i=desde ; i<longi ; i++){
            int primerN = est[i].compareTo(mayor);//metodo de clase Estadio
            if (primerN<0){
                mayor=est[i];
                posMayor=i;
            }
        }
        return posMayor;
    }
    public static int buscarMenor (int desde, Estadio [] est){
        //Busca el numero menor dentro de un arreglo y retorna la posicion en la que se encuentra.
        int i;
        Estadio menor = est[desde];
        int posMenor = desde, longi=est.length;
        for (i=desde ; i<longi ; i++){
            int primerN = est[i].compareTo(menor);//metodo de clase Estadio
            if (primerN>0){
                menor=est[i];
                posMenor=i;
            }
        }
        return posMenor;
    }
    
    //4) Manejo de String/recursividad
    public static String abreviaturaNombre (String nom, int n) {
        //Dado el nombre de un estadio, generar su abreviatura  (sacando las vocales y con la primera consonante con
        //mayúsculas y sin espacios entre medio. Solicitar al usuario el número de estadio y mostrar el nombre original y el nombre modificado. 
        //Ejemplo: 
        //Estadio Ciudad de la Educación = Stdcdddldccn 
        //Lusail = Lsl 
        String car =""+ nom.charAt(n); 
        String abreviado="";
        if (n>0){//Paso Recursivo
            if(!car.equalsIgnoreCase("a") && !car.equalsIgnoreCase("e") && !car.equalsIgnoreCase("i") && !car.equalsIgnoreCase("o") && !car.equalsIgnoreCase("u")){
                 abreviado = abreviaturaNombre(nom, n-1).trim() + car;
            }else{
                abreviado = abreviaturaNombre(nom, n-1).trim();
            } 
        }else if (n==0){//Caso Base
                if(!car.equalsIgnoreCase("a") && !car.equalsIgnoreCase("e") && !car.equalsIgnoreCase("i") && !car.equalsIgnoreCase("o") && !car.equalsIgnoreCase("u")){
                abreviado = car.trim();
                }
        }
        return abreviado; 
    }
    // 5) Promocion
    /*Aquellas personas que promocionan deberán elegir otro método de  ordenamiento de orden O (n log n), en forma ascendente y descendente. 
     Los métodos a utilizar son los métodos Heapsort, Quicksort y Mergesort. 
        0) Heapsort 
        1) Quicksort 
        2) Mergesort 
     Muestre qué métodos de los planteados es más rápido y analice por qué. 
     Haga pruebas empíricas para comparar los dos métodos, (si quiere utilice System.nanoTime()).
    */
}
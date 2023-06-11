package tpfinal;
/**
 *
 * @author Angel
 */
// 1) Estrucutura de la Clase Estadio
public class Estadio {
    //Atributos
    private int numero;
    private String nombre;
    private String ciudad;
    private int capacidad;
    private String disputado;
        
        //constructoras
        public Estadio (){
            nombre="";
            ciudad="";
            capacidad=0;
            disputado="";
        }
        public Estadio (int num, String nom, String ciu, int cap, String dis){
            this.numero=num;
            this.nombre=nom;
            this.ciudad=ciu; 
            this.capacidad=cap;
            this.disputado=dis;
        }
        
        //Comparativas
        public int compareTo(Estadio otro){
            if (this.ciudad.compareTo(otro.getCiudad()) == 0){
                return this.nombre.compareTo(otro.getNombre());
            }else{
                 return  this.ciudad.compareTo(otro.getCiudad()); 
            }
        } 
        public boolean equals(Estadio otro){
        return otro.getNumero() == this.numero;
        }
        
        
        //Observadoras
        public int getNumero(){
            return this.numero;
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getCiudad(){
            return this.ciudad;
        }
        public int getCapacidad(){
            return this.capacidad;
        }
        public String getDisputado(){
            return this.disputado;
        }
    @Override
        public String toString(){
            return "Numero: "+this.numero+" , Nombre: "+this.nombre+" , Ciudad: "+this.ciudad+" , Capacidad: "+this.capacidad+" , Disputado: "+this.disputado;
        }
       
        //Modificadoras
        public void setNombre(String nom){
            this.nombre=nom;
        }
        public void setCiudad(String ciu){
            this.ciudad=ciu;
        }
        public void setCapacidad(int cap){
            this.capacidad=cap;
        }
        public void setDisputado(String dis){
            this.disputado=dis;
        }
        
        //Propias del tipo NULL
        
}

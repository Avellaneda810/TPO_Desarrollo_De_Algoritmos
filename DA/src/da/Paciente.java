/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;
//INCOMPLETO
/**
 *
 * @author Angel
 */
public class Paciente {
    //Atributo
    private String nombre;
    private String apellido;
    private int documento;
    private String obraSocial;
    private double coseguro;
    private int tratamiento;
    
    //Constructores 
    public Paciente (){
    }
    public Paciente (String nom, String ape, int doc, String obs, double cos, int trat){
        nombre = nom;
        apellido = ape;
        documento =  doc;
        obraSocial = obs;
        coseguro = cos;
        tratamiento = trat;
    }
    
    //modificadores 
}

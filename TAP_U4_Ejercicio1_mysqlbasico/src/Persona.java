/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edwin
 */
public class Persona {
    int id;
    String Nombre;
    String Domicilio;
    String Telefono;

    public Persona(int i, String N, String D, String T) {
        id = i;
        Nombre = N;
        Domicilio = D;
        Telefono = T;
    }
    
    public String[] toRenglon(){
    String[] vector = new String[4];
    
    vector[0]=""+id;
    vector[1]=Nombre;
    vector[2]=Domicilio;
    vector[3]=Telefono;
    
    return vector;
    }
}

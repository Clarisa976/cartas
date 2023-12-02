/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author clara
 */
/*palos: oros, bastos, copas, espadas*/
public enum Palo {
    OROS("Oros"),
    BASTOS("Bastos"),
    COPAS("Copas"),
    ESPADAS("Espadas");
    
    //atributo
    private final String descripcion;
    //constructor
    private Palo(String descripcion) {
        this.descripcion = descripcion;
    }
    //getter
    public String getDescripcion() {
        return descripcion;
    }
    
}

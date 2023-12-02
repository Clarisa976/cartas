/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author clara
 */
public class Naipe {
    public Random rnd = new Random();
    //atributos
    private int numeroCartas;/*1..7,8(sota),9(caballo),10(rey)*/
    private Palo palo;//espadas, copas, oros, bastos
    
    //constructor aleatorio por defecto
    public Naipe() {
        this.numeroCartas = rnd.nextInt(1, 11);
        this.palo = Palo.values()[rnd.nextInt(Palo.values().length)];
    }
    /*constructor con parámetros que lanza excepción en caso de error*/
    public Naipe(int numeroCartas, Palo palo) {
        this.numeroCartas = numeroCartas;
        this.palo = palo;
    }
    //getters
    public int getNumeroCartas() {
        return numeroCartas;
    }

    public Palo getPalo() {
        return palo;
    }
    //setters
    public void setNumeroCartas(int numeroCartas) {
        this.numeroCartas = numeroCartas;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        sb.append("numeroCartas=").append(numeroCartas);
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    
}

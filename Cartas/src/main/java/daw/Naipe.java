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
    private final String[] NUMERO_CARTA = {"1","2","3","4","5","6","7","8","9","10"};/*1..7,8(sota),9(caballo),10(rey)*/
    private Palo palo;//espadas, copas, oros, bastos

    //constructor aleatorio por defecto
//    public Naipe() {
//        this.numeroCartas = {1,2,3,4,5,6,7,8,9,10};
//        this.palo = Palo.values()[rnd.nextInt(Palo.values().length)];
//    }

    /*constructor con parámetros que lanza excepción en caso de error*/
    public Naipe(int NUMERO_CARTA, Palo palo) {
        if (NUMERO_CARTA < 1 || NUMERO_CARTA > 10) {
            throw new IllegalArgumentException("Número de carta no válido");
        }
//        this.numeroCartas = numeroCartas;
        this.palo = palo;
    }

    //getters
    public String[] getNUMERO_CARTA() {
        return NUMERO_CARTA;
    }


    public Palo getPalo() {
        return palo;
    }

    //setters
    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    //toString
    @Override
    public String toString() {
        /*modificamos el toString para que aparezca sota en lugar de 8,
        caballo en lugar de 9 y rey en lugar del 10*/
//        String nombreNumero;
//        nombreNumero = switch (NUMERO_CARTA) {
//            case "8" -> "Sota";
//            case 9 -> "Caballo";
//            case 10 -> "Rey";
//            default -> String.valueOf(NUMERO_CARTA);
//        };
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        sb.append(NUMERO_CARTA);
        sb.append(" ").append(palo);
        sb.append('}');
        return sb.toString();
    }

}

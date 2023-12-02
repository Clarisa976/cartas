/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author clara
 */
public class Baraja {

    //atributo
    private ArrayList<Naipe> barajaNaipes;
    
    //constructor por defecto que rellena el array con todos los naipes
    public Baraja() {
        this.barajaNaipes = new ArrayList<>();
        //rellenamos usando un for each
        for (Palo palo : Palo.values()) {
            //usamos hashset para asegurarnos de que no hay repetidos
            Set<Integer> numUsado = new HashSet<>();
            //se hace 10 veces el bucle porque hay 10 cartas por cada palo
            for (int i = 0; i < 10; i++) {
                //se genera el número de forma aleatoria
                int numero;
                do {
                    numero = (int) (Math.random() * 10) + 1;
                } while (numUsado.contains(numero));
                //se añade a la lista
                numUsado.add(numero);
                try {
                    //creamos un nuevo naipe y lo agregamos a la lista de naipes
                    barajaNaipes.add(new Naipe(numero, palo));
                } catch (IllegalArgumentException iae) {

                }
            }
        }
    }
    //getter y setter
    public ArrayList<Naipe> getBarajaNaipes() {
        return barajaNaipes;
    }

    public void setBarajaNaipes(ArrayList<Naipe> barajaNaipes) {
        this.barajaNaipes = barajaNaipes;
    }
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append(barajaNaipes);
        sb.append('}');
        return sb.toString();
    }
}

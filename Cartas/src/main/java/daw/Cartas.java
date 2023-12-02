/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

/**
 *
 * @author clara
 */
public class Cartas {
    
    public static void main(String[] args) {
        //creamos una carta aleatoria y la mostramos
        Naipe n1 = new Naipe();
        System.out.println("Carta creada de forma aleatoria: " + n1);
        System.out.println("\t ***********************************");
        //creamos una baraja y la mostramos
        Baraja b1 = new Baraja();
        System.out.println(b1);
        System.out.println("\t ***********************************");
    }
}

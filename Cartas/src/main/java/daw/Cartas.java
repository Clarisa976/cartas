/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author clara
 */
public class Cartas {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        //creamos una carta aleatoria y la mostramos
        Naipe n1 = new Naipe();
        System.out.println("Carta creada de forma aleatoria: " + n1);
        System.out.println("\t ***********************************");
        //creamos una baraja y la mostramos
        Baraja b1 = new Baraja();
        System.out.println(b1);
        System.out.println("\t ***********************************");
        //pedimos una carta al usuario
        System.out.println("Introduce el número de la carta (1-10)");
        int numeroPedido = pedirNumero();
        //controlamos que el palo sea uno de los que hay
        Palo paloTmp = null;
        String paloPedido;
        do {
            System.out.println("Introduce el palo (OROS, BASTOS, COPAS o  ESPADAS)");
            paloPedido = pedirString();
            try {
                paloTmp = Palo.valueOf(paloPedido.toUpperCase());
                System.out.println("El usuario elige: " + numeroPedido + " "
                        + paloPedido);
            } catch (IllegalArgumentException e) {
                System.out.println("Palo no válido");
            }
        } while (paloTmp == null);

        //sacamos y mostramos cartas hasta que coincida con la del usuario
        boolean esIgual = false;
        while (!esIgual) {
            Naipe aux = b1.getBarajaNaipes().remove(0);
            System.out.println(aux);
            if (aux.getNumeroCartas() == numeroPedido && aux.getPalo() == paloTmp) {
                esIgual = true;
                System.out.println("Carta encontrada!");
            }
        }
    }
    //Método el cual controla la excepción con int

    private static int pedirInt() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        int numero = 0;
        do {
            // Bloque try. Aquí se pone el código susceptible de error
            try {
                numero = teclado.nextInt();
                seguir = false;

            } catch (InputMismatchException ime) {

                System.out.println("Introduce solo números");
                teclado.nextLine();
            }
        } while (seguir);
        return numero;
    }

    public static int pedirNumero() {
        int max = 10;
        int min = 1;
        /*con la creación de un bucle pedimos un número que esté entre el rango
        indicado*/
        int num = -1;
        do {
//            System.out.println("Introduzca un número entre " + min + " y " + max);
            num = pedirInt();

        } while (!comprobarRango(num, min, max));
        return num;
    }

    public static boolean comprobarRango(int numero, int min, int max) {
        int MAX = 10;
        int MIN = 1;
        /*método para comprobar que el número está en el rango indicado*/
        boolean resultado = false;
        if (numero >= min && numero <= max) {
            resultado = true;
        }
        return resultado;

    }

    //Método el cual controla la excepción
    private static String pedirString() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        String palabra = "";
        do {
            // Bloque try. Aquí se pone el código susceptible de error
            try {
                palabra = teclado.nextLine();
                seguir = false;

            } catch (NullPointerException npe) {

                teclado.nextLine();
            }
        } while (seguir);
        return palabra;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import entidad.Carta;

/**
 *
 * @author jorge
 */
public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList();
    private ArrayList<Carta> barajasMonton = new ArrayList();
    private Carta carta;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearBaraja() {
        System.out.println("-------------------");
        System.out.println("CARGANDO BARAJA");
        System.out.println("-------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                Carta carta = new Carta();
                switch (i) {
                    case 0:
                        carta.setPalo("Oro");
                        break;
                    case 1:
                        carta.setPalo("Espada");
                        break;
                    case 2:
                        carta.setPalo("Copa");
                        break;
                    case 3:
                        carta.setPalo("Basto");
                        break;
                }
                carta.setNumero(j);
                if (j != 8 && j != 9) {
                    baraja.add(carta);
                }
            }
        }
    }

    public void barajar() {
        System.out.println("-------------------");
        System.out.println("BARAJANDO CARTAS");
        System.out.println("-------------------");
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {
        System.out.println("-------------------");
        System.out.println("SIGUIENTE CARTA");
        System.out.println("-------------------");
        if (baraja.isEmpty()) {
            System.out.println("No hay más cartas en la baraja");
        } else {
            for (Carta cartas : baraja) {
                System.out.println("La carta es: " + cartas);
                barajasMonton.add(cartas);
                baraja.remove(cartas);
                break;
            }
        }
    }
 
    public void cartasDisponibles(){
        System.out.println("-------------------");
        System.out.println("Cartas Disponibles: "+baraja.size());
        System.out.println("-------------------");
    }
 
    public void darCartas(){
        System.out.println("-------------------");
        System.out.println("DAR CARTAS");
        System.out.println("-------------------");
        System.out.println("Cuántas cartas desea: ");
        int cantCartas = leer.nextInt();
        
        if (cantCartas > baraja.size()) {
            System.out.println("La cantidad de cartas solicitadas es mayor a las disponibles. ");
            cartasDisponibles();
        }else{
            for (int i = 0; i < cantCartas; i++) {
                siguienteCarta();
            }
        }
    }
   
    public void cartasMonton(){
        System.out.println("-------------------");
        System.out.println("CARTAS DEL MONTON");
        System.out.println("-------------------");
        if (barajasMonton.isEmpty()) {
            System.out.println("No hay cartas en el montón.");
        }else{
            System.out.println("Las cartas que ya salieron son: ");
            System.out.println(barajasMonton);
        }
    }

    
    public void mostrarBaraja(){
        System.out.println("-------------------");
        System.out.println("Mostrar Baraja");
        System.out.println(baraja);
        System.out.println("-------------------");
    }
    
}

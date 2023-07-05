
package entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servcios.JugadorSevicio;
import servcios.RevolverDeAguaServicio;


public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Jugador> jugadores = new ArrayList();
    JugadorSevicio JS = new JugadorSevicio();
    RevolverDeAguaServicio RAS = new RevolverDeAguaServicio();
    RevolverDeAgua revolver = RAS.llenarRevolver();


    public void llenarJuego() {
        System.out.println("Ingrese la cantidad de jugadores (6 máx.): ");
        int cantJugadores = leer.nextInt();
        if (cantJugadores <= 6) {
            for (int i = 0; i < cantJugadores; i++) {
                Jugador jugador = new Jugador();
                jugador.setID(i +1);
                jugador.setNombre("Jugador " + jugador.getID());
                jugador.setMojado(JS.disparo(revolver, RAS));
                jugadores.add(jugador);
            }
        } else {
            System.out.println("Usted Ingreso una cantidad no válida");
            System.out.println("Por defecto se cargarán 6 Jugadores");
            for (int i = 0; i < 6; i++) {
                Jugador jugador = new Jugador();
                jugador.setID(i + 1);
                jugador.setNombre("Jugador " + jugador.getID());
                jugador.setMojado(JS.disparo(revolver, RAS));
                jugadores.add(jugador);
            }
        }
    }

   
    public void ronda() {

        System.out.println("----------------");
        System.out.println("Juego RULETA RUSA");
        System.out.println("----------------");
        boolean salir = true;
        do {
             for (Jugador jugador : jugadores) {
                 System.out.println(jugador);
                    if (jugador.getMojado() == false) {
                        System.out.println("El " + jugador.getNombre() + " no se mojó");
                        System.out.println("SIGUIENTE JUGADOR");
                        System.out.println("----------------");
                        
                    } else {
                        System.out.println("El " + jugador.getNombre() + " se mojó");
                        System.out.println(jugador.getNombre() + " Queda ELIMINADO");
                        System.out.println("----------------");
                        //jugadores.remove(jugador);
                        salir = false;
                        break;
                    }
                    jugador.setMojado(JS.disparo(revolver, RAS));
                }
        } while (salir);
    }
}

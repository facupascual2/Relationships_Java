
package main;

import entidad.Baraja;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nuevo Juego");   

        boolean salir = true;
        baraja.crearBaraja();

        do {
          
            System.out.println("MENÚ");
            System.out.println("1-BARAJAR");
            System.out.println("2-SIGUIENTE CARTA");
            System.out.println("3-DAR MÁS CARTAS");
            System.out.println("4-CANTIDAD DE CARTAS DISPONIBLES");
            System.out.println("5-MOSTRAR CARTAS DEL MONTON");
            System.out.println("6-MOSTRAR CARTAS AÚN DISPONIBLES");
            System.out.println("0-SALIR DEL JUEGO");
            System.out.println("-------------------");
            System.out.println("Ingrese la opción deseada:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    baraja.siguienteCarta();
                    break;
                case 3:
                    baraja.darCartas();
                    break;
                case 4:
                    baraja.cartasDisponibles();
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 0:
                    System.out.println("Usted seleccionó SALIR");
                    salir = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
        } while (salir);

    }
}

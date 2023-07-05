
package main;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.PerroServicio;
import servicio.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServicio PS = new PerroServicio();
        PersonaServicio PersonaS = new PersonaServicio();
        System.out.println("------------------");
        System.out.println("Perros a Adoptar");
        ArrayList<Perro> perros = PS.crearListaPerro();
        System.out.println("------------------");
        System.out.println("Personas Adoptantes");
        ArrayList<Persona> personas = PersonaS.crearListaPersona();
        System.out.println("------------------");

        for (Persona persona : personas) {
            boolean confirmar = true;
            do {
                if (perros.isEmpty()) {
                    System.out.println("NO HAY PERROS PARA ADOPTAR");
                } else {
                    System.out.println("Perros en adopción: ");
                    System.out.println(perros);
                }
                System.out.println(persona.getNombre() + " Ingrese el nombre del perro a Adoptar");
                String perroAdoptado = leer.next();
                int cantDispAdop = 0;
                for (Perro perro : perros) {
                    if (perroAdoptado.equalsIgnoreCase(perro.getNombre())) {
                        System.out.println("FELICITACIONES usted adoptó a " + perro.getNombre().toUpperCase());
                        persona.setPerro(perro);
                        perros.remove(perro);
                        confirmar = false;
                        break;
                    } else {
                        cantDispAdop++;
                        if (cantDispAdop == perros.size()) {
                            System.out.println("El perro no se encuentra para ser Adoptado");
                            System.out.println("Desea intentar con otro perro (S/N)?");
                            if (leer.next().equalsIgnoreCase("N")) {
                                confirmar = false;
                            }
                        }
                    }
                }

            } while (confirmar);

        }
        System.out.println("------------------");
        System.out.println("ESTADO DE ADOPCIONES");
        if (perros.isEmpty()) {
            System.out.println("TODOS los perros fueron adoptados");
        } else {
            System.out.println("Perros aún en adopción: ");
            System.out.println(perros);
        }
        System.out.println(personas);
        System.out.println("------------------");
    }

}

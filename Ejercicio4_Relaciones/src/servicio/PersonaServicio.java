
package servicio;

import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona personaAux = new Persona();
        System.out.println("------------------");
        System.out.println("Ingrese el nombre de la Persona");
        personaAux.setNombre(leer.next());
        System.out.println("Ingrese el Apellido de la Persona");
        personaAux.setApellido(leer.next());
        System.out.println("Ingrese el DNI de la Persona");
        personaAux.setDni(leer.nextInt());
        System.out.println("Ingrese la edad de la Persona");
        personaAux.setEdad(leer.nextInt());
        System.out.println("------------------");
        return personaAux;
    }
    
    public ArrayList<Persona> crearListaPersona(){
        ArrayList<Persona> personasAux = new ArrayList();
        boolean salir = true;
        do {
          personasAux.add(crearPersona());
            System.out.println("Desea agregar otra Persona (S/N)?");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);
        return personasAux;
    }
}
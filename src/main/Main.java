package main;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        //Personas
        boolean salirPersona = true;
        do {
            Persona persona = new Persona();
            System.out.println("Nombre: ");
            persona.setNombre(leer.next());
            System.out.println("Apellido: ");
            persona.setApellido(leer.next());
            System.out.println("Edad: ");
            persona.setEdad(leer.nextInt());
            System.out.println("Documento: ");
            persona.setDocumento(leer.nextInt());

            //Perros
            boolean salirPerro = true;
            ArrayList<Perro> perros = new ArrayList();
            do {
                System.out.println("Nombre perro: ");
                Perro perro = new Perro();
                perro.setNombre(leer.next());
                System.out.println("Raza: ");
                perro.setRaza(leer.next());
                System.out.println("Edad: ");
                perro.setEdad(leer.nextInt());
                System.out.println("Tamaño: ");
                perro.setTamaño(leer.next());
                perros.add(perro);
                persona.setPerro(perros);
                System.out.println("Desea ingresar otro Perro? ");
                if (leer.next().equalsIgnoreCase("N")) {
                    salirPerro = false;
                    System.out.println("Usted No agregará más Perros");
                }
            } while (salirPerro);
            personas.add(persona);
            System.out.println("Desea Ingresar otra Persona?: ");
            if (leer.next().equalsIgnoreCase("N")) {
                salirPersona = false;
                System.out.println("Usted No agregará más Personas");
            }
        } while (salirPersona);
        System.out.println(personas);

    }
}
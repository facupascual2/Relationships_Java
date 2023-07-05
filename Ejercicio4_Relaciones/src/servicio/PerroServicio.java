
package servicio;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Perro crearPerro(){
        Perro perroAux = new Perro();
        System.out.println("------------------");
        System.out.println("Ingrese el nombre del Perro");
        perroAux.setNombre(leer.next());
        System.out.println("Ingrese la raza del Perro");
        perroAux.setRaza(leer.next());
        System.out.println("Ingrese la edad del Perro");
        perroAux.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del Perro");
        perroAux.setTamaño(leer.next());
        System.out.println("------------------");
        return perroAux;
    }
    
    public ArrayList<Perro> crearListaPerro(){
        ArrayList<Perro> perrosAux = new ArrayList();
        boolean salir = true;
        do {
          perrosAux.add(crearPerro());
            System.out.println("Desea agregar otro Perro (S/N)?");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);
        return perrosAux;
    }
}

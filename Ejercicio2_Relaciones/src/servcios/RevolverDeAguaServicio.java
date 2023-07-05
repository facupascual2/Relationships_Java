 /*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.*/

/*• mojar(): devuelve true si la posición del agua coincide con la posición actual*/

 /*• siguienteChorro(): cambia a la siguiente posición del tambor*/
package servcios;

import entidad.RevolverDeAgua;
import java.util.Random;


public class RevolverDeAguaServicio {
   
    
    public RevolverDeAgua llenarRevolver(){
        RevolverDeAgua revolverAux = new RevolverDeAgua();
        Random aleatorio = new Random();
        revolverAux.setPosicionActual(aleatorio.nextInt(6)+1);
        revolverAux.setPosicionAgua(aleatorio.nextInt(6)+1);
        return revolverAux;
    }
    
    
    
    public boolean mojar(RevolverDeAgua revolver){
        boolean mojado = false;
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            mojado = true;
        }
        return mojado;
    }
    
 
    public void siguienteChorro(RevolverDeAgua revolver){
        if (revolver.getPosicionActual()==6) {
            revolver.setPosicionActual(1);
        }else{
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
    }
}

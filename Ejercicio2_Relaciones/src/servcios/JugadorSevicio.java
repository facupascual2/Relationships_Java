 /*Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    
package servcios;

import entidad.Jugador;
import entidad.RevolverDeAgua;

public class JugadorSevicio {
    
  
    
    public boolean disparo(RevolverDeAgua revolver, RevolverDeAguaServicio RAS){
        boolean mojado = false;
        if (RAS.mojar(revolver)) {
           mojado = true;
        }else{
            RAS.siguienteChorro(revolver);
        }
        return mojado;
    }
}

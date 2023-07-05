    /*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:*/
package main;

import entidad.Juego;
import entidad.RevolverDeAgua;
import servcios.RevolverDeAguaServicio;


public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.llenarJuego();
        juego.ronda();
     }
}

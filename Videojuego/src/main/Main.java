package main;

import gameObjects.*;
import gameObjects.Color;
import main.BadIceCream;
import main.Bloque;
import main.Mapa;
import main.Nivel;
import java.awt.*;
import static gameObjects.Color.COLOR_MORADO;

public class Main {
    public static void main(String[] args) {
        String ROJO = "\u001B[31m";
        String RESET = "\u001B[0m";

        BadIceCream badIceCream = new BadIceCream();

        //Caso 1: Agregamos un jugador e inicializamos el videojuego y nos debe dejar inicializar
        Jugador jugador1 = badIceCream.agregarJugador(new Jugador(100, 5, Color.COLOR_NEGRO, new Score(0)));
        Jugador jugador2 = badIceCream.agregarJugador(new Jugador(100, 5, Color.COLOR_MORADO, new Score(0)));
        /*
        Personaje personaje1 = badIceCream.agregarJugador(new Jugador(100, 5, Color.COLOR_NEGRO , new Score(0) ));
        Personaje personaje2 = badIceCream.agregarJugador(new Jugador(100, 5, COLOR_MORADO , new Score(0) ));

         */
        System.out.println(ROJO + "Caso 1: Nos permite inicializar el videojuego " + RESET);
        badIceCream.iniciarJuego();

        //Caso 2: Agregamos otro jugador e inicializamos el videojuego y no nos debe dejar inicializar
        Jugador jugador3 = badIceCream.agregarJugador(new Jugador(100, 5, Color.COLOR_VERDE, new Score(0)));
        System.out.println(ROJO + "Caso 2: no debe dejar crear otro jugador (null) ---> " + RESET + jugador3);

        //Agregamos un enemigo
        Enemigo enemigo = badIceCream.agregarEnemigo();
        //Agregamos un mapa
        Mapa mapa1 = badIceCream.agregarMapa(new Nivel(1, new Bloque(4), new Manzana(10, 10)));
        System.out.println(ROJO + "Caso 3: creamos un mapa --> " + RESET + mapa1);

        //Caso 4: Los jugadores recogen frutas y debe aumentar el score
        jugador1.recogerFrutas(new Manzana(10, 10));
        jugador1.recogerFrutas(new Manzana(10, 10));
        jugador1.recogerFrutas(new Manzana(10, 10));
        jugador2.recogerFrutas(new Manzana(10, 10));
        System.out.println(ROJO + "Caso 4: Incrementa el puntuaje de cada jugador según las frutas atrapadas " + RESET );
        badIceCream.imprimirScore(jugador1);
        badIceCream.imprimirScore(jugador2);

        //Caso 5: Haremos la prueba de que pasa cuando un enemigo nos ataca y nos mata
        enemigo.atacar(jugador1);
        System.out.println(ROJO + "Caso 5: el enemigo atacar al Jugador Uno , por lo tanto el jugador atacado está vivo? ---> " + RESET + jugador1.estaVivo);
        System.out.println("El juego sigue iniciado? " + badIceCream.isEstaIniciado());

        //Caso 6: Se debe detener el juego cuando ambos jugadores estén muertos
        enemigo.atacar(jugador2);
        System.out.println(ROJO + "Caso 6: el juego debe acabar luego de que ambos jugadores estén muertos " + RESET);
        badIceCream.verificarEstadoJuego();
        System.out.println("El juego sigue iniciado? " + badIceCream.isEstaIniciado());


    }
}
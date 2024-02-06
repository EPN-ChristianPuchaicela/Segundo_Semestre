package main;

import gameObjects.Enemigo;
import gameObjects.Jugador;
import gameObjects.Personaje;
import gameObjects.Score;

import java.util.ArrayList;
import java.util.List;

public class BadIceCream {
    private static final int NUMERO_JUGADORES = 2;
    private final List<Jugador> jugadores;
    private final ArrayList<Enemigo> enemigos;
    private final ArrayList<Mapa> mapas;
    private final ArrayList<Nivel> niveles;
    private boolean estaIniciado;
    private Score score;



    public BadIceCream() {
        jugadores = new ArrayList<>();
        enemigos = new ArrayList<>();
        mapas = new ArrayList<>();
        niveles = new ArrayList<>();
        estaIniciado = false;
        this.score = new Score(0);
    }

    public void iniciarJuego() {
        if(!sePuedeAgregarNuevoPersonaje()){
            System.out.println("Excede el número de jugadores");
            estaIniciado = false;
            return;
        }
        System.out.println("Inicializado con éxito");
        estaIniciado = true;
    }

    public Jugador agregarJugador(Jugador jugador) {
        if (!sePuedeAgregarNuevoPersonaje()) {
            return null;
        }

        jugadores.add(jugador);

        return jugador;
    }
    public Enemigo agregarEnemigo() {
        Enemigo nuevoEnemigo = new Enemigo(50, 2);
        enemigos.add(nuevoEnemigo);
        return nuevoEnemigo;
    }

    public boolean sePuedeAgregarNuevoPersonaje() {
        if (estaIniciado || jugadores.size() > NUMERO_JUGADORES) {
            return false;
        }
        return true;
    }


    public Mapa agregarMapa(Nivel nivel) {
        Mapa nuevoMapa = new Mapa(nivel);
        mapas.add(nuevoMapa);
        return nuevoMapa;
    }
    public void parar(){
        estaIniciado = false;
    }
    public void verificarEstadoJuego() {

            if (todosJugadoresMuertos()) {
                parar();
                System.out.println(estaIniciado);
            } else{
                estaIniciado = true;
                System.out.println(estaIniciado);
            }

    }
    private boolean todosJugadoresMuertos() {
        for (Jugador jugador : jugadores) {
            if (jugador.isEstaVivo()) {
                return false;
            }
        }
        return true;
    }

    public boolean isEstaIniciado() {
        return estaIniciado;
    }
    public void imprimirScore(Jugador jugador) {
        System.out.println("Puntos del jugador " + jugador.getColor() + ": " + jugador.getScore().getPuntuacion());
    }
}


package main;

import gameObjects.Fruta;



public class Nivel {
    private final Integer numeroNivel;
    private final Bloque bloque;
    private final Fruta fruta;

    public Nivel(int numeroNivel, Bloque bloque, Fruta fruta) {
        this.numeroNivel = numeroNivel;
        this.bloque = bloque;
        this.fruta = fruta;
    }
}

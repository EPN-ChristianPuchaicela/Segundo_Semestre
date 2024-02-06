package gameObjects;

public abstract class Personaje {
    private final int vida;
    private final double velocidad;

    public Personaje(int vida, double velocidad) {
        this.vida = vida;
        this.velocidad = velocidad;

    }

    public abstract void morir();

    public abstract void destruirBloque();

    public abstract void mover();



    public abstract void atacar(Jugador jugador);
}

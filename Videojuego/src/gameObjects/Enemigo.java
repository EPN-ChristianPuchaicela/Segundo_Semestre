package gameObjects;

public class Enemigo extends Personaje {
    private Jugador jugador;

    public Enemigo(int vida, double velocidad) {
        super(vida, velocidad);
    }

    @Override
    public void morir() {

    }

    @Override
    public void destruirBloque() {

    }

    @Override
    public void mover() {

    }

    @Override
    public void atacar(Jugador jugador) {
        System.out.println("¡Ataque!");
        if(jugador !=null){
            jugador.morir();
            //badIceCreamo.verificarEstadoJuego();

        }
    }
}

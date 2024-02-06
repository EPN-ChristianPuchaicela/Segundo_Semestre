package gameObjects;

import main.BadIceCream;

public class Jugador extends Personaje {
    private final Score score;
    private final Color color;
    public boolean estaVivo;
    private BadIceCream badIceCream;

    public Color getColor() {
        return color;
    }

    public Jugador(int vida, double velocidad, Color color, Score score) {
        super(vida, velocidad);
        this.color = color;
        this.score = score;
        estaVivo = true;
    }


    @Override
    public void morir() {
        estaVivo = false;

    }

    @Override
    public void destruirBloque() {

    }

    @Override
    public void mover() {

    }

    @Override
    public void atacar(Jugador jugador) {

    }
    public void recogerFrutas(Fruta fruta){
        score.sumarPuntos(fruta);

    }

    public Score getScore() {
        return score;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }


}

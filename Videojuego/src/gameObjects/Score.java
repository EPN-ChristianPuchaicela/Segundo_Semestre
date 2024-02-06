// gameObjects/Score.java
package gameObjects;

public class Score {
    private int puntuacion;

    public Score(int puntuacionInicial) {
        this.puntuacion = puntuacionInicial;

    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void sumarPuntos(Fruta fruta) {
        puntuacion += fruta.getPuntuajeFruta();

    }

}

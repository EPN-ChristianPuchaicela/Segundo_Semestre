package gameObjects;

public abstract class Fruta {
    private final int numeroFrutas;
    private final int puntuajeFruta;

    public int getNumeroFrutas() {
        return numeroFrutas;
    }

    public int getPuntuajeFruta() {
        return puntuajeFruta;
    }

    public Fruta(int numeroFrutas, int puntuajeFruta) {
        this.puntuajeFruta = puntuajeFruta;
        this.numeroFrutas = numeroFrutas;
    }
}

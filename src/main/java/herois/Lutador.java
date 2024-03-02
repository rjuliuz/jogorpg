package herois;

public interface Lutador {
    int atacar();
    void receberDano(int danoSofrido);
    int getVida();
    void setVida(int vida);

    String getNome();
}

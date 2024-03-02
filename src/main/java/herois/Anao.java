package herois;

import java.util.ArrayList;
import java.util.Random;

public class Anao extends Personagem implements Lutador {
    public Anao(String nome) {
        super(nome, 1800, 10, 20, 15, 50);
    }

    public int impactoSismico() {
        return (getForca() + getInteligencia()) * 2;
    }

    public int lancaObsidiana() {
        return getMagia() * 3;
    }

    public int chuvaDeEstilhacos() {
        return getAgilidade() * 3;
    }

    public int furiaDoGuerreiro() {
        return getForca() * getLevel() * 5;
    }

    public int explosaoDeLava() {
        return (getInteligencia() * 4) + (getMagia() * 2);
    }

    @Override
    public int atacar() {
        Random random = new Random();
        int escolhaAtaque = random.nextInt(5); // Gera um número entre 0 e 4

        switch (escolhaAtaque) {
            case 0:
                return impactoSismico();
            case 1:
                return lancaObsidiana();
            case 2:
                return chuvaDeEstilhacos();
            case 3:
                return furiaDoGuerreiro();
            case 4:
                return explosaoDeLava();
            default:
                return 0;
        }
    }

    @Override
    public void receberDano(int danoSofrido) {
        this.setVida(this.getVida() - danoSofrido);
    }
}

package herois;

import java.util.Random;

public class Humano extends Personagem implements Lutador {


    public Humano(String nome) {
        super(nome, 1800, 50, 10, 20, 80);
    }

    public int corteDuplo() {
        return (getForca() + getAgilidade()) * 2;
    }

    public int flechaPenetrante() {
        return (getForca() + getInteligencia()) * 2;
    }

    public int golpeDeMisericordia() {
        return getInteligencia() * 5;
    }

    public int vorticeDeAco() {
        return getAgilidade() * 4;
    }

    public int chamadoDoHeroi() {
        return getForca() * getLevel() * 3;
    }

    @Override
    public int atacar() {
        Random random = new Random();
        int escolhaAtaque = random.nextInt(5); // Gera um número entre 0 e 4

        switch (escolhaAtaque) {
            case 0:
                return corteDuplo();
            case 1:
                return flechaPenetrante();
            case 2:
                return golpeDeMisericordia();
            case 3:
                return vorticeDeAco();
            case 4:
                return chamadoDoHeroi();
            default:
                return 0;
        }
    }

    @Override
    public void receberDano(int danoSofrido) {
        this.setVida(this.getVida() - danoSofrido);
    }
}

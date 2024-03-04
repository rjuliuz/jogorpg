package herois;

import java.util.Random;

public class Elfos extends Personagem implements Lutador {

    public Elfos(String nome) {
        super(nome, 1800, 20, 80, 30, 100);
    }

    public int tempestadeDeFlechas() {
        return getMagia() * 3;
    }

    public int laminaEterea() {
        return getInteligencia() * 2;
    }

    public int raioDeLua() {
        return getMagia() * 4;
    }

    public int toqueDaNatureza() {
        return getMagia() * 2 + getAgilidade();
    }

    public int sinfoniaDasChamas() {
        return (getMagia() + getInteligencia()) * 2;
    }

    @Override
    public int atacar() {
        Random random = new Random();
        int escolhaAtaque = random.nextInt(5);

        switch (escolhaAtaque) {
            case 0:
                return tempestadeDeFlechas();
            case 1:
                return laminaEterea();
            case 2:
                return raioDeLua();
            case 3:
                return toqueDaNatureza();
            case 4:
                return sinfoniaDasChamas();
            default:
                return 0;
        }
    }

    @Override
    public void receberDano(int dano) {
        super.setVida(super.getVida() - dano);
    }
}

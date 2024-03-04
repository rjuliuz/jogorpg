package monstros;

public class Balrog extends Monstro  {
    public Balrog() {
        super("Ballrog", 300, 50);
    }

    public int ataqueBasico() {
        return getForca() * 5;
    }

    public int atacar() {
        return ataqueBasico();
    }

    public void adicionarItem() {
        adicionarItem("Flecha de Fogo");
    }

    @Override
    public void receberDano(int dano) {
        // Balrog tem resistência a dano, então recebe apenas metade do dano
        super.receberDano(dano / 2);
    }
}

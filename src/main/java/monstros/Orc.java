package monstros;

public class Orc extends Monstro  {
    public Orc() {
        super("Orc", 100, 15 );
    }

    public int ataqueBasico() {
        return getForca() * 3;
    }

    public int atacar() {
        return ataqueBasico();
    }

    public void adicionarItem() {
        adicionarItem("Espada Mágica");
    }

    @Override
    public void receberDano(int dano) {
        // Balrog tem resistência a dano, então recebe apenas metade do dano
        super.receberDano(dano);
    }
}

package monstros;

public class Troll extends Monstro{
    public Troll() {
        super("Troll", 200, 30);
    }

    public int ataqueBasico() {
        return getForca() * 3;
    }

    public int atacar() {
        return ataqueBasico();
    }

    public void adicionarItem() {
        adicionarItem("Machado Escarlate");
    }

    @Override
    public void receberDano(int dano) {
        // Balrog tem resistência a dano, então recebe apenas metade do dano
        super.receberDano(dano);
    }
}

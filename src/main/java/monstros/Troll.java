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
}

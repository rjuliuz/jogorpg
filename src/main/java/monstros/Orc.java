package monstros;

class Orc extends Monstro  {
    public Orc() {
        super("Orc", 100, 15);
    }

    public int ataqueBasico() {
        return getForca() * 3;
    }

    public int atacar() {
        return ataqueBasico();
    }
}

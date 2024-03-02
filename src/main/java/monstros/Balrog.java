package monstros;

class Balrog extends Monstro  {
    public Balrog() {
        super("Orc", 300, 50);
    }

    public int ataqueBasico() {
        return getForca() * 5;
    }

    public int atacar() {
        return ataqueBasico();
    }
}

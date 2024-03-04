package monstros;

import java.util.ArrayList;

public abstract class Monstro {
    private String nome;
    private int vida;
    private int forca;
    private ArrayList<String> itens;

    public Monstro(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public abstract int atacar();

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0; // Garante que a vida não fique negativa
        }
    }
}

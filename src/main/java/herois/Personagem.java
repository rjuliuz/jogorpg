package herois;

import java.util.ArrayList;

public abstract class Personagem  {
    private String nome;
    private int vida;
    private int forca;
    private int magia;
    private int agilidade;
    private int inteligencia;
    private int level;
    private ArrayList<String> itens;

    public Personagem(String nome, int vida, int forca, int magia, int agilidade, int inteligencia) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.magia = magia;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.level = 1;
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public abstract int atacar();

    public abstract void receberDano(int dano);

    public void subirDeNivel(Personagem heroi) {
        int nivelAtual = heroi.getLevel();
        heroi.setLevel(nivelAtual + 1);
    }

    public void subirDeNivel() {
        this.level++;
        this.vida = 1800;
    }

    @Override
    public String toString() {
        return  " Nome: " + nome +
                " Vida: " + vida +
                " Força: " + forca +
                " Magia: " + magia +
                " Agilidade: " + agilidade +
                " Inteligência: " + inteligencia +
                " Level: " + level;
    }
}

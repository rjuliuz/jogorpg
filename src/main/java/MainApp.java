import herois.*;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Anao anao = new Anao("Gimli");
        Humano humano = new Humano("Aragorn");
        Elfos elfos = new Elfos("Legolas");

        Personagem[] personagens = {anao, humano, elfos};

        Random random = new Random();
        int primeiroLutadorIndex = random.nextInt(personagens.length);
        int segundoLutadorIndex = primeiroLutadorIndex;
        while (segundoLutadorIndex == primeiroLutadorIndex) {
            segundoLutadorIndex = random.nextInt(personagens.length);
        }

        Arena arena = new Arena();
        arena.duelo((Lutador) personagens[primeiroLutadorIndex], (Lutador) personagens[segundoLutadorIndex]);

        for (Personagem p : personagens) {
            System.out.println(p.toString());
        }
    }
}

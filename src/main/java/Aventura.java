import herois.Personagem;
import herois.Anao;
import herois.Elfos;
import herois.Humano;
import monstros.Monstro;
import monstros.Orc;
import monstros.Troll;
import monstros.Balrog;

import java.util.Random;

public class Aventura {
    private Random random = new Random();

    public void iniciarAventura() {
        Personagem heroi = gerarHeroiAleatorio();
        assert heroi != null;
        heroi.getLevel();

        System.out.println("A aventura começa para " + heroi.getNome() + "!");

        while (heroi.getLevel() < 10) {
            Monstro monstro = gerarMonstroAleatorio();
            System.out.println(heroi.getNome() + " encontrou um " + monstro.getNome() + " no nível " + heroi.getLevel() + "!");

            boolean vitoria = lutar(heroi, monstro);
            if (vitoria) {
                heroi.subirDeNivel(heroi);
                heroi.subirDeNivel();
                System.out.println(heroi.getNome() + " subiu para o nível " + heroi.getLevel() + "!");
            } else {
                System.out.println(heroi.getNome() + " foi derrotado pelo " + monstro.getNome() + "...");
                break;
            }
        }

        if (heroi.getLevel() >= 10) {
            System.out.println(heroi.getNome() + " alcançou o nível máximo e completou a aventura!");
        }
    }

    private boolean lutar(Personagem heroi, Monstro monstro) {
        while (heroi.getVida() > 0 && monstro.getVida() > 0) {
            int danoHeroi = heroi.atacar();
            monstro.receberDano(danoHeroi);
            System.out.println(heroi.getNome() + " ataca e causa " + danoHeroi + " de dano!");

            if (monstro.getVida() > 0) {
                int danoMonstro = monstro.atacar();
                heroi.receberDano(danoMonstro);
                System.out.println(monstro.getNome() + " ataca e causa " + danoMonstro + " de dano!");
            }
        }

        return heroi.getVida() > 0;
    }



    private Personagem gerarHeroiAleatorio() {
        int escolha = random.nextInt(3);
        switch (escolha) {
            case 0:
                return new Anao("Gimli");
            case 1:
                return new Elfos("Legolas");
            case 2:
                return new Humano("Aragorn");
            default:
                return null;
        }
    }

    private Monstro gerarMonstroAleatorio() {
        int escolha = random.nextInt(3);
        switch (escolha) {
            case 0:
                return new Orc();
            case 1:
                return new Troll();
            case 2:
                return new Balrog();
            default:
                return null;
        }
    }
}

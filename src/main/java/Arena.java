import herois.Anao;
import herois.Elfos;
import herois.Humano;
import herois.Lutador;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Arena {
    private List<Lutador> heroisDisponiveis = Arrays.asList(
            new Anao("Gimli"),
            new Elfos("Legolas"),
            new Humano("Aragorn")
    );
    private Random random = new Random();

    public void duelo() {
        // Escolhe dois heróis aleatórios da lista
        Lutador heroi1 = heroisDisponiveis.get(random.nextInt(heroisDisponiveis.size()));
        Lutador heroi2;
        do {
            heroi2 = heroisDisponiveis.get(random.nextInt(heroisDisponiveis.size()));
        } while (heroi1 == heroi2);

        // Decidindo quem ataca primeiro de forma aleatória
        Lutador primeiroAtacante = random.nextBoolean() ? heroi1 : heroi2;
        Lutador segundoAtacante = primeiroAtacante == heroi1 ? heroi2 : heroi1;

        // Duelo
        int dano = primeiroAtacante.atacar();
        System.out.println(primeiroAtacante.getNome() + " aplica um golpe e causa " + dano + " de dano.");
        segundoAtacante.receberDano(dano);
        System.out.println(segundoAtacante.getNome() + " fica com " + segundoAtacante.getVida() + " de vida.");

        if(segundoAtacante.getVida() > 0){
            dano = segundoAtacante.atacar();
            System.out.println(segundoAtacante.getNome() + " aplica um golpe e causa " + dano + " de dano.");
            primeiroAtacante.receberDano(dano);
            System.out.println(primeiroAtacante.getNome() + " fica com " + primeiroAtacante.getVida() + " de vida.");
        }

        // Declaração do vencedor
        if(heroi1.getVida() > heroi2.getVida()){
            System.out.println(heroi1.getNome() + " é o vencedor do Duelo com " + heroi1.getVida() + " de vida restante.");
        } else if(heroi2.getVida() > heroi1.getVida()) {
            System.out.println(heroi2.getNome() + " é o vencedor do Duelo com " + heroi2.getVida() + " de vida restante.");
        } else {
            System.out.println("O duelo terminou em empate!");
        }
    }
}

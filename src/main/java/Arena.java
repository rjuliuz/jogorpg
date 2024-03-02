import herois.Lutador;

import java.util.Random;

public class Arena {
    public void duelo(Lutador a, Lutador b){
        Random random = new Random();

        // Decidindo quem ataca primeiro de forma aleatória
        Lutador primeiroAtacante, segundoAtacante;
        if(random.nextBoolean()){
            primeiroAtacante = a;
            segundoAtacante = b;
        } else {
            primeiroAtacante = b;
            segundoAtacante = a;
        }

        // Primeiro ataque
        int dano = primeiroAtacante.atacar();
        segundoAtacante.receberDano(dano);

        // Verifica se o segundo lutador ainda está vivo para contra-atacar
        if(segundoAtacante.getVida() > 0){
            dano = segundoAtacante.atacar();
            primeiroAtacante.receberDano(dano);
        }

        // Declaração do vencedor
        if(a.getVida() < b.getVida()){
            System.out.println(b.getNome() + " é o vencedor do Duelo");
        } else if(b.getVida() < a.getVida()) {
            System.out.println(a.getNome() + " é o vencedor do Duelo");
        } else {
            System.out.println("O duelo terminou em empate!");
        }
    }
}


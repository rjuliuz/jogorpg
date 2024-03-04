import herois.*;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();
        aventura.iniciarAventura();

        Arena arena = new Arena();
        arena.duelo();
    }
}

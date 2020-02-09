package io.github.mauricioborges.sushi;

import java.util.Random;

import static java.util.Arrays.asList;

public class MenuThings {
    enum Dishes {
        HOTROLL,
        YAKIIKA,
        HAMACHI_KAMA,
        SUNOMONO,
        MAGURO,
        TORO,
        POKI_ROLL,
        TATAKI_ROLL,
        FUTOMAKI;
    }

    public void showMenuThings() {
        System.out.println("MENU: " + asList(Dishes.values()));
    }

    public Dishes chooseDisheRandomly() {
        Integer disheIndex = new Random().nextInt(Dishes.values().length);
        System.out.println("Prato Escolhido: " + Dishes.values()[disheIndex]);
        return Dishes.values()[disheIndex];
    }
}

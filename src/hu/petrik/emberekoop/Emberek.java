package hu.petrik.emberekoop;

import java.util.ArrayList;
import java.util.List;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberTomb) {
        this.emberek = new ArrayList<>();
        /*
        for (Ember e: emberTomb) {
            this.emberek.add(e);
        }
        */
    }
}

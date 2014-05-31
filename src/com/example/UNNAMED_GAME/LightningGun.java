package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface LightningGun {

}

public class LightningGun implements Weapon {

    public LightningGun() {
        Weapon LG = new Weapon(10, 1, 0, 10);
    }
}

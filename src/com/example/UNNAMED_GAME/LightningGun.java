package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public class LightningGun extends Weapon {

    public LightningGun() {
        Weapon LG = new Weapon(10, 1, 0, 10, 1);
    }

    @Override
    public void onFire() {
        onFire(LIGHTNINGGUN);
    }
}

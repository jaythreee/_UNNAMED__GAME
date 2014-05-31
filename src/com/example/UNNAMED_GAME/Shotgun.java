package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public class Shotgun extends Weapon {

    public Shotgun() {
        Weapon SG = new Weapon(8, 50, 0, 10, 1);
    }

    @Override
    public void onFire() {
        onFire(SHOTGUN);
    }
}

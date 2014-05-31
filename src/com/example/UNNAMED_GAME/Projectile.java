package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public class Projectile {

    public Projectile(enum weaponProjectileType) {
        switch(weaponProjectileType) {
            case SHOTGUN:
                break;
            case ROCKETLAUNCHER:
                break;

            case RAILGUN:
                break;

            case LIGHTNINGGUN:
                break;

            default:
                // throw an error
        }
    }
}

package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface Projectile {
    public boolean predictEnvironmentCollisionPoint();
    public double[] getCurrentCoordinates();
}

public class Projectile {

    private double[] coordinates;

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

    // if projectile.center intersects with environment.edge
    public boolean predictEnvironmentCollisionPoint() {

    }

    public double[] getCurrentCoordinates() {
        return coordinates;
    }
}

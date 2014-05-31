package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface Projectile {
    public boolean predictEnvironmentCollisionPoint();
    public double[] getCurrentCoordinates();
}

public class sub implements Projectile {

    private double[] coordinates;
    private double projectileTravelSpeed;

    public Projectile(double[] launchCoordinates, double projTravelSpd, enum weaponProjectileType) {

        projectileTravelSpeed = projTravelSpd;

        for (int i = 0; i < 3; i++) {
            coordinates[i] = launchCoordinates[i];
        }


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

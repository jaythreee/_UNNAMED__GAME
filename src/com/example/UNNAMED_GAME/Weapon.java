package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public class Weapon {

    // Properties common to all types of weapons
    private double damagePerShot;
    private double projectileTravelSpeed;

    public Weapon(double dmgPerShot, double projSpeed) {
        damagePerShot = dmgPerShot;
        projectileTravelSpeed = projSpeed;
    }

    public void onFire() {
        Projectile proj = new Projectile();
    }
}
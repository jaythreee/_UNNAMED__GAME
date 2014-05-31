package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public class Weapon {

    // Properties common to all types of weapons
    private double damagePerShot;
    private double projectileTravelSpeed;
    private double splashRadius;
    private int availableAmmo;

    public Weapon(double dmgPerShot, double projSpeed, double splashR, int availAmmo) {
        damagePerShot = dmgPerShot;
        projectileTravelSpeed = projSpeed;
        splashRadius = splashR;
        availableAmmo = availAmmo;
    }

    public void onFire() {
        Projectile proj = new Projectile();
    }

    public void onSpawn() {
        // need a way to communicate to Map/Environment class
        // that some set of points on map are occupied by weapon
    }

    public void loseAmmo() {
        availableAmmo = availableAmmo--;
    }

    public void gainAmmo(int howMuch) {
        availableAmmo = availableAmmo + howMuch;
    }

    public enum Weapons{
        SHOTGUN,
        ROCKETLAUNCHER,
        RAILGUN,
        LIGHTNINGGUN;
    }
}

package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface Weapon {
    public int getCurrentAmmo();
    public void onFire();
    public void onSpawn();
}

public class Weapon {

    // Properties common to all types of weapons
    private double damagePerShot;
    private double projectileTravelSpeed;
    private double splashRadius;
    private int availableAmmo;
    private int maxAmmo;

    public Weapon(double dmgPerShot, double projSpeed, double splashR, int availAmmo, int maxAmmo) {
        damagePerShot = dmgPerShot;
        projectileTravelSpeed = projSpeed;
        splashRadius = splashR;
        availableAmmo = availAmmo;
    }

    public void onFire(enum weaponType) {
        if(availableAmmo > 0) {
            Projectile proj = new Projectile(weaponType);
            loseAmmo();
        }
    }

    public void onSpawn() {
        // need a way to communicate to Map/Environment class
        // that some set of points on map are occupied by weapon
    }

    // Want to decrement by 1 every time probably?
    public void loseAmmo() {
        availableAmmo = availableAmmo--;
    }

    // May want to give different mechanics for picking up ammo. For example
    // 1) Picking up weapon after killing opponent - set howMuch = Opponent.Weapon.availableAmmo
    // 2) Picking up fresh weapon - set howMuch = Weapon.defaultAvailableAmmo
    public void gainAmmo(int howMuch) {
        availableAmmo = availableAmmo + howMuch;
    }

    public int getCurrentAmmo() {
        return availableAmmo;
    }

    public enum Weapons{
        SHOTGUN,
        ROCKETLAUNCHER,
        RAILGUN,
        LIGHTNINGGUN;
    }
}

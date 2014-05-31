package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface Player {
    public void onSpawn();
    public void onDeath();

}

public class Player {

    // Properties held by all players
    public int healthPoints;
    public int armorPoints;
    public enum[] availableWeapons;

    public void onSpawn() {
        healthPoints = 100;
        armorPoints = 0;
        availableWeapons.push(new Shotgun);
    }
}

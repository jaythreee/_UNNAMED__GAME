package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface Player {
    public void onSpawn();
    public void onDeath();

    public double[] getPosition();
    public double[] getVelocity();
    public double[] getAcceleration();
}

public class sub implements Player {

    // Properties held by all players
    public int healthPoints;
    public int armorPoints;
    public enum[] availableWeapons;
    public int respawnTimer;

    // These should all be 2d arrays
    public double[] position;
    public double[] velocity;
    public double[] acceleration;

    public Player() {
        healthPoints = 100;
        armorPoints = 0;
        availableWeapons.push(new Shotgun);
        respawnTimer = 0;

        // Need to implement spawn point logic
        position = [0, 0];
        velocity = [0, 0];
        acceleration = [0, 0];
    }

    public double[] getPosition() {
        return position;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public double[] getAcceleration() {
        return acceleration;
    }
}

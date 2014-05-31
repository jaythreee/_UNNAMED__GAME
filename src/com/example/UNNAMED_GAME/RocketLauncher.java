package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface RocketLauncher {

}

public class RocketLauncher implements Weapon {

    public RocketLauncher() {
        Weapon RL = new Weapon(100, 100, 100, 10, 1);
    }

    @Override
    public void onFire() {
        onFire(ROCKETLAUNCHER);
    }
}

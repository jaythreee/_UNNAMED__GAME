package com.example.UNNAMED_GAME;

/**
 * Created by drew on 5/31/2014.
 */
public interface Railgun {

}

public class Railgun implements Weapon {

    public Railgun() {
        Weapon Rail = new Weapon(100, 100, 0, 10, 1);
    }

    @Override
    public void onFire() {
        onFire(RAILGUN);
    }
}

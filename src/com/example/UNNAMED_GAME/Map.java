package com.example.UNNAMED_GAME;

/**
 * Created by j3 on 5/31/2014.
 */
public class Map
{
    public enum GridObjects
    {
        EMPTY,
        WALL,
        WEAPON,
        PLAYER,
        ITEM,
        POWERUP,
    }
    public void SetObjPos(int centerX, int centerY, GridObjects obj)
    {
        int xStart, yStart, xEnd, yEnd;

        switch (obj)
        {
            case EMPTY:
            case WALL:
                xStart = xEnd = centerX;
                yStart = yEnd = centerY;
                break;

            case WEAPON:
                xStart = centerX - WEAPON_SIZE_X / 2;
                yStart = centerY - WEAPON_SIZE_Y / 2;
                xEnd = centerX + WEAPON_SIZE_X / 2 - 1;
                yEnd = centerY + WEAPON_SIZE_Y / 2 - 1;
                break;

            case PLAYER:
                xStart = centerX - PLAYER_SIZE_X / 2;
                yStart = centerY - PLAYER_SIZE_Y / 2;
                xEnd = centerX + PLAYER_SIZE_X / 2 - 1;
                yEnd = centerY + PLAYER_SIZE_Y / 2 - 1;
                break;

            case ITEM:
                xStart = centerX - ITEM_SIZE_X / 2;
                yStart = centerY - ITEM_SIZE_Y / 2;
                xEnd = centerX + ITEM_SIZE_X / 2 - 1;
                yEnd = centerY + ITEM_SIZE_Y / 2 - 1;
                break;

            case POWERUP:
                xStart = centerX - POWERUP_SIZE_X / 2;
                yStart = centerY - POWERUP_SIZE_Y / 2;
                xEnd = centerX + POWERUP_SIZE_X / 2 - 1;
                yEnd = centerY + POWERUP_SIZE_Y / 2 - 1;
                break;
        }

        /* Make sure we're still inside map */
        if (xStart < 0)
            xStart = 0;
        if (yStart < 0)
            yStart = 0;
        if (xEnd > MAP_MAX_X)
            xEnd = MAP_MAX_X;
        if (yEnd > MAP_MAX_Y)
            yEnd = MAP_MAX_Y
                    ;
        for (int x = xStart; x <= xEnd; x++)
            grid[x][y] = obj;
    }

    public boolean CanMoveTo(int x, int y)
    {

    }



    private static final int MAP_MAX_Y = 2048;
    private static final int MAP_MAX_X = 2048;

    private short[][] grid = new short[MAP_MAX_X][MAP_MAX_Y];
}

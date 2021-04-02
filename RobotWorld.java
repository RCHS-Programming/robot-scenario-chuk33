import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotWorld extends World
{
    public RobotWorld()
    {    
        super(800, 600, 1);
        addObject( new Robot(), 400, 560 );
        addObject( new ScoreBoard(), 75, 555 );
        addObject( new Block(), 400, 500 );
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotWorld extends World
{
    public RobotWorld()
    {    
        super(800, 600, 1);
        addObject( new Robot(), 700, 560 );
        addObject( new ScoreBoard(), 75, 555 );
        addObject( new Pizza(), 320, 400 );
        addObject( new Pizza(), 480, 400 );
        addObject( new Pizza(), 40, 50 );
        addObject( new Pizza(), 400, 300 );
        addObject( new Pizza(), 600, 100 );
        addObject( new Block(), 400, 400 );
        addObject( new Brick(), 60, 400 );
        addObject( new Brick(), 740, 400 );
        addObject( new Brick(), 160, 400 );
        addObject( new Brick(), 640, 400 );
        addObject( new Brick(), 240, 400 );
        addObject( new Brick(), 560, 400 );
        addObject( new House(), 700, 50 );
    }
}

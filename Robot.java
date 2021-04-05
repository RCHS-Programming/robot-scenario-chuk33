import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Robot extends Actor
{
    int Hp = 10;
    int Points = 0;
 public void act() 
 {
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY() - 5);
        }
        if( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX() - 5, getY() );
        }
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX(), getY() + 5 );
        }
        if( Greenfoot.isKeyDown("d") )
        {
            setLocation( getX() + 5, getY() );
        }
        if (isTouching(Block.class) )
        {
            setLocation(700,560);
            loseHp();
        }
        if (isTouching(Brick.class) )
        {
            setLocation(700,560);
        }
        if (isTouching(Pizza.class) )
        {
            removeTouching(Pizza.class);
            addPoints();
        }
        if (isTouching(House.class) )
        {
            setLocation(700,560);
            Greenfoot.stop();
        }
 }
 public void checkKeyPress()
 {
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY() - 5);
        }
        if( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX(), getY() + 5);
        }
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX() - 5 , getY() );
        }
        if( Greenfoot.isKeyDown("d") )
        {
            setLocation( getX() + 5, getY() );
        }
 }
 public void showStatus()
 {
    getWorld().showText("HP"+Hp,50,30);
    getWorld().showText("Points"+Points,50,10);
 }
 public void addPoints()
 {
    Points = Points + 1;
 }
 public void loseHp()
 {
    Hp = Hp - 1;
 }
 public void hitPizza()
 {
      if (isTouching(Pizza.class) )
      {
         removeTouching(Pizza.class);
         addPoints();
      }
 }
 public void detectBlockCollision()
 {
      if (isTouching(Block.class) )
      {
        setLocation(700,560);
        loseHp();
      }
 }
 public void detectWallCollision()
 {
      if (isTouching(Brick.class) )
      {
        setLocation(700,560);
      }
 }
 public void hitHouse()
 {
      if (isTouching(House.class) )
      {
        setLocation(700,560);
        Greenfoot.stop();
      }
 }
}
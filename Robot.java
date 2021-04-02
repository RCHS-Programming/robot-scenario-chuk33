import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Robot extends Actor
{
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
        
 public void hitPizza()
 {
        if (isTouching (Pizza.class) )
        {
        removeTouching (Pizza.class);
        }
 }
 
 public void hitBlock()
 {
      if (isTouching (Block.class) )
      {
        setLocation(400,560);
      }
 }
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tekiweapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tekiweapon extends Actor
{
    int time=10;
    public void act() 
    {
        // Add your action code here.
        move(1);
        Actor actor = getOneIntersectingObject( tekiweapon.class );
        int x =getX();
        int y =getY();
        
        setLocation(x,y+90);
        time--;
        
        if(time<1)
        getWorld().removeObject(this);
    }    
}

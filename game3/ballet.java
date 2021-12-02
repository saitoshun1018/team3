import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ballet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ballet extends Actor
{
    /**
     * Act - do whatever the ballet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    int time=10;
    public void act() 
    {
        // Add your action code here.
        move(1);
        Actor actor = getOneIntersectingObject( ballet.class );
        int x =getX();
        int y =getY();
        
        setLocation(x,y-90);
        time--;
        
        if(time<1)
        getWorld().removeObject(this);
    }    
}

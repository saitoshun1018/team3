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
  
    
    public void act() 
    {
        // Add your action code here.
        move(5);
        Actor actor = getOneIntersectingObject( ballet.class );

        int x = getX();
        int y = getY();
    }    
}

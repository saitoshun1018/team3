import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tekiweapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tekiweapon extends Actor
{
    int time = 100;
    
    public tekiweapon(int dig)
    {
        super();        
        setRotation(dig);       
    }
    /**
     * Act - do whatever the tekiweapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        // Add your action code here.
        Actor actor = getOneIntersectingObject(tekiweapon.class);

        int x = getX();
        int y = getY();


        time--;
        move(5);

        // Add your action code here.
        if(time<1)
        getWorld().removeObject(this);
    }    
}

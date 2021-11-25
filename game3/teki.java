import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teki extends Actor
{
    private int flag_tama = 0;
    private int dig = 0;
    /**
     * Act - do whatever the ari wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "e" ) ){
             {if( flag_tama == 0 ){
                getWorld().addObject( new tekiweapon(getRotation()), x, y );
                //Greenfoot.playSound("georgeshot.mp3");
                flag_tama = 40;
            }
        }  
    }        
}
}    
        
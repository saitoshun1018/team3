import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teki extends Actor
{
    /**
     * Act - do whatever the interimpresident wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int flag_tama=0;
    public void act() 
    {
        int x =getX();
        int y =getY();
           
    if(flag_tama>0){flag_tama--;}
    else{    
        if(Greenfoot.isKeyDown( "e" )){
            getWorld().addObject( new tekiweapon(), x, y+90 );
            flag_tama = 40;
        }
    }
    
    
    move(1);
    if(Greenfoot.getRandomNumber(10)<1){
    }
    if(isAtEdge()){
        turn(180);
    }
}
}


    
        
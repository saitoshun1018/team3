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

    /*if(flag_tama>1){flag_tama--;}
>>>>>>> e73620e41626d18b5c18ff51f7df9b04b1b9b1ef
    else{    
        if(Greenfoot.isKeyDown( "q" )){
            getWorld().addObject( new tekiweapon(), x, y+90 );
            flag_tama = 40;
        }
    }*/
    
    Actor actor=getOneIntersectingObject(ballet.class);
    
    if(actor !=null){
        getWorld().removeObject(this);
    }
    
    
    move(1);
    if(Greenfoot.getRandomNumber(10)<1){
    }
    if(isAtEdge()){
        turn(180);
    }
}
}


    
        
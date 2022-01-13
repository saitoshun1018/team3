import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class c here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class c extends World
{

    /**
     * Constructor for objects of class c.
     * 
     */
    int pattern=0;
    public int count=0;
    public c()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new interimpresident(), 300, 350);
        addObject(new teki(), 300, 50);
    }
    public void act(){
       
           spawnvirus();
          
        
    }
    public void spawnvirus(){
        if(count==4){return;}
        switch(pattern){
            case 0: addObject(new teki(), 300,30);
                    break;
            case 1: addObject(new teki(), 150,60);
                    break;
            case 2: addObject(new teki(), 240,30);
                    break;
            case 3: addObject(new teki(), 400,60);
                    break;
        }
        count++;
        pattern++;
        if(pattern==4){pattern=0;}
    }
}

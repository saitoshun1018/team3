import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hakodate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class a extends World
{

    /**
     * Constructor for objects of class hakodate.
     * 
     */
    int count=0;
    public a()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new interimpresident(), 300, 350);
        
        
    }
    public void act(){
       
        for(int i=0;i<4;i++){
            spawnvirus();
            count++;
            
        }
    }
    public void spawnvirus(){
        switch(count){
            case 0: addObject(new teki(), 300,30);
                    break;
            case 1: addObject(new teki(), 150,60);
                    break;
            case 2: addObject(new teki(), 240,30);
                    break;
            case 3: addObject(new teki(), 400,60);
                    break;
        }
    }
}

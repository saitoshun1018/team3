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
    int pattern=0;
    static int count=0;
    Counter counter = new Counter();
    public a()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new interimpresident(), 300, 350);
        addObject(counter, 500, 370);
        
    }
    public void act(){
       
           spawnvirus();
          
        
    }
    public void spawnvirus(){
        if(count<=10){
           switch(pattern){
            case 0: addObject(new teki(), (int)(Math.random()*300),30);
                    break;
            case 1: addObject(new teki(), (int)(Math.random()*600),60);
                    break;
            case 2: addObject(new teki(), (int)(Math.random()*300),90);
                    break;
            case 3: addObject(new teki(), (int)(Math.random()*600),120);
                    break;
           }
           count++;
           pattern++;
        }
        
        if(pattern==4){pattern=0;}
    }
}

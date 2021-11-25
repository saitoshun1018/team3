import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
      public void act()
    {    
        if(Greenfoot.isKeyDown("a")){
            World Myworld = new a();
            Greenfoot.setWorld(Myworld);
        }
        if(Greenfoot.isKeyDown("b")){
            World Myworld = new b();
            Greenfoot.setWorld(Myworld);
        }
        if(Greenfoot.isKeyDown("c")){
            World Myworld = new c();
            Greenfoot.setWorld(Myworld);
        }
        
    }
}

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
    public a()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new interimpresident(), 300, 350);
        addObject(new teki(), 300, 50);
    }
}

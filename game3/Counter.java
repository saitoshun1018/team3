import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    static int score;
    
    public Counter() 
    {
        setImage(new GreenfootImage("Score: "+ score, 40, Color.WHITE, new Color(0,0,0,0)));// Add your action code here.
    }
    public void act() 
    {
        setImage(new GreenfootImage("Score: "+ score, 40, Color.WHITE, new Color(0,0,0,0)));
    } 
}

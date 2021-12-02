import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        super(600, 400, 1); 

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                Random random = new Random();
                int randomValue = random.nextInt(1);
                
                switch (randomValue){
                    case 0:
                        addObject(new teki(), 1600, 700);
                        break;
                    case 1:
                        addObject(new teki(), 1600, 400);
                        break;
                    case 2:
                        addObject(new teki(), 1600, 100);
                        break;
                    
                }
            }
        };
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

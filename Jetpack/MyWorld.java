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
        super(600, 401, 1); 
        prepare();
        Greenfoot.setSpeed(50);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jetpack jetpack = new Jetpack();
        addObject(jetpack,76,320);

        jetpack.setLocation(70,213);
    }

    public void act()

    {
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            switch(Greenfoot.getRandomNumber(10)) 
            {
                default: addObject(new astroid(),1366,Greenfoot.getRandomNumber(720));
                break;
                case 1: addObject(new Coin(),1366,Greenfoot.getRandomNumber(720));
                break;
                case 2: addObject(new Coin(),1366,Greenfoot.getRandomNumber(720));

            }
        }
        
    }
    
    
} 



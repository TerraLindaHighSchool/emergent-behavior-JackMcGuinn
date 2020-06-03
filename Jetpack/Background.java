import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * sets the picture of the world
 * 
 * @Jack McGuinn 
 * @12/16/19
 */
public class Background extends Actor
{
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
       private final int IMAGE_WIDTH = getImage().getWidth(); 
       private int count = 0;

       public void act() 
        {
        if(count++ % 2 == 0) 
        {
            move(-1);
        }
        
        if(getX() == getWorld().getWidth() / 2 - IMAGE_WIDTH)
        {
             setLocation(getWorld().getWidth() / 2 + IMAGE_WIDTH,
                         getWorld().getHeight() / 2);
        }
     }
    }     
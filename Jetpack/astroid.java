import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class astroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class astroid extends Actor
{
     private int Level = 4;
     private int speed = 2;
    /**
     * Act - do whatever the Astroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act2()
    {
     setLevel();
     
    }
    private void setLevel()
    { 
       if(Level < 4)
       {
           speed++;
        
        
        }
     
      
      
     
    
    } 
   
    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
        
        
    }
    public boolean hitsJetpack(Jetpack Jetpack)
    {
       return getObjectsInRange(getImage().getWidth()/2, Jetpack.class).contains(Jetpack);
    }
    
 }    


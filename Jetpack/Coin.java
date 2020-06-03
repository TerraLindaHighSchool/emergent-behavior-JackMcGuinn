import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Moves from left to right gives and is removen when hit
 * 
 * @Jack McGuinn 
 * @12/16/19
 */
public class Coin extends Actor
{
    private int m_Speed= 1+ (Greenfoot.getRandomNumber(4)); 
    private int m_Rotate= 3- (Greenfoot.getRandomNumber(4));
    
    /**
     * Act - do whatever the Debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     setLocation(getX() - m_Speed, getY());
     turn(m_Rotate);
       if(getX() == 0)
     {
        getWorld().removeObject(this);
     }
    
    }    
}

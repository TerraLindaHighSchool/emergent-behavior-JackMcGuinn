import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shows the Ship,Score,Time,Level,and Lives, it also allows ship to move WASD
 * and it adds lifes when score is added and levels are added at certain score
 * 
 * @Jack McGuinn 
 * @12/16/19
 */
public class Jetpack extends Actor
{
    /**
     * Act - do whatever the SpaceShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int score;
    private int count;
    private int time = 300;
    private int hit = 0;
    private int life = 3;
    private boolean justAddedALife = false;
    private int level = 1;
    private boolean justAddedALevel = false;
    
   
    private GreenfootImage m_Image0 = new GreenfootImage("jetpack 1.png");
    private GreenfootImage m_Image1 = new GreenfootImage("jetpack fire.png");
    
    public Jetpack()
    {
       GreenfootImage myImage = getImage();
       int myNewHeight = (int)myImage.getHeight()/2;
       int myNewWidth = (int)myImage.getWidth()/2;
       
    }
    
    public void act()
    { 
        checkKeyPress();
        move(-1);
        checkForCollision(); 
        setTime();
        displayInScene();
        setLife();
        endGame();
        setLevel();
        
        
    }
  
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
            setImage(m_Image1);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
            setImage(m_Image1);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
            setImage(m_Image1);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
            setImage(m_Image1);
        }
    }
   
    
    
    private void checkForCollision()
    {
       if(isTouching(astroid.class))
       {
           removeTouching(astroid.class);
           hit++;
           life--;
       }   
       if(isTouching(Coin.class))
       {
           removeTouching(Coin.class);
           score = score + 10;
       }   
       
       
       
         if(life==0)
         {
             Greenfoot.stop();
          }  
    }  
    private void setTime()
     {
        if(count++ % 75 == 0)
        {
             if(time > 0)
             {
                  time--;
             }
        }
     } 
    private void setLife()
     {
        
          
      if(isTouching(astroid.class))
      {
                  life--;
      }
      if (score % 100 ==  0 && score > 0 && !justAddedALife)
      {
             life++;
             justAddedALife = true;
             
      }
      if(score % 100 != 0)
      {
              justAddedALife = false;
      }
    } 
    private void setLevel()
    {
     
      if (score % 200 ==  0 && score > 0 && !justAddedALevel)
      {
             level++;
             justAddedALevel = true;
             
             
      }
      if(score % 200 != 0)
      {
              justAddedALevel = false;
      }
      if (score % 200 == 0)
      {
       Greenfoot.setSpeed(40 + level * 10);    
      }
     
    
    } 
    
    
    private void displayInScene()
     {
       getWorld().showText("time: " + time, 550, 10);   
       getWorld().showText("score: " + score, 70, 10);
       getWorld().showText("Lifes: " + life, 70, 30);
       getWorld().showText("Level:" +   level,550, 30);
    }
    private void endGame()
    {
      if (time == 0)
      {
          Greenfoot.stop(); 
          getWorld().showText("GameOver!",300, 10);
        
             if (score > 0)
        {
                 getWorld().showText("GameOver!", 300, 200);     
        }   
             if (score % 100 == 0)
        {
                 life++;
        }   
     }
     if (life == 0)
     {
              getWorld().showText("GameOver!", 300, 200);
               Greenfoot.stop();
     }
       
     if (level == 4)
     {
          Greenfoot.stop();
          getWorld().showText("GameOver!", 700, 350); 
     }
       
      
    }  
}


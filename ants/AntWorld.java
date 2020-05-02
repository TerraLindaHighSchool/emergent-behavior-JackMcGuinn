import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill(1);
        addObject(antHill,297,339);
        AntHill antHill2 = new AntHill(1);
        addObject(antHill2,404,181);
        Food food = new Food();
        addObject(food,126,189);
        Food food2 = new Food();
        addObject(food2,447,341);
        Food food3 = new Food();
        addObject(food3,460,98);
        Food food4 = new Food();
        addObject(food4,114,481);
        Food food5 = new Food();
        addObject(food5,370,465);
        Food food6 = new Food();
        addObject(food6,227,134);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class MyWorld here.
 * 
 * @author Dylan Ocampo 
 * @version version 0.0.1
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
        Cohete cohetico = new Cohete(270);
        addObject(cohetico, 300, 300); 
    }
}

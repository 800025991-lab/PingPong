import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotMovement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotMovement extends Actor
{
    /**
     * Act - do whatever the BotMovement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        while(Ball.getx()>0||Ball.getx()<900){
            if (Ball.getx()>450){
                if (Ball.gety()>BotPaddle.gety()){
                    BotY++;
                }
                if (Ball.gety()<BotPaddle.gety()){
                    BotY--;
                }
            }
        }
    }
}

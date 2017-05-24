/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsrace;

/**
 *
 * @author calvin
 */
public class Turtle implements Runnable{
    
    private int speed;
    
    public Turtle(int speed)
    {
        this.speed = speed;        
    }

    @Override
    public void run() 
    {
        System.out.println("Turtle running for its life !!!");
    }
    
}

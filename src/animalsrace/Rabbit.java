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
public class Rabbit implements Runnable{
    
    private int speed;
    private int numberOfNaps;
    private int napTime;
    
    public Rabbit(int speed, int numberOfNaps, int napTime)
    {
        this.speed = speed;
        this.numberOfNaps = numberOfNaps;
        this.napTime = napTime;
    }

    @Override
    public void run() {
        System.out.println("Rabbit running for its life!!!");
    }
    
    
}

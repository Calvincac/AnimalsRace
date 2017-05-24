/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsrace;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author calvin
 */

public class AnimalsRace {
    
    private static int meters, centimeters;
    private static int numberOfRabbits, numberOfTurtles;
    private static ArrayList<Turtle> arrayOfTurtles = new ArrayList<>();
    private static ArrayList<Rabbit> arrayOfRabbits = new ArrayList<>();
    private static Scanner scan =  new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        buildConsoleIO();           
    }
    
    public static void buildConsoleIO()
    {
        System.out.println("How many meters should the race have? ");
        meters = scan.nextInt();
        centimeters = meters * 100;
        
        System.out.println("How many turtles? ");
        numberOfTurtles = scan.nextInt();        
        ArrayList turtles = buildTurtles(numberOfTurtles, generateRandomNumbers());
        
        System.out.println("How many rabbits? ");
        numberOfRabbits = scan.nextInt();
        ArrayList rabbits = buildRabbits(
                numberOfRabbits,
                generateRandomNumbers(),
                generateRandomNumbers(),
                generateRandomNumbers()
        );
        
        startThreads(rabbits);
        startThreads(turtles);
    }
    
    public static int generateRandomNumbers()
    {
        Random random = new Random();
        int number = random.nextInt(20)+1;
        
        return number;
    }
    
    public static ArrayList buildTurtles(int number, int speed)
    {
        for (int i = 0; i < number; i++) {
            Turtle turtle = new Turtle(speed);
            arrayOfTurtles.add(turtle);
        }
        
        return arrayOfTurtles;
    }
    
    public static ArrayList buildRabbits(int number, int speed, int numberOfnaps, int napTime)
    {
        for (int i = 0; i < number; i++) {
            Rabbit rabbit = new Rabbit(speed, numberOfnaps, napTime);
            arrayOfRabbits.add(rabbit);
        }
        
        return arrayOfRabbits;
    }
    
    public static  void startThreads(ArrayList animals)
    {
        for (int i=0; i<animals.size(); i++) {
            Object x = animals.get(i);
            Thread animal = new Thread((Runnable) x);
              
            animal.start();
        }        
    }

}

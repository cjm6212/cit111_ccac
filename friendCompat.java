
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cjm62
 */
public class friendCompat {
    
    final int COMPAT_THRESHOLD = 100;
    
    public static void main(String[] args){
        int compatScore = 0;
        int responseNumber = 0;
        Scanner scan = new Scanner(System.in);
        
        // print out welcome and q1
        
        System.out.println("Welcome to my Friend Compatability Test!");
        System.out.println("Question 1: Do you ride motorcycles through the jungle?");
        System.out.println("Yes = 1  No = 0");
        responseNumber = scan.nextInt();
        
        // evaluate response
        
        if(responseNumber == 1){
            System.out.println("Excellent, me too!");
            compatScore = compatScore + 100;
            System.out.println("What kind of bike you ridin these days home slice");
            System.out.println("Harley Davidson = 1");
            System.out.println("Ducatti = 2");
            System.out.println("Yamaha = 3");
            
            System.out.println("Kawasaki = 4");
            System.out.println("Honda = 5");
            System.out.println("Other = 6");
            
            responseNumber = scan.nextInt();
            
            if(responseNumber == 1){
                System.out.println("Harleys are always fun");
                compatScore = compatScore + 10;
               
            } else if(responseNumber == 2){
                System.out.println("A Ducatti? Not bad...");
                compatScore = compatScore + 20;
                
            } else if(responseNumber == 3){
                System.out.println("A smart choice. Those Japanese are NOT messing around");
                compatScore = compatScore + 30;
               
            } else if(responseNumber == 4){
                System.out.println("Very nice!");
                compatScore = compatScore + 40;
                
            } else if(responseNumber == 5){
                System.out.println("A good choice");
                compatScore = compatScore + 50;
                
            }else if(responseNumber == 6){
                System.out.println("Not main stream, huh? I like it");
                compatScore = compatScore + 30;
                
            } else {
                System.out.println("Not a valid answer, no points awarded");
            }
            
        } else {
            
        }
        
        
    }
    
}

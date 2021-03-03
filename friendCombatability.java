
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
public class friendCombatability {
    public static void main(String[] args){
        final int compatThresh = 100;
        int compatScore = 0;
        int responseNum = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hey, welcome to my Friend Combatability Test");
        System.out.println("I am interested to see if I have any shared hobbies/passtimes with you");
        
        System.out.println("Question 1: Do you enjoy outdoor recreation?");
        System.out.println("1 = Yes " + "0 = No");
        
        responseNum = scan.nextInt();
        
        if(responseNum == 1){
            System.out.println("Sweet, me too");
            System.out.println("Question 2: Do any of these look like something you enjoy?");
            System.out.println("Biking = 1");
            System.out.println("Skateboarding = 2");
            System.out.println("Frisbee = 3");
            System.out.println("Any and all other outdoor activities = 4");
            
            responseNum = scan.nextInt();
            
            if(responseNum == 1){
                System.out.println("Nice, me too. Nothing like finding a fun trail with nice weather");
                System.out.println("+50 Compatabilty Points, well done");
                compatScore = compatScore + 50;
                
            } else if(responseNum == 2){
                System.out.println("Gnarly. Hopefully you chose that because longboarding wasn't an option");
                System.out.println("If not, its fine. I guess... + 50 Compatability Points");
                compatScore = compatScore + 50;
                
            } else if(responseNum == 3){
                System.out.println("Radicalll! I also toss the ol disc");
                System.out.println("+ 50 Compatability Points, well done");
                compatScore = compatScore + 50;
                
            }else if(responseNum == 4){
                System.out.println("Nice, anything outsides cool with me");
                System.out.println("+ 50 Compatability Points");
                compatScore = compatScore + 50;
                
            }else {
                System.out.println("Invalid Response, potential friend. Lets strive for better huh?");
            }
            

        } else {
            System.out.println("Hey thats alright. Afterall outside is where the bees reside");
            System.out.println("Due to your lack of desire for fresh air, proceed to question 3");
        }
        
        System.out.println("Question 3: Do you play any instruments?");
        System.out.println("Yes = 1 No = 0");
        
        responseNum = scan.nextInt();
        
        if(responseNum == 1){
            System.out.println("Hey me too! ");
            System.out.println("+ 50 Compatability Points");
            compatScore = compatScore + 50;
            
        } else{
            System.out.println("It's okay, maybe one day you'll get around to it. I used to be uncool too...");
            
        }
        
        if(compatScore == compatThresh){
            System.out.println("Congrats! You have passed the Compatability Test. How's it feel to be a total stud");
            
        }else{
            System.out.println("If what my sloppily written code tells me is true, this may not work...");
        }
        


    }
    
}

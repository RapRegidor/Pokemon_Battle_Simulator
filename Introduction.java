import java.util.Scanner;

public class Introduction
{
  public static void start()
  {
    
    Scanner choice = new Scanner(System.in);
    
    System.out.println("Hello trainer! Welcome to the Pokemon World. What name should I call you with?");
    
    String name = choice.next();
    
    System.out.println(name + ". Huh, What a unique name you possess. Well, now that is over with, lets move on. \nAre you ready? (Yes/No)");
    
    String begin = choice.next();
    
    if(begin.equalsIgnoreCase("No"))
    {
      System.out.println("Come back when you are ready! You wasted my time.");
      System.exit(1);
    }
    else if(begin.equalsIgnoreCase("Yes"))
    {
      System.out.println("Alright, let's begin.\n");
    }
    else
    {
      System.out.println("You can't even follow simple instructions?! Get out.");
      System.exit(1);
    }
    
    System.out.println("[Sequel from previous project]\n\nAfter defeating all 8 Gym Leaders from Johto and the Elite Four, you became the Champion. ");

    System.out.println("You are still not satisfied with your position and so you decided to go to Kanto and defeat all 8 Gym Leaders there. ");                   

    System.out.println("Finally you head up Mt. Silver and challenged one of the previous champions Red.");
  } 
}
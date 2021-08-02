import java.util.Scanner;

public class PlayerTurn
{
  private static boolean dragonTail = false;
  public static void start(WholePokemon[] playerWholePokemon, WholePokemon[] enemyWholePokemon)
  {
    Scanner move = new Scanner(System.in);
    boolean alive = false;
    int finalDamage = 0;
    boolean use = true;
    boolean someAlive = playerWholePokemon[1].getPokeHealth() != 0 || playerWholePokemon[2].getPokeHealth() != 0 || playerWholePokemon[3].getPokeHealth() != 0 || playerWholePokemon[4].getPokeHealth() != 0 || playerWholePokemon[5].getPokeHealth() != 0;
    
    System.out.println("\nWhich move would you like to do?");
    
    for(int i = 0; i < 4; i++)
    {
      System.out.println("[" + (i + 1) + "] " + playerWholePokemon[0].getMoveName(i));
    }
    System.out.println("[5] Switch Pokemon");
    System.out.println("[6] End game (Automatic Win)");
      
    int choose = move.nextInt();
    
    while(choose <= 0 || choose >= 7)
    {
      System.out.println("\nPlease select a number between 1-6.");
      
      for(int i = 0; i < 4; i++)
      {
        System.out.println("[" + (i + 1) + "] " + playerWholePokemon[0].getMoveName(i));
      }
      System.out.println("[5] Switch Pokemon");
      System.out.println("[6] End game (Automatic Win)");
      
      choose = move.nextInt();
    }
    
    while(!(someAlive) && choose == 5)
    {
      System.out.println("All other Pokemon have fainted. Choose a different move");
      for(int i = 0; i < 4; i++)
      {
        System.out.println("[" + (i + 1) + "] " + playerWholePokemon[0].getMoveName(i));
      }
      System.out.println("[5] Switch Pokemon");
      System.out.println("[6] End game (Automatic Win)");
      choose = move.nextInt();
    }
    
    if(choose == 5 && (someAlive))
    {
      while(!alive)
      {
        System.out.println("Which Pokemon would you like to switch to?");
        for(int i = 1; i < 6; i++)
        {
          System.out.println("[" + i + "] " + playerWholePokemon[i].getPokeName() + " ");
        }
        
        int pokeSwitch = move.nextInt();
        
        while(pokeSwitch <= 0 || pokeSwitch >= 6)
        {
          System.out.println("\nPlease select a number between 1-5.");
          pokeSwitch = move.nextInt();
        }
        
        if(playerWholePokemon[pokeSwitch].getPokeHealth() != 0)
        {
          playerWholePokemon[6] = playerWholePokemon[0];
          playerWholePokemon[0] = playerWholePokemon[pokeSwitch];
          playerWholePokemon[pokeSwitch] = playerWholePokemon[6];
          alive = true;
        }else{
          System.out.println("This Pokemon has fainted");
        }
        
          System.out.println("You switched to: " + playerWholePokemon[0].getPokeName());
  
      }
    }
      
    if(choose == 6)
    {
      
      System.out.println("\nEnding the game...\n");
      finishWin(enemyWholePokemon);
      Middle.win(playerWholePokemon, enemyWholePokemon);
      
    }
    
    if(choose >= 1 && choose <= 4)
    {
      
      if(playerWholePokemon[0].getMoveName(choose - 1).equals("Roost") && playerWholePokemon[0].getWholeCount(choose - 1) != 0)
      {
        
        playerWholePokemon[0].setPokeHealth(playerWholePokemon[0].getPokeDamage(choose - 1)*-1);
        System.out.println("You used Roost! " + playerWholePokemon[0].getPokeName() + " now has " + playerWholePokemon[0].getPokeHealth() + " hp.");
        playerWholePokemon[0].setWholeCount(choose - 1);
        System.out.println("You have " + playerWholePokemon[0].getWholeCount(choose - 1) + " uses left.");
        
      }else{
        
        while(use)
        {
          if(playerWholePokemon[0].getMoveName(choose - 1).equals("Roost") && playerWholePokemon[0].getWholeCount(choose - 1) == 0)
          {
            System.out.println("Please choose another move. You have used up the max amount.");
              choose = move.nextInt();
          }
          if(!(playerWholePokemon[0].getMoveName(choose - 1).equals("Roost")))
          {
            use = false;
          }
        }
        finalDamage = BonusDamage.finalDamage(playerWholePokemon[0].getMoveType(choose - 1), enemyWholePokemon[0].getPokeType(), playerWholePokemon[0].getPokeDamage(choose - 1));
        
        System.out.println("\n" + playerWholePokemon[0].getPokeName() + " did " + playerWholePokemon[0].getMoveName(choose - 1) + "!");
        
        if(finalDamage >= (int)((playerWholePokemon[0].getPokeDamage(choose - 1))*1.5))
        {
          System.out.println("It was super effective!");
        }else if(finalDamage < playerWholePokemon[0].getPokeDamage(choose - 1))
        {
          System.out.println("Opposing Pokemon resisted the attack!");
        }
        
        System.out.println("You did " + finalDamage + " to the opposing Pokemon.");
        
        enemyWholePokemon[0].setPokeHealth(finalDamage);
        
        if(enemyWholePokemon[0].getPokeHealth() < 0)
        {
          enemyWholePokemon[0].setWholePokeHealth(0);
        }
        
        System.out.println(enemyWholePokemon[0].getPokeName() + " now has " + enemyWholePokemon[0].getPokeHealth() + " hp!");
        
        if(playerWholePokemon[0].getMoveName(choose - 1).equals("Dragon Tail") && !(Middle.lose(enemyWholePokemon)))
        { 
          /*shiftLeftArray(enemyWholePokemon);
           if(playerWholePokemon[1].getPokeHealth() != 0)
           {
           shiftLeftArray(enemyWholePokemon);
           }*/
          EnemyTurn.switchList(enemyWholePokemon);
          
          System.out.println("PKMN Trainer Red switched to " + enemyWholePokemon[0].getPokeName() + ".");
          usedDragonTail();
        }
      }
    }
    resetDrag();
    
    if(enemyWholePokemon[0].getPokeHealth() == 0 && !(Middle.lose(enemyWholePokemon)))
    {
      System.out.println("Opposing Pokemon has fainted!");
      EnemyTurn.switchList(enemyWholePokemon);
      System.out.println("PKMN Trainer Red switched to " + enemyWholePokemon[0].getPokeName());
    }
  }


  public static void usedDragonTail()
  {
    dragonTail = true;
  }
  
  public static boolean getDragonTail()
  {
    return dragonTail;
  }
  
  public static void resetDrag()
  {
    dragonTail = false;
  }
  
  public static void shiftLeftArray(WholePokemon[] enemyWholePokemon) 
  {
    WholePokemon[] temp = new WholePokemon[6];
    temp[0] = enemyWholePokemon[0];
    temp[1] = enemyWholePokemon[1];
    temp[2] = enemyWholePokemon[2];
    temp[3] = enemyWholePokemon[3];
    temp[4] = enemyWholePokemon[4];
    temp[5] = enemyWholePokemon[5];
    
    for(int i = 0; i < 5; i++)
    {
      enemyWholePokemon[i] = temp[i + 1];
    }
    enemyWholePokemon[5] = temp[0];
  }
  
  public static void reverse(WholePokemon[] enemyWholePokemon) 
  {
    WholePokemon[] temp = new WholePokemon[6];
    temp[0] = enemyWholePokemon[0];
    temp[1] = enemyWholePokemon[1];
    temp[2] = enemyWholePokemon[2];
    temp[3] = enemyWholePokemon[3];
    temp[4] = enemyWholePokemon[4];
    temp[5] = enemyWholePokemon[5];
    for(int i = 0; i < 6; i++)
    {
      enemyWholePokemon[5 - i] = temp[i];
    }
  }
  
  public static void finishWin(WholePokemon[] enemyWholePokemon)
  {
    for(int i = 0; i < 6; i++)
    {
      enemyWholePokemon[i].setWholePokeHealth(0);
    }
  }
}

import java.util.Scanner;
public class EnemyTurn 
{
  public static void start(WholePokemon[] playerWholePokemon, WholePokemon[] enemyWholePokemon)
  {
    Scanner move = new Scanner(System.in);
    boolean alive = false;
    if (!(Middle.lose(enemyWholePokemon)))
    {
      int index = higherDam(enemyWholePokemon);
      int finalDamage = BonusDamage.finalDamage(enemyWholePokemon[0].getMoveType(index), playerWholePokemon[0].getPokeType(), enemyWholePokemon[0].getPokeDamage(index));
      
      System.out.println("\nIt is PKMN Trainer Red's move!");
      System.out.println(enemyWholePokemon[0].getPokeName() + " used " + enemyWholePokemon[0].getMoveName(index) + "!");
      
      if(finalDamage >= (int)((enemyWholePokemon[0].getPokeDamage(index))*1.5))
      {
        System.out.println("It was super effective!");
      }else if(finalDamage < enemyWholePokemon[0].getPokeDamage(index))
      {
        System.out.println("You resisted the attack!");
      }
      
      System.out.println("Opposing Pokemon did " + finalDamage + " to " + playerWholePokemon[0].getPokeName());
      playerWholePokemon[0].setPokeHealth(finalDamage);
    }
    
    if(playerWholePokemon[0].getPokeHealth() < 0)
    {
      playerWholePokemon[0].setWholePokeHealth(0);
    }
    
    System.out.println("Your Pokemon now has " + playerWholePokemon[0].getPokeHealth() + " hp.");
    
    if(playerWholePokemon[0].getPokeHealth() == 0 && !Middle.lose(playerWholePokemon))
    {
      while(!alive)
      {
        System.out.println("\nYour Pokemon has fainted. Which Pokemon would you like to switch to?");
        for(int i = 1; i < 6; i++)
        {
          System.out.println("[" + i + "] " + playerWholePokemon[i].getPokeName() + " ");
        }
        
        int pokeSwitch = move.nextInt();
        
        if(playerWholePokemon[pokeSwitch].getPokeHealth() != 0)
        {
          playerWholePokemon[6] = playerWholePokemon[0];
          playerWholePokemon[0] = playerWholePokemon[pokeSwitch];
          playerWholePokemon[pokeSwitch] = playerWholePokemon[6];
          alive = true;
        }else{
          System.out.println("This Pokemon has fainted");
        }
        
        while(pokeSwitch <= 0 || pokeSwitch >= 6)
        {
          System.out.println("\nPlease select a number between 1-5.");
          pokeSwitch = move.nextInt();
          if(playerWholePokemon[pokeSwitch].getPokeHealth() != 0)
          {
            playerWholePokemon[6] = playerWholePokemon[0];
            playerWholePokemon[0] = playerWholePokemon[pokeSwitch];
            playerWholePokemon[pokeSwitch] = playerWholePokemon[6];
            alive = true;
          }else{
            System.out.println("This Pokemon has fainted");
          }
        }
      } 
      System.out.println("You switched to " + playerWholePokemon[0].getPokeName());
    }
  }
  
  
  
  public static void switchList(WholePokemon[] enemyWholePokemon)
  {
    PlayerTurn.reverse(enemyWholePokemon);
    while(enemyWholePokemon[0].getPokeHealth() == 0)
    {
      PlayerTurn.shiftLeftArray(enemyWholePokemon);
    }
  }
  
  public static int higherDam(WholePokemon[] enemyWholePokemon)
  {
    int[] dmgVal = {enemyWholePokemon[0].getPokeDamage(0), enemyWholePokemon[0].getPokeDamage(1), enemyWholePokemon[0].getPokeDamage(2), enemyWholePokemon[0].getPokeDamage(3)};
    int maxDmg = dmgVal[0];
    int num = 0;
    int randomNum = (int)(Math.random()*10) + 1;
    if(randomNum < 5)
    {
      for(int i = 0; i < 3; i++)
      {
        if(duplicate(dmgVal))
        {
          dmgVal[i + 1] *=  0;
        }
        if(maxDmg < dmgVal[i])
        {
          maxDmg = dmgVal[i];
          num++;
        }
      }
      return num;
    }
    return (int)(Math.random()*4);
  }

  public static boolean duplicate(int[] array)
  {
    for(int i = 0; i < 3; i++)
    {
      if(array[i] == array[i + 1])
      {
        return true;
      }
    }
    return false;
  }
}

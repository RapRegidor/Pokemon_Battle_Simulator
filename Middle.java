import java.util.Scanner;

public class Middle //Creating the Pokemon objects + starting the battle
{
  private static boolean playerWin;
  private static boolean enemyWin;
  public static void battle()
  {
    int count = 0;
    Scanner choice = new Scanner(System.in);
    
    Pokemon[] playerPokemon = new Pokemon[6];
    playerPokemon[0] = new Pokemon("Typhlosion", 297, 236, "Fire");
    playerPokemon[1] = new Pokemon("Dragonite", 323, 196, "Dragon");
    playerPokemon[2] = new Pokemon("Togekiss", 311, 196, "Flying");
    playerPokemon[3] = new Pokemon("Umbreon", 331, 166, "Dark");
    playerPokemon[4] = new Pokemon("Scizor", 281, 166, "Steel");
    playerPokemon[5] = new Pokemon("Gyarados", 331, 198, "Water");
  
    Pokemon[] enemyPokemon = new Pokemon[6];
    enemyPokemon[0] = new Pokemon("Venusaur", 301, 196, "Grass");
    enemyPokemon[1] = new Pokemon("Pikachu", 274, 279, "Electric");
    enemyPokemon[2] = new Pokemon("Lapras", 401, 156, "Ice");
    enemyPokemon[3] = new Pokemon("Blastoise", 299, 192, "Water");
    enemyPokemon[4] = new Pokemon("Charizard", 297, 236, "Fire");
    enemyPokemon[5] = new Pokemon("Snorlax", 461, 96, "Normal");
   

    
    System.out.println("\nThese are your Pokemon (Monotypes):");

    for(Pokemon i: playerPokemon)
      {
        count++;
        System.out.print("[" + count + "] " + i.getName() + "\n");
      }
    
    
    //Player Pokemon Moves
    MoveObj[] TyphlosionMove = new MoveObj[4];
    TyphlosionMove[0] = new MoveObj("Eruption", PokemonMoveMethods.Eruption(), "Fire");
    TyphlosionMove[1] = new MoveObj("Flame Charge", PokemonMoveMethods.FlameCharge(), "Fire");
    TyphlosionMove[2] = new MoveObj("Body Slam", PokemonMoveMethods.BodySlam(), "Normal");
    TyphlosionMove[3] = new MoveObj("Fire Blast", PokemonMoveMethods.FireBlast(), "Fire");
    
    MoveObj[] TogekissMove = new MoveObj[4];
    TogekissMove[0] = new MoveObj("Roost", PokemonMoveMethods.Roost(playerPokemon[2]), "Flying");
    TogekissMove[1] = new MoveObj("Air Slash", PokemonMoveMethods.AirSlash(), "Flying");
    TogekissMove[2] = new MoveObj("Acrobatics", PokemonMoveMethods.Acrobatics(), "Flying");
    TogekissMove[3] = new MoveObj("BodySlam", PokemonMoveMethods.BodySlam(), "Normal");
    
    MoveObj[] DragoniteMove = new MoveObj[4];
    DragoniteMove[0] = new MoveObj("Dragon Tail", PokemonMoveMethods.DragonTail(), "Dragon");
    DragoniteMove[1] = new MoveObj("Hyper Beam", PokemonMoveMethods.HyperBeam(), "Normal");
    DragoniteMove[2] = new MoveObj("Dragon Pulse", PokemonMoveMethods.DragonPulse(), "Dragon");
    DragoniteMove[3] = new MoveObj("Roost", PokemonMoveMethods.Roost(playerPokemon[1]), "Flying");
    
    MoveObj[] UmbreonMove = new MoveObj[4];
    UmbreonMove[0] = new MoveObj("Crunch", PokemonMoveMethods.Crunch(), "Dark");
    UmbreonMove[1] = new MoveObj("Dark Pulse", PokemonMoveMethods.DarkPulse(), "Dark");
    UmbreonMove[2] = new MoveObj("Foul Play", PokemonMoveMethods.FoulPlay(), "Dark");
    UmbreonMove[3] = new MoveObj("Facade", PokemonMoveMethods.Facade(), "Normal");
    
    MoveObj[] ScizorMove = new MoveObj[4];
    ScizorMove[0] = new MoveObj("Bullet Punch", PokemonMoveMethods.BulletPunch(), "Steel");
    ScizorMove[1] = new MoveObj("Iron Head", PokemonMoveMethods.IronHead(), "Steel");
    ScizorMove[2] = new MoveObj("Roost", PokemonMoveMethods.Roost(playerPokemon[4]), "Flying");
    ScizorMove[3] = new MoveObj("Acrobatics", PokemonMoveMethods.Acrobatics(), "Flying");
    
    MoveObj[] GyaradosMove = new MoveObj[4];
    GyaradosMove[0] = new MoveObj("Waterfall", PokemonMoveMethods.Waterfall(), "Water");
    GyaradosMove[1] = new MoveObj("Aqua Tail", PokemonMoveMethods.AquaTail(), "Water");
    GyaradosMove[2] = new MoveObj("Dragon Tail", PokemonMoveMethods.DragonTail(), "Dragon");
    GyaradosMove[3] = new MoveObj("Facade", PokemonMoveMethods.Facade(), "Normal");
    
    
    //Enemy Pokemon Moves
    MoveObj[] VenusaurMove = new MoveObj[4];
    VenusaurMove[0] = new MoveObj("Body Slam", PokemonMoveMethods.BodySlam(), "Normal");
    VenusaurMove[1] = new MoveObj("Leaf Storm",PokemonMoveMethods.LeafStorm(), "Grass");
    VenusaurMove[2] = new MoveObj("Energy Ball", PokemonMoveMethods.EnergyBall(), "Grass");
    VenusaurMove[3] = new MoveObj("PowerWhip", PokemonMoveMethods.PowerWhip(), "Grass");
    
    MoveObj[] PikachuMove = new MoveObj[4];
    PikachuMove[0] = new MoveObj("Iron Tail", PokemonMoveMethods.IronTail(), "Steel");
    PikachuMove[1] = new MoveObj("Pound", PokemonMoveMethods.Pound(), "Normal");
    PikachuMove[2] = new MoveObj("Thunder Bolt", PokemonMoveMethods.ThunderBolt(), "Electric");
    PikachuMove[3] = new MoveObj("Thunder", PokemonMoveMethods.Thunder(), "Electric");
    
    MoveObj[] LaprasMove = new MoveObj[4];
    LaprasMove[0] = new MoveObj("Blizzard", PokemonMoveMethods.Blizzard(), "Ice");
    LaprasMove[1] = new MoveObj("HydroPump", PokemonMoveMethods.HydroPump(), "Water");
    LaprasMove[2] = new MoveObj("Icicle Spear", PokemonMoveMethods.IcicleSpear(), "Ice");
    LaprasMove[3] = new MoveObj("Freeze Dry", PokemonMoveMethods.FreezeDry(), "Ice");
    
    MoveObj[] BlastoiseMove = new MoveObj[4];
    BlastoiseMove[0] = new MoveObj("Blizzard", PokemonMoveMethods.Blizzard(), "Ice");
    BlastoiseMove[1] = new MoveObj("HydroPump", PokemonMoveMethods.HydroPump(), "Water");
    BlastoiseMove[2] = new MoveObj("Crunch", PokemonMoveMethods.Crunch(), "Dark");
    BlastoiseMove[3] = new MoveObj("Dragon Pulse", PokemonMoveMethods.DragonPulse(), "Dragon");
    
    MoveObj[] CharizardMove = new MoveObj[4];
    CharizardMove[0] = new MoveObj("Acrobatics", PokemonMoveMethods.Acrobatics(), "Flying");
    CharizardMove[1] = new MoveObj("Heat Wave", PokemonMoveMethods.HeatWave(), "Fire");
    CharizardMove[2] = new MoveObj("Fire Blast", PokemonMoveMethods.FireBlast(), "Fire");
    CharizardMove[3] = new MoveObj("DragonPulse", PokemonMoveMethods.DragonPulse(), "Dragon");
    
    MoveObj[] SnorlaxMove = new MoveObj[4];
    SnorlaxMove[0] = new MoveObj("Body Slam", PokemonMoveMethods.BodySlam(), "Normal");
    SnorlaxMove[1] = new MoveObj("Crunch", PokemonMoveMethods.Crunch(), "Dark");
    SnorlaxMove[2] = new MoveObj("Facade", PokemonMoveMethods.Facade(), "Normal");
    SnorlaxMove[3] = new MoveObj("Blizzard", PokemonMoveMethods.Blizzard(), "Ice");
    
    
    //Player Whole Pokemon
    WholePokemon[] playerWholePokemon = new WholePokemon[7];
    playerWholePokemon[0] = new WholePokemon(playerPokemon[0], TyphlosionMove);
    playerWholePokemon[1] = new WholePokemon(playerPokemon[1], DragoniteMove);
    playerWholePokemon[2] = new WholePokemon(playerPokemon[2], TogekissMove);
    playerWholePokemon[3] = new WholePokemon(playerPokemon[3], UmbreonMove);
    playerWholePokemon[4] = new WholePokemon(playerPokemon[4], ScizorMove);
    playerWholePokemon[5] = new WholePokemon(playerPokemon[5], GyaradosMove);
    
    
    //Enemy Whole Pokemon
    WholePokemon[] enemyWholePokemon = new WholePokemon[6];
    enemyWholePokemon[0] = new WholePokemon(enemyPokemon[0], VenusaurMove);
    enemyWholePokemon[1] = new WholePokemon(enemyPokemon[1], PikachuMove);
    enemyWholePokemon[2] = new WholePokemon(enemyPokemon[2], LaprasMove);
    enemyWholePokemon[3] = new WholePokemon(enemyPokemon[3], BlastoiseMove);
    enemyWholePokemon[4] = new WholePokemon(enemyPokemon[4], CharizardMove);
    enemyWholePokemon[5] = new WholePokemon(enemyPokemon[5], SnorlaxMove);
    
    System.out.println("\nWould you like to know your Pokemon's information? Yes/No \n");
    
    String statInfo = choice.next();
    
    if(statInfo.equalsIgnoreCase("Yes"))
    {
      for(int i = 0; i < 6; i++)
      {
        System.out.println(playerWholePokemon[i]);
      }
    }
    
    System.out.println("\nWould you like to change the name of your starter (Typhlosion)? (Only the first one can be changed)Yes/No");
          
    String nameChange = choice.next();
    
    if(nameChange.equalsIgnoreCase("Yes"))
    {
      System.out.println("Adding a nickname to: " + playerWholePokemon[0].getPokeName() + ". Type in a name.");
      
      String nickname = choice.next();
      
      System.out.println("\nYour Pokemon's info is now: \n" + playerWholePokemon[0].setPokeName(nickname));
    }
    
    
    
    System.out.println("\nYou are challenged by PKMN Trainer Red!");

    System.out.println("PKMN Trainer Red sent out Venusaur!");

    System.out.println("Go! " + playerPokemon[0].getName());

    
    
    int roundCount = 1;
    WholePokemon[] tempEn = new WholePokemon[1];
    WholePokemon[] tempPl = new WholePokemon[1];
    while(!lose(playerWholePokemon) && !lose(enemyWholePokemon))
    {
      tempEn[0] = enemyWholePokemon[0];
      tempPl[0] = playerWholePokemon[0];
      System.out.println("\n\nRound " + roundCount);
      if(playerWholePokemon[0].getSpeed() > enemyWholePokemon[0].getSpeed())
      {
        PlayerTurn.start(playerWholePokemon, enemyWholePokemon);
        if(tempEn[0].getPokeHealth() != 0 && !(PlayerTurn.getDragonTail()))
        {
          EnemyTurn.start(playerWholePokemon, enemyWholePokemon);
        }
      }else{
        EnemyTurn.start(playerWholePokemon, enemyWholePokemon);
        if(tempPl[0].getPokeHealth() != 0)
        {
          PlayerTurn.start(playerWholePokemon, enemyWholePokemon);
        }
      }
      roundCount++;
    }
    
    win(playerWholePokemon, enemyWholePokemon);
  }
  
  public static void win(WholePokemon[] playerList, WholePokemon[] enemyList)
  {
    if(lose(playerList))
    {
      enemyWin = true;
    }else if(lose(enemyList)){
      playerWin = true;
    }
  }
  
  public static boolean getEnemy()
  {
    return playerWin;
  }
  
  public static boolean getPlayer()
  {
    return enemyWin;
  }
  
  /**
    * @param pokeList - an array of WholePokemon objects 
    * @return a boolean true (if countFaint == 6) or false (if countFaint != 6)
    * pre-condition: A WholePokemon array containing WholePokemon objects
    * post-condition: returns a boolean true/false
    */
  
  public static boolean lose(WholePokemon[] pokeList)
  {
    int countFaint = 0;
    for(int i = 0; i < 6; i++)
    {
      if(pokeList[i].getPokeHealth() <= 0)
      {
        countFaint ++;
      }
    }
    if(countFaint == 6)
    {
      return true;
    }
    return false; 
  }
}
public class damageIndicator //to see if its effective or not
{
  
  public static void resetVal(boolean i)
  {
    i = !i;
  }
  
  //Weaknesses
  //Against Typhlosion && Charizard
  public static boolean WaterToFire(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Water") && pokemonType.equals("Fire"))
    {
      return !i;
    }
    return i;
  }
  
  //Against Dragonite
  public static boolean IceToDragon(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Ice") && pokemonType.equals("Dragon"))
    {
      return !i;
    }
    return i;
  }
  
  //Against Togekiss
  public static boolean IceToFlying(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Ice") && pokemonType.equals("Flying"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean ElectricToFlying(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Electric") && pokemonType.equals("Flying"))
    {
      return !i;
    }
    return i;
  }
  
  //Against Scizor
  
  public static boolean FireToSteel(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Fire") && pokemonType.equals("Steel"))
    {
      return !i;
    }
    return i;
  }
  
  //Gyarados && Blastoise
  
  public static boolean GrassToWater(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Grass") && pokemonType.equals("Water"))
    {
      return !i;
    }
    return i;
  }
  
  //Against Venusaur
  public static boolean FireToGrass(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Fire") && pokemonType.equals("Grass"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean FlyingToGrass(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Flying") && pokemonType.equals("Grass"))
    {
      return !i;
    }
    return i;
  }
  
  //Against Lapras
  
  public static boolean FireToIce(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Fire") && pokemonType.equals("Ice"))
    {
      return !i;
    }
    return i;
  }
  
  //Resist
  //Against Typhlosion
  public static boolean GrassToFire(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Grass") && pokemonType.equals("Fire"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean GrassToFlying(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Grass") && pokemonType.equals("Flying"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean WaterToWater(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Water") && pokemonType.equals("Water"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean FlyingToElectric(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Flying") && pokemonType.equals("Electric"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean FlyingToWater(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Flying") && pokemonType.equals("Water"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean FireToWater(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Fire") && pokemonType.equals("Water"))
    {
      return !i;
    }
    return i;
  }
  
  public static boolean IceToFire(String moveType, String pokemonType, boolean i)
  {
    if(moveType.equals("Ice") && pokemonType.equals("Fire"))
    {
      return !i;
    }
    return i;
  }
}
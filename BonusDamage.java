public class BonusDamage //methods to calculate the final dmg
{
  private static boolean effective = false;
  public static int finalDamage(String moveType, String pokemonType, int pokeDamage)
  {
    double fire = 1;
    double water = 1;
    double grass = 1;
    double electric = 1;
    double flying = 1;
    double ice = 1;
    
    if(damageIndicator.WaterToFire(moveType, pokemonType, effective))
    {
      water = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.IceToDragon(moveType, pokemonType, effective))
    {
      ice = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.IceToFlying(moveType, pokemonType, effective))
    {
      ice = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.ElectricToFlying(moveType, pokemonType, effective))
    {
      electric = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.FireToSteel(moveType, pokemonType, effective))
    {
      fire = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.GrassToWater(moveType, pokemonType, effective))
    {
      grass = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.FireToGrass(moveType, pokemonType, effective))
    {
      fire = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.FlyingToGrass(moveType, pokemonType, effective))
    {
      flying = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.FireToIce(moveType, pokemonType, effective))
    {
      fire = 1.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.GrassToFire(moveType, pokemonType, effective))
    {
      grass = 0.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.GrassToFlying(moveType, pokemonType, effective))
    {
      grass = 0.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.WaterToWater(moveType, pokemonType, effective))
    {
      water = 0.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.FlyingToElectric(moveType, pokemonType, effective))
    {
      flying = 0.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.FlyingToWater(moveType, pokemonType, effective))
    {
      flying = 0.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.FireToWater(moveType, pokemonType, effective))
    {
      fire = 0.5;
      damageIndicator.resetVal(effective);
    }
    
    if(damageIndicator.IceToFire(moveType, pokemonType, effective))
    {
      ice = 0.5;
      damageIndicator.resetVal(effective);
    }

    return (int)(pokeDamage*fire*water*grass*electric*flying*ice);
  }
  
  public static int crit(int x) //This is just an add-on to use all methods
  {
    int max = maxDigit(x); 
    int min = minNum(eachDigit(x));
    int sum = sum(x);
    int average = average(sum);
    int consecAddAll = addConsecutiveArr(eachDigit(x));
    int numElements = frequency(eachDigit(x), 0);
    int bonus = x + average + mode(x) + max + min + consecAddAll + numElements;
    
    return bonus;
  }
  
  public static int frequency(int[] array, int num)
  {
    int elementCount = 0;
    for(int i:array)
    {
      if(i == num)
      {
        elementCount++;
      }
    }
    return elementCount;
  }
  
  private static int maxDigit(int x)
  {
    int f = 0;
    while(x > 0)
    {
      if(x % 10 > f)
      {
        f = x % 10;
      }
      x /= 10;
    }
    return f;
  }
    
  public static int minNum(int[] array) 
  {
    int currentMin = array[0];
    for(int i:array)
    {
      if(i < currentMin)
      {
        currentMin = i;
      }
    }
    return currentMin;
  }
  
  public static int[] eachDigit(int x)
  {
    int length = 0;
    int n = x;
    
    while(n > 0)
    {
      length++;
      n /= 10;
    }
    
    int[] intArray = new int[length];
    for(int i = 0; i < intArray.length; i++)
    {
      intArray[i] = (x % 10);
      x /= 10; 
    }
    return intArray;
  }
  
  public static int sum(int n)
  {
    int s = 0;
    while(n > 0)
    {
      s += (n % 10);
      n /= 10;
    }
    return s;
  }
  
  public static int average(int n)
  {
    double s = 0;
    int numDigits = Integer.toString(n).length();
    while(n > 0)
    {
      s += (n % 10);
      n /= 10;
    }
    return (int)(s / numDigits);
  }
  
  public static int mode(int n)
  {
    int f = 0;
    int m = 0;
    int d = 0;
    
    while(m < 10)
    {
      if (frequency(n, m) > f)
      {
        d = m;
        f = frequency(n, m);
      }
      m++;
    }
    return d;
  }
  
  public static int frequency(int n, int d)
  {
    int f = 0;
    while(n > 0)
    {
      if(n % 10 == d)
      {
        f++;
      }
      n /= 10;
    }
    return f;
  }
 
  public static int addConsecutiveArr(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length - 1; i++) 
    {
      int[] temp = new int[] {array[i], array[i+1]};
      sum += temp[0] + temp[1];
    } 
    return sum;
    
  }
}
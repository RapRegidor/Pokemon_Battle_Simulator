public class Pokemon //constructors to make each Pokemon
{
  private String name;
  private int health;
  private int speed;
  private String type;
    
  /** Constructs a Pokemon object
    * @param name is the name of the Pokemon
    * @param health is the total health of the Pokemon
    * @param speed is the speed stat of the Pokemon
    * @param moveType is the type (element) of the Pokemon
    */
  
  public Pokemon(String name, int health, int speed, String type)
  {
    this.name = name;
    this.health = health;
    this.speed = speed;
    this.type = type;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public int getHealth()
  {
    return health;
  }
  
  public void setHealth(int damage)
  {
    health -= damage;
  }
  
  public void setWholeHealth(int health)
  {
    this.health = health;
  }
  
  public int getSpeed()
  {
    return speed;
  }
  
  public String getType()
  {
    return type;
  }
  
  public String toString()
  {
    return "Name: " + name + "\nHealth: " + health + "\nSpeed: " + speed + "\nType: " + type + "\n"; 
  }
}
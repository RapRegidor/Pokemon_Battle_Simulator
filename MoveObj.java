public class MoveObj //constructors to make the moves of each pokemon
{
  private int damage;
  private String moveType;
  private String name;
  private int count;
  
  /** Constructs a MoveObj object which represents a move of a Pokemon
    * @param name is the name of the move 
    * @param damage is the damage the move can deal
    * @param moveType is the type (element) of the move
    */
  
  public MoveObj(String name, int damage, String moveType)
  {
    this.name = name;
    this.damage = damage;
    this.moveType = moveType;
    count = 3;
  }
  
  public int getCount()
  {
    return count;
  }
  
  public int setCount()
  {
    count = count - 1;
    return count;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getDamage()
  {
    return damage;
  }
  
  public String getMoveType()
  {
    return moveType;
  }
}
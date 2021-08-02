public class WholePokemon //Constructor to make a "whole" Pokemon with both Pokemon info + Pokemon moves
{
  private Pokemon pokemon;
  private MoveObj[] moves;
  
  /** Constructs a WholePokemon object (Pokemon information + moves)
    * @param pokemon is the Pokemon array containing Pokemon objects
    * @param moves is the MoveObj array containing MoveObj objects
    */
  
  public WholePokemon(Pokemon pokemon, MoveObj[] moves)
  {
    this.pokemon = pokemon;
    this.moves = moves;
  }
  
  public int getWholeCount(int i)
  {
    return moves[i].getCount();
  }
  
  public int setWholeCount(int i)
  {
    return moves[i].setCount();
  }
  
  public int getSpeed()
  {
    return pokemon.getSpeed(); 
  }
    
  public String getPokeType()
  {
    return pokemon.getType(); 
  }
  
  public String getMoveType(int i)
  {
    return moves[i].getMoveType();
  }
  
  public String getMoveName(int i)
  {
    return moves[i].getName();
  }
  
  public String getPokeName()
  {
    return pokemon.getName();
  }
  
  public int getPokeDamage(int i)
  {
    return moves[i].getDamage();
  }
  
  public int getPokeHealth()
  {
    return pokemon.getHealth();
  }
  
  public void setPokeHealth(int damage)
  {
    pokemon.setHealth(damage);
  }
  
  public void setWholePokeHealth(int health)
  {
    pokemon.setWholeHealth(health);
  }
  
  public String toString()
  {
    return pokemon + ""; 
  }
  
  public Pokemon setPokeName(String name)
  {
    pokemon.setName(name);
    return pokemon;
  }
}
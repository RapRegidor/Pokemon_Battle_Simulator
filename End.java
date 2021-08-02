public class End
{
  public static void start()
  {
    if(Middle.getEnemy())
    {
      playerWon();
    }else if (Middle.getPlayer()){
      enemyWon();
    }
  }
  
  public static void enemyWon()
  {
    System.out.println("\n\nAll your Pokemon have fainted. You have been rushed to the nearest Pokemon center. \nUnfortunately you were not good enough"
                         + " to defeat Red. However, there are many chances to come.");
  }
  
  public static void playerWon()
  {
    System.out.println("\n\nAll 6 of PKMN Trainer Red's Pokemon have fainted. \n(Red disappears) (You are now alone on the peak of Mt. Silver)"
                         + "\n\n................................................................................ "
                         + "  \n................................................................................ "
                         + "  \n................................................................................");
  }
}
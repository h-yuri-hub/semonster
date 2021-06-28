public class Main {
  public static void main(String[] args) {
    System.out.println("Hello SEMonster");
    Monster testMonster = new Monster();
    System.out.println(testMonster.toString());
    Player testPlayer = new Player();
    testPlayer.drawMonsters();
    testPlayer.showDeck();
  }
}

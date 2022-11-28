package Chapter7;

public class ArcheryGame {
    private static Player[] players;

    public ArcheryGame(int numberOfArchers, Player ... players){
        players = new Player[numberOfArchers];
        Player[] players1 = addPlayer(numberOfArchers);
        players = players1;
    }
    public Player[] getPlayers() {

        return players;
    }
    private static Player[] addPlayer(int numberOfArchers){
        //players = new Player[int numbersOfArchers];
        for (int i = 0; i < numberOfArchers; i++) {
            players[1] = new Player();

        }
        return new Player[0];
    }
}

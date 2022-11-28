package Chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.OptionalDataException;

import static org.junit.jupiter.api.Assertions.*;

public class ArcheryGameTest {
    ArcheryGame game;
//    Player[] players;

    @BeforeEach
    public void setUp(){
//        players = new Player[1];
        game = new ArcheryGame(1);
    }
    @Test
    public void testThatArcheryGameExists(){

        assertNotNull(game);
    }
    @Test
    public void testThatPlayersCanExistInArcheryGame(){
        Player[] players = game.getPlayers();
        assertEquals(1, game.getPlayers().length );
        assertTrue(players.length > 0);
    }
    @Test
    public void testThatGameHasPayer(){
        Player[] players = game.getPlayers();
        Player player = players[0];

    }
}

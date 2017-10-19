package soen6441team15.soen6441;
import model.GameManager;
import org.junit.Test;
import util.expetion.InvalidNumOfPlayersException;

/**
 * Tests number of players with MaxPlayers + 1
 */
public class GpTest2 {

    /**
     * Creates a game with 7 players
     * @throws InvalidNumOfPlayersException
     */
    @Test(expected = InvalidNumOfPlayersException.class)
    public void testMaxPlayers() throws InvalidNumOfPlayersException
    {
        GameManager gm = new GameManager(null, 7);
        gm.start();
    }

}
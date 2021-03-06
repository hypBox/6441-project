package model;

import model.GameManager;
import model.Map;
import model.contract.IMap;
import model.contract.IPlayer;
import org.junit.Assert;
import org.junit.Test;
import util.expetion.InvalidNumOfPlayersException;


/**
 * testing card exchange logic with different trades
 */
public class CardExchangeTest {

    @Test()
    public void test1() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3,"r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        int exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(0, exchangeValue);


    }

    /**
     * 1st trade
     * @throws InvalidNumOfPlayersException if number of player not as per game rules
     */
    @Test()
    public void test2() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3,"r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        int exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(4, exchangeValue);
    }

    /**
     * 2nd trade
     * @throws InvalidNumOfPlayersException if number of player not as per game rules
     */
    @Test()
    public void test3() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3, "r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        int exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(6, exchangeValue);


    }

    /**
     * 3rd trade
     * @throws InvalidNumOfPlayersException if number of player not as per game rules
     */
    @Test()
    public void test4() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3,"r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        int exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);


        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(8, exchangeValue);


    }

    /**
     * 4th trade
     * @throws InvalidNumOfPlayersException if number of player not as per game rules
     */
    @Test()
    public void test5() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3,"r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        int exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(10, exchangeValue);

    }

    /**
     * 5th trade
     * @throws InvalidNumOfPlayersException if number of player not as per game rules
     */
    @Test()
    public void test6() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3,"r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        int exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(12, exchangeValue);

    }

    /**
     * 6th trade
     * @throws InvalidNumOfPlayersException if number of player not as per game rules
     */
    @Test()
    public void test7() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3, "r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        int exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(15, exchangeValue);

    }

    /**
     * 7th trade
     * @throws InvalidNumOfPlayersException if number of player not as per game rules
     */
    @Test()
    public void test8() throws InvalidNumOfPlayersException {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3,"r,r,r", 500);
        gm.start(false);

        IPlayer p = gm.nextPlayer();
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        int exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);

        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        gm.cardDeck.grantCard(p);
        exchangeValue = gm.exchangeCard(p);
        Assert.assertEquals(20, exchangeValue);

    }

}

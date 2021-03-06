package model;

import model.GameManager;
import model.Map;
import model.contract.IContinent;
import model.contract.IMap;
import model.contract.IPlayer;
import model.contract.ITerritory;
import org.junit.Assert;
import org.junit.Test;
import util.expetion.InvalidNumOfPlayersException;

import java.util.ArrayList;
import java.util.List;


/**
 * tests if a continent controls by a player
 */
public class IsPlayerKingTest {

    @Test()
    public void test1() throws InvalidNumOfPlayersException
    {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3, "r,r,r", 500);
        gm.start(false);
        ArrayList<IContinent> cList = gm.ContinentControlledBy(gm.nextPlayer());
        Assert.assertEquals(0, cList.size());

    }

    @Test()
    public void test2() throws InvalidNumOfPlayersException
    {
        Map m = new Map();
        m.clearData();
        m.fakeData();

        GameManager gm = new GameManager(m, 3,"r,r,r", 500);
        gm.start(false);
        IPlayer p = gm.nextPlayer();

        for(IContinent c : m.getContinents())
            for(ITerritory t: c.getTerritories())
                p.ownTerritory(t);

        ArrayList<IContinent> cList = gm.ContinentControlledBy(p);
        Assert.assertEquals(3, cList.size());

    }

}

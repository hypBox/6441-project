package model;

import model.contract.IContinent;
import model.contract.IMap;

import java.util.ArrayList;

/**
 * represents Map in the game
 */
public class Map implements IMap {

	static int totalnumberOfArmiee = 0;
	
    private ArrayList<IContinent> continents = new ArrayList<>();

    /**
     * Constructor that loads data for game play
     */
    public Map()
    {
        this.loadData();
    }


    /**
     * This methods returns all contiennts
     * @return {@link ArrayList} of continents in the map
     */
    @Override
    public ArrayList<IContinent> getContinents() {
        return this.continents;
    }


    /**
     * This method converts {@link MapDataBase#continents} into {@link #continents}
     */
    private void loadData(){
    	this.continents = new ArrayList<>();
    	for(String continent: MapDataBase.continents.keySet()){
    		IContinent c = new Continent(continent);
    		for(Territory territory: MapDataBase.continents.get(continent).values()){
    			c.addTerritory(territory);
    			totalnumberOfArmiee++;
    		}
    		this.continents.add(c);	
    	}
    }

    /**
     * clears the continents from the map
     */
    public void clearData()
    {
        this.continents = new ArrayList<>();
    }

    /**
     * fills the map with the fake data
     */
    public void fakeData()
    {
        this.continents = new ArrayList<>();


        IContinent c1 = new Continent("Asia");
        this.continents.add(c1);
        c1.addTerritory(new Territory("Iran",c1.getName()));
        c1.addTerritory(new Territory("India",c1.getName()));
        c1.addTerritory(new Territory("Mexico",c1.getName()));
        c1.addTerritory(new Territory("Russia",c1.getName()));

        IContinent c2 = new Continent("Africa");
        this.continents.add(c2);
        c2.addTerritory(new Territory("Egypt",c2.getName()));
        c2.addTerritory(new Territory("Kenya",c2.getName()));

        IContinent c3 = new Continent("America");
        this.continents.add(c3);
        c3.addTerritory(new Territory("China", c3.getName()));
        c3.addTerritory(new Territory("Canada", c3.getName()));
        c3.addTerritory(new Territory("Argentina", c3.getName()));

    }
}

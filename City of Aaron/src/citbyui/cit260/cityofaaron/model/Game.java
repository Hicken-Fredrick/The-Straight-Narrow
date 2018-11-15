/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Group Work
 */
public class Game implements Serializable {
    //Private instances
    //contains player info (name)
    private Player thePlayer;
    //contains the full Map for gameworld
    private Map theMap;
    //contains storehouse for array of items contained
    private Storehouse theStorehouse;
    //current population of that land
    private int currentPopulation;
    //current land owned by player
    private int acresOwned;
    //current acres planted
    private int acresPlanted;
    //acre cost for the year
    private int acreCost;
    //current wheat stored for use
    private int wheatinStorage;
    //tithing payed this year
    private int tithingPayed;
    //contains player name and current score
    private Scoreboard score;
    
    private LandData landData;

    /**
     * Get the value of landData
     *
     * @return the value of landData
     */
    public LandData getLandData() {
        return landData;
    }

    /**
     * Set the value of landData
     *
     * @param landData new value of landData
     */
    public void setLandData(LandData landData) {
        this.landData = landData;
    }

    //public instances GETTERS/SETTERS
    
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Storehouse getTheStorehouse() {
        return theStorehouse;
    }

    public void setTheStorehouse(Storehouse theStorehouse) {
        this.theStorehouse = theStorehouse;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }
    
    public int getAcreCost() {
        return acreCost;
    }

    public void setAcreCost(int acreCost) {
        this.acreCost = acreCost;
    }

    public int getTithingPayed() {
        return tithingPayed;
    }

    public void setTithingPayed(int tithingPayed) {
        this.tithingPayed = tithingPayed;
    }

    public int getWheatinStorage() {
        return wheatinStorage;
    }

    public void setWheatinStorage(int wheatinStorage) {
        this.wheatinStorage = wheatinStorage;
    }

    public Scoreboard getScore() {
        return score;
    }

    public void setScore(Scoreboard score) {
        this.score = score;
    }
    
    //hash, equals, and toString

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.thePlayer);
        hash = 29 * hash + Objects.hashCode(this.theMap);
        hash = 29 * hash + Objects.hashCode(this.theStorehouse);
        hash = 29 * hash + this.currentPopulation;
        hash = 29 * hash + this.acresOwned;
        hash = 29 * hash + this.wheatinStorage;
        hash = 29 * hash + Objects.hashCode(this.score);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.currentPopulation != other.currentPopulation) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatinStorage != other.wheatinStorage) {
            return false;
        }
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
        if (!Objects.equals(this.theStorehouse, other.theStorehouse)) {
            return false;
        }
        if (!Objects.equals(this.score, other.score)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + ", theMap=" + theMap + ", theStorehouse=" + theStorehouse + ", currentPopulation=" + currentPopulation + ", acresOwned=" + acresOwned + ", wheatinStorage=" + wheatinStorage + ", score=" + score + '}';
    }
    
    
}

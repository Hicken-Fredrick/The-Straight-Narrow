/*********************************************
 * Class: Scoreboard
 * CIT 260:07
 * Fall 2018
 * Team: Straight And Narrow
 * Fred, Taylor & Edgar
 ********************************************/
package citbyui.cit260.cityofaaron.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author Meroko and Friends
 */

public class Scoreboard implements Serializable {
    private String score;

    public Scoreboard() {
    }
  ///*  

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    
    
    @Override
    public String toString() {
        return "Scoreboard{" + "score=" + score + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.score);
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
        final Scoreboard other = (Scoreboard) obj;
        if (!Objects.equals(this.score, other.score)) {
            return false;
        }
        return true;
    }

    public void setScoreboard(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
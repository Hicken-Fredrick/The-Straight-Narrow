/*********************************************
 * Class: Storehouse
 * CIT 260:07
 * Fall 2018
 * Team: Straight And Narrow
 * Fred, Taylor & Edgar
 ********************************************/
package citbyui.cit260.cityofaaron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Meroko and friends
 */
public class Storehouse implements Serializable {
   private ArrayList<InventoryItem> inventory;
   private Author author[];

    public Storehouse() {
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<InventoryItem> inventory) {
        this.inventory = inventory;
    }

   

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.inventory);
        hash = 97 * hash + Arrays.deepHashCode(this.author);
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
        final Storehouse other = (Storehouse) obj;
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.author, other.author)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Storehouse{" + "inventory=" + inventory + ", author=" + author + '}';
    }


 
   
   
}

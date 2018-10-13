/*********************************************
 * Class: Author
 * CIT 260:07
 * Fall 2018
 * Team: Straight And Narrow
 * Fred, Taylor & Edgar
 ********************************************/
package citbyui.cit260.cityofaaron.model;
/**
 *
 * @author Meroko and friends
 */

import java.io.Serializable;
import java.util.Objects;

public class Author implements Serializable {
//Public instances    
//String for Author Name
    private String author;

    public Author() {
    }

   
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.author);
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
        final Author other = (Author) obj;
        if (Objects.equals(this.author, other.author)) {
        } else {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Author{" + "author=" + author + '}';
    }
   
    
}
/*********************************************
 * Class: Author
 * CIT 260:07
 * Fall 2018
 * Team: Straight And Narrow
 * Fred, Taylor & Edgar
 ********************************************/

/**
 *
 * @author Team4
 */

import java.io.Serializable;
import java.util.Objects;

public class Author implements Serializable {
//Public instances    
//String for Author Name
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
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
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }

    
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public Author() {
         name = "Aaron";
    }
}
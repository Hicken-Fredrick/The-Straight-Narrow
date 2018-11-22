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
 * @author Fred Hicken
 */
public class InventoryItem implements Serializable {
    //private instances
    //name var
    private String name;
    //ItemType Enum Animal, Tool, Medicine, Food
    private ItemType itemType;
    //quantity var using int, no decimals
    private int quantity;
    //the value in wheat of an item
    private int value;
    //Condition Enum Good, Fair, Poor
    private Condition condition;
    //age int, if un-needed set to NULL
    private int age;
    //perishable bool, for things that expire after x years
    private boolean perishable;
    
    //public instances
    //Constructors
    public InventoryItem() {
    }
    
    //Getters / Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }
    
    //hash, equal, and toString
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.itemType);
        hash = 11 * hash + this.quantity;
        hash = 11 * hash + Objects.hashCode(this.condition);
        hash = 11 * hash + this.age;
        hash = 11 * hash + (this.perishable ? 1 : 0);
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.perishable != other.perishable) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.itemType != other.itemType) {
            return false;
        }
        if (this.condition != other.condition) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "name=" + name + ", itemType=" + itemType + ", quantity=" + quantity + ", condition=" + condition + ", age=" + age + ", perishable=" + perishable + '}';
    }
    
    
}

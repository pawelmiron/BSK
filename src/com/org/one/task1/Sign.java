package com.org.one.task1;

/**
 * Created by mironp on 23.02.2017.
 */
public class Sign {

    private Character character;
    private int level;
    private int quantity;

    public Sign() {
    }

    public Sign(Character character, int level) {
        this.character = character;
        this.level = level;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

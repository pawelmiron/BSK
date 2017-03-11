package com.org.one.task2;

/**
 * Created by mironp on 26.02.2017.
 */
public class Sign2 {

    private Character character;
    private int order;

    public Sign2() {
    }

    public Sign2(Character character, int order) {
        this.character = character;
        this.order = order;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

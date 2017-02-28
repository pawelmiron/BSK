package com.org.task1;

import java.util.ArrayList;

/**
 * Created by mironp on 23.02.2017.
 */
public class Cryptograph1 {

    public String code(String word, int number) {

        String endWord = "";
        Character currentDirection = '+';
        Integer level = 0;
        ArrayList<Sign> list = new ArrayList<>();

        for (int i=0; i<word.length(); i++){
            Sign sign = new Sign(word.charAt(i), level);
            list.add(sign);
            currentDirection = decideDirection(level, currentDirection, number);
            if (currentDirection.equals('+'))
                level++;
            else
                level--;
        }

        for (int i = 0; i<number; i++){
            for (Sign sign: list){
                if(sign.getLevel()==i){
                    endWord = endWord + sign.getCharacter();
                }
            }
        }


        return endWord;
    }

    private Character decideDirection(Integer level, Character currentDirection, Integer number) {
        if(level==0)
            return '+';
        else
        if (level==number-1)
            return '-';
        else
            return currentDirection;



    }

    public String decode(String word, int number){
        String endWord = "";
        Character currentDirection = '+';
        Integer level = 0;
        ArrayList<Sign> listOfLevelSignsQuantities = new ArrayList<>();
        ArrayList<String> listOfSubstrings = new ArrayList<>();
        for (int i=0; i<number; i++){
            Sign sign = new Sign();
            sign.setLevel(i);
            sign.setQuantity(0);
            listOfLevelSignsQuantities.add(sign);
        }

        for (int i=0; i<word.length(); i++){
            for (Sign sign: listOfLevelSignsQuantities){
                if (sign.getLevel()==level){
                    sign.setQuantity(sign.getQuantity()+1);
                }
            }
            currentDirection = decideDirection(level, currentDirection, number);
            if (currentDirection.equals('+'))
                level++;
            else
                level--;
        }

        int lastPosition = 0;

        for (Sign sign: listOfLevelSignsQuantities){
            listOfSubstrings.add(word.substring(lastPosition, lastPosition+sign.getQuantity()));
            lastPosition = lastPosition + sign.getQuantity();
        }

        currentDirection = '+';
        level = 0;
        for (int i=0; i<word.length(); i++){
            Character character = listOfSubstrings.get(level).charAt(0);
            endWord=endWord+character;
            String temp = listOfSubstrings.get(level).substring(1);
            listOfSubstrings.set(level,temp);
            currentDirection = decideDirection(level, currentDirection, number);
            if (currentDirection.equals('+'))
                level++;
            else
                level--;
        }



        return endWord;
    }

}

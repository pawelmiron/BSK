package com.org.one.task2;

import java.text.Collator;
import java.util.*;

/**
 * Created by mironp on 25.02.2017.
 */
public class Cryptograph2 {

    public String code(String word, int... coder) {
        String temp = word;
        String endWord = "";
        int argumentsQuantity = coder.length;
        ArrayList<String> substringsList = new ArrayList<>();
        while (word.length() > 0) {
            try {
                substringsList.add(word.substring(0, argumentsQuantity));
                word = word.substring(argumentsQuantity);
            } catch (StringIndexOutOfBoundsException e) {
                substringsList.add(word);
                break;
            }
        }
        word = temp;


        while (word.length() > endWord.length()) {
            for (String subString : substringsList) {
                for (int i : coder) {
                    try {
                        endWord = endWord + subString.charAt(i - 1);
                    } catch (Exception e) {
                    }

                }
            }

        }

        return endWord;
    }

    public String decode2(String word, int... key )
    {

        String decodedWord = word;
        String diffrence = "";
        int keyLenght = key.length;
        int diffrenceLenght = word.length() % keyLenght;
        if(diffrenceLenght!=0)
        {
            diffrence = decodedWord.substring(word.length()-diffrenceLenght);
            decodedWord = decodedWord.substring(0, word.length()-diffrenceLenght);
            if(diffrenceLenght%2==0) diffrence = partialDecodeEven(diffrence,key);
            else diffrence = partialDecodeOdd(diffrence,key);
        }
        if(key.length%2==0) decodedWord = partialDecodeEven(decodedWord,key);
        else decodedWord = partialDecodeOdd(decodedWord,key);
        decodedWord+=diffrence;
        return decodedWord;
    }
    private String partialDecodeOdd(String word, int... key)
    {
        String decodedWord = word;
        for(int i=0; i<key.length-2 ; i++)
        {
            decodedWord = code(decodedWord, key);
        }
        return decodedWord;
    }
    private String partialDecodeEven(String word, int... key)
    {
        String decodedWord = word;
        for(int i=0; i<key.length-1 ; i++)
        {
            decodedWord = code(decodedWord, key);
        }
        return decodedWord;
    }

}

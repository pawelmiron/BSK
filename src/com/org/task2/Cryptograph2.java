package com.org.task2;

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

    public String decode(String word, int... decoder) {
        String endWord = "";
        int argumentsQuantity = decoder.length;
        String endSubWord = "";
        String wordTemp = word;
        LinkedList<Sign2> listOfSigns = new LinkedList<>();
        while (word.length() > endWord.length()) {
            for (int i : decoder) {
                try {
                    Sign2 sign2 = new Sign2(wordTemp.charAt(0), i);
                    listOfSigns.add(sign2);
                    wordTemp = wordTemp.substring(1);
                } catch (Exception e) {
                    break;
                }

            }
            Collections.sort(listOfSigns, new Comparator<Sign2>() {
                @Override
                public int compare(Sign2 o1, Sign2 o2) {
                    if (o1.getOrder() < o2.getOrder()) {
                        return -1;
                    }
                    if (o1.getOrder() > o2.getOrder()) {
                        return 1;
                    }
                    return 0;
                }
            });
            for (Sign2 sign : listOfSigns) {
                endWord = endWord + sign.getCharacter();
            }
            listOfSigns = new LinkedList<Sign2>();
        }

        endWord = deleteAllTempSymbols(endWord);
        return endWord;
    }

    private String deleteAllTempSymbols(String endSubWord) {

        String endWord = "";
        for (String subword : endSubWord.split("@")) {
            endWord = endWord + subword;
        }
        return endWord;
    }

    private String prepareForDecoding(String wordTemp, int[] decoder) {
        for (int i = 0; i < decoder.length; i++) {
            if (decoder[i] > wordTemp.length()) {
                String part1 = wordTemp.substring(0, i);
                String part2 = wordTemp.substring(i, wordTemp.length());
                wordTemp = part1 + "@" + part2;
            }
        }
        return wordTemp;
    }

}

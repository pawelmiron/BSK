package com.org.one.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by mironp on 26.02.2017.
 */
public class Cryptograph3 {

    public String code(String word, String key) {
        String endWord = "";
        String keyTemp = key;
        LinkedList<Sign3> coderList = new LinkedList<>();
        int currentNumber = 1;
        while (coderList.size() < key.length()) {
            for (int i = 0; i <= 127; i++) {
                for (int j = 0; j < key.length(); j++) {
                    if ((int) key.charAt(j) == i) {
                        coderList.add(new Sign3(j, currentNumber));
                        currentNumber++;
                    }
                }
            }
        }

        Collections.sort(coderList, new Comparator<Sign3>() {
            @Override
            public int compare(Sign3 o1, Sign3 o2) {
                if (o1.getNumber() < o2.getNumber()) {
                    return -1;
                }
                if (o1.getNumber() > o2.getNumber()) {
                    return 1;
                }
                return 0;
            }
        });


        ArrayList<String> listOfSubstrings = new ArrayList<>();


        for (Sign3 sign : coderList) {
            listOfSubstrings.add("");
        }

        String wordTemp = word;

        while (wordTemp.length() > 0) {
            try {
                for (int i = 0; i < listOfSubstrings.size(); i++) {
                    listOfSubstrings.set(i, listOfSubstrings.get(i) + wordTemp.charAt(i));
                }
                wordTemp = wordTemp.substring(listOfSubstrings.size());
            } catch (Exception e) {
                for (int i = 0; i < wordTemp.length(); i++) {
                    listOfSubstrings.set(i, listOfSubstrings.get(i) + wordTemp.charAt(i));
                }
                wordTemp = "";
            }

        }


        for (Sign3 sign : coderList) {
            endWord = endWord  + listOfSubstrings.get(sign.getPosittion());
        }

        return endWord;
    }

}

package com.org.task5;

import java.util.ArrayList;

/**
 * Created by mironp on 28.02.2017.
 */
public class Cryptograph5 {


    public String code(String word, String key) throws Exception {

        if (word.length() != key.length()) {
            throw new Exception("Word and Key lenghts has to be the same size");
        }

        String endWord = "";
        Character[][] vigenereTable = new Character[26][26];
        int adding = 0;
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= 25; j++) {
                vigenereTable[i][j] = (char) (((j + adding) % 26) + 65);
            }
            adding++;
        }

        int j = 0;
        for (int i = 0; i < word.length(); i++) {

            endWord = endWord + vigenereTable[((int) word.charAt(i)) - 65][((int) key.charAt(i)) - 65];
            j++;
        }

        return endWord;
    }
}

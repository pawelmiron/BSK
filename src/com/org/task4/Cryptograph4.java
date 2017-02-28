package com.org.task4;

import java.math.BigInteger;
import java.util.ArrayList;

import static java.lang.Character.isUpperCase;

/**
 * Created by mironp on 27.02.2017.
 */
public class Cryptograph4 {

    public String code(int k0, int k1, String word) throws Exception {
        String endWord = "";
        ArrayList<Character> characterArrayList = new ArrayList<>();

        if (isGCDOfInputsEqualOne(k0, k1)) {
            for (int i = 0; i < word.length(); i++) {
                characterArrayList.add(word.charAt(i));
            }

            for (Character character : characterArrayList) {
                if (isUpperCase(character)) {
                    endWord = endWord + getCodedCharacter(character, k0, k1);
                } else {
                    endWord = endWord + getCodedCharacter(character.toString().toUpperCase().charAt(0), k0, k1).toString().toLowerCase().charAt(0);
                }
            }
        } else
            throw new Exception("Inputs not matching requirements");
        return endWord;
    }

    private Character getCodedCharacter(Character character, int k0, int k1) {
        int a = (int) character;
        int c = ((a - 65) * k1 + k0) % (26) + 65;
        return (char) c;
    }

    private Boolean isGCDOfInputsEqualOne(int k1, int k2) {
        BigInteger k11 = BigInteger.valueOf(k1);
        BigInteger k22 = BigInteger.valueOf(k2);
        BigInteger nn = BigInteger.valueOf(74);
        return nn.gcd(k11.gcd(k22)).intValue() == 1;
    }

}

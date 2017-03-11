package com.org.one.task4;

import java.math.BigInteger;
import java.util.ArrayList;

import static java.lang.Character.isUpperCase;

/**
 * Created by mironp on 27.02.2017.
 */
public class Cryptograph4 {

    public String code(int k0, int k1, String word) throws Exception {

        if (k0<k1){
            int temp = k0;
            k0 = k1;
            k1 =temp;
        }
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

    public String decode(int k0, int k1, String word) throws Exception {
        if (k0<k1){
            int temp = k0;
            k0 = k1;
            k1 =temp;
        }

        String endWord = "";
        ArrayList<Character> characterArrayList = new ArrayList<>();

        if (isGCDOfInputsEqualOne(k0, k1)) {
            for (int i = 0; i < word.length(); i++) {
                characterArrayList.add(word.charAt(i));
            }

            for (Character character : characterArrayList) {
                if (isUpperCase(character)) {
                    endWord = endWord + getDecodedCharacter(character, k0, k1);
                } else {
                    endWord = endWord + getDecodedCharacter(character.toString().toUpperCase().charAt(0), k0, k1).toString().toLowerCase().charAt(0);
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

    private Character getDecodedCharacter(Character character, int k0, int k1){
        int c = (int) character;
        int a = (int) ((((c-65)+(26-k0))*Math.pow(k1, 11))%(26) + 65);
        return (char) a;
    }

    private Boolean isGCDOfInputsEqualOne(int k1, int k2) {
        BigInteger k11 = BigInteger.valueOf(k1);
        BigInteger k22 = BigInteger.valueOf(k2);
        BigInteger nn = BigInteger.valueOf(74);
        return nn.gcd(k11.gcd(k22)).intValue() == 1;
    }
}

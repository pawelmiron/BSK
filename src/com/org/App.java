package com.org;


import com.org.task1.Cryptograph1;
import com.org.task2.Cryptograph2;
import com.org.task3.Cryptograph3;
import com.org.task4.Cryptograph4;
import com.org.task5.Cryptograph5;

import java.math.BigInteger;

/**
 * Created by mironp on 23.02.2017.
 */
public class App {

    public static void main(String[] args) throws Exception {
        Cryptograph1 railFence = new Cryptograph1();
        Cryptograph2 macierz = new Cryptograph2();
        Cryptograph3 macierzKlucz = new Cryptograph3();
        Cryptograph4 cezar = new Cryptograph4();
        Cryptograph5 vigener = new Cryptograph5();

//        System.out.println(railFence.code("CRYPTOGRAPHY", 3));
//        System.out.println(railFence.decode("CTARPORPYYGH", 3));
//        System.out.println("");

        System.out.println(macierz.code("CRYPTOGRAPHYOSA", 3, 1, 4, 2));
        System.out.println(macierz.decode("YCPRGTROHAYPAOS", 3,1,4,2)); //Blad w koncowce
        System.out.println("");
//
//        System.out.println(macierzKlucz.code("HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION", "CONVENIENCE"));
//        System.out.println("");
//
//        System.out.println(cezar.code(5,7,"CRYPTOGRAPHY"));
//        System.out.println(cezar.decode(5,7, "ROXEYZLOHEQX"));
//
//        System.out.println("");
        System.out.println(vigener.code("CRYPTOGRAPHYABCDEFG", "BREAKBREAKBRQWERTYU"));
        System.out.println(vigener.decode("DICPDPXVAZIPQXGUXDA", "BREAKBREAKBRQWERTYU"));
        System.out.println(vigener.decode2("DICPDPXVAZIPQXGUXDA", "BREAKBREAKBRQWERTYU"));




    }

}

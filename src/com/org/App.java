package com.org;


import com.org.task1.Cryptograph1;
import com.org.task2.Cryptograph2;
import com.org.task3.Cryptograph3;
import com.org.task4.Cryptograph4;
import com.org.task5.Cryptograph5;

/**
 * Created by mironp on 23.02.2017.
 */
public class App {

    public static void main(String[] args) {
        Cryptograph1 cryptograph1 = new Cryptograph1();
        Cryptograph2 cryptograph2 = new Cryptograph2();
        Cryptograph3 cryptograph3 = new Cryptograph3();
        Cryptograph4 cryptograph4 = new Cryptograph4();
        Cryptograph5 cryptograph5 = new Cryptograph5();
        System.out.println("Zadanie 1");
//        Dziala dla wszystkich kombinacji
        System.out.println(cryptograph1.code("CRYPTOGRAPHY", 3));
        System.out.println(cryptograph1.decode("CTARPORPYYGH", 3));
        System.out.println();
        System.out.println("Zadanie 2");
//        Działa dla wszystkich kombinacji i n wejsc
        System.out.println(cryptograph2.code("CRYPTOGRAPHY", 6,5,3,4,1,2));
        System.out.println(cryptograph2.decode("OTYPCRYHAPGR", 6,5,3,4,1,2));
        System.out.println();
        System.out.println("Zadanie 3");
//        Działa dla opcji bez spacji
        System.out.println(cryptograph3.code("HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION", "CONVENIENCE"));
        System.out.println();
        System.out.println("Zadanie 4");
        try {
            System.out.println(cryptograph4.code(3, 1, "CRYPTOGRAPHY"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Zadanie5");
        try {
            System.out.println(cryptograph5.code("CRYPTOGRAPHY", "BREAKBREAKBR"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

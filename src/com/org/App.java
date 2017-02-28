package com.org;


import com.org.task1.Cryptograph1;
import com.org.task2.Cryptograph2;
import com.org.task3.Cryptograph3;
import com.org.task4.Cryptograph4;

/**
 * Created by mironp on 23.02.2017.
 */
public class App {

    public static void main(String []args){
        Cryptograph1 cryptograph1 = new Cryptograph1();
        Cryptograph2 cryptograph2 = new Cryptograph2();
        Cryptograph3 cryptograph3 = new Cryptograph3();
        Cryptograph4 cryptograph4 = new Cryptograph4();

        //Dziala dla wszystkich kombinacji
        //System.out.println(cryptograph1.code("CRYPTOGRAPHY", 3));
        ///System.out.println(cryptograph1.decode("CTARPORPYYGH", 3));

        //Działa dla wszystkich kombinacji i n wejsc
        //System.out.println(cryptograph2.code("CRYPTOGRAPHY", 6,5,3,4,1,2));
        //System.out.println(cryptograph2.decode("OTYPCRYHAPGR", 6,5,3,4,1,2));

        //Działa dla opcji bez spacji
//        System.out.println(cryptograph3.code("HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION", "CONVENIENCE"));
    }

}

package com.org;


import com.org.one.task1.Cryptograph1;
import com.org.one.task2.Cryptograph2;
import com.org.one.task3.Cryptograph3;
import com.org.one.task4.Cryptograph4;
import com.org.one.task5.Cryptograph5;
import com.org.two.task1.Generator1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

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

        Generator1 generator1 = new Generator1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Task number: ");
        String input = br.readLine();
        String name;
        String name1;
        String coded;
        String number;
        Integer integer;
        Integer integer1;

        switch (input) {
            case "1":
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name to code: ");
                name = br.readLine();
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Number: ");
                number = br.readLine();
                integer = Integer.valueOf(number);

                System.out.println(railFence.code(name, integer));

                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name to decode: ");
                name = br.readLine();
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Number: ");
                number = br.readLine();
                integer = Integer.valueOf(number);

                System.out.println(railFence.decode(name, integer));
                break;
            case "2":
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name to code: ");
                name = br.readLine();

                System.out.println(macierz.code(name, 3,1,4,2));

                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name to decode: ");
                name = br.readLine();

                System.out.println(macierz.decode2(name, 3,1,4,2)); //Blad w koncowce
                break;
            case "3":
                System.out.println(macierzKlucz.code("HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION", "CONVENIENCE"));
                System.out.println("/////////////");
                break;
            case "4":

                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name to code: ");
                name = br.readLine();
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Number 1: ");
                number = br.readLine();
                integer = Integer.valueOf(number);
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Number 1: ");
                number = br.readLine();
                integer1 = Integer.valueOf(number);

                System.out.println(cezar.code(integer,integer1,name));

                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name to decode: ");
                name = br.readLine();
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Number 1: ");
                number = br.readLine();
                integer = Integer.valueOf(number);
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Number 1: ");
                number = br.readLine();
                integer1 = Integer.valueOf(number);

                System.out.println(cezar.decode(integer,integer1,name));
                break;
            case "5":
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name1: ");
                name = br.readLine();

                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name2: ");
                name1 = br.readLine();

                System.out.println(vigener.code(name, name1));5

                System.out.println("Decoding");

                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name1: ");
                name = br.readLine();

                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Name2: ");
                name1 = br.readLine();


                System.out.println(vigener.decode2(name, name1));
                break;

        }
    }

}

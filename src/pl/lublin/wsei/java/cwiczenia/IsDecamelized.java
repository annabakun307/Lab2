package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsDecamelized{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        do{
            System.out.println("Enter text for the test, (0 to exit):");
            String text = scn.next();
            if(text.equals("0")) break;
            System.out.println("Wynik metody decamelize: "+ StringFun.decamelize(text));
        } while (true);
    }
}
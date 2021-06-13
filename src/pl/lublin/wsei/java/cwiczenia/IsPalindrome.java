package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Podaj text do sprawdzenia (0 - exit):");
            String text = scn.next();
            if(text.equals("0")) break;
            System.out.println("Text:"+ text + " " + (StringFun.isPalindrome(text) ?"" : "nie") + "jest palindromem");
        } while(true);
    }
}
package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class StringFun {

    // IsAnaechized
   public static String anarchize(String word) {
        String result = "";
        char[] arrayChar = word.toCharArray();

        if (Character.isLowerCase(arrayChar[0])) {
            result += Character.toLowerCase(arrayChar[0]);
            for (int i = 1; i < arrayChar.length; i++) {
                if (i % 2 != 0) arrayChar[i] = Character.toUpperCase(arrayChar[i]);
                else arrayChar[i] = Character.toLowerCase(arrayChar[i]);
                result += arrayChar[i];
            }
        }
        if (Character.isUpperCase(arrayChar[0])) {
            result += Character.toUpperCase(arrayChar[0]);
            for (int i = 1; i < arrayChar.length; i++) {
                if (i % 2 != 0) arrayChar[i] = Character.toUpperCase(arrayChar[i]);
                else arrayChar[i] = Character.toLowerCase(arrayChar[i]);
                result += arrayChar[i];
            }
        }
        System.out.println(result);
        return result;
    }

    //IsCamelised
   public static String camelize(String word) {
        word = word.toLowerCase();
        String result = "";
        String[] arrayString = word.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            if (i == 0) {
                result += arrayString[i];
            } else {
                arrayString[i] = StringUtils.capitalize(arrayString[i]);
                result += arrayString[i];
            }
        }
        System.out.println(result);
        return result;
    }
    // IsDecamelized

    public static String decamelize(String word) {
        char[] arrayChar = word.toCharArray();
        String res = "";
        for (int i = 0; i < arrayChar.length; i++){
            res += Character.toLowerCase(arrayChar[i]);
            if (i + 1 < arrayChar.length && Character.isUpperCase(arrayChar[i + 1 ])){
                res += " ";
            }
        }
        System.out.println(res);
        return  res;
    }
    // IsPalindrome

    public static boolean isPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(word);
        String res = sb.reverse().toString();
        if (res.equals(word)) {
            return true;
        } else
            return false;
    }
    // IsShuffled

    public static String shuffle(String word) {
        List<Character> listChar = new LinkedList<>();
        for(char c:word.toCharArray()){
            listChar.add(c);
        }
        StringBuilder res = new StringBuilder();
        for (int index=0;index<word.length();index++){
            int randomPosition = new Random().nextInt(listChar.size());
            res.append(listChar.get(randomPosition));
            listChar.remove(randomPosition);
        }
        System.out.println(res.toString());
        return res.toString();
    }
}
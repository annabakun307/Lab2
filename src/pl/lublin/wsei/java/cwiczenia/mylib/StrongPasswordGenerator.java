package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Random;

public class StrongPasswordGenerator {
    private final String maleLiterki = "abcdefghijklmnopqrstuvwxyz";
    private final String wielkiLitekiy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String znaczkiSpecjalne = "!@#$%^&*()_+=-{}[]/?.,<>";
    private final String cyferki = "0123456789";
    private int dlugosc;
    private boolean maleLitery;
    private boolean wielkieLitery;
    private boolean cyfry;
    private boolean znakiSpecjalne;

    public StrongPasswordGenerator(int dlugocs, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne) {
        this.dlugosc = dlugocs;
        this.maleLitery = maleLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.wielkieLitery = wielkieLitery;
    }

    public char[] generate() {
        char[] password = new char[dlugosc];

        Random random = new Random();
        String combinedChares = "";
        if (maleLitery == true) combinedChares += maleLiterki;
        if (wielkieLitery == true) combinedChares += wielkiLitekiy;
        if (cyfry == true) combinedChares += cyferki;
        if (znakiSpecjalne == true) combinedChares += znaczkiSpecjalne;

        for (int i = 0; i < dlugosc; i++) {
            password[i] = combinedChares.charAt(random.nextInt(combinedChares.length()));
        }
        return password;
    }

    public static void main(String[] args) {


        char[] pswd = new StrongPasswordGenerator(20, true, true, true, false).generate();
        System.out.println(pswd);

    }
}
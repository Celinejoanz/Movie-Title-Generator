package com.company;

import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
        String[] nouns = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");

        System.out.println("Myxyllplyk's Random Movie Title Generator\n");

        System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
        System.out.println("and " + nouns.length + " nouns (" + (adjectives.length * nouns.length) + " combinations).");

       // how to make array index random
        Random rand = new Random();
        int randomNumber = rand.nextInt(adjectives.length);

        String adjective = adjectives[randomNumber];
        String noun = nouns[randomNumber];

        System.out.println("Your movie title is: " + adjective + " " + noun);
    }

    /**
     * @param url - the URL to read words from
     * @return An array of words, initialized from the given URL
     */
    public static String[] arrayFromUrl(String url) throws Exception {
        Scanner fin = new Scanner((new URL(url)).openStream());
        int count = fin.nextInt();

        String[] words = new String[count];

        for (int i = 0; i < words.length; i++) {
            words[i] = fin.next();
        }
        fin.close();

        return words;
    }

}
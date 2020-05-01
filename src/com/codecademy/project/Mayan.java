package com.codecademy.project;

public class Mayan extends Language {
    public Mayan (String langName, int numSpeakers) {
        super(langName, numSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". " +
                "The language follows the word order: " + wordOrder + ".");
        System.out.println("Fun fact: " + name + " is an ergative language.");
    }
}

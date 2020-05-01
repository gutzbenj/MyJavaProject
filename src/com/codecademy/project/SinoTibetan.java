package com.codecademy.project;

public class SinoTibetan extends Language{
    public SinoTibetan (String langName, int numSpeakers) {
        super(langName, numSpeakers, "Asia", "subject-object-verb");

        if (this.name.contains("Chinese")) {
            wordOrder = "subject-verb-object";
        }
    }
}

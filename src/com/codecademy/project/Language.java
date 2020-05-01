package com.codecademy.project;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language (String langName, int langSpeakers, String langRegions, String langOrder) {
        name = langName;
        numSpeakers = langSpeakers;
        regionsSpoken = langRegions;
        wordOrder = langOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". " +
                "The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        Language kiche = new Mayan("Ki'che'", 2330000);
        kiche.getInfo();

        Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 2330000);
        mandarinChinese.getInfo();

        Language burmese = new SinoTibetan("Burmese", 2330000);
        burmese.getInfo();

        System.out.print("apple".compareTo());
    }
}

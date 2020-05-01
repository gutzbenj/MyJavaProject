package com.codecademy.project;

public class DNA {
    String dnaString;

    public DNA (String dnaStr) {
        dnaString = dnaStr;
    }

    public void hasProtein () {
        String startCodon = "ATG";
        String stopCodon = "TGA";

        int startCodonIndex = dnaString.indexOf(startCodon);
        int stopCodonIndex = dnaString.indexOf(stopCodon);

        if (startCodonIndex != -1 && stopCodonIndex != -1 &&
            dnaString.substring(startCodonIndex, stopCodonIndex).length() % 3 == 0) {
            System.out.println("Contains a protein.");
        } else {
            System.out.println("No protein.");
        }
    }

    public static void main(String[] args) {
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        DNA dna1 = new DNA("ATGCGATACGCTTGA");
        DNA dna2 = new DNA("ATGCGATACGTGA");
        DNA dna3 = new DNA("ATTAATATGTACTGA");

        dna1.hasProtein();
        dna2.hasProtein();
        dna3.hasProtein();


    }

}

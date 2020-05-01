package com.codecademy.project;

public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, this is your new droid, " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyTransfer(Droid otherDroid) {
        int ownEnergy = this.batteryLevel;
        int otherEnergy = otherDroid.batteryLevel;

        System.out.println("Transfering energy between " + this.name + " and " + otherDroid.name + "...");

        this.batteryLevel = otherEnergy;
        otherDroid.batteryLevel = ownEnergy;
    }

    public static void main(String[] args){
        Droid droidCodey = new Droid("Codey");
        Droid droidSteve = new Droid("Steve");

        System.out.println(droidCodey.toString());
        System.out.println(droidSteve.toString());


        droidCodey.performTask("cleaning");
        droidCodey.performTask("cooking");

        System.out.println(droidCodey.name + "s batterylevel: " + droidCodey.batteryLevel);

        droidCodey.energyTransfer(droidSteve);

        System.out.println(droidCodey.name + "s batterylevel: " + droidCodey.batteryLevel);
    }
}


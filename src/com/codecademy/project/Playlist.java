package com.codecademy.project;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList <String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("What");
        desertIslandPlaylist.add("de");
        desertIslandPlaylist.add("Hadde");
        desertIslandPlaylist.add("dude");
        desertIslandPlaylist.add("da");
        desertIslandPlaylist.add("Last");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Hadde");

        System.out.println(desertIslandPlaylist.size());

        int aIndex = desertIslandPlaylist.indexOf("de");
        int bIndex = desertIslandPlaylist.indexOf("Last");
        String tempA = desertIslandPlaylist.get(aIndex);

        desertIslandPlaylist.set(aIndex, desertIslandPlaylist.get(bIndex));
        desertIslandPlaylist.set(bIndex, tempA);

        System.out.println(desertIslandPlaylist);

    }

}
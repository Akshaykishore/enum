package com.company;
public class Main {
    public static void main(String[] args) {
        System.out.println(Level.valueOf("MEDIUM"));
        System.out.println(Level.HARD.ordinal());
        Level[] a = Level.values();
        for(Level levels : a){
            System.out.println(levels.getDifficulty());
        }
    }
}

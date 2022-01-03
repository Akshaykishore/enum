package com.company;
public enum Level {
    EASY(0), MEDIUM(1), HARD(2);
    public int difficulty;
    Level(int difficulty) {
        this.difficulty = difficulty;
    }
    public int getDifficulty(){
        return difficulty;
    }
}

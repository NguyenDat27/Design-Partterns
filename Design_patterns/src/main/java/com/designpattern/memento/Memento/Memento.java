package com.hcmute.springboot.behavioralpatterns.memento.Memento;

public class Memento {
    private int level;
    private int score;
    private String health;

    public Memento(int level, int score, String health) {
        this.level = level;
        this.score = score;
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getHealth() {
        return health;
    }

    public void setHealt(String healt) {
        this.health = healt;
    }
}

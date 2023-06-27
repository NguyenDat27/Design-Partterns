package com.hcmute.springboot.behavioralpatterns.memento.Originator;

import com.hcmute.springboot.behavioralpatterns.memento.Memento.Memento;

public class Player {
    private int level;
    private int score;
    private String health;
    private int lifeline = 3;

    public Memento CreateMarker(Player player)
    {
        return new Memento(player.level, player.score, player.health);
    }

    public void RestoreLevel(Memento playerMemento)
    {
        this.level = playerMemento.getLevel();
        this.score = playerMemento.getScore();
        this.health = playerMemento.getHealth();
        this.lifeline -= 1;
    }

    public void DisplayPlayerInfo()
    {
        System.out.println("Level: " + this.level);
        System.out.println("Score: " + this.score);
        System.out.println("Health: " + this.health);
        System.out.println("Lifeline left: " + this.lifeline);
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

    public void setHealth(String health) {
        this.health = health;
    }

    public int getLifeline() {
        return lifeline;
    }

    public void setLifeline(int lifeline) {
        this.lifeline = lifeline;
    }
}

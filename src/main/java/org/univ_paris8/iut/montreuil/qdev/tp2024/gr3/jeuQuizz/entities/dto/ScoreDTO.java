package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.dto;

public class ScoreDTO {
    private int id;
    private int score;
    private int questionsCount;
    private long temps;

    public ScoreDTO(int id, int score, int questionsCount, long temps) {
        this.id = id;
        this.score = score;
        this.questionsCount = questionsCount;
        this.temps = temps;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public int getQuestionsCount() {
        return questionsCount;
    }

    public long getTemps() {
        return temps;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setQuestionsCount(int questionsCount) {
        this.questionsCount = questionsCount;
    }

    public void setTemps(long temps) {
        this.temps = temps;
    }
}

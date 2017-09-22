package cn.pingweb.dto;

public class UserScoreDto {
    private double score;

    public UserScoreDto() {
    }

    public UserScoreDto(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

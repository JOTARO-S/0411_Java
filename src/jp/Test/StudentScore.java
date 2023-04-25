package jp.Test;

import java.util.HashMap;
import java.util.Map;

public class StudentScore {
    private Map<String, Integer> scores;

    public StudentScore() {
        this.scores = new HashMap<>();
    }

    public void addScore(String studentName, int score) {
        scores.put(studentName, score);
    }

    public int getScore(String studentName) {
        Integer score = scores.get(studentName);
        return score == null ? 0 : score;
    }

    public static void main(String[] args) {
        StudentScore studentScores = new StudentScore();
        studentScores.addScore("Alice", 90);
        studentScores.addScore("Bob", 80);
        studentScores.addScore("Charlie", 70);

        System.out.println(studentScores.getScore("Alice"));    // 90
        System.out.println(studentScores.getScore("Bob"));      // 80
        System.out.println(studentScores.getScore("Charlie"));  // 70
        System.out.println(studentScores.getScore("Dave"));     // 0
    }
}


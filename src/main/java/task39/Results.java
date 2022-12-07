package task39;

public class Results {
    private int scoreA = 0;
    private int scoreB = 0;

    public synchronized int getScoreA() {
        return scoreA;
    }

    public synchronized int getScoreB() {
        return scoreB;
    }

    public synchronized boolean updateScores(int newA, int newB, int oldA, int oldB) {
        if (oldA == scoreA && oldB == scoreB) {
            scoreA = newA;
            scoreB = newB;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Zawodnik A: "
                + scoreA
                +"\t|  Zawodnik B: " +
                scoreB;
    }
}

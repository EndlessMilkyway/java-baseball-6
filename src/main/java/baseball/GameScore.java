package baseball;

public class GameScore {

    private int strike;
    private int ball;

    public GameScore(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public void updateStrike() {
        strike++;
    }

    public void updateBall() {
        ball++;
    }
}

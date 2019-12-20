package domain.user;

public class Score {
	private static final int SCORE_MIN = 0;
	private static final int BLACKJACK_SCORE = 21;

	public static final Score ZERO = new Score(SCORE_MIN);

	private int score;

	public Score(int score) {
		if (score < SCORE_MIN) {
			throw new IllegalArgumentException("점수는 0 이상이어야 합니다.");
		}
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}
}

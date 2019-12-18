package domain.card;

import java.util.List;

import domain.main.Score;

public class Cards {
	private final List<Card> cards;

	public Cards(List<Card> cards) {
		this.cards = cards;
	}

	public Score score() {
		return reviseAceScore(calculateRawScore());
	}

	private Score reviseAceScore(Score score) {
		if (!hasAce(cards)) {
			return score;
		}
		return score.plusTenIfNotBust();
	}

	private Score calculateRawScore() {
		Score score = Score.ZERO;
		for (Card card : cards) {
			score = card.calcuate(score);
		}
		return score;
	}

	private static boolean hasAce(List<Card> original) {
		return original.stream().filter(Card::isAce).findFirst().isPresent();
	}
}
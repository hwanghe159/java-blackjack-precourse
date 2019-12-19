package domain.user;

import java.util.List;

import domain.card.Card;
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
			score = card.calculate(score);
		}
		return score;
	}

	//에이스인 카드를 걸러서 가장 첫번째가 존재한다면 true
	private static boolean hasAce(List<Card> original) {
		return original.stream().filter(Card::isAce).findFirst().isPresent();
	}
	
	
}
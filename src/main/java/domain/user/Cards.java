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

	private static boolean hasAce(List<Card> original) {
		return original.stream().filter(card -> card.getSymbol().isAce()).findFirst().isPresent();
	}
	
	public void add(Card card) {
		cards.add(card);
	}
	
	public Card get(int index) {
		return cards.get(index);
	}
	
	public List<Card> getCards(){
		return this.cards;
	}
}
package domain.user;

import java.util.ArrayList;
import java.util.List;

import domain.card.Card;

public class Cards {
	private final List<Card> cards;
	private final Score score;
	
	public Cards() {
		this.cards = new ArrayList<>();
		this.score = new Score(0);
	}
	
	public void add(Card card) {
		this.cards.add(card);
	}
	
	public Card getCard(int index) {
		return cards.get(index);
	}
	
	public int getSize() {
		return cards.size();
	}
	
	public Score calculate() {
		int sum = 0;
		for (Card card : cards) {
			sum = calculateSubRoutine(sum, card);
		}
	}

	private int calculateSubRoutine(int sum, Card card) {
		if(!card.isAce()) {
			return sum+card
		}
	}
}

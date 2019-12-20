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
		Score score = new Score(0);
		for(Card card:cards) {
			score.getS
		}
	}
}

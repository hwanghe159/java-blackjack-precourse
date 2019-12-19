package domain.user;

import java.util.ArrayList;
import java.util.List;

import domain.card.Card;

public class Cards {
	private final List<Card> cards;
	
	public Cards() {
		this.cards = new ArrayList<>();
	}
	
	public void add(Card card) {
		this.cards.add(card);
	}
	
	public Card getCard(int index) {
		return cards.get(index);
	}
}

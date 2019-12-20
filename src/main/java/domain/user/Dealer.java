package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer {
	private final Cards cards = new Cards();

	public Dealer() {
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	// TODO 추가 기능 구현
	public Card getCard(int index) {
		return cards.getCard(index);
	}

	public boolean decideOneMoreCardOrNot() {
		if (isBelow16()) {
			return true;
		}
		return false;
	}
	
	private boolean isBelow16() {
		this.cards.calculate()
	}
}

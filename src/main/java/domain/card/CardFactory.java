package domain.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 트럼프 카드 전체 생성을 담당하는 객체
 */
public class CardFactory {
	private static final int TOTAL_NUM_OF_CARDS = 52;
	List<Card> cardFactory = new ArrayList<Card>();
	private int index;

	public CardFactory() {
		List<Card> cards = new ArrayList<>();
		Symbol[] symbols = Symbol.values();
		for (Symbol symbol : symbols) {
			createByType(cards, symbol);
		}
		this.cardFactory = cards;
		this.index = 0;
	}

	private static void createByType(List<Card> cards, Symbol symbol) {
		Type[] types = Type.values();
		for (Type type : types) {
			cards.add(new Card(symbol, type));
		}
	}

	public void shuffle() {
		Collections.shuffle(this.cardFactory);
	}

	public Card pop() {
		this.index++;
		if (this.index > TOTAL_NUM_OF_CARDS) {
			throw new NullPointerException("더 이상 뽑을 카드가 없습니다.");
		}
		return cardFactory.get(index);
	}
}

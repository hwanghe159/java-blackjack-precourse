package domain.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.card.Card;
import domain.card.CardFactory;
import domain.user.Dealer;
import domain.user.Player;

public class BlackJackGame {
	
	List<Player> players = new ArrayList<Player>();
	Dealer dealer = new Dealer();
	List<Card> cardFactory = CardFactory.create();
	int cardIndex = 0;
	
	public void play() {
		prepare();
		gamePlay();
		result();
	}

	private void prepare() {
		enterPlayers();
		distributeCards();
	}
	
	private void enterPlayers() {
		UI.askPlayersName();
		String[] names = UI.inputPlayersName();
		for (String name : names) {
			UI.askBettingMoney(name);
			double bettingMoney = UI.inputBettingMoney(name);
			createPlayerInstance(name, bettingMoney);
		}
	}
	
	private void createPlayerInstance(String name, double bettingMoney) {
		players.add(new Player(name,bettingMoney));
	}
	
	private void distributeCards() {
		Collections.shuffle(cardFactory);
		dealer.addCard(cardFactory.get(cardIndex++));
		dealer.addCard(cardFactory.get(cardIndex++));
		for(Player player:players) {
			player.addCard(cardFactory.get(cardIndex++));
			player.addCard(cardFactory.get(cardIndex++));
		}
		UI.printDistributeResult(dealer,players);
	}

	private void gamePlay() {

	}

	private void result() {

	}

}

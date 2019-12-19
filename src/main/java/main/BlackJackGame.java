package main;

import java.util.ArrayList;
import java.util.List;

import domain.card.CardFactory;
import domain.user.Dealer;
import domain.user.Player;

public class BlackJackGame {

	List<Player> players = new ArrayList<Player>();
	Dealer dealer = new Dealer();
	CardFactory cardFactory = new CardFactory();

	public void play() {
		prepare();
		gamePlay();
		result();
	}

	public void prepare() {
		UI.requestPlayerNamesMessage();
		String[] playerNames = UI.inputPlayerNames().split(",");
		for (String playerName : playerNames) {
			createPlayer(playerName, UI.requestAndInputBettingMoney(playerName));
		}
		distributeCards();
	}

	public void createPlayer(String name, double bettingMoney) {
		players.add(new Player(name, bettingMoney));
	}

	public void distributeCards() {
		cardFactory.shuffle();
		dealer.addCard(cardFactory.pop());
		dealer.addCard(cardFactory.pop());
		for (Player player : players) {
			player.addCard(cardFactory.pop());
			player.addCard(cardFactory.pop());
		}
		UI.distributionCompleteMessage(players);
		UI.printDistributionResult(dealer, players);
	}

	public void gamePlay() {

	}

	public void result() {

	}
}

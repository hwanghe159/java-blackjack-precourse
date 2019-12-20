package main;

import java.util.ArrayList;
import java.util.List;

import domain.card.CardFactory;
import domain.user.Dealer;
import domain.user.Player;

public class BlackJackGame {

	static final int MAX_PLAYERS_NUM = 8;
	List<Player> players = new ArrayList<Player>();
	Dealer dealer = new Dealer();
	CardFactory cardFactory = new CardFactory();

	public void play() {
		prepare();
		gamePlay();
		result();
	}

	private void prepare() {
		UI.requestPlayerNamesMessage();
		String[] playerNames = UI.inputPlayerNames().split(",");
		if (playerNames.length > MAX_PLAYERS_NUM) {
			throw new IllegalArgumentException("플레이어는 8명 이하여야 합니다.");
		}
		for (String playerName : playerNames) {
			createPlayer(playerName, UI.requestAndInputBettingMoney(playerName));
		}
		distributeCards();
	}

	private void createPlayer(String name, double bettingMoney) {
		players.add(new Player(name, bettingMoney));
	}

	private void distributeCards() {
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

	private void gamePlay() {
		for (Player player : players) {
			playerGamePlay(player);
		}
		dealerGamePlay();
	}

	private void playerGamePlay(Player player) {
		while(UI.requestYesOrNo(player.getName())) {
			player.addCard(cardFactory.pop());
			UI.printAllCardsOfPlayer(player);
		}
	}

	private void dealerGamePlay() {

	}

	private void result() {

	}
}

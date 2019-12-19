package domain.main;

import java.util.ArrayList;
import java.util.List;

import domain.user.Player;

public class BlackJackGame {
	
	List<Player> players = new ArrayList<Player>();
	
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
	
	private void distributeCards() {
		
	}

	private void createPlayerInstance(String name, double bettingMoney) {
		players.add(new Player(name,bettingMoney));
	}
	
	private void gamePlay() {

	}

	private void result() {

	}

}

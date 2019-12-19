package main;

import java.util.ArrayList;
import java.util.List;

import domain.card.CardFactory;
import domain.user.Player;

public class BlackJackGame {
	
	List<Player> players = new ArrayList<Player>();
	CardFactory cardFactory = new CardFactory();
	
	public void play() {
		prepare();
		gamePlay();
		result();
	}
	
	public void prepare() {
		UI.requestPlayerNamesMessage();
		String[] playerNames = UI.inputPlayerNames().split(",");
		for(String playerName : playerNames) {
			createPlayer(playerName, UI.requestAndInputBettingMoney(playerName));
		}
		distributeCards();
	}
	
	public void createPlayer(String name, double bettingMoney) {
		players.add(new Player(name,bettingMoney));
	}
	
	public void distributeCards() {
		
	}
	
	public void gamePlay() {
		
	}
	
	public void result() {
		
	}
}

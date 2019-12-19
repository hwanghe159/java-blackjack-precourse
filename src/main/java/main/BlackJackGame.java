package main;

public class BlackJackGame {
	public void play() {
		prepare();
		gamePlay();
		result();
	}
	
	public void prepare() {
		UI.requestPlayerNamesMessage();
		String[] playerNames = UI.inputPlayerNames().split(",");
		for(String playerName : playerNames) {
			createPlayer(playerName, requestAndInputBettingMoney(playerName));
		}
	}
	
	public void createPlayer(String name, double bettingMoney) {
		
	}
	
	public void gamePlay() {
		
	}
	
	public void result() {
		
	}
}

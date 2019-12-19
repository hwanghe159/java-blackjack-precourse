package domain.main;

public class BlackJackGame {
	public void play() {
		prepare();
		gamePlay();
		result();
	}

	private void prepare() {
		UI.askPlayersName();
		String[] names = UI.inputPlayersName();
		for (String name : names) {
			UI.askBettingMoney(name);
			int bettingMoney = UI.inputBettingMoney(name);
			createPlayerInstance(name, bettingMoney);
		}
	}

	private void gamePlay() {

	}

	private void result() {

	}

}

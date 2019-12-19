package domain.main;

import java.util.List;
import java.util.Scanner;

import domain.card.Card;
import domain.user.Dealer;
import domain.user.Player;

public class UI {
	public static void askPlayersName() {
		System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
	}

	public static String[] inputPlayersName() {
		Scanner scan = new Scanner(System.in);
		String names = scan.nextLine();
		if (names == null || names.contains(",,")) {
			throw new IllegalArgumentException("이름을 올바르게 입력해 주세요.");
		}
		return names.split(",");
	}

	public static void askBettingMoney(String name) {
		System.out.println(name + "의 배팅 금액은?");
	}

	public static double inputBettingMoney(String name) {
		Scanner scan = new Scanner(System.in);
		double bettingMoney = scan.nextDouble();
		if (bettingMoney < 0) {
			throw new IllegalArgumentException("배팅 금액으로 음수 값은 불가합니다.");
		}
		return bettingMoney;
	}
	
	public static void printDistributeResult(Dealer dealer, List<Player> players) {
		System.out.print("딜러와 " + players.get(0).getName());
		for(int playerIndex = 1; playerIndex<players.size(); playerIndex++) {
			System.out.print(", "+players.get(playerIndex).getName());
		}
		System.out.println("에게 2장의 카드를 나누었습니다.");
		System.out.print("딜러: ");
		System.out.println(dealer.getCards().get(0).getInformation());
		for(Player player : players) {
			printNameAndCardInfoOf(player);
		}
	}
	
	public static void printNameAndCardInfoOf(Player player) {
		System.out.print(player.getName()+"카드: ");
		printCardInfo(player.getCards().getCards().get(0));
		for(int index = 1; index<player.getCards().getCards().size(); index++) {
			System.out.print(", ");
			printCardInfo(player.getCards().getCards().get(index));
		}
		System.out.println();
	}
	
	public static void printCardInfo(Card card) {
		System.out.print(card.getSymbol().getName()+card.getType().getName());
	}
}

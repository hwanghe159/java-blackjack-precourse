package main;

import java.util.List;
import java.util.Scanner;

import domain.card.Card;
import domain.user.Dealer;
import domain.user.Player;

public class UI {
	public static void requestPlayerNamesMessage() {
		System.out.println("게임에 참여할 사람의 이름을 입력해주세요.(쉼표 기준으로 분리)");
	}

	public static String inputPlayerNames() {
		Scanner scan = new Scanner(System.in);
		String playerNames = scan.nextLine();
		if (playerNames == null || playerNames.contains(",,")) {
			throw new IllegalArgumentException("올바르게 입력해 주세요.");
		}
		return playerNames;
	}

	public static double requestAndInputBettingMoney(String playerName) {
		Scanner scan = new Scanner(System.in);
		System.out.println(playerName + "의 배팅 금액은?");
		return scan.nextDouble();
	}

	public static void distributionCompleteMessage(List<Player> players) {
		System.out.print("딜러와 ");
		System.out.print(players.get(0).getName());
		for (int i = 1; i < players.size(); i++) {
			System.out.print(", " + players.get(i).getName());
		}
		System.out.println("에게 2장의 카드를 나누었습니다.");
	}

	public static void printDistributionResult(Dealer dealer, List<Player> players) {
		printOneCardOfDealer(dealer);
		for (Player player : players) {
			printTwoCardsOfPlayer(player);
		}
	}

	public static void printOneCardOfDealer(Dealer dealer) {
		System.out.println("딜러: " + dealer.getCard(0).getCardInfo());
	}

	public static void printTwoCardsOfPlayer(Player player) {
		System.out.println(
				player.getName() + "카드: " + player.getCard(0).getCardInfo() + ", " + player.getCard(1).getCardInfo());

	}

	public static void printlnAllCardsOfPlayer(Player player) {
		System.out.print(player.getName() + "카드: " + player.getCard(0).getCardInfo());
		for (int i = 1; i < player.getCards().getSize(); i++) {
			System.out.print(", " + player.getCard(i).getCardInfo());
		}
		System.out.println();
	}

	public static void printlnAllCardsAndResultOfPlayer(Player player) {
		System.out.print(player.getName() + "카드: " + player.getCard(0).getCardInfo());
		for (int i = 1; i < player.getCards().getSize(); i++) {
			System.out.print(", " + player.getCard(i).getCardInfo());
		}
		System.out.println(" - 결과: " + player.getCards().calculate().getScore());
	}

	public static void printlnAllCardsAndResultOfDealer(Dealer dealer) {
		System.out.print("딜러 카드: " + dealer.getCard(0).getCardInfo());
		for (int i = 1; i < dealer.getCards().getSize(); i++) {
			System.out.print(", " + dealer.getCard(i).getCardInfo());
		}
		System.out.println(" - 결과: " + dealer.getCards().calculate().getScore());
	}

	public static boolean requestYesOrNo(String playerName) {
		Scanner scan = new Scanner(System.in);
		System.out.println(playerName + "는 한 장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
		YesOrNo yesOrNo = new YesOrNo(scan.nextLine());
		return yesOrNo.isYes();
	}

	public static void dealerReceivedOneCardMessage() {
		System.out.println("딜러는 16이하라 한 장의 카드를 더 받았습니다.");
	}
	
	
}

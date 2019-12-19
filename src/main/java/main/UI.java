package main;

import java.util.Scanner;

public class UI {
	public static void requestPlayerNamesMessage() {
		System.out.println("게임에 참여할 사람의 이름을 입력해주세요.(쉽표 기준으로 분리)");
	}
	
	public static String inputPlayerNames() {
		Scanner scan = new Scanner(System.in);
		String playerNames = scan.nextLine();
		if(playerNames == null || playerNames.contains(",,")) {
			throw new IllegalArgumentException("올바르게 입력해 주세요.");
		}
		return playerNames;
	}
	
	public static double requestAndInputBettingMoney(String playerName) {
		Scanner scan = new Scanner(System.in);
		System.out.println(playerName+"의 배팅 금액은?");
		return scan.nextDouble();
	}
}

package domain.main;

import java.util.List;
import java.util.Scanner;

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
		
	}
}

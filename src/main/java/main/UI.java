package main;

import java.util.Scanner;

public class UI {
	public static void requestPlayerNamesMessage() {
		System.out.println("게임에 참여할 사람의 이름을 입력해주세요.(쉽표 기준으로 분리)");
	}
	
	public static String inputPlayerNames() {
		Scanner scan = new Scanner(System.in);
		String playerNames = scan.nextLine();
		return playerNames;
	}
}

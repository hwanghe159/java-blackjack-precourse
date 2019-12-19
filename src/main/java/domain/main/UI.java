package domain.main;

import java.util.Scanner;

public class UI {
	public static void askPlayersName() {
		System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
	}
	
	public static String[] inputPlayersName() {
		Scanner scan = new Scanner(System.in);
		String names = scan.nextLine();//예외처리 필요
		return names.split(",");
	}
	
	
}

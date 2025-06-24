package kadai_028;

import java.util.ArrayList;
import java.util.HashMap
;
import java.util.Scanner;
public class Jyanken_Chapter28 {
	
	public static String getMychoice() {
		
		do {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				return input;
		    } else {
		    	System.out.println("エラーです");
		    }
		} while (true);
	}
	
	public static String getRandom() {
		
		ArrayList<String> other = new ArrayList<String>();
		
		other.add("r");
		other.add("s");
		other.add("p");
		
		double randNumDouble = Math.floor(Math.random() * 3);
		int randNum = (int)randNumDouble;
		
		
		String janken = other.get(randNum);
		return janken;
	}
	
	public static void playGame() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String myChoice = getMychoice();
		
		String otherChoice = getRandom();
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("r", "グー");
		hashMap.put("s", "チョキ");
		hashMap.put("p", "パー");
		
		System.out.println("自分の手は" + hashMap.get(myChoice));
		System.out.println("対戦相手の手は" + hashMap.get(otherChoice));
		
		if (myChoice.equals("r") && otherChoice.equals("s") || myChoice.equals("s") && otherChoice.equals("p") || myChoice.equals("p") && otherChoice.equals("r")) {
			System.out.println("自分の勝ちです");
		} else if (myChoice.equals(otherChoice)) {
			System.out.println("あいこです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}

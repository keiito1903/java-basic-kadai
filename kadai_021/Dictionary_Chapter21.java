package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public static void searchDict (ArrayList<String> fruits) {
		
		HashMap<String, String> map = new HashMap<String, String>();
	
		map.put("apple","りんご");
		map.put("peach","桃");
		map.put("banana","バナナ");
		map.put("lemon","レモン");
		map.put("pear","梨");
		map.put("kiwi","キウィ");
		map.put("strawberry","いちご");
		map.put("grape","ぶどう");
		map.put("muscat","マスカット");
		map.put("cherry","さくらんぼ");
		
		for(int i = 0; i < fruits.size(); i++) {
			String word = fruits.get(i);
			if(map.containsKey(word)) {
				System.out.println(word + "の意味は" + map.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
	     }
     }
}

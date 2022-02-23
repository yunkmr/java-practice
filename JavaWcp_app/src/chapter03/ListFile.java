package chapter03;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		
		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");
		
		list1.get(0);
		
		// 存在チェック (trueを返す)
		list1.contains("バナナ");

		// 存在チェック (falseを返す)
		list1.contains("なし");
		
		list1.size();
		
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		list1.remove("バナナ");
		list1.remove("なし");

		// 位置を指定して要素を削除する
		list1.remove(0);
		list1.remove(5);
	}
}

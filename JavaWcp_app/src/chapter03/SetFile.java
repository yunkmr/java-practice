package chapter03;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
	public static void main(String[] args) {
		// HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		//要素を追加する
		set1.add("スイカ");
		set1.add("メロン");
		
		//存在チェック
		set1.contains("スイカ");
		
		//存在チェック
		set1.contains("なし");
		
		set1.size();
		
		//要素を削除する
		set1.remove("スイカ");
		set1.remove("なし");
		
	}
}

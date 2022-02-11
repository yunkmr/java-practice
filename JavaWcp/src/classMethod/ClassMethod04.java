package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
//		Human04 satou = new Human04("佐藤");
		
//		静的メソッドはインスタンス生成なしで使用できる
		Human04.staticMerhodPrint();
		
//		staticなクラス定数もインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);
		
//		インスタンスメンバーはインスタンス生成をしないと使用できない
		yamada.instanceMethodPrint();
//		下記はエラーとなる
//		Human04.instanceMethodPrint();
		
	}
}

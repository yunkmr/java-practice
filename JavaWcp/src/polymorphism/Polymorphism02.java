package polymorphism;

import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism02 {
	public static void main(String[] args) {
		Human human = new Student("佐藤", 17, 70);
		
		Polymorphism02 plymorphism = new Polymorphism02();
		
//		引数なし
		plymorphism.printName();
//		引数がStringクラス
		plymorphism.printName("松本");
//		引数がStringクラスとStringクラス
		plymorphism.printName("松本", "清水");
//		引数がHumanクラス
		plymorphism.printName(human);
	}
	
	public void printName() {
		System.out.println("中川です。");
	}

	public void printName(String name) {
		System.out.println(name + "です。");
	}
	
	public void printName(String name1, String name2) {
		System.out.println(name1 + "と" + name2 + "です。");
	}
	
	public void printName(Human human) {
		System.out.println(human.getName() + "です。");
	}
	
}

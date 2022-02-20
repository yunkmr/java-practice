package chapter9;

public class Hero {
	String name;
	int hp;
	Sword sword;
	
	void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("的に5ポイントのダメージをあたえた！");
	}
}

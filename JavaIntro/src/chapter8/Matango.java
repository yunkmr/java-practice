package chapter8;

public class Matango {
	int hp;
	final int LEVEL = 10;
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復しました！");
	}
	
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した.");
	}
	
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("５のダメージ！");
	}
	
	void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}

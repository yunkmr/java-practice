package chapter8;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		hp = MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した。");
	}
	
	int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		
	    Random rand = new Random();
	    int recover = rand.nextInt(3) + sec;
	    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
	    
	    mp += recoverActual;
	    		
	    System.out.println("MPが" + recoverActual + "回復した");
	    
	    return recoverActual;
	}
}

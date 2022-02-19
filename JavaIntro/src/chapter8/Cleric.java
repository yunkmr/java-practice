package chapter8;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		mp -= 5;
		hp = MAX_HP;
	}
	
	public int pray(int sec) {
	    Random rand = new Random();
	    int num = rand.nextInt(3) + sec;
	    
	    mp = mp + num;
	    		
	    if (mp > MAX_MP) {
	    	mp = MAX_MP;
	    }
	    
	    return mp;
	}
}

package chapter11;

public class Matango {
	int hp = 50;
	private char suffix;
	
	public Matango(car suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("" + this.suffix + "");
		System.out.println("" + this.suffix + "");
		h.setHp(h.getHp() -10);
	}
}

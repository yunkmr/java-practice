package chapter11;

public class PoisonMatango extends Matango {
	private int count = 5;
	private int dmg;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		
		if (this.count > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			dmg = h.getHp() / 5;
			h.setHp(h.getHp() - dmg);
			System.out.println(dmg + "ポイントのダメージをあたえた！");
			this.count--;
		}
		
	}
}

package chapter10;

public class Wand {
	private String name;
	double power;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖の名前が正しくありません");
		}
		this.name = name;
	}
	
	double getPower() {
		return this.power;
	}
	
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖の魔力が正しくありません");
		}
		this.power = power;
	}
	
}

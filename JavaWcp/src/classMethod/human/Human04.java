package classMethod.human;

public class Human04 {
	
//	static変数
	static public int humanCount = 0;
	public String name;
	
//	定数
	public static final String GREETING = "こんにちは";
	
	public Human04(String name) {
		this.name = name;
		Human04.humanCount++;
	}
	
	static public void staticMerhodPrint() {
		System.out.println("人の数は、" + humanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は、" + name);
	}
	
}

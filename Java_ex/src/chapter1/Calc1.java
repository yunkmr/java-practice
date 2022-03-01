package chapter1;

public class Calc {
	public static void main(String[] args) {
		int data[] = {32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420};
		
		int total = data[0];
		float ave = 0.0f;
		
		for (int i=1; i < data.length; i++) {
			total += data[i];
		}
		
		ave = (float) total / data.length;		
		
		System.out.println("平均値 >> " + ave + "個");
		System.out.println("合計　 >> " + total + "個");
	}
}

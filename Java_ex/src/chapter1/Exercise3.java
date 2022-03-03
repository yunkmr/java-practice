package chapter1;

public class Exercise3 {
	public static void main(String[] args) {
		int data[] = {32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420};
		
		int maxValue = data[0];
		int maxMonth = 1;
		int minValue = data[0];
		int minMonth = 1;
		
		for (int i = 1; i < data.length; i++) {
			if (maxValue < data[i]) {
				maxValue = data[i];
				maxMonth = i + 1;
			}
			
			if (minValue > data[i]) {
				minValue = data[i];
				minMonth = i + 1;
			}
		}
		
		System.out.println("最大値 >> " + maxValue + "個\t" + maxMonth + "月");
		System.out.println("最小値 >> " + minValue + "個\t" + minMonth + "月");
	}
}

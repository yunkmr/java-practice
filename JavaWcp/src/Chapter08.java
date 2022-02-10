
public class Chapter08 {
	public static void main(String[] args) {
		
//		While文
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		
//		通常for文
		int[] array = { 1, 21, 33, 48 };
		for (int i = 1; i <= array.length; i++) {
			System.out.println(i);
		}
		
//		拡張for文
		for (int num : array) {
			if (num % 2 == 0) {
				continue;
			} 
			System.out.println(num);
		}
	}
}

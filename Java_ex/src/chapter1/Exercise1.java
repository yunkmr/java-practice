package chapter1;

public class Exercise1 {
	public static void main(String[] args) {
		int data[] = {32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420};
		
		for (int i = 0; i < data.length; i++) {
			int month = Math.round((float) data[i] / 10);
			
			System.out.print((i + 1) + "月\t|");
			for (int j = 0; j < month; j++) {
				System.out.print("※");
			}
			System.out.println();
		}
	}
}

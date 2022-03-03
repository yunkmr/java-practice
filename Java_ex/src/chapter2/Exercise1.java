package chapter2;

public class Exercise1 {
	public static void main(String[] args) {
		int data[] = {32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420};
		
		int month[] = new int[12];
		for (int i = 0; i < month.length; i++) {
			month[i] = i + 1;
		}
		
		for (int i = data.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] < data[j+1]) {
					int work = 0;
					
					work = data[j+1];
					data[j+1] = data[j];
					data[j] = work;
					
					work = month[j+1];
					month[j+1] = month[j];
					month[j] = work;
				}
			}
		}
		System.out.println("順位\t個数\t月");
		for (int i=0; i < data.length; i++) {
			System.out.print((i+1) + "\t");
			System.out.print(data[i] + "個\t");
			System.out.println(month[i] + "月");
		}
	}
}

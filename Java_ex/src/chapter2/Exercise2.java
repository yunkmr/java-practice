package chapter2;

public class Exercise2 {
	public static void main(String[] args) {
		int data[] = {32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420};
		
		int month[] = new int[12];
		for (int i = 0; i < month.length; i++) {
			month[i] = i + 1;
		}
		
		int work = 0;
		int num = 0;
		
		for (int i = 0; i < data.length; i++) {
			num = i;
			
			for (int j = i + 1; j < data.length; j++) {
				if (data[num] > data[j]) {
					num = j;
				}
			}
			
			work = data[i];
			data[i] = data[num];
			data[num] = work;
			
			work = month[i];
			month[i] = month[num];
			month[num] = work;
		}
		System.out.println("順位\t個数\t月");
		for (int i=0; i < data.length; i++) {
			System.out.print((i+1) + "\t");
			System.out.print(data[i] + "個\t");
			System.out.println(month[i] + "月");
		}
	}
}

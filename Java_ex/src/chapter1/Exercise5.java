package chapter1;

public class CalcGcd {
	public static void main(String[] args) {
		
		int m;
		int n;
		int a;
		int b;
		int r;
		
		if (args.length == 2) {
			try{
				m = Integer.parseInt(args[0]);
				n = Integer.parseInt(args[1]);
				
				if( m > n ) {
					a = m;
					b = n;
				} else {
					a = n;
					b = m;
				}
				
				do {
					r = a % b;
					a = b;
					b = r;
				} while (r != 0);
				
				System.out.println(m + " と " + n + " 最大公約数は " + a + " です。");
				
			} catch( NumberFormatException e) {
				System.out.println("引数には整数を指定してください。");
			}
		} else {
			System.out.println("引数は２個指定してください。");
		}
		
	}
}

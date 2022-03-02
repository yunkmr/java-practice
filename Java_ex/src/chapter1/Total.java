package chapter1;

public class Total {
	public static void main(String[] args) {
		int m;
		int n;
		int work;
		int total = 0;
		int sum;
		
		if (args.length == 2) {
			try{
				m = Integer.parseInt(args[0]);
				n = Integer.parseInt(args[1]);
				
				if( m > n ) {
					work = m;
					m = n;
					n = work;
				}
				
				for (sum = m; sum < n; sum++) {
					total = total + sum;
				}
				
				System.out.println(m + "から" + n + "までの合計は" + total + "です。");
				
			} catch( NumberFormatException e) {
				System.out.println("引数には整数を指定してください。");
			}
		} else {
			System.out.println("引数は２個指定してください。");
		}
	}
}

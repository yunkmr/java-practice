package chapter01;

public class chapter01 {
	public static void main(String[] args) {
		Human human = new Human();
		Human.HumanLeg humanleg = human.new HumanLeg();
		humanleg.kick();
		
//		一行に略
		new Human().new HumanLeg().kick();
	}
}

package practice;

public class Chapter12 {
    public static void main(String[] args) {
        NoCapsuleMan man = new NoCapsuleMan("小林", 32);
        System.out.println("名前は" + man.name +  "です。");
        System.out.println("年齢は" + man.age + "です。");
        man.age = 33;
        System.out.println("誕生日を迎えたので、年齢が" + man.age + "になりました。");
    }
}

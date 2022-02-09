
public class Null01 {
	public static void main(String[] args) {
		String str1;
		str1 = "あいう";
		System.out.println(str1 + "の文字数は：" + str1.length());
        // ””（空文字）の文字数を出力
		str1 = "";
        System.out.println(str1 + "の文字数：" + str1.length());
        // nullの変数を参照するとNullPointerExceptionのエラー
        str1 = null;
        System.out.println(str1 + "の文字数：" + str1.length());
	}
}

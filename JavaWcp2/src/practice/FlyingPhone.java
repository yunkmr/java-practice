package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    // プログラムを作成
	private int minutes;
	
	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}
	
	public void fly() {
		System.out.println(this.minutes + "分間、飛びます。");
	}
	
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}

	@Override
	public void powerOff() {
		Flying.super.powerOff();
	}
	
}

package chapter04;

import java.math.BigDecimal;

public class Apple extends Fruit {
	Apple(String name, BigDecimal price){
		super(name, price);
	}
	
	@Override
	protected String getName() {
		return name;
	}
	
	@Override
	protected BigDecimal getPrice() {
		return price;
	}
	
}

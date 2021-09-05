package intefaceex.calculator;

public class Main {

	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.add(10, 2));
		System.out.println(mc.sub(10, 2));
		System.out.println(mc.mul(10, 2));
		System.out.println(mc.div(10, 2));	
	}

}
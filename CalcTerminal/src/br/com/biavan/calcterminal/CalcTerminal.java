package br.com.biavan.calcterminal;

public class CalcTerminal {

	public static void main(String[] args) {

		Number num1 = new Number(Double.valueOf(15));
		Number num2 = new Number(Double.valueOf(32.8));
		Number num3 = new Number(Double.valueOf(6));
		Number num4 = new Number(Double.valueOf(24));
		Number num5 = new Number(Double.valueOf(4));
		Number num6 = new Number(Double.valueOf(3));
		
		
		System.out.println(num1.add(num3));
		System.out.println(num4.subtract(num3));
		System.out.println(num3.multiplies(num5));
		
		System.out.print(num6.divides(num3));
		System.out.println(" Resta: " + num6.getRemainder());
		
		System.out.print(num2.divides(num3));
		System.out.println(" Resta: " + num2.getRemainder());
		
		System.out.print(num3.divides(num6));
		System.out.println(" Resta: " + num3.getRemainder());

	}

}

public class Calculator {
	public Calculator() {

	}

	public int add(int a, int b) {
		return a + b;

	}

	public int substract(int a, int b) {
		return a - b;

	}

	public int multiply(int a, int b) {
		return a * b;

	}

	public double divide(int a, int b) {
		return a / b;

	}

	public int modulo(int a, int b) {
		return a % b;

	}

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		System.out.println(myCalculator.add(30,15));
		System.out.println(myCalculator.substract(30,15));
		System.out.println(myCalculator.multiply(30,15));
	//	System.out.println(myCalculator.divide(30,15));

		}
}
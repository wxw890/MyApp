package fourth;

public class Main2 {

	public static void main(String[] args) {
		ExeTimeCalculator etCal1 = new ExeTimeCalculator(new CalculatorImpl());
		System.out.println(etCal1.factorial(10));
		
		ExeTimeCalculator etCal2 = new ExeTimeCalculator(new CalculatorRecImpl());
		System.out.println(etCal2.factorial(10));

	}

}

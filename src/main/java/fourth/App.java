package fourth;

public class App {

	public static void main(String[] args) {
		Calculator cal1 = new CalculatorImpl();
		long start1 = System.currentTimeMillis();
		cal1.factorial(5);
		long end1 = System.currentTimeMillis();
		System.out.printf("CalculatorImpl.factorial(%d) 실행시간 - %d\n", 10000, (end1-start1));
		
		Calculator cal2 = new CalculatorRecImpl();
		long start2 = System.currentTimeMillis();
		cal2.factorial(5);
		long end2 = System.currentTimeMillis();
		System.out.printf("CalculatorRecImpl.factorial(%d) 실행시간 - %d\n", 10000, (end2-start2));

	}

}

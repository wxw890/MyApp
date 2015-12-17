package fourth;

public class ExeTimeCalculator implements Calculator {
	private Calculator cal;
	
	public ExeTimeCalculator(Calculator cal){
		this.cal = cal;
	}
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = cal.factorial(num);
		long end = System.nanoTime();
		
		System.out.printf("%s.factorial(%d) 실행시간 - %d\n",cal.getClass(), num, (end-start));
		return result;
	}

}

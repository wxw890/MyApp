package fifth;
//일반 반복문을 이용한 펙토리얼 메소드
public class CalculatorImpl implements Calculator {

	public long factorial(long num) {
		//long start = System.currentTimeMillis();
		
		long result = 1;
		for(int i=1; i<=num; i++){
			result *=i;
		}
		//long end = System.currentTimeMillis();
		//System.out.printf("CalculatorImpl.factorial(%d) 실행시간 - %d\n", num, (end-start));
		
		return result;
	}

}

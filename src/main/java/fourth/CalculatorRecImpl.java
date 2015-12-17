package fourth;
//재귀호출을 이용한 팩토리얼메서드
public class CalculatorRecImpl implements Calculator {

	public long factorial(long num) {
		//long start = System.currentTimeMillis();
		try{
		if(num==0)
			return 1;
		else
			return num*factorial(num-1);
		}
		finally{
			//long end = System.currentTimeMillis();
			//System.out.printf("CalculatorRecImpl.factorial(%d) 실행시간 - %d\n", num, (end-start));
		}
	}

}

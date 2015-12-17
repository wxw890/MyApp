package sixth;



import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ExeTimeCalculator {
	private Calculator cal;
	
	@Around("execution(public * sixth..*(..))")
	public Object measure(ProceedingJoinPoint joinpoint) throws Throwable {
		long start = System.nanoTime();
		try{
		Object result = joinpoint.proceed();
		return result;
		}
		finally{
		long end = System.nanoTime();
		Signature sign = joinpoint.getSignature();
		System.out.printf("%s.%s(%s) 실행시간 - %d\n",joinpoint.getTarget().getClass().getSimpleName() ,sign.getName(), Arrays.toString(joinpoint.getArgs()), (end-start));
		
		}
	}

}

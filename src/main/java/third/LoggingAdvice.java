package third;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect //Annotation으로 사용할때 필요함
public class LoggingAdvice{ //ArountAdvice 기능을 사용할수 있다.
@Around("execution(* sayHello())") //Annotation으로 사용할때 필요함
public Object invoke(ProceedingJoinPoint arg0) throws Throwable {
	// TODO Auto-generated method stub
	StopWatch watch = new StopWatch();
	//long startTime = System.currentTimeMillis();//시작시간
	String methodName = arg0.getSignature().getName();//메서드 이름을 알수있다
	watch.start(methodName);
	System.out.println("[LOG] method : "+ methodName+"시작됨");
	Object obj = arg0.proceed(); //다시 실행시킴
	
	//long endTime = System.currentTimeMillis();
	watch.stop();
	System.out.println("[LOG] method : "+ methodName+"종료");
	
	System.out.println("[LOG] 처리시간 : "+ watch.getTotalTimeSeconds());
	return obj;
}
}

package first;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
@Component
public class LoggingAdvice implements MethodInterceptor { //ArountAdvice 기능을 사용할수 있다.

public Object invoke(MethodInvocation arg0) throws Throwable {
	// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();//시작시간
	String methodName = arg0.getMethod().getName();
	System.out.println("[LOG] method : "+ methodName+"시작됨");
	Object obj = arg0.proceed(); //다시 실행시킴
	
	long endTime = System.currentTimeMillis();
	System.out.println("[LOG] method : "+ methodName+"종료");
	
	System.out.println("[LOG] 처리시간 : "+ (endTime-startTime)/1000);
	return obj;
}
}

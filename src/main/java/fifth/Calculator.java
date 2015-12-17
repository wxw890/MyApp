package fifth;
//factorial 메서드를 하나는 반복문, 또하나는 재귀호출로 통해 서로 성능차이를 알아보는 예제(즉 현재 인터페이스 하나에 그걸 상속 받는 두개의 클래스가 있는 상태)
public interface Calculator {
	public long factorial(long num);
}

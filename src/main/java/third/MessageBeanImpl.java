package third;

public class MessageBeanImpl implements MessageBean {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {//성능측정할 예정
		//시작시간
		System.out.println("Hello!!!!!"+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//끝시간
		//걸린시간 = 끝시간 - 시작시간
	}

}

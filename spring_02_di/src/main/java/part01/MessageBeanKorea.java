package part01;

public class MessageBeanKorea implements MessageBean {
	public MessageBeanKorea() {
		System.out.println("MessageBeanKorea");
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.printf("안녕, %s !!!", name);
	}
}

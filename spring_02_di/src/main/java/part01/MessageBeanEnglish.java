package part01;

public class MessageBeanEnglish implements MessageBean {
public MessageBeanEnglish () {
	System.out.println("MessgeBeanEnglish");
}

@Override
public void sayHello(String name) {
	// TODO Auto-generated method stub
	System.out.printf("Hello, %s !!!", name);
}
}

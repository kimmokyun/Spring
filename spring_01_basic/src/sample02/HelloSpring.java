package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MessageBean bean = null;
//bean = new MessageBeanKorea();
//dispaly(bean);
		bean = new MessageBeanEnglish();
		dispaly(bean, "Spring");
		
		
	}
public static void dispaly(MessageBean bean, String subject) {
//	bean.sayHello("스프링");
	bean.sayHello(subject);
}
}

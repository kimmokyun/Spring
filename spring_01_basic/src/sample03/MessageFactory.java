package sample03;

public class MessageFactory {
public static MessageBean getInstance(String type) {
	if(type.equals("ko")) {
		return new MessageBeanKorea();
	}else if(type.equals("en")) {
		return new MessageBeanKorea();
	}else {
		return null;
	}
} // end get
	
} // class

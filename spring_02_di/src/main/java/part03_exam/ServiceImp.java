package part03_exam;

public class ServiceImp implements Service{
private User user;

public ServiceImp() {
	// TODO Auto-generated constructor stub
}
public ServiceImp(User user) {
	this.user=user;
}

@Override
public void prn() {
	// TODO Auto-generated method stub
	System.out.printf("%s %s\n", user.getId(), user.getPass());
}
}

package part02_annotation;

import java.util.Random;
//핵심 로직만 구현해 놓은 클래스 - Target
public class ServiceImp implements Service {
public ServiceImp() {
	// TODO Auto-generated constructor stub
}

@Override
public void prn1() {
	// TODO Auto-generated method stub
	System.out.println("prn");
}

@Override
public void prn1(int x) {
	// TODO Auto-generated method stub
	System.out.println("x:"+x);
}
@Override
public void prn1(Random ran) {
	// TODO Auto-generated method stub
	System.out.println(ran.nextDouble());
}

@Override
public void prn1(int a, int b) {
	// TODO Auto-generated method stub
	System.out.printf("a=%d, b=%d\n", a, b);
}

@Override
public void prn2() {
	// TODO Auto-generated method stub
	System.out.println("prn2");
}

@Override
public String prn3() {
	// TODO Auto-generated method stub
	System.out.println("prn3");
	
	return "홍길동";
}

@Override
public void prn4() {
	// TODO Auto-generated method stub
	System.out.println("prn4");
	//String data = "123";
	String data = "abc";
	int num = Integer.parseInt(data);
	System.out.println("num:" + num);
}

@Override
public void prn5() {
	System.out.println("prn5");
	// TODO Auto-generated method stub
	
}
}

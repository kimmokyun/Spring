package part02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8090/myapp/secondmain.ss

@Controller
public class MemController {

	private Service svc;

	public MemController() {
		// TODO Auto-generated constructor stub
	}

	public void setSvc(Service svc) {
		this.svc = svc;
	}

	@RequestMapping("/secondmain.ss")
	public void execute() {
		System.out.println("execute");
		//트렌잭션이 설정된 메소드에서는 try~catch를 서정하면 안되고
		//메소드를 호출하는 곳에서 try~catch을 한다
		try {
	  svc.insertProcess();
		}catch(Exception ex) {
			System.out.println("result:" + ex.toString());
		}
		}

}

package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dao.MemDAO;
import dto.MemDTO;

//@RestController = @controller + @Responsbody

//@RestController

@Controller
public class MemController {

	private MemDAO dao;
	public MemController() {
		// TODO Auto-generated constructor stub
	}
	public void setDao(MemDAO dao) {
		this.dao = dao;
	}
	
	//http://localhost:8090/myapp/mem/list
	

	//@CrossOrigin("*") // @CrossOrigin("http://localhost:3000")
	
	
	@ResponseBody
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<MemDTO> listMethod() {
		System.out.println("list");
	return dao.list();	
	}
	
	//http://localhost:8090/myapp/mem/list/17
	@ResponseBody
	@RequestMapping(value="/list/{ss}", method=RequestMethod.GET)
	public MemDTO listMethod(@PathVariable("ss") int num) {
		return dao.list(num);
	}
	//http://localhost:8090/myapp/mem/list/17/돌쟁이
		@ResponseBody
		@RequestMapping(value="/list/{ss}/{name}", method=RequestMethod.GET)
		public MemDTO listMethod(@PathVariable("ss") int num,@PathVariable("name") String name) {
			return dao.list(new MemDTO(num,name));
		}
		
		//{"name":"홍길동", "age":30, "loc":"서울}
		//http://localhost:8090/myapp/mem/insert
		
		@RequestMapping(value="/insert", method=RequestMethod.POST)
	public ResponseEntity<String> insertMethod(@RequestBody MemDTO dto) {
		ResponseEntity<String>entity = null;
		try {
		dao.register(dto);
		entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		}catch(Exception e) {
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
		//{"num":17,"name":"Steven"}
				//http://localhost:8090/myapp/mem/update	
		@RequestMapping(value="/update", method=RequestMethod.PUT)
		public ResponseEntity<String> updateMethod(@RequestBody MemDTO dto) {
			ResponseEntity<String>entity = null;
			try {
			dao.update(dto);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
			}catch(Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
			return entity;
		}
		//http://localhost:8090/myapp/mem/delete/44
		@RequestMapping(value="/delete/{num}", method=RequestMethod.DELETE)
		public ResponseEntity<String> deleteMethod(@PathVariable("num")int num) {
			ResponseEntity<String>entity = null;
			try {
			dao.delete(num);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
			}catch(Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
			return entity;
		}
}

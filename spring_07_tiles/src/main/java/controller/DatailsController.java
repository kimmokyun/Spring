package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DatailsController {

@RequestMapping("/detail.do")	
public String execute() {
	return "details";
}
}

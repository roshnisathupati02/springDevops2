package in.sb.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "<h1 style='color:blue'>web application development with java</h1>";
	}
}

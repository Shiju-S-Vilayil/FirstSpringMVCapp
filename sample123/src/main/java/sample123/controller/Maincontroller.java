package sample123.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller 
{
	@RequestMapping("/")
	public String view()
	{
		return "index";
	}
	@RequestMapping("/hi")
	public String viewData()
	{
		return "view";
	}

}

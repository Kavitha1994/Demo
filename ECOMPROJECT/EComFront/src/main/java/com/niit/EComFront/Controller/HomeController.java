package com.niit.EComFront.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({ "/", "/index" })
	public String indexPage(Model m) {
		m.addAttribute("sliderpage", true);
		return "index";
	}

	@RequestMapping("/aboutus")
	public String aboutPage(Model m) {
		m.addAttribute("aboutPage", true);
		return "index";
	}

	@RequestMapping("/contactus")
	public String contactPage(Model m) {
		m.addAttribute("contactPage", true);
		return "index";

	}

	@RequestMapping("/login")
	public String loginPage(Model m) {
		m.addAttribute("loginPage", true);
		return "index";

	}

	

	}

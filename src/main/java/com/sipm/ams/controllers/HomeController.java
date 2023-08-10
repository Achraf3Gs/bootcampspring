package com.sipm.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/info")// ce que je tape dans l`url
	public String info() {
		System.out.println("Méthode infoo");
		return "home/info";
	}
	
	@RequestMapping("/affichage")// le nom de la vue sous template
	public String affichage() {
		System.out.println("Méthode affichage");
		return "home/affichage";
	
}
}

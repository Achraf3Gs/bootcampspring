package com.sipm.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/info")// ce que je tape dans l`url
	public String info(Model model) {
		ArrayList<String> names =new ArrayList<>();
		names.add("OCP");
		names.add("OCA");
		names.add("Angular");
		names.add("React");
		model.addAttribute("names", names);
		String formation= "Fullstack";
		System.out.println("Méthode infoo");
	   model.addAttribute("workshop", formation);
		return "home/info";
	}
	
	@RequestMapping("/affichage")// le nom de la vue sous template
	public String affichage() {
		System.out.println("Méthode affichage");
		return "home/affichage";
	
}
}

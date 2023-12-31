package com.sipm.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	@PostMapping("/result")
	@ResponseBody
	public String resultat(@RequestParam("nom")String n ,@RequestParam("email")String e )
	{
		return "Vous avez tapez : "+ n + " " + e ;
	}
	
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

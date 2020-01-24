package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class PortfolioController {

	@RequestMapping("/portfolio")
	public String port() {
		return "Portfolio";
	
	}
	@RequestMapping("/projetos")
	public String proje() {
		return "Projetos";

	}
	@RequestMapping("/skills")
	public String skills() {
		return "Skills";

	}
	@RequestMapping("/Contato")
	public String contato() {
		return "Contato";
	}
}
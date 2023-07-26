package br.com.dinosauria.dino.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DinoController {
	
	@GetMapping("/")
	public String listarDinossauros() {
		System.out.println("meow");		
		return ("lista-dinossauro");
	}
}

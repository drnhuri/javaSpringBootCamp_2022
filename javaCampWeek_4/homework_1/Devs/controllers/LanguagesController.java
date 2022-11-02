package Kodlama.io.Devs.kodlama.io.Devs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.kodlama.io.Devs.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return this.languageService.getAll();
	}
	
	@GetMapping("/getById")
	public Language getById(int id) {
		return this.languageService.getById(id);
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
	
	@PostMapping("/update")
	public String update(@RequestBody Language language) {
		return this.languageService.update(language);
	}
	
	@DeleteMapping()
	public void delete(Language language) {
		languageService.delete(language);
	}

}

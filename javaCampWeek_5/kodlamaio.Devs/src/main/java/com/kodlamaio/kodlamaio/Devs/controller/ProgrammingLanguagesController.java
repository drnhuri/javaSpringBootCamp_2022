package com.kodlamaio.kodlamaio.Devs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.kodlamaio.Devs.business.abstracts.ProgrammingLanguageService;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.DeleteProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.UpdateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingLanguageResponses.GetAllProgrammingLanguageResponse;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingLanguageResponses.GetByIdProgrammingLanguageResponse;
@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageResponse> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception{
		programmingLanguageService.add(createProgrammingLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		programmingLanguageService.delete(deleteProgrammingLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception{
		programmingLanguageService.update(updateProgrammingLanguageRequest);
	}
	
	@GetMapping("/getbyid")
	public GetByIdProgrammingLanguageResponse getById(int id){
		return programmingLanguageService.getById(id);
	}
}

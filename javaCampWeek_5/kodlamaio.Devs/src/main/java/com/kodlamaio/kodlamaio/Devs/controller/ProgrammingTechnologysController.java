package com.kodlamaio.kodlamaio.Devs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.kodlamaio.Devs.business.abstracts.ProgrammingTechnologyService;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.CreateProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.DeleteProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.UpdateProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingTechnologyResponses.GetAllProgrammingTechnologyResponse;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingTechnologyResponses.GetByIdProgrammingTechnologyResponse;

@RestController
@RequestMapping("/api/programmingtechnology")
public class ProgrammingTechnologysController {
	
	private ProgrammingTechnologyService programmingTechnologyService;
	
	@Autowired
	public ProgrammingTechnologysController(ProgrammingTechnologyService programmingTechnologyService) {
		this.programmingTechnologyService = programmingTechnologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingTechnologyResponse> getAll(){
		return programmingTechnologyService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) throws Exception{
		programmingTechnologyService.add(createProgrammingTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingTechnologyRequest deleteProgrammingTechnologyRequest) {
		programmingTechnologyService.delete(deleteProgrammingTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammingTechnologyRequest updateProgrammingTechnologyRequest) throws Exception{
		programmingTechnologyService.update(updateProgrammingTechnologyRequest);
	}
	
	@GetMapping("/getbyid")
	public GetByIdProgrammingTechnologyResponse getById(int id) {
		return programmingTechnologyService.getById(id);
	}
	
	
}

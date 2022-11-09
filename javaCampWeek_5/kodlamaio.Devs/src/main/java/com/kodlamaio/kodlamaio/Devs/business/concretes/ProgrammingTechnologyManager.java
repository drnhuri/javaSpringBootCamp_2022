package com.kodlamaio.kodlamaio.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.kodlamaio.Devs.business.abstracts.ProgrammingTechnologyService;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.CreateProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.DeleteProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.UpdateProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingTechnologyResponses.GetAllProgrammingTechnologyResponse;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingTechnologyResponses.GetByIdProgrammingTechnologyResponse;
import com.kodlamaio.kodlamaio.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.kodlamaio.kodlamaio.Devs.dataAccess.abstracts.ProgrammingTechnologyRepository;
import com.kodlamaio.kodlamaio.Devs.entities.ProgrammingLanguage;
import com.kodlamaio.kodlamaio.Devs.entities.ProgrammingTechnology;
@Service
public class ProgrammingTechnologyManager implements ProgrammingTechnologyService{

	private ProgrammingTechnologyRepository programmingTechnologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingTechnologyManager(ProgrammingTechnologyRepository programmingTechnologyRepository, ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingTechnologyRepository = programmingTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	@Override
	public List<GetAllProgrammingTechnologyResponse> getAll() {
		
		List<ProgrammingTechnology> programmingTechnologies = programmingTechnologyRepository.findAll();
		List<GetAllProgrammingTechnologyResponse> programmingTechnologyResponses = new ArrayList<GetAllProgrammingTechnologyResponse>();
		
		for (ProgrammingTechnology programmingTechnology : programmingTechnologies) {
			GetAllProgrammingTechnologyResponse responseItem = new GetAllProgrammingTechnologyResponse();
			
			ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getReferenceById(programmingTechnology.getProgrammingLanguage().getId());
			
			responseItem.setId(programmingTechnology.getId());
			responseItem.setProgrammingLanguageName(programmingLanguage.getName());
			responseItem.setName(programmingTechnology.getName());
			
			programmingTechnologyResponses.add(responseItem);
			
		}
		
		return programmingTechnologyResponses;
	
	}

	@Override
	public void add(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) throws Exception {

		/*
	//	ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getReferenceById(createProgrammingTechnologyRequest.get);
	
		ProgrammingTechnology programmingTechnology = new ProgrammingTechnology();
		programmingTechnology.setName((createProgrammingTechnologyRequest.getName()));
		//programmingTechnology.setProgrammingLanguage(prog);
		
		List<ProgrammingTechnology> technologies = programmingTechnologyRepository.findAll();
		
		for (ProgrammingTechnology programmingTechnology2 : technologies) {
			if(programmingTechnology2.getName().equals(programmingTechnology.getName())) {
				throw new Exception("Teknoloji isimleri tekrar edemez.");
			}
		}
		if(programmingTechnology.getName().isEmpty()) {
			throw new Exception("Teknoloji alanı boş geçilemez");
		}
		
		//this.programmingTechnologyRepository.save(programmingLanguage);
		 * */
		 
	}

	@Override
	public void delete(DeleteProgrammingTechnologyRequest deleteProgrammingTechnologyRequest) {

		ProgrammingTechnology programmingTechnology = new ProgrammingTechnology();
		programmingTechnology.setId(deleteProgrammingTechnologyRequest.getId());
		
		programmingTechnologyRepository.delete(programmingTechnology);
		
	}

	@Override
	public void update(UpdateProgrammingTechnologyRequest updateProgrammingTechnologyRequest) throws Exception {

		/*
		ProgrammingTechnology programmingTechnology = new ProgrammingTechnology();
		programmingTechnology.setId(updateProgrammingTechnologyRequest.getId());
		programmingTechnology.setName(updateProgrammingTechnologyRequest.getName());

		List<ProgrammingTechnology> programmingTechnologies = programmingTechnologyRepository.findAll();

		for (ProgrammingTechnology pl : programmingTechnologies) {
			if (pl.getName().equals(programmingTechnology.getName())) {
				throw new Exception("İsimler tekrar edemez.");
			}
		}

		if (programmingTechnology.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}

		ProgrammingTechnology updatedProgrammingTechnology = programmingTechnologyRepository.getReferenceById(programmingTechnology.getId());
		updatedProgrammingTechnology.setName(programmingTechnology.getName());
	//	updatedProgrammingTechnology.setProgrammingLanguage(programmingLanguage);
		programmingTechnologyRepository.save(updatedProgrammingTechnology);
		
		*/
	}

	@Override
	public GetByIdProgrammingTechnologyResponse getById(int id) {

		ProgrammingTechnology programmingTechnology = programmingTechnologyRepository.getReferenceById(id);
		
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getReferenceById(programmingTechnology.getProgrammingLanguage().getId());
		
		GetByIdProgrammingTechnologyResponse technologyResponse = new GetByIdProgrammingTechnologyResponse();
		technologyResponse.setId(programmingLanguage.getId());
		technologyResponse.setName(programmingTechnology.getName());
		technologyResponse.setProgrammingLanguageName(programmingLanguage.getName());
		
		return technologyResponse;
	}

}

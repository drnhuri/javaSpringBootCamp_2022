package com.kodlamaio.kodlamaio.Devs.business.abstracts;


import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.DeleteProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.UpdateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingLanguageResponses.GetAllProgrammingLanguageResponse;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingLanguageResponses.GetByIdProgrammingLanguageResponse;

@Service
public interface ProgrammingLanguageService {

	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception;
	GetByIdProgrammingLanguageResponse getById(int id);
	
}

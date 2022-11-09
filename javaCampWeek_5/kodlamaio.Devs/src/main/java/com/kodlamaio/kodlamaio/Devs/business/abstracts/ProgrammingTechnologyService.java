package com.kodlamaio.kodlamaio.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.CreateProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.DeleteProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingTechnology.UpdateProgrammingTechnologyRequest;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingTechnologyResponses.GetAllProgrammingTechnologyResponse;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingTechnologyResponses.GetByIdProgrammingTechnologyResponse;

@Service
public interface ProgrammingTechnologyService {

	List<GetAllProgrammingTechnologyResponse> getAll();
	void add(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) throws Exception;
	void delete(DeleteProgrammingTechnologyRequest deleteProgrammingTechnologyRequest);
	void update(UpdateProgrammingTechnologyRequest updateProgrammingTechnologyRequest) throws Exception;
	GetByIdProgrammingTechnologyResponse getById(int id);
}

package com.kodlamaio.kodlamaio.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.kodlamaio.Devs.business.abstracts.ProgrammingLanguageService;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.CreateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.DeleteProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.requests.ProgrammingLanguage.UpdateProgrammingLanguageRequest;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingLanguageResponses.GetAllProgrammingLanguageResponse;
import com.kodlamaio.kodlamaio.Devs.business.responses.programmingLanguageResponses.GetByIdProgrammingLanguageResponse;
import com.kodlamaio.kodlamaio.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.kodlamaio.kodlamaio.Devs.entities.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {

		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> programmingLanguageResponses = new ArrayList<GetAllProgrammingLanguageResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());

			programmingLanguageResponses.add(responseItem);

		}

		return programmingLanguageResponses;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {

		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());

		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();

		for (ProgrammingLanguage pl : programmingLanguages) {
			if (pl.getName().equals(programmingLanguage.getName())) {
				throw new Exception("İsimler tekrar edemez.");
			}
		}

		if (programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}

		this.programmingLanguageRepository.save(programmingLanguage);

	}

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setId(deleteProgrammingLanguageRequest.getId());

		programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {

		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setId(updateProgrammingLanguageRequest.getId());
		programmingLanguage.setName(updateProgrammingLanguageRequest.getName());

		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();

		for (ProgrammingLanguage pl : programmingLanguages) {
			if (pl.getName().equals(programmingLanguage.getName())) {
				throw new Exception("İsimler tekrar edemez.");
			}
		}

		if (programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}

		ProgrammingLanguage updatedProgrammingLanguage = programmingLanguageRepository
				.getReferenceById(programmingLanguage.getId());
		updatedProgrammingLanguage.setName(programmingLanguage.getName());
		programmingLanguageRepository.save(updatedProgrammingLanguage);
	}

	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getReferenceById(id);

		GetByIdProgrammingLanguageResponse programmingLanguageResponse = new GetByIdProgrammingLanguageResponse();
		programmingLanguageResponse.setId(programmingLanguage.getId());
		programmingLanguageResponse.setName(programmingLanguage.getName());

		return programmingLanguageResponse;
	}

}

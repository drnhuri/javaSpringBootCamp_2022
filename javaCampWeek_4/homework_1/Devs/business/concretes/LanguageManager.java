package Kodlama.io.Devs.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Kodlama.io.Devs.kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.kodlama.io.Devs.entities.Language;

public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	
	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public String add(Language language) {
		if(this.checkName(language.getName()))
			return "Aynı isme sahip dil mevcuttur";
		
		if(language.getName().isBlank() || language.getName().isEmpty())
			return "Dil alanı boş geçilemez";
		
		this.languageRepository.add(language);
		return "Eklendi";
	}

	private boolean checkName(String name) {
		List<Language> languages = this.languageRepository.getAll();
		boolean result = false;
		
		for(Language language : languages){
			if(language.getName().equalsIgnoreCase(name)) {
				result = true;
			}
		}
		
		return result;
	}


	@Override
	public String update(Language language) {
		if(this.checkName(language.getName()))
			return "aynı isme sahip dil mevcuttur.";
		
		if(language.getName().isBlank() || language.getName().isEmpty())
			return "Güncellecek dil alanı boş geçilemez.";
		
		this.languageRepository.update(language, language.getName());
		return "Güncellendi";
		
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
	}

	

}

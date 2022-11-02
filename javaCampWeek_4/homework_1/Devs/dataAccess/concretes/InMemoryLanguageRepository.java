package Kodlama.io.Devs.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.kodlama.io.Devs.entities.Language;

public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languageList;
	
	public InMemoryLanguageRepository() {
		languageList = new ArrayList<>();
		languageList.add(new Language(1, "Java"));
		languageList.add(new Language(2, "C#"));
		languageList.add(new Language(3, "Python"));
		languageList.add(new Language(4, "C++"));
		languageList.add(new Language(5, "Kotlin"));
	}
	
	
	@Override
	public List<Language> getAll() {
		return languageList;
	}

	@Override
	public Language getById(int id) {
		for (Language language : languageList) {
			if(language.getId() == id)
				return language;
		}
		return null;
	}

	@Override
	public void add(Language language) {
		languageList.add(language);		
	}

	@Override
	public void update(Language language, String newName) {
		languageList.get(language.getId()).setName(newName);
	}

	@Override
	public void delete(Language language) {
		languageList.remove(language);
		
	}

}

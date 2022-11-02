package Kodlama.io.Devs.kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.Devs.entities.Language;

public interface LanguageService {
	List<Language> getAll();
	Language getById(int id);
	String add(Language language);
	String update(Language language);
	void delete(Language language);

}

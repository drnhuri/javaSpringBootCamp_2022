package Kodlama.io.Devs.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.Devs.entities.Language;

public interface LanguageRepository {
	List<Language> getAll();
	Language getById(int id);
	void add(Language language);
	void delete(Language language);
	void update(Language language, String newName);

}

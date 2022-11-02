package business.concretes;

import business.abstracts.CategoryService;
import core.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class CatogoryManager implements CategoryService {
    private CategoryDao categoryDao;
    private List<Logger>loggers;
    private List<Category> categories;

    public CatogoryManager(CategoryDao categoryDao, List<Logger>loggers, List<Category> categories){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    @Override
    public void add(Category category) throws Exception {
        for (Category categoryOrder : categories){
            if(categoryOrder.getName().equals(category.getName())){
                throw new Exception("Aynı isme sahip kategori mevcuttur.");
            }
        }
        categoryDao.add(category);
        categories.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getName());
        }

    }
}

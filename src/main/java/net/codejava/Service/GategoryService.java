package net.codejava.Service;

import net.codejava.Model.Article;

import net.codejava.Model.Categorie;
import net.codejava.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
@Service
public class GategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Categorie> listAllCategory() {
        return categoryRepository.findAll();
    }

    public Categorie getGategoryById(Integer id) {
        return categoryRepository.findById(id).get();
    }

    public Categorie saveGategory(Categorie categorie) {
        return categoryRepository.save(categorie);
    }

    public Categorie deleteGategory(Integer id) {
        Categorie categorie = categoryRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
        categoryRepository.deleteById(id);
        return categorie;
    }


    public Categorie updateCategory(Integer id, Categorie categorie) {
        if (!categoryRepository.existsById(id))
            throw new NoSuchElementException();
        categorie.setIdCategorie(id);
        return categoryRepository.save(categorie);
    }
}


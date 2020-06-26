package net.codejava.Service;

import net.codejava.Model.Article;
import net.codejava.Model.sousCategory;
import net.codejava.Repository.sousCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class sousCategoryService {
    @Autowired
    private sousCategorieRepository sousCategorieRepository;

    public List<sousCategory> getAllSousCategory() {
        return sousCategorieRepository.findAll();
    }

    public sousCategory getSousCategory(Integer id) {
        return sousCategorieRepository.findById(id).get();
    }

    public sousCategory savesousCategory(sousCategory sousCategory) {
        return sousCategorieRepository.save(sousCategory);
    }

    public sousCategory deletesousCategory(Integer id) {
        sousCategory sousCategory = sousCategorieRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
        sousCategorieRepository.deleteById(id);
        return sousCategory;
    }


    public sousCategory updatesousCategory(Integer id, sousCategory sousCategory) {
        if (!sousCategorieRepository.existsById(id))
            throw new NoSuchElementException();
        sousCategory.setIdsousCategory(id);
        return sousCategorieRepository.save(sousCategory);
    }
}

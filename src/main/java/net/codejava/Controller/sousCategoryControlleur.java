package net.codejava.Controller;

import net.codejava.Model.Commande;
import net.codejava.Model.sousCategory;
import net.codejava.Service.CommandeService;
import net.codejava.Service.sousCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/sousCategory")
@RestController
public class sousCategoryControlleur {
    @Autowired
    public sousCategoryService sousCategoryService;

    @GetMapping("/AllsousCategory")
    public List<sousCategory> listsousCategory() {
        return sousCategoryService.getAllSousCategory();
    }

    @GetMapping("/getsousCategoryByID/{ID}")
    public sousCategory getsousCategoryByID(@PathVariable("ID") Integer ID) {
        return sousCategoryService.getSousCategory(ID);
    }

    @PostMapping("/savesousCategory")
    public sousCategory addsousCategory(@RequestBody sousCategory sousCategory) {

        return sousCategoryService.savesousCategory(sousCategory);
    }
    @DeleteMapping("/deletesousCategoryByID/{id}")
    public sousCategory deletesousCategory(@PathVariable("id") Integer id) {
        return sousCategoryService.deletesousCategory(id);
    }

}

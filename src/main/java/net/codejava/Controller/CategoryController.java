package net.codejava.Controller;

import net.codejava.Model.Article;
import net.codejava.Model.Categorie;
import net.codejava.Service.ArticleService;
import net.codejava.Service.GategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RequestMapping("/Categories")
@RestController
public class CategoryController {
    @Autowired
    public GategoryService gategoryService ;

//	@GetMapping("/articles")
//	public List<Article> list() {
//		return articleService.listAll();
//	}

    @GetMapping("/AllCategories")
    public List<Categorie> list() {
        return gategoryService.listAllCategory();
    }

    @GetMapping("/getCaotegoryByID/{ID}")
    public Categorie getArticleByID(@PathVariable("ID") Integer ID) {
        return gategoryService.getGategoryById(ID);
    }

    @PostMapping("/saveCaotegory")
    public Categorie addArticle(@RequestBody Categorie categorie) {

        return gategoryService.saveGategory(categorie);
    }
    @DeleteMapping("/delete/{id}")
    public Categorie deleteArticle(@PathVariable("id") Integer id) {
        return gategoryService.deleteGategory(id);
    }


}

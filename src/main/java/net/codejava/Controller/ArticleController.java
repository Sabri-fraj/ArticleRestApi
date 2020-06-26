package net.codejava.Controller;

import java.util.List;

import net.codejava.Model.Article;
import net.codejava.Model.Client;
import net.codejava.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/Articles")
@RestController
public class ArticleController {
	
	@Autowired
	public ArticleService articleService ;
	
//	@GetMapping("/articles")
//	public List<Article> list() {
//		return articleService.listAll();
//	}

	@GetMapping("/Allarticles")
	public List<Article> list() {
		return articleService.listAll();
	}

	@GetMapping("/getarticleByID/{ID}")
	public Article getArticleByID(@PathVariable("ID") Integer ID) {
		return articleService.getArticleById(ID);
	}

	@PostMapping("/saveArticle")
	public Article addArticle(@RequestBody Article article) {

		return articleService.saveArticle(article);
	}
	@DeleteMapping("/deleteArticleByID/{id}")
	public Article deleteArticle(@PathVariable("id") Integer id) {
		return articleService.deleteArticle(id);
	}

	@GetMapping("/getArticleByGenre/{genre}")
	public  List<Article> getArticleBygenre(@PathVariable(value = "genre") String genre){

		return articleService.getArticleByGnere(genre);
	}

}

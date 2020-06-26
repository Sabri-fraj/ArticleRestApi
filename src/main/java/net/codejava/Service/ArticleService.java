package net.codejava.Service;
import java.util.List;
import java.util.NoSuchElementException;

import net.codejava.Model.Article;
import net.codejava.Model.Client;
import net.codejava.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class ArticleService {
 
    @Autowired
    private ArticleRepository articleRepository;
     
    public List<Article> listAll() {
        return articleRepository.findAll();
    }

    public Article getArticleById(Integer id) {
        return articleRepository.findById(id).get();
    }

    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article deleteArticle(Integer id) {
        Article article = articleRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
        articleRepository.deleteById(id);
        return article;
    }


    public Article updateArticle(Integer id, Article article) {
        if (!articleRepository.existsById(id))
            throw new NoSuchElementException();
        article.setIdArticle(id);
        return articleRepository.save(article);
    }

    public List<Article> getArticleByGnere(String genre){

        return articleRepository.findArticleBygenre(genre);
    }
}
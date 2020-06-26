package net.codejava.Repository;

import net.codejava.Model.Article;
import net.codejava.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository  extends JpaRepository<Article, Integer>{
//
//    @Query(value = "SELECT * FROM Users u WHERE u.status = :status and u.name = :name",
//            nativeQuery = true)
//    User findUserByStatusAndNameNamedParamsNative(
//            @Param("status") Integer status, @Param("name") String name);

    @Query(value = "SELECT * FROM article WHERE genre = ?1", nativeQuery = true)
    List<Article> findArticleBygenre(String names);

}

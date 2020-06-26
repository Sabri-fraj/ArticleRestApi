package net.codejava.Repository;

import net.codejava.Model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;

public interface CategoryRepository extends JpaRepository<Categorie,Integer> {
}

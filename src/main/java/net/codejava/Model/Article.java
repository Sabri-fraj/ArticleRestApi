package net.codejava.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Article {

	@Id
	@GeneratedValue
	private Integer idArticle;
	private String image;
	private String titre;
	private String reference;
	private float prix;
	private String genre;
	//private String categorie_id;
	@JsonManagedReference
	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
	private List<Categorie> CategoryList;

	@JsonBackReference
	@ManyToOne
	private Commande commande;

}

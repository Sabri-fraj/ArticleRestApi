package net.codejava.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
 	@Id
	@GeneratedValue
	private Integer idCategorie;
	private String nomCategorie ;

	@JsonBackReference
	@ManyToOne
	private Article article;
	@JsonManagedReference
	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
	private List<sousCategory> sousCategoryList;
}

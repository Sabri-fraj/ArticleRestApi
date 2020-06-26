package net.codejava.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Commande {
	@Id
	@GeneratedValue
	private Integer idCommande;
	private Date dateCommande;
	private Date dateLivraison;
	@JsonBackReference
	 @ManyToOne
	 private Client client;


	@JsonManagedReference
	@OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
	private List<Article> articleList;




}

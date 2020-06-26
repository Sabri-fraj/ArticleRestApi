package net.codejava.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class sousCategory {

	@Id
	@GeneratedValue
	private Integer idsousCategory;
	private String nom ;
	@JsonBackReference
	@ManyToOne
	private Categorie categorie;
}

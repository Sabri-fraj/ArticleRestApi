package net.codejava.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {
	@Id
	@GeneratedValue
	private Integer idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String phone ;
	private String email;

	@JsonManagedReference
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Commande> commandeList;







}

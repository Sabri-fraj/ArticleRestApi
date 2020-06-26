package net.codejava.Repository;

import net.codejava.Model.Client;
import net.codejava.Model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository  extends JpaRepository<Client, Integer>{
//   @Query("FROM Categorie AS CTG LEFT JOIN CTG.Articles AS cm WHERE AR.ID = :ID")    //This is using a named query method
//   public List<Commande> FindAllQuery(@Param("ID") Integer id);

//    @Query("select c from Client c join c.Commande CO where (CO.idCommande = :ID)")
//    List<Client> findByClient(@Param("ID")Integer ID);

}

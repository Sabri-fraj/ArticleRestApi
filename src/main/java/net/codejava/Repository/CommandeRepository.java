package net.codejava.Repository;

import net.codejava.Model.Client;
import net.codejava.Model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {

//    public final static String FIND_BY_ADDRESS_QUERY = "SELECT p " +
//            "FROM Person p LEFT JOIN p.addresses a " +
//            "WHERE a.address = :address";
//
//    @Query(FIND_BY_ADDRESS_QUERY)
//    public List<Commande> findByAddress(@Param("address") String address);
//public final static String FIND_BY_ADDRESS_QUERY = "SELECT p " +
//            "FROM commande c LEFT JOIN c.id a " +
//           "WHERE a.id = :id";
//    public List<Commande> findByAddress(@Param("id") Integer id);

//    @Query("select c from Client c join c.id a where (a.id = :id)")
//    List<Commande> findByCommande(@Param("cityName")Integer id);

//    @Query("select * Commande CO where ( CO.client_id_client = :ID)")
//    List<Commande> findCommandeByClient(@Param("ID")Integer ID);
}

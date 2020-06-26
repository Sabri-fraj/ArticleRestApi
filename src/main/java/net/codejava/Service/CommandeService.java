package net.codejava.Service;

import net.codejava.Model.Client;
import net.codejava.Model.Commande;
import net.codejava.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> listAll() {
        return commandeRepository.findAll();
    }

    public Commande getCommandeById(Integer id) {
        return commandeRepository.findById(id).get();
    }

    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }


    public Commande deleteCommande(Integer id) {
        Commande commande = commandeRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
        commandeRepository.deleteById(id);
        return commande;
    }


    public Commande updateCommande(Integer id, Commande commande) {
        if (!commandeRepository.existsById(id))
            throw new NoSuchElementException();
        commande.setIdCommande(id);
        return commandeRepository.save(commande);
    }


//    public List<Commande> findCommandeByIDClient(Integer id) {
//        return commandeRepository.findCommandeByClient(id);
//    }























//   public List<Commande> findByAddress( Integer id){
//     return    commandeRepository.findByAddress(id);
//   }
//    @Query("select c from Client c join c.id a where (a.id = :id)")
//    List<Commande> findByCommande(@Param("cityName")Integer id);
//    public List<Commande> findByCommande(Integer id){
//        return commandeRepository.findByCommande(id);
//    }
}

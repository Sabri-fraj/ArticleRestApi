package net.codejava.Controller;

import net.codejava.Model.Article;
import net.codejava.Model.Client;
import net.codejava.Model.Commande;
import net.codejava.Model.sousCategory;
import net.codejava.Service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/Commandes")
@RestController
public class CommandeController {

    @Autowired
    public CommandeService commandeService;

    @GetMapping("/AllCommandes")
    public List<Commande> list() {
        return commandeService.listAll();
    }

    @GetMapping("/AllCommande")
    public List<Commande> listCommandes() {
        return commandeService.listAll();
    }

    @GetMapping("/getCammandesByID/{ID}")
    public Commande getCommandeByID(@PathVariable("ID") Integer ID) {
        return commandeService.getCommandeById(ID);
    }

    @PostMapping("/saveCammande")
    public Commande addCommande(@RequestBody Commande commande) {

        return commandeService.saveCommande(commande);
    }
    @DeleteMapping("/deleteCammandeByID/{id}")
    public Commande deleteCommande(@PathVariable("id") Integer id) {
        return commandeService.deleteCommande(id);
    }


//    @GetMapping("/getClientByCammandes/{ID}")
//    public List<Commande> FindClientByCommande(@PathVariable("ID")Integer id){
//        return commandeService.findCommandeByIDClient(id);
//    }


//    public sousCategory getSousCategory(Integer id) {
//        return commandeService.getCommande(id);
//    }
//    @GetMapping("/GetCommandeClient/{id}")
//    public  List<Commande> findByAddress( Integer id){
//
//        return    commandeService.findByAddress(id);
//    }
//    @GetMapping("/GetCommandeClient")
//    public  List<Commande> findByAddress( Integer id){
//
//        return    commandeService.findByCommande(id);
//    }
}

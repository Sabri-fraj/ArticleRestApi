package net.codejava.Service;
import java.util.List;
import java.util.NoSuchElementException;

import net.codejava.Model.Client;
import net.codejava.Model.Commande;
import net.codejava.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
 
@Service
public class ClientService {
 
    @Autowired
    private ClientRepository clientRepository;


    public List<Client> listAll() {
        return clientRepository.findAll();
    }
     

     
    public Client getClientById(Integer id) {
        return clientRepository.findById(id).get();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public Client deleteClient(Integer id) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
        clientRepository.deleteById(id);
        return client;
    }


    public Client updateClient(Integer id, Client client) {
        if (!clientRepository.existsById(id))
            throw new NoSuchElementException();
        client.setIdClient(id);
        return clientRepository.save(client);
    }
//    public List<Commande> FindAllQuery( Integer id){
//
//        return  repo.FindAllQuery(id);
//
//    }
//    public List<Client> FindClientByCommande(Integer id){
//        return clientRepository.findByClient(id);
//    }
}
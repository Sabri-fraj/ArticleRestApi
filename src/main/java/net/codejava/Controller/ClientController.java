package net.codejava.Controller;

import java.util.List;

import lombok.AllArgsConstructor;
import net.codejava.Model.Article;
import net.codejava.Model.Client;
import net.codejava.Model.Commande;
import net.codejava.Service.ArticleService;
import net.codejava.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/Clients")
@RestController
@AllArgsConstructor
public class ClientController {
	
	@Autowired
	public ClientService clientService ;
	
	@GetMapping("/Allclients")
	public List<Client> list() {
		return clientService.listAll();
	}

	@GetMapping("/getClientsByID/{ID}")
	public Client getClientByID(@PathVariable("ID") Integer ID) {
		return clientService.getClientById(ID);
	}

	@PostMapping("/saveClient")
	public Client addClient(@RequestBody Client client) {

		return clientService.save(client);
	}
	@DeleteMapping("/delete/{id}")
	public Client deleteClient(@PathVariable("id") Integer id) {
		return clientService.deleteClient(id);
	}

	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public Client updateClient(@PathVariable("id") Integer id, @RequestBody Client client) {
		return clientService.updateClient(id, client);
	}



	//	@GetMapping("/{name}")
//	public int getAgeByName(@PathVariable("name") String name) {
//		return studentService.getAgeByName(name);
//	}


//	@GetMapping("/getClientByCammandes/{ID}")
//	public List<Client> FindClientByCommande(@PathVariable("ID")Integer id){
//		return clientService.FindClientByCommande(id);
//	}

}

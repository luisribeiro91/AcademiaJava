package domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import domain.models.Account;
import domain.models.CardType;
import domain.models.Client;
import persistence.Persistence;

public class ClientService {

	public Client register(Client c) {
		
		c.setIdentifier(UUID.randomUUID());//BR: client unique identifier
		
		createAccount(c);
		
		
		return Persistence.addCLient(c);
	}


	private void createAccount(Client c) {
		
		Account account = new Account();
		account.setIdentifier(UUID.randomUUID());

		createCard(CardType.DEBIT);
		
		if(c.getAccounts() == null || c.getAccounts().isEmpty()) {
			List<Account> accounts = new ArrayList<>();
			c.setAccounts(accounts);
		} 
		c.getAccounts().add(account);//BR: client must have at least one account
		
	}

	private void createCard(CardType debit) {
		
		
	}

	public List<Client> findAll(){
		return Persistence.findAllClients();
	}
	
}

package domain.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Client {

	private UUID identifier;
	
	private String name;
	
	private List<Account> accounts;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public UUID getIdentifier() {
		return identifier;
	}

	public void setIdentifier(UUID identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}

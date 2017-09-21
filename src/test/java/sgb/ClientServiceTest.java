package sgb;

import org.junit.Assert;
import org.junit.Test;

import domain.models.Client;
import domain.services.ClientService;

public class ClientServiceTest {
	
	private ClientService clientService;

	@Test
	public void registerClient_returnsValidIdentifier() {
		clientService = new ClientService();
//		Client c = new Client();
//		c.setName("cenas");
		Client c = Client.builder().name("cenas")
		Client savedClient = clientService.register(c);
		Assert.assertEquals("cenas", savedClient.getName());
		Assert.assertNotNull(savedClient.getIdentifier());
		
		Client c2 = new Client();
		c2.setName("cenas");
		Client savedClient2 = clientService.register(c2);
		Assert.assertNotNull(savedClient2.getIdentifier());
		Assert.assertNotEquals(savedClient.getIdentifier(), savedClient2.getIdentifier());
	}
	
	@Test
	public void registerClient_returnsWithValidAccount() {
		
		clientService = new ClientService();
		Client c = new Client();
		c.setName("cenas");
		Client savedClient = clientService.register(c);
		Assert.assertEquals("cenas", savedClient.getName());
		Assert.assertNotNull(savedClient.getIdentifier());
		Assert.assertFalse(savedClient.getAccounts().isEmpty());
		Assert.assertTrue(savedClient.getAccounts().size()>=1);
		Assert.assertNotNull(savedClient.getAccounts().get(0).getIdentifier());
	}
	
	
}

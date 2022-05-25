package smartcon.dashboard2;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import smartcon.dashboard2.model.Client;
import smartcon.dashboard2.service.ClienteService;

@SpringBootTest
class ClienteServiceTest {

	private ClienteService clienteService;

	@Autowired
	public ClienteServiceTest(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@Test
	void creationTest() {
		List<String> clients = new ArrayList<String>();
		clients.add("Apple Inc.");
		clients.add("Google");
		clients.add("Microsoft");
		clients.add("Tesla");
		clients.add("SpaceX");

		clients.forEach(client -> clienteService.save(new Client(null, client)));

	}
}

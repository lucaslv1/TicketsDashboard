package smartcon.dashboard2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smartcon.dashboard2.model.Client;
import smartcon.dashboard2.service.ClienteService;
import smartcon.dashboard2.service.CrudService;

@RestController
@RequestMapping("clients")
public class ClienteController extends CrudController<Client, Long>{

	@Autowired
	private ClienteService clienteService;
	
	@Override
	protected CrudService<Client, Long> getService() {
		return this.clienteService;
	}

}

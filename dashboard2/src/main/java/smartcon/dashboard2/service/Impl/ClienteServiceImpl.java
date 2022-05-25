package smartcon.dashboard2.service.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import smartcon.dashboard2.Repository.ClienteRepository;
import smartcon.dashboard2.model.Client;
import smartcon.dashboard2.service.ClienteService;

@Service
public class ClienteServiceImpl extends CrudServiceImpl<Client, Long>
	implements ClienteService {

	private ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	protected JpaRepository<Client, Long> getRepository() {
		return this.clienteRepository;
	}

	@Override
	public List<Client> findByOpeningDate(LocalDate begin, LocalDate end) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

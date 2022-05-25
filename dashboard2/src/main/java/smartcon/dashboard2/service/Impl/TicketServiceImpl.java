package smartcon.dashboard2.service.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import smartcon.dashboard2.Repository.TicketRepository;
import smartcon.dashboard2.model.Ticket;
import smartcon.dashboard2.service.TicketService;

@Service
public class TicketServiceImpl extends CrudServiceImpl<Ticket, Long>
	implements TicketService {
	
	private TicketRepository ticketRepository;

	public TicketServiceImpl(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}
	
	@Override
	protected JpaRepository<Ticket, Long> getRepository() {
		return this.ticketRepository;
	}

	@Override
	public List<Ticket> findByOpeningDate(LocalDate begin, LocalDate end) {
		return ticketRepository.findByOpeningDateBetween(begin, end);
	}
	
	public Ticket save(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}


}

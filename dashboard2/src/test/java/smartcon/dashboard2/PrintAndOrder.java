package smartcon.dashboard2;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import smartcon.dashboard2.model.Ticket;
import smartcon.dashboard2.service.TicketService;

@Slf4j
@SpringBootTest
class PrintAndOrder {
	
	private TicketService ticketService;
	
	@Autowired
	public PrintAndOrder(TicketService ticketService) {
		this.ticketService = ticketService;
	}
				

	@Test
	void CreationTest() {
		
		List<Ticket> tickets = ticketService.findAll();
		
		log.info("TICKETS: " + tickets);
		
	}
}	

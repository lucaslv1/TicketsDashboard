package smartcon.dashboard2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smartcon.dashboard2.model.Ticket;
import smartcon.dashboard2.service.CrudService;
import smartcon.dashboard2.service.TicketService;

@RestController
@RequestMapping("tickets")
public class TicketController extends CrudController<Ticket, Long> {
	
	@Autowired
	private TicketService ticketService;
	
	@Override
	protected CrudService<Ticket, Long> getService() {
		return this.ticketService;
	}

}

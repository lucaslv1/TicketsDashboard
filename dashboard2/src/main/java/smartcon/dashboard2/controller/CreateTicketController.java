package smartcon.dashboard2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smartcon.dashboard2.model.Ticket;
import smartcon.dashboard2.service.TicketService;
import smartcon.dashboard2.shared.GenericResponse;

@RestController
@RequestMapping("createticket")
public class CreateTicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@PostMapping
	GenericResponse CreateTicket(@RequestBody Ticket ticket) {
		ticketService.save(ticket);
        return new GenericResponse("Registro salvo.");
	}
}

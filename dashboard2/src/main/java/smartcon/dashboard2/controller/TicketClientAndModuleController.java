package smartcon.dashboard2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smartcon.dashboard2.model.TicketClientAndModule;
import smartcon.dashboard2.service.Impl.TicketsGroupByClientAndModuleByDateService;

@RestController
@RequestMapping("ticketclientsandmodules")
public class TicketClientAndModuleController {

	@Autowired
	TicketsGroupByClientAndModuleByDateService ticketsGroupByClientAndModuleByDateService;

	@GetMapping(value = "/{month}/{year}")
	public TicketClientAndModule TicketsGourpedByClientAndModule(@PathVariable(name = "month") String month,
			@PathVariable(name = "year") String year) {
		return ticketsGroupByClientAndModuleByDateService.ListOfTicket(month, year);
	}
}

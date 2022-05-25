package smartcon.dashboard2.controller;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smartcon.dashboard2.model.Client;
import smartcon.dashboard2.model.Ticket;
import smartcon.dashboard2.model.TicketByClient;
import smartcon.dashboard2.service.CrudService;
import smartcon.dashboard2.service.TicketService;

@RestController
@RequestMapping("ticketbyclients")
public class TicketByClientController extends CrudController<Ticket, Long>{

	@Autowired
	private TicketService ticketService;
	
	@GetMapping(value = "/{month}/{year}")
	public List<TicketByClient> listGourpedByClient(@PathVariable(name = "month") String month,
			@PathVariable(name = "year") String year) {
		
		List<Ticket> listOfTicket = listTicketByDate(month, year);
		
		Map<Client, List<Ticket>> mapOfTickets = new HashMap<>();
		
		listOfTicket.forEach(ticket -> {
			if(!mapOfTickets.containsKey(ticket.getClient())) {
				mapOfTickets.put(ticket.getClient(), new ArrayList<>());
			}
			mapOfTickets.get(ticket.getClient()).add(ticket);
		});
		
		List<TicketByClient> listToReturn = new ArrayList<>();
		
		mapOfTickets.keySet()
			.forEach(client -> listToReturn.add(new TicketByClient(client, mapOfTickets.get(client).size())));
		
		return listToReturn;
	}
	
	public List<Ticket> listTicketByDate(String month, String year) {
		LocalDate beginDate;
		LocalDate endDate;
		List<Ticket> listTicket = new ArrayList<>();
		
		beginDate =  LocalDate.parse(year.concat("-").concat(month).concat("-01"));
		endDate = beginDate.with(TemporalAdjusters.lastDayOfMonth());
		
		listTicket = ticketService.findByOpeningDate(beginDate, endDate);
		
		return listTicket;
	}

	@Override
	protected CrudService<Ticket, Long> getService() {
		return this.ticketService;
	}

}

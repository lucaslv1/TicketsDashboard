package smartcon.dashboard2.service.Impl;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smartcon.dashboard2.model.Client;
import smartcon.dashboard2.model.Module;
import smartcon.dashboard2.model.Ticket;
import smartcon.dashboard2.model.TicketByClient;
import smartcon.dashboard2.model.TicketByModule;
import smartcon.dashboard2.model.TicketClientAndModule;
import smartcon.dashboard2.service.TicketService;

@Service
public class TicketsGroupByClientAndModuleByDateService {
	
	@Autowired
	private TicketService ticketService;
	
	public TicketClientAndModule ListOfTicket (String month, String year) {
	
	List<Ticket> listOfTickets = listTicketByDate (month, year);
	
	List<TicketByModule> groupedByModule = groupByModule(listOfTickets);
	List<TicketByClient> groupedByClient = groupByClient(listOfTickets);
	
	return new TicketClientAndModule(groupedByClient, groupedByModule, listOfTickets);

	}
	
	private List<TicketByModule> groupByModule(List<Ticket> ticketsToGroup) {
		// colocamos em uma estrutura de map para agrupar os registros
		Map<Module, List<Ticket>> mapOfTickets = new HashMap<>();
	
		// percorre todos os tickets
		ticketsToGroup.forEach(ticket -> {
			// caso o map ainda não tem o modulo ele adiciona no map com uma lista vazia
			if (!mapOfTickets.containsKey(ticket.getModule())) {
				mapOfTickets.put(ticket.getModule(), new ArrayList<>());
			}
			// com o if acima garantimos que o map vai ter o modulo, assim podemos recuperar
			// o registro do map pelo modulo e apenas adicionar o ticket;
			mapOfTickets.get(ticket.getModule()).add(ticket);
		});
	
		// cria a instancia do objeto que vamos retornoar
		List<TicketByModule> listToReturn = new ArrayList<>();
	
		// como o map é uma estrutura de chave x valor, percorremos todas as chaves do
		// map (que neste caso são so modulos) e adicionamos na nossa estrutura de
		// retorno
		mapOfTickets.keySet()
				.forEach(module -> listToReturn.add(new TicketByModule(module, mapOfTickets.get(module).size())));
	
		return listToReturn;
	}
	
	private List<TicketByClient> groupByClient(List<Ticket> ticketsToGroup) {
		
		Map<Client, List<Ticket>> mapOfTickets = new HashMap<>();
		
		ticketsToGroup.forEach(ticket -> {
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
}

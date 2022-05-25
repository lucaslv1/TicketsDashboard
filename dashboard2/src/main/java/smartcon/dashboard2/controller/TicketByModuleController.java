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

import lombok.extern.slf4j.Slf4j;
import smartcon.dashboard2.model.Module;
import smartcon.dashboard2.model.Ticket;
import smartcon.dashboard2.model.TicketByModule;
import smartcon.dashboard2.service.TicketService;

@Slf4j
@RestController
@RequestMapping("ticketbymodules")
public class TicketByModuleController {

	@Autowired
	private TicketService ticketService;

	@GetMapping(value = "/{month}/{year}")
	public List<TicketByModule> listGourpedByModule(@PathVariable(name = "month") String month,
			@PathVariable(name = "year") String year) {
		log.info("MONTH: ".concat(month));
		log.info("YEAR: ".concat(year));
		// Implementar um metodo que retorne os ticket por mes e ano (data de criação)
		List<Ticket> listOfTicket = listTicketByDate(month, year);
		
		// colocamos em uma estrutura de map para agrupar os registros
		Map<Module, List<Ticket>> mapOfTickets = new HashMap<>();

		// percorre todos os tickets
		listOfTicket.forEach(ticket -> {
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

		//como o map é uma estrutura de chave x valor, percorremos todas as chaves do map (que neste caso são so modulos) e adicionamos na nossa estrutura de retorno
		mapOfTickets.keySet()
				.forEach(module -> listToReturn.add(new TicketByModule(module, mapOfTickets.get(module).size())));

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

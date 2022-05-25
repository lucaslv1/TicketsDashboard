package smartcon.dashboard2.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketClientAndModule {

	private List<TicketByClient> byClient;

	private List<TicketByModule> byModule;
	
	private List<Ticket> byTicket;

}

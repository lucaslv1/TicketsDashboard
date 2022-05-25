package smartcon.dashboard2.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketByClient implements Serializable{
	
	private static final long serialVersionUID = -1038471660755387237L;

	private Client client;
	
	private Integer quantidade;
	
}

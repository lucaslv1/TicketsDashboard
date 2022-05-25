package smartcon.dashboard2.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketByModule implements Serializable {

	private static final long serialVersionUID = -6217254903958601838L;

	private Module module;

	private Integer quantidade;
}

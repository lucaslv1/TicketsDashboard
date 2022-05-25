package smartcon.dashboard2.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import smartcon.dashboard2.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{
	
	List<Ticket> findByOpeningDateBetween (LocalDate begin, LocalDate end);
}

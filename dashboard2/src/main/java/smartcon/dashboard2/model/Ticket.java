package smartcon.dashboard2.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Column(length = 100, nullable = false)
	private String title;
	
	
	@JoinColumn(name = "FK_ID_CLIENT", referencedColumnName = "id")
	@Column(name = "FK_ID_CLIENT")
	private Client client;
	
	@JoinColumn(name = "FK_ID_MODULE", referencedColumnName = "id")
	@Column(name = "FK_ID_MODULE")
	private Module module;
	
	@NotNull
	private LocalDate openingDate;
	
	@NotNull
	private LocalDate closingDate;
	
}

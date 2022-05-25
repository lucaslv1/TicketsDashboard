package smartcon.dashboard2.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Module implements Serializable{

	private static final long serialVersionUID = -1651121562737324379L;

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Column(length = 35, nullable = false)
	private String name;
	
}

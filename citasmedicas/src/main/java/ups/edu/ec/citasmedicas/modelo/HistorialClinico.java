package ups.edu.ec.citasmedicas.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_HistorialClinico")
public class HistorialClinico {
	@Id
	private int id;
	@OneToOne
	@JoinColumn(name = "id")
	private ConsultaMedica consultasmedicas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ConsultaMedica getConsultasmedicas() {
		return consultasmedicas;
	}
	public void setConsultasmedicas(ConsultaMedica consultasmedicas) {
		this.consultasmedicas = consultasmedicas;
	}
	
	
	
}

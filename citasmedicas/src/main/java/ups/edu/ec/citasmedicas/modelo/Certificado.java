package ups.edu.ec.citasmedicas.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "TBL_Certificado")
public class Certificado {
	@Id
	private int id;
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id")
	private List<ConsultaMedica> consultasmedicas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ConsultaMedica> getConsultasmedicas() {
		return consultasmedicas;
	}
	public void setConsultasmedicas(List<ConsultaMedica> consultasmedicas) {
		this.consultasmedicas = consultasmedicas;
	}
}

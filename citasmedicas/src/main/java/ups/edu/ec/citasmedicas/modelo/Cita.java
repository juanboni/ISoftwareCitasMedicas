package ups.edu.ec.citasmedicas.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Cita")
public class Cita {
	@Id
	private int id;
	@OneToOne
	@JoinColumn(name = "id")
	private Paciente paciente;
	@OneToOne
	@JoinColumn(name = "id")
	private Medico medico;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	
}

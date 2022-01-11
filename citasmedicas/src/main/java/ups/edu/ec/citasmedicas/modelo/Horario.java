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
@Table(name = "TBL_Horario")
public class Horario {
	@Id
	private int id;
	/*@OneToOne
	@JoinColumn(name = "id")
	private Cita citas;*/
	private String dia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	/*public Cita getCitas() {
		return citas;
	}
	public void setCitas(Cita citas) {
		this.citas = citas;
	}*/
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	
}

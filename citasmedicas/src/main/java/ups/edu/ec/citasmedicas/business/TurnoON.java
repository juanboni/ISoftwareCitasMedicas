package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;



@Stateless
public class TurnoON {
	/*
	
	@Inject
	private TurnoDAO daoTurno;
	public void insertTurno(Turno turno) throws Exception {
		
			
		daoTurno.insert(turno);	
	}

	public void updateTurno(Turno turno) throws Exception {
		
		daoTurno.update(turno);
	}
	
	public void deleteTurno(Turno turno) throws Exception {
		
		String num= String.valueOf(turno.getCodigo());
		 
		daoTurno.delete(num);
	}
	
	public List<Turno> getClientes() {
		
		//if(!this.validaCedula(persona.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Persona per= daoPersona.read("0102930888");
		
		return daoTurno.getTurnos("%");
	}
	*/
}

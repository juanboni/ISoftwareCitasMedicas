package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.ConsultaMedicaDAO;
import ups.edu.ec.citasmedicas.modelo.ConsultaMedica;



@Stateless
public class ConsultaMedicaON {
	@Inject
	private ConsultaMedicaDAO daoConsulta;
	
	public void insertConsulta(ConsultaMedica consulta) throws Exception {
		
		
		daoConsulta.insert(consulta);	
	}

	public void updateConsulta(ConsultaMedica consulta) throws Exception {
		
		daoConsulta.update(consulta);
	}
	
	/*public void deleteConsulta(ConsultaMedica consulta) throws Exception {
		
		String cedula= consulta.getEstado();
		 
		daoConsulta.delete(cedula);
	}*/
	
	public List<ConsultaMedica> getConsultas() {
		
		//if(!this.validaCedula(persona.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Persona per= daoPersona.read("0102930888");
		
		return daoConsulta.getConsultas("%");
	}
}

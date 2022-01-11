package ups.edu.ec.citasmedicas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.Paciente;

public class PacienteDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Paciente paciente) {
		em.persist(paciente);
	}
	
	public void update(Paciente paciente) {
		em.merge(paciente);
	}
	
	public Paciente read(String cedula) {
		Paciente p = em.find(Paciente.class, cedula);
		return p;
	}
	
	public void delete(String cedula) {
		Paciente p = em.find(Paciente.class, cedula);
		em.remove(p);
	}
	
	public List<Paciente> getPacientes(String nombre){
		
		String jpql2="SELECT p FROM Paciente p WHERE nombre LIKE ?1";
		
		nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Paciente.class);
		query.setParameter(1, nombre);
		
		List<Paciente> personas=query.getResultList();
		return personas;
		
	}
}

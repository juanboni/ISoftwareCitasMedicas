package ups.edu.ec.citasmedicas.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.ConsultaMedica;




@Stateless
public class ConsultaMedicaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(ConsultaMedica consulta) {
		em.persist(consulta);
	}
	
	public void update(ConsultaMedica consulta) {
		em.merge(consulta);
	}
	
	public ConsultaMedica read(String cedula) {
		ConsultaMedica c = em.find(ConsultaMedica.class, cedula);
		return c;
	}
	
	public void delete(String cedula) {
		ConsultaMedica c = em.find(ConsultaMedica.class, cedula);
		em.remove(c);
	}
	
	public List<ConsultaMedica> getConsultas(String nombre){
		
		String jpql2="SELECT p FROM ConsultaMedica p WHERE nombre LIKE ?1";
		
		nombre= nombre+"%";
		Query query= em.createQuery(jpql2, ConsultaMedica.class);
		query.setParameter(1, nombre);
		
		List<ConsultaMedica> consultas=query.getResultList();
		return consultas;
		
	}
	
}

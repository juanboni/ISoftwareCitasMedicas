package ups.edu.ec.citasmedicas.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/*
@Stateless
public class TurnoDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Turno turno) {
		em.persist(turno);
	}
	
	public void update(Turno turno) {
		em.merge(turno);
	}
	
	public Turno read(String cedula) {
		Turno t = em.find(Turno.class, cedula);
		return t;
	}
	
	public void delete(String cedula) {
		Turno p = em.find(Turno.class, cedula);
		em.remove(p);
	}
	
	public List<Turno> getTurnos(String nombre){
		
		String jpql2="SELECT p FROM Turno p WHERE nombre LIKE ?1";
		
		nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Turno.class);
		query.setParameter(1, nombre);
		
		List<Turno> turnos=query.getResultList();
		return turnos;
		
	}
}*/

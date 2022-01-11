package ups.edu.ec.citasmedicas.views;

import java.io.IOException;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.citasmedicas.business.CalendarioONLocal;
import ups.edu.ec.citasmedicas.business.CitasONLocal;
import ups.edu.ec.citasmedicas.business.ConsultaMedicaONLocal;
import ups.edu.ec.citasmedicas.business.FacturacionONLocal;
import ups.edu.ec.citasmedicas.business.MedicoON;
import ups.edu.ec.citasmedicas.business.MedicoONLocal;
import ups.edu.ec.citasmedicas.modelo.Cita;
import ups.edu.ec.citasmedicas.modelo.ConsultaMedica;
import ups.edu.ec.citasmedicas.modelo.Factura;
import ups.edu.ec.citasmedicas.modelo.Horario;
import ups.edu.ec.citasmedicas.modelo.Medico;
import ups.edu.ec.citasmedicas.modelo.Paciente;




/**
 * Servlet implementation class ventanaprincipal
 */
@WebServlet("/ventanaprincipal")
public class ventanaprincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Inject
    private MedicoONLocal medicoon;
	@Inject
	private CitasONLocal  citaonlocal;
	@Inject
	private CalendarioONLocal calendariolocal;
	@Inject
	private FacturacionONLocal facturalocal;
	@Inject
	private ConsultaMedicaONLocal consultamedica;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ventanaprincipal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//---Medico
		System.out.println("insertAR MEDICO");
		Medico m=new Medico();
		m.setId(1);
		m.setCedula("0302882726");
		m.setNombres("Evelin Castro");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("evelin@gmail.com");
		m.setEspecialidad("general");
		
		try {
			medicoon.insertMedico(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//System.out.println("insertado"+medicoon.getMedicos());
		
		
		 //----- insertando citamedica
		Cita ct= new Cita();
		ct.setId(1);
		
		Paciente pc=new Paciente();
		pc.setId(1);
		//ct.setPaciente(pc);
		Medico md=new Medico();
		md.setId(1);
		ct.setMedico(md);
		ct.setEstado("pendiente");
		ct.setFecha("11/2/2022");
		ct.setHora("9:00");
		
		try {
			citaonlocal.insertCita(ct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//--- insertando calendario atencion de cada medico
		Horario h=new Horario();
		h.setId(1);
		Medico md1=new Medico();
		md1.setId(1);
		//Medico md2=new Medico();
		//md2.setId(2);
		ArrayList<Medico> medicos=new ArrayList<Medico>();
		medicos.add(md1);
		//medicos.add(md2);
		h.setMedicos(medicos);
		h.setDia("lunes");
		h.setHorainicio("8:00 am");
		h.setHorafinal("6:00 pm");
		try {
			calendariolocal.insertCalendario(h);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ------insertando factura
		Factura fc=new Factura();
		fc.setId(1);
		fc.setFecha("11/1/2022");
		fc.setTotal(40.0);
		Cita cta=new Cita();
		cta.setId(1);
		fc.setCita(cta);
		try {
			facturalocal.insertFactura(fc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//insertando Consulta medica
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("se encuentra con gripe");
		Cita ci=new Cita();
		ci.setId(1);
		cm.setCita(ci);
		try {
			consultamedica.insertConsulta(cm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

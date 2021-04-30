package modeloDeNegocio;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private String nombre;
	private Oficio oficio;
	private List <Trabajo> trabajoAsignado;
 
	public Trabajador(String nombre,Oficio oficio) 
	{
		this.nombre=nombre;
		this.oficio=oficio;
		this.trabajoAsignado= new ArrayList<Trabajo>();
	}
	public Trabajador(String nombre,Oficio oficio,List<Trabajo> trabajos) 
	{
		this.nombre=nombre;
		this.oficio=oficio;
		this.trabajoAsignado=trabajos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Oficio getOficio() {
		return oficio;
	}
	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}
	public List<Trabajo> getTrabajoAsignado() {
		return trabajoAsignado;
	}
	public void setTrabajoAsignado(List<Trabajo> trabajoAsignado) {
		this.trabajoAsignado = trabajoAsignado;
	}
	
   public void agregarTarea(Trabajo tarea) 
   {
	   try {
		   try {
			   if(tarea.getServicio().oficio.getNombreOficio().equals(this.oficio))
				   this.trabajoAsignado.add(tarea);
		       else
			       throw new Exception();
			   
		        }
		  catch( Exception OficioNoCoincideException){
			                System.out.println(" El oficio no coincide con la tarea asignada.");
		        }
		  
		        if(!this.trabajoAsignado.isEmpty()) 
			        throw new Exception();
		  
	       }
	   
	    catch(Exception AgendaOcupadaException){
			       System.out.println(" El trabajor no puede tomar la tarea por tener la agenda ocupada.");
		   }   
		   
		      
   }
   
   
}

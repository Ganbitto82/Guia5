package modeloDeNegocio;

import modeloExtendido.Contratable;
import java.time.LocalDate;

public class Trabajo implements Contratable{
	
	
	private Trabajador trabajador;
	private Servicio servicio;
	private boolean urgente;
	private LocalDate fechaFin;
	
	public Trabajo(Trabajador trabajador,Servicio servicio, boolean urgente) 
	{
		this.trabajador=trabajador;
		this.servicio=servicio;
		this.urgente=urgente;
		this.fechaFin=null;
		
	}	

	public Trabajo(Trabajador trabajador,Servicio servicio, boolean urgente,LocalDate fechaFin) 
	{
		this.trabajador=trabajador;
		this.servicio=servicio;
		this.urgente=urgente;
		this.fechaFin=fechaFin;
	}
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public boolean isUrgente() {
		return urgente;
	}
	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}
	
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	@Override
	public double precio() {
		
		    if(this.urgente)
			return this.servicio.costo() + this.servicio.costo()*0.5;
		
			else return this.servicio.costo() ;
	}
	@Override
	public boolean finalizado() {
		if(!this.fechaFin.equals(null))
		return true;
		else return false;
	}

	@Override
	public String contratoDe() {
		String t="trabajo";
		return t;
	}



	
		
		
	}
	



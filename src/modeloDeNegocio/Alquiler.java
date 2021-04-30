package modeloDeNegocio;

import static java.time.temporal.ChronoUnit.DAYS;
import java.time.LocalDate;

import modeloExtendido.Contratable;

public class Alquiler implements Contratable {
 
	
	private Herramienta herramienta;
	private LocalDate fechaInicio;
	private LocalDate fechaEntrega;
	private LocalDate devolucionEfectiva;
	

	public Alquiler(Herramienta herramienta, LocalDate inicio,LocalDate entrega,LocalDate devolucion) 
	{
		this.herramienta=herramienta;
		this.fechaInicio=inicio;
		this.fechaEntrega=entrega;
		this.devolucionEfectiva=devolucion;
		
	}
	
	public Herramienta getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public LocalDate getDevolucionEfectiva() {
		return devolucionEfectiva;
	}

	public void setDevolucionEfectiva(LocalDate devolucionEfectiva) {
		this.devolucionEfectiva = devolucionEfectiva;
	}

	

	@Override
	public double precio() {
	    long dias = DAYS.between( fechaEntrega,devolucionEfectiva);
		return this.herramienta.getCostoPorDia()*dias;
	}
	@Override
	public boolean finalizado() {
		if(!this.devolucionEfectiva.equals(null))
		return true;
		else return false;
	}
	public boolean enMora()
	{if (this.fechaEntrega.compareTo(devolucionEfectiva)<0)
		return true;
	else return false;
		
	}

	@Override
	public String contratoDe() {
		String a="alquiler";
		return a;
	}




	

}

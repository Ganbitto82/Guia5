package modeloDeNegocio;

public class Estandar extends Servicio {
	private double montoFijo;
	private double plus;

	public Estandar(double fijo,double plus) 
	{
	  this.montoFijo=fijo;
	  this.plus=plus;
	}
	

	public double getMontoFijo() {
		return montoFijo;
	}


	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}


	public double getPlus() {
		return plus;
	}


	public void setPlus(double plus) {
		this.plus = plus;
	}


	@Override
	public double costo() {
		
		return this.montoFijo +  this.plus;
	}

}

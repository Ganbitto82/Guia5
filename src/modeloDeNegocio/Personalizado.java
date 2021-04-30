package modeloDeNegocio;

public  class Personalizado extends Servicio {

	private double valorPresupuestado;
	private double costoMateriales;
	private double costoTransporte;
	
	public Personalizado(double  valorPresupuestado,double costoMateriales,double costoTransporte) {
		this.valorPresupuestado=valorPresupuestado;
		this.costoMateriales=costoMateriales;
		this.costoTransporte=costoTransporte;
	}
	

	public double getValorPresupuestado() {
		return valorPresupuestado;
	}


	public void setValorPresupuestado(double valorPresupuestado) {
		this.valorPresupuestado = valorPresupuestado;
	}


	public double getCostoMateriales() {
		return costoMateriales;
	}


	public void setCostoMateriales(double costoMateriales) {
		this.costoMateriales = costoMateriales;
	}


	public double getCostoTransporte() {
		return costoTransporte;
	}


	public void setCostoTransporte(double costoTransporte) {
		this.costoTransporte = costoTransporte;
	}


	@Override
	public double costo() {
		
      return this.valorPresupuestado +this.costoMateriales+this.costoTransporte;
	}

}

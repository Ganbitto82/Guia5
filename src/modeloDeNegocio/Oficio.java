package modeloDeNegocio;

public class Oficio {
     
	private String nombreOficio;
	
		public Oficio(String nombre)
	{
		this.nombreOficio=nombre;
	}

		public String getNombreOficio() {
			return nombreOficio;
		}

		public void setNombreOficio(String nombreOficio) {
			this.nombreOficio = nombreOficio;
		}

}

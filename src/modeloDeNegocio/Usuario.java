package modeloDeNegocio;

import java.util.ArrayList;
import java.util.List;

import modeloExtendido.Contratable;

public class Usuario {
	private String correo;
	private List<Contratable> Itemcontratados;

	public Usuario(String correo) 
	{
		this.correo=correo;
		this.Itemcontratados=new ArrayList<>();
	} 
	
	public Usuario(String correo, List<Contratable> items) 
	{
		this.correo=correo;
		this.Itemcontratados=items;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<Contratable> getItemcontratados() {
		return Itemcontratados;
	}
	public void setItemcontratados(List<Contratable> itemcontratados) {
		Itemcontratados = itemcontratados;
	}
	
    public void contratar(Contratable contratable) {
    	
  
    	int contador=0;
    	
    	try {
    	    	if(Itemcontratados.isEmpty()) 
    		    		Itemcontratados.add(contratable);
    		   	else {
    		    		
    		    		for (Contratable c :Itemcontratados) {
    		    		  if(c.contratoDe().equals("alquiler") && !c.finalizado())
    		    			  contador+=1;
    		   			}
    		    		
    		    		if(contador >2 )
    				   
    				       throw new Exception();
    				   
    			        }
    	}
         catch( Exception AlquilerNoEntregadoException){
    				                System.out.println(" El oficio no coincide con la tarea asignada.");
    			                                        }
  }
    		
 }
    		
    		
    	
    	
    


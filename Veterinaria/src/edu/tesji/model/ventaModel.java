package edu.tesji.model;

public class ventaModel {

	public String prod;
	public double gato=12;
	public double perro=19;
	public double collar=23;
	public double medalla=120;
	public double juguete=500;
	public double res1;
	

	public String calcularCantidad(double cantidad) {
		switch(prod) {
		case "Comida de Gato":
		res1= gato*cantidad;
		 return  "\nTOTAL A PAGAR : " + res1 + 
				 " \nCANTIDAD A COMPRAR : " + cantidad +
				 " \nPRODUCTO O ACCESORIO COMPTRADO : " + prod;
		
			
			
		case "Comida de Perro":
			res1= perro*cantidad;
			return  "\nTOTAL A PAGAR : " + res1 + 
					 " \nCANTIDAD A COMPRAR : " + cantidad +
					 " \nPRODUCTO O ACCESORIO COMPTRADO : " + prod;
			
			
		case "Juguetes":
			res1= juguete*cantidad;
			return  "\nTOTAL A PAGAR : " + res1 + 
					 " \nCANTIDAD A COMPRAR : " + cantidad +
					 " \nPRODUCTO O ACCESORIO COMPTRADO : " + prod;
	
	        
	    case "Collar":
	    	double	res1= collar*cantidad;
	    	return  "\nTOTAL A PAGAR : " + res1 + 
					 " \nCANTIDAD A COMPRAR : " + cantidad +
					 " \nPRODUCTO O ACCESORIO COMPTRADO : " + prod;
	
	        
	    case "Medalla":
	    	res1= medalla*cantidad;
	    	return  "\nTOTAL A PAGAR : " + res1 + 
					 " \nCANTIDAD A COMPRAR : " + cantidad +
					 " \nPRODUCTO O ACCESORIO COMPTRADO : " + prod;
         
		}
	
		
		return "invalido";
	}

}

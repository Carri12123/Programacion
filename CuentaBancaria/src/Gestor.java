
public class Gestor {
	    String nombre;
	    private final String telefono;
	    int importeM;
	    
	    
	    public Gestor(String nombre, String telefono){
	        this.nombre = nombre;
	        this.telefono = telefono;
	        this.importeM = 10000;
	    }
	    
	    public Gestor(String nombre, String telefono, int importeM){
	        this.nombre = nombre;
	        this.telefono = telefono;
	        this.importeM = importeM;
	        
	    }
	    
	    public String getTelefono(){
	        return telefono;
	    }
	    
}


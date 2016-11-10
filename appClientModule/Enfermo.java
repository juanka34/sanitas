
public class Enfermo extends Persona{
private String area;

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public Enfermo(String nombre, int edad, String area) {
	super(nombre, edad);
	this.area = area;
}
	
	
}

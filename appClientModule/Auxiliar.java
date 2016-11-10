
public class Auxiliar extends Persona{

	
	private String horario;
	
	
	 public void mostrar(){
	       System.out.println(this.horario);}

	public String getHorario() {
		return horario;
	}

	public Auxiliar(String nombre, int edad, String horario) {
		super(nombre, edad);
		this.horario = horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}

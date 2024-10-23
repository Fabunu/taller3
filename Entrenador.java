import java.util.Date;
import java.util.List;

public class Entrenador {
	private String nombre;
	private int experiencia;
	private String deporteEspecializado;
	private Equipo equipo;

	public Entrenador(String nombre, int experiencia, String deporteEspecializado) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.deporteEspecializado = deporteEspecializado;
    }

	public String getNombre() {
        return nombre;
    }

    public void asignarEquipo(Equipo equipo) {
        if (this.equipo != null) {
            System.out.println("El entrenador ya está asignado a un equipo");
        } else {
            this.equipo = equipo;
            equipo.setEntrenador(this);
        }
	}
}
import java.util.Date;
import java.util.List;
import java.ArrayList;

public class Partidos {
	private Equipo equipo1;
	private Equipo equipo2;
	private String resultado;
	private Date fecha;
	private Cancha cancha;
	

	public Partido(Equipo equipo1, Equipo equipo2, Date fecha, Cancha cancha) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.fecha = fecha;
		this.cancha = cancha;

		if (cancha.consultarDisponibilidad(fecha)) {
			cancha.reservarCancha(fecha);
		} else {
			System.out.println("No se puede agendar el partido, la cancha ya está reservada.");
		}
	}
	
	public void registrarResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public String getResultado() {
		return resultado;
	}
	}






















	




// Clase principal para prueba
public class Main {
public static void main(String[] args) {
	Club club = new Club();

	// Crear deportistas
	Deportista deportista1 = new Deportista("Carlos", "Ramírez", 123456, "Futbol");
	Deportista deportista2 = new Deportista("Juan", "Pérez", 654321, "Futbol");

	// Crear entrenador
	Entrenador entrenador1 = new Entrenador("Luis", 10, "Futbol");

	// Crear equipo y asignar entrenador y deportistas
	Equipo equipo1 = new Equipo("Equipo A");
	equipo1.agregarDeportista(deportista1);
	equipo1.agregarDeportista(deportista2);
	equipo1.setEntrenador(entrenador1);

	// Registrar el equipo en el club
	club.registrarEquipo(equipo1);

	// Crear cancha
	Cancha cancha1 = new Cancha("Césped", "Ubicación 1", 5000);

	// Crear partido
	Date fechaPartido = new Date(); // Fecha actual para ejemplo
	Partido partido1 = new Partido(equipo1, equipo1, fechaPartido, cancha1); // Jugadores del mismo equipo para ejemplo

	// Registrar el partido en el club
	club.gestionarPartido(partido1);

	// Listar equipos en el club
	club.listarEquipos();
}
}
Explicación del Código:
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombreEquipo;
    private List<Deportista> deportistas;
    private Entrenador entrenador;

	public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.deportistas = new ArrayList<>();
    }

    public void agregarDeportista(Deportista deportista) {
        deportistas.add(deportista);
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
}


    
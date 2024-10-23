package com.example;

import java.util.ArrayList;
import java.util.List;

public class Club {
	private List<Deportista> deportistas;
	private List<Entrenador> entrenadores;
	private List<Equipo> equipos;
	private List<Partidos> partidos;

	public Club() {
		this.deportistas = new ArrayList<>();
		this.entrenadores = new ArrayList<>();
		this.equipos = new ArrayList<>();
		this.partidos = new ArrayList<>();
	}

	public List<Deportista> getDeportistas() {
        return deportistas;
    }

    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void registrarEntrenador(Entrenador entrenador) {
        entrenadores.add(entrenador);
    }

	public void registrarDeportista(Deportista deportista) {
		deportistas.add(deportista);
	}

	public void registrarEquipos(Equipo equipo) {
		equipos.add(equipo);
	}

	public void GestionPartido(Partidos partido) {
		partidos.add(partido);
	}

	public void listarEquipos() {
		for (Equipo equipo : equipos) {
			System.out.println("Equipo: " + equipo.getNombreEquipo());
		}
	}
}


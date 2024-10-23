package com.example;

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

    public Equipo getEquipo() {
        return equipo;
    }
    
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
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
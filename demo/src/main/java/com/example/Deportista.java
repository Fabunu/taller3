package com.example;

public class Deportista {
	private String nombre;
	private String apellido;
	private int contacto;
	private String deporte;
	private Equipo equipo;

	public Deportista(String nombre, String apellido, int contacto, String deporte) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
        this.deporte = deporte;
    }
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

	public String getNombre() {
        return nombre;
    }

    public String getDeporte() {
        return deporte;
    }

	public void asignarEquipo(Equipo equipo) {
        if (this.equipo != null) {
            System.out.println("El deportista ya esta en un equipo");
        } else {
            this.equipo = equipo;
            equipo.agregarDeportista(this);
        }
    }

}

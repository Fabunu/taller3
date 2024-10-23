package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cancha {
	private String tipoSuperficie;
    private String ubicacion;
    private int capacidadEspectadores;
    private List<Date> reservas;

	public Cancha(String tipoSuperficie, String ubicacion, int capacidadEspectadores) {
        this.tipoSuperficie = tipoSuperficie;
        this.ubicacion = ubicacion;
        this.capacidadEspectadores = capacidadEspectadores;
        this.reservas = new ArrayList<>();
    }
	public String getUbicacion() {
        return ubicacion;
	}

	public boolean consultarDisponibilidad(Date fecha) {
        for (Date reserva : reservas) {
            if (reserva.equals(fecha)) {
                return false; 
            }
        }
        return true;
    }

	public void reservarCancha(Date fecha) {
        if (consultarDisponibilidad(fecha)) {
            reservas.add(fecha);
            System.out.println("Cancha reservada para la fecha: " + fecha);
        } else {
            System.out.println("La cancha no está disponible en esa fecha");
        }
    }
}
    

    

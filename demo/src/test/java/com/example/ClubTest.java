package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.Date;

public class ClubTest {

    private Club club;
    private Deportista deportista1;
    private Deportista deportista2;
    private Entrenador entrenador1;
    private Equipo equipo1;
    private Cancha cancha1;

    @BeforeEach
    public void setUp() {
        club = new Club();
        deportista1 = new Deportista("Carlos", "Ramirez", 123456, "Futbol");
        deportista2 = new Deportista("Juan", "Perez", 654321, "Futbol");
        entrenador1 = new Entrenador("Luis", 10, "Futbol");
        equipo1 = new Equipo("Equipo A");
        cancha1 = new Cancha("Cesped", "Ubicacion 1", 100);
    }

    @Test
    public void testRegistroDeportistaCorrecto() {
        club.registrarDeportista(deportista1);
        assertEquals(1, club.getDeportistas().size(), "Debe haber 1 deportista registrado");
    }

    @Test
    public void testRegistroDeportistaDuplicado() {
        club.registrarDeportista(deportista1);
        club.registrarDeportista(deportista1);  
        assertEquals(1, club.getDeportistas().size(), "No se deben registrar deportistas duplicados");
    }

    @Test
    public void testRegistroEntrenadorCorrecto() {
        club.registrarEntrenador(entrenador1);
        assertEquals(1, club.getEntrenadores().size(), "Debe haber 1 entrenador registrado");
    }

    @Test
    public void testRegistroEntrenadorDuplicado() {
        club.registrarEntrenador(entrenador1);
        club.registrarEntrenador(entrenador1); 
        assertEquals(1, club.getEntrenadores().size(), "No se deben registrar entrenadores duplicados");
    }

    @Test
    public void testCreacionEquipoCorrecta() {
        club.registrarEquipo(equipo1);
        assertEquals(1, club.getEquipos().size(), "Debe haber 1 equipo registrado");
    }

    @Test
    public void testAsignacionDeportistaAUnEquipo() {
        equipo1.agregarDeportista(deportista1);
        deportista1.asignarEquipo(equipo1);
        assertEquals(equipo1, deportista1.getEquipo(), "El deportista debe estar asignado al equipo correctamente");
    }

    @Test
    public void testDeportistaSoloUnEquipo() {
        equipo1.agregarDeportista(deportista1);
        deportista1.asignarEquipo(equipo1);

        Equipo equipo2 = new Equipo("Equipo B");
        deportista1.asignarEquipo(equipo2);  

        assertEquals(equipo1, deportista1.getEquipo(), "El deportista no puede estar en más de un equipo a la vez");
    }

    @Test
    public void testEntrenadorSoloUnEquipo() {
        equipo1.setEntrenador(entrenador1);
        entrenador1.asignarEquipo(equipo1);

        Equipo equipo2 = new Equipo("Equipo B");
        entrenador1.asignarEquipo(equipo2); 

        assertEquals(equipo1, entrenador1.getEquipo(), "El entrenador no puede dirigir más de un equipo a la vez");
    }

    @Test
    public void testRegistroPartidoCorrecto() {
        Date fechaPartido = new Date(); 
        Partido partido1 = new Partido(equipo1, equipo1, fechaPartido, cancha1);

        club.gestionarPartido(partido1);
        assertEquals(1, club.getPartidos().size(), "Debe haber 1 partido registrado correctamente");
    }

    @Test
    public void testPartidoSinErroresAsignacionCancha() {
        Date fechaPartido = new Date(); 
        Partidos partido1 = new Partidos(equipo1, equipo1, fechaPartido, cancha1);

        assertTrue(cancha1.consultarDisponibilidad(fechaPartido), "La cancha debe estar disponible antes de reservar");
        assertEquals(cancha1, partido1.getCancha(), "La cancha debe asignarse correctamente al partido");
    }
}

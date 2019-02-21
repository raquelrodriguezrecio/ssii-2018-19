package es.urjc.etsii;

import javax.persistence.*;
import java.util.List;

/**
 * Clase simplificada que representa un director.
 * 
 * @author J. M. Colmenar
 *
 */
@Entity
public class Director {
	private int id;
	private String nombre;
	private String apellidos;
	private List<Pelicula> peliculas;

	public Director() {
	}
	
	public Director(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// Getters y setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    // Campo de Pelicula que incluye el director.
	@OneToMany(mappedBy = "director")
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
		
}

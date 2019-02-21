package es.urjc.etsii;

import javax.persistence.*;
import java.util.Set;

/**
 * Representación de los datos básicos de una película.
 * 
 * @author J. M. Colmenar
 *
 */
@Entity
public class Pelicula {
	private int id;
	private String titulo;
	private int anio;
	private String imdb;

	private Director director;

	// Constructor vacío necesario para Spring
	public Pelicula() {
	}
	
	public Pelicula(String titulo, int anio, String imdb) {
		this.titulo = titulo;
		this.anio = anio;
		this.imdb = imdb;
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

    // Columna de la tabla de peliculas que guarda la clave ajena
	@ManyToOne
	@JoinColumn(name="director_id")
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	
}

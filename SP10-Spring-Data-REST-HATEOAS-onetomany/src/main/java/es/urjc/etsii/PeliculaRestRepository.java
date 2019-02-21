package es.urjc.etsii;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Repositorio generador de API REST HATEOAS: películas
 *
 * @author J. M. Colmenar
 */
@RepositoryRestResource(collectionResourceRel = "peliculas", path = "peliculas")
public interface PeliculaRestRepository extends CrudRepository<Pelicula, Integer> {

    // El siguiente método aparece al acceder a http://localhost:8080/peliculas/search

    // Declaración de método para buscar peliculas por título.
    List<Pelicula> findByTitulo(@Param("titulo") String titulo);

}
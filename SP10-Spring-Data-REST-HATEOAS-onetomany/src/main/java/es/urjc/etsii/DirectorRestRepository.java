package es.urjc.etsii;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Repositorio generador de API REST HATEOAS: directores
 *
 * @author J. M. Colmenar
 */
@RepositoryRestResource(collectionResourceRel = "directores", path = "directores")
public interface DirectorRestRepository extends CrudRepository<Director, Integer> {

}
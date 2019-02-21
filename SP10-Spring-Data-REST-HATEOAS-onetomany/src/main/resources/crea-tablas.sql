CREATE TABLE `director` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellidos` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `pelicula` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anio` int(11) NOT NULL,
  `imdb` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `director_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`director_id`) REFERENCES `director` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


insert into director(id,nombre,apellidos) values (1,'Francis Ford','Coppola'),
  (2,'James','Cameron');

insert into pelicula(anio,imdb,titulo,director_id) values ('1972','http://www.imdb.com/title/tt0068646/','El Padrino',1),
  ('1974','http://www.imdb.com/title/tt0071562/','El Padrino: parte II',1),
  ('1990','http://www.imdb.com/title/tt0099674/','El Padrino: parte III',1),
  ('2009','http://www.imdb.com/title/tt0499549/','Avatar',2);
package com.prueba.parqueadero.dominio.parqueadero;

import org.springframework.data.repository.CrudRepository;

/**
 * DaoParqueadero
 */
public interface DaoParqueadero extends CrudRepository<EntityVehiculo, Long> {

}
package com.prueba.parqueadero.dominio.vehiculo;

import org.springframework.data.repository.CrudRepository;

/**
 * DaoVehiculo
 */
public interface DaoVehiculo extends CrudRepository<EntityVehiculo, Long> {

}
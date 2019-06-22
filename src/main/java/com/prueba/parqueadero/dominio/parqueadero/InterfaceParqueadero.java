package com.prueba.parqueadero.dominio.parqueadero;

import java.util.List;

/**
 * InterfaceParqueadero
 */

public interface InterfaceParqueadero {

    public List<EntityVehiculo> findAll();

    public EntityVehiculo findById(long id);

    public EntityVehiculo save(EntityVehiculo data);
}
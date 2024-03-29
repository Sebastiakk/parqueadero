package com.prueba.parqueadero.dominio.parqueadero;

import java.util.List;

/**
 * InterfaceParqueadero
 */

public interface InterfaceParqueadero {

    public List<EntityParqueadero> findAll();

    public EntityParqueadero findById(long id);

    public EntityParqueadero save(EntityParqueadero data);
}
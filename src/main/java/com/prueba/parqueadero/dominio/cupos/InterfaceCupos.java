package com.prueba.parqueadero.dominio.cupos;

import java.util.List;

/**
 * InterfaceCupos
 */

public interface InterfaceCupos {

    public List<EntityCupos> findAll();

    public EntityCupos findById(long id);

    public EntityCupos save(EntityCupos data);
}
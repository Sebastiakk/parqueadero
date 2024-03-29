package com.prueba.parqueadero.dominio.vehiculo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 * ImplementVehiculo
 */
@Service
public class ImplementVehiculo  implements InterfaceVehiculo {

    @Autowired
    private CrudRepository<EntityVehiculo, Long> vehiculo;

    @Override
    @Transactional(readOnly = true)
    public List<EntityVehiculo> findAll() {
        return (List<EntityVehiculo>) vehiculo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public EntityVehiculo findById(long id) {
        return vehiculo.findById(id).orElse(null);
    }

    @Override
    public EntityVehiculo save(EntityVehiculo data) {
        return vehiculo.save(data);
    }

}
package com.prueba.parqueadero.dominio.parqueadero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 * ImplementParqueadero
 */
@Service
public class ImplementParqueadero implements InterfaceParqueadero {

    @Autowired
    private CrudRepository<EntityVehiculo, Long> parqueadero;

    @Override
    @Transactional(readOnly = true)
    public List<EntityVehiculo> findAll() {
        return (List<EntityVehiculo>) parqueadero.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public EntityVehiculo findById(long id) {
        return parqueadero.findById(id).orElse(null);
    }

    @Override
    public EntityVehiculo save(EntityVehiculo data) {
        return parqueadero.save(data);
    }

}
package com.prueba.parqueadero.dominio.vehiculo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vehiculo
 */
@Entity
@Table(name = "vehiculo")
public class EntityVehiculo implements Serializable {

    private enum TipoVehiculo {
        Carro, Moto
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_vehiculo;
    @Column(nullable = false)
    private String placa;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String color;

    private String cilintraje;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoVehiculo tipo_vehiculo;

    public EntityVehiculo() {
    }

    public EntityVehiculo(String placa, String modelo, String color, String cilintraje, TipoVehiculo tipo_vehiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.cilintraje = cilintraje;
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public long getId_vehiculo() {
        return this.id_vehiculo;
    }

    public void setId_vehiculo(long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilintraje() {
        return this.cilintraje;
    }

    public void setCilintraje(String cilintraje) {
        this.cilintraje = cilintraje;
    }

    public TipoVehiculo getTipo_vehiculo() {
        return this.tipo_vehiculo;
    }

    public void setTipo_vehiculo(TipoVehiculo tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

}
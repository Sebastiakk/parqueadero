package com.prueba.parqueadero.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import com.prueba.parqueadero.dominio.parqueadero.EntityParqueadero;
import com.prueba.parqueadero.dominio.parqueadero.InterfaceParqueadero;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParqueaderoTest {
	@Autowired()
	private InterfaceParqueadero parqueadero;

	@Test
	public void crear_parqueadero() {
		try {
			String nombre_parquedero = "Parqueo donde sebas";
			EntityParqueadero data = new EntityParqueadero(nombre_parquedero);
			EntityParqueadero result = parqueadero.save(data);
			assertEquals(nombre_parquedero, result.getNombre());
			assertNotEquals(result.getid_parqueadero(), 0);
			// id_parqueadero = result.getid_parqueadero();
		} catch (Exception err) {
			fail();
		}
	}

	@Test
	public void get_parquederos() {
		try {
			// Se crea el parquedero
			crear_parqueadero();
			// Se hace la consulta
			List<EntityParqueadero> result = parqueadero.findAll();
			// Se valida que el tamaño del resultado sea mayor a cero
			assertTrue((result.size() > 0) ? true : false);
		} catch (Exception err) {
			fail();
		}
	}

	@Test
	public void get_parquedero() {
		try {
			// Se crea el parquedero y se obtiene el id
			crear_parqueadero();
			// Se hace la consulta
			EntityParqueadero result = parqueadero.findById(1);
			// Se valida que el tamaño del resultado sea mayor a cero
			assertEquals(1, result.getid_parqueadero());
		} catch (Exception err) {
			fail();
		}
	}
}

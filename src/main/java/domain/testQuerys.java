package domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class testQuerys {

	public static void main(String[] args) {
		
		/*INSERTAR UN EMPLEADO*/
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
//		EntityManager manager = factory.createEntityManager();
//		
//		EntityTransaction tx = manager.getTransaction();
//		
//		tx.begin();
//		
//		Empleado e = new Empleado();
//		e.setApellido_paterno("Rames");
//		e.setApellido_materno("Segundo");
//		e.setNombres("Mohammed ");
//		e.setNro_hijos(20);
//		e.setSueldo(1300.00);
//		e.setFecha_Nacimiento(LocalDate.of(2002, 1, 21));
//		
//		// Insertar
//		manager.persist(e);
//		
//		tx.commit();
//		
//		
//		List<Empleado> list = manager.createNamedQuery("Empleado.lista", Empleado.class).getResultList();
//		for (Empleado empleado: list) {
//			System.out.println(empleado);
//		}
		
		/*BUSCAR UN EMPLEADO*/
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
//		EntityManager manager = factory.createEntityManager();
//		
//		EntityTransaction tx = manager.getTransaction();
//		
//		tx.begin();
//		
//		Empleado e = manager.find(Empleado.class, 1l);
//		
//		tx.commit();
//		
//		List<Empleado> list = manager.createNamedQuery("Empleado.lista", Empleado.class).getResultList();
//		for (Empleado empleado: list) {
//			System.out.println(empleado);
//		}
		
		/*ACTUALIZAR UN EMPLEADO*/
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
//		EntityManager manager = factory.createEntityManager();
//		
//		EntityTransaction tx = manager.getTransaction();
//		
//		tx.begin();
//		
//		Empleado e = new Empleado();
//		e.setId(1L);
//		e.setApellido_paterno("Morita");
//		e.setApellido_materno("tafurata");
//		e.setNombres("Leo Rodrigo");
//		e.setNro_hijos(50);
//		e.setSueldo(2500.00);
//		e.setFecha_Nacimiento(LocalDate.of(1997, 7, 2));
//		
//		manager.merge(e);
//		
//		tx.commit();
//		
//		List<Empleado> list = manager.createNamedQuery("Empleado.lista", Empleado.class).getResultList();
//		for (Empleado empleado: list) {
//			System.out.println(empleado);
//	}
		
		/*ELIMINAR UN EMPLEADO*/
		
//		EntityManagerFactory emfactory = new Persistence().createEntityManagerFactory("default");
//		EntityManager manager = emfactory.createEntityManager();
//		
//		EntityTransaction tx = manager.getTransaction();
//		tx.begin();
//		
//		Empleado e = manager.getReference(Empleado.class, 2L);
//		manager.remove(e);
//		
//		tx.commit();
//		
//		List<Empleado> list = manager.createNamedQuery("Empleado.lista", Empleado.class).getResultList();
//		for (Empleado empleado: list) {
//			System.out.println(empleado);
//		}
//	
//		}
	
	}
	
}
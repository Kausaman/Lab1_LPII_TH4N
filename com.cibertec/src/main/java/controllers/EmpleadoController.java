package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {

	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class)
			.buildSessionFactory();
	Session session = sessionFactory.openSession();

	public String createEmpleado(String apellido, String nombre, String edad, String sexo, double salario) {

		try {
			Empleado empleado = new Empleado(apellido, nombre, edad, sexo, salario);
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			sessionFactory.close();

			return "Empleado Creado";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al registrar Empleado";

	}

	public String BuscarEmpleado(int id) {
		try {
			session.beginTransaction();
			Empleado emp = session.get(Empleado.class, id);
			session.getTransaction().commit();
			sessionFactory.close();

			if (emp != null) {
				return "Empleado encontrado";
			} else {
				return "No se pudo encontrar al empleado";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al buscar empleado";
	}

	public String EliminarEmpleado(int idEmpleado) {
		try {

			session.beginTransaction();
			Empleado em = session.get(Empleado.class, idEmpleado);
			session.delete(em);
			session.getTransaction().commit();
			sessionFactory.close();
			return "Empleado eliminado";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error a eliminar empleado";
	}

	public String ActualizarEmpleado(int idEmpleado, String apellidos, String nombres) {
		try {
			session.beginTransaction();
			Empleado emp = session.get(Empleado.class, idEmpleado);
			emp.setApellido(apellidos);
			emp.setNombre(nombres);
			session.update(emp);
			session.getTransaction().commit();
			sessionFactory.close();
			return "Empleado actualizado";
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "Error al actualizar empleado";
	}
}

package models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")

public class Empleado {
	
	@Id
	@Column(name="idEmpleado")
	private int idempleado;
	
	@Basic
	@Column(name="Apellidos")
	private String apellido;
	
	@Basic
	@Column(name="Nombres")
	private String nombre;
	
	@Basic
	@Column(name="Edad")
	private String edad;
	
	@Basic
	@Column(name="Sexo")
	private String sexo;
	
	@Basic
	@Column(name="Salario")
	private double salario;

	public Empleado(String apellido, String nombre, String edad, String sexo, double salario) {
	
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", apellido=" + apellido + ", nombre=" + nombre + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}

	

}

package domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Table(name="empleado")
@Entity(name="empleado")
//@NamedQuery(name = "Empleado.lista", query = "SELECT e FROM empleado e")
@NamedQuery(name = "Empleado.lista", query = "SELECT e FROM empleado e")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "apellido_paterno", length = 100, nullable = false)
	private String apellido_paterno;
	
	@Column(name = "apellido_materno", length = 100, nullable = false)
	private String apellido_materno;
	
	@Column(name = "nombres", length = 50, nullable = false)
	private String nombres;
	
	@Column(name = "nro_hijos")
	private Integer nro_hijos;
	
	@Column(name = "sueldo")
	private Double sueldo;
	
	@Column(name = "fecha_Nacimiento")
	private LocalDate fecha_Nacimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Integer getNro_hijos() {
		return nro_hijos;
	}

	public void setNro_hijos(Integer nro_hijos) {
		this.nro_hijos = nro_hijos;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDate getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	public Empleado() {
		super();
	}

	public Empleado(Long id, String apellido_paterno, String apellido_materno, String nombres, Integer nro_hijos,
			Double sueldo, LocalDate fecha_Nacimiento) {
		super();
		this.id = id;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.nombres = nombres;
		this.nro_hijos = nro_hijos;
		this.sueldo = sueldo;
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", apellido_paterno=" + apellido_paterno + ", apellido_materno="
				+ apellido_materno + ", nombres=" + nombres + ", nro_hijos=" + nro_hijos + ", sueldo=" + sueldo
				+ ", fecha_Nacimiento=" + fecha_Nacimiento + "]";
	}	

}

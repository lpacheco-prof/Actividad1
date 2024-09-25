package com.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Luis M. Pacheco
 */

@Entity
@Table(name="tareas")
public class Tarea {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="completada")
	private boolean completada;
	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}
	
	public Tarea(String nombre) {
		this.nombre = nombre;
		this.completada = false;
	}

	public Tarea(Long id, String nombre, boolean completada) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.completada = completada;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isCompletada() {
		return completada;
	}

	public void setCompletada(boolean completada) {
		this.completada = completada;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", nombre=" + nombre + ", completada=" + completada + "]";
	}

}

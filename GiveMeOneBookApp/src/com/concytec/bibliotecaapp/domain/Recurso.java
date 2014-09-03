package com.concytec.bibliotecaapp.domain;

// Generated 28/07/2014 06:43:13 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Recurso generated by hbm2java
 */
@Entity
@Table(name = "recurso", catalog = "biblioteca")
public class Recurso implements java.io.Serializable {

	private Integer ideRec;
	private Categoria categoria;
	private String titRec;
	private String editRec;
	private Integer anioEdicRec;
	private String estRec;
	private Set<Prestamo> prestamos = new HashSet<Prestamo>(0);
	private Set<Autor> autors = new HashSet<Autor>(0);

	public Recurso() {
	}

	public Recurso(String titRec) {
		this.titRec = titRec;
	}

	public Recurso(Categoria categoria, String titRec, String editRec,
			Integer anioEdicRec, String estRec, Set<Prestamo> prestamos,
			Set<Autor> autors) {
		this.categoria = categoria;
		this.titRec = titRec;
		this.editRec = editRec;
		this.anioEdicRec = anioEdicRec;
		this.estRec = estRec;
		this.prestamos = prestamos;
		this.autors = autors;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ideRec", unique = true, nullable = false)
	public Integer getIdeRec() {
		return this.ideRec;
	}

	public void setIdeRec(Integer ideRec) {
		this.ideRec = ideRec;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codCat")
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name = "titRec", nullable = false, length = 80)
	public String getTitRec() {
		return this.titRec;
	}

	public void setTitRec(String titRec) {
		this.titRec = titRec;
	}

	@Column(name = "editRec", length = 60)
	public String getEditRec() {
		return this.editRec;
	}

	public void setEditRec(String editRec) {
		this.editRec = editRec;
	}

	@Column(name = "anioEdicRec")
	public Integer getAnioEdicRec() {
		return this.anioEdicRec;
	}

	public void setAnioEdicRec(Integer anioEdicRec) {
		this.anioEdicRec = anioEdicRec;
	}

	@Column(name = "estRec", length = 30)
	public String getEstRec() {
		return this.estRec;
	}

	public void setEstRec(String estRec) {
		this.estRec = estRec;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "recurso")
	public Set<Prestamo> getPrestamos() {
		return this.prestamos;
	}

	public void setPrestamos(Set<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "recursos")
	public Set<Autor> getAutors() {
		return this.autors;
	}

	public void setAutors(Set<Autor> autors) {
		this.autors = autors;
	}

}

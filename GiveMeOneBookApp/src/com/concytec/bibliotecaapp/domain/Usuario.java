package com.concytec.bibliotecaapp.domain;

// Generated 28/07/2014 06:43:13 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "biblioteca")
public class Usuario implements java.io.Serializable {

	private String docIdeUsu;
	private TipoUsuario tipoUsuario;
	private String nomUsu;
	private String apeUsu;
	private Integer telUsu;
	private String dirUsu;
	private String emaUsu;
	private String passUsu;
	private String estUsu;
	private Set<Prestamo> prestamos = new HashSet<Prestamo>(0);

	public Usuario() {
	}

	public Usuario(String docIdeUsu) {
		this.docIdeUsu = docIdeUsu;
	}

	public Usuario(String docIdeUsu, TipoUsuario tipoUsuario, String nomUsu,
			String apeUsu, Integer telUsu, String dirUsu, String emaUsu,
			String passUsu, String estUsu, Set<Prestamo> prestamos) {
		this.docIdeUsu = docIdeUsu;
		this.tipoUsuario = tipoUsuario;
		this.nomUsu = nomUsu;
		this.apeUsu = apeUsu;
		this.telUsu = telUsu;
		this.dirUsu = dirUsu;
		this.emaUsu = emaUsu;
		this.passUsu = passUsu;
		this.estUsu = estUsu;
		this.prestamos = prestamos;
	}

	@Id
	@Column(name = "docIdeUsu", unique = true, nullable = false, length = 8)
	public String getDocIdeUsu() {
		return this.docIdeUsu;
	}

	public void setDocIdeUsu(String docIdeUsu) {
		this.docIdeUsu = docIdeUsu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ideTipUsu")
	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Column(name = "nomUsu", length = 30)
	public String getNomUsu() {
		return this.nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	@Column(name = "apeUsu", length = 60)
	public String getApeUsu() {
		return this.apeUsu;
	}

	public void setApeUsu(String apeUsu) {
		this.apeUsu = apeUsu;
	}

	@Column(name = "telUsu")
	public Integer getTelUsu() {
		return this.telUsu;
	}

	public void setTelUsu(Integer telUsu) {
		this.telUsu = telUsu;
	}

	@Column(name = "dirUsu", length = 80)
	public String getDirUsu() {
		return this.dirUsu;
	}

	public void setDirUsu(String dirUsu) {
		this.dirUsu = dirUsu;
	}

	@Column(name = "emaUsu", length = 60)
	public String getEmaUsu() {
		return this.emaUsu;
	}

	public void setEmaUsu(String emaUsu) {
		this.emaUsu = emaUsu;
	}

	@Column(name = "passUsu", length = 20)
	public String getPassUsu() {
		return this.passUsu;
	}

	public void setPassUsu(String passUsu) {
		this.passUsu = passUsu;
	}

	@Column(name = "estUsu", length = 20)
	public String getEstUsu() {
		return this.estUsu;
	}

	public void setEstUsu(String estUsu) {
		this.estUsu = estUsu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Prestamo> getPrestamos() {
		return this.prestamos;
	}

	public void setPrestamos(Set<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

}

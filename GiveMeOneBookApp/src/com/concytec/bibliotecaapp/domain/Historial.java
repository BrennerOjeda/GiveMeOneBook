package com.concytec.bibliotecaapp.domain;

// Generated 28/07/2014 06:43:13 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Historial generated by hbm2java
 */
@Entity
@Table(name = "historial", catalog = "biblioteca")
public class Historial implements java.io.Serializable {

	private int ideHis;
	private Integer ideRec;
	private String docIdeUsu;
	private Date fecPres;
	private Date fecDev;

	public Historial() {
	}

	public Historial(int ideHis) {
		this.ideHis = ideHis;
	}

	public Historial(int ideHis, Integer ideRec, String docIdeUsu,
			Date fecPres, Date fecDev) {
		this.ideHis = ideHis;
		this.ideRec = ideRec;
		this.docIdeUsu = docIdeUsu;
		this.fecPres = fecPres;
		this.fecDev = fecDev;
	}

	@Id
	@Column(name = "ideHis", unique = true, nullable = false)
	public int getIdeHis() {
		return this.ideHis;
	}

	public void setIdeHis(int ideHis) {
		this.ideHis = ideHis;
	}

	@Column(name = "ideRec")
	public Integer getIdeRec() {
		return this.ideRec;
	}

	public void setIdeRec(Integer ideRec) {
		this.ideRec = ideRec;
	}

	@Column(name = "docIdeUsu", length = 8)
	public String getDocIdeUsu() {
		return this.docIdeUsu;
	}

	public void setDocIdeUsu(String docIdeUsu) {
		this.docIdeUsu = docIdeUsu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecPres", length = 0)
	public Date getFecPres() {
		return this.fecPres;
	}

	public void setFecPres(Date fecPres) {
		this.fecPres = fecPres;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecDev", length = 0)
	public Date getFecDev() {
		return this.fecDev;
	}

	public void setFecDev(Date fecDev) {
		this.fecDev = fecDev;
	}

}

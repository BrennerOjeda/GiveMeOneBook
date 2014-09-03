package com.avilyne.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.concytec.bibliotecaapp.domain.TipoUsuario;
@XmlRootElement
public class User {
	private String docIdeUsu;
	private TipoUsuario tipoUsuario;
	private String nomUsu;
	private String apeUsu;
	private Integer telUsu;
	private String dirUsu;
	private String emaUsu;
	private String passUsu;
	private String estUsu;
	
	public String getEstUsu() {
		return estUsu;
	}
	public void setEstUsu(String estUsu) {
		this.estUsu = estUsu;
	}
	public String getPassUsu() {
		return passUsu;
	}
	public void setPassUsu(String passUsu) {
		this.passUsu = passUsu;
	}
	public String getEmaUsu() {
		return emaUsu;
	}
	public void setEmaUsu(String emaUsu) {
		this.emaUsu = emaUsu;
	}
	public String getDirUsu() {
		return dirUsu;
	}
	public void setDirUsu(String dirUsu) {
		this.dirUsu = dirUsu;
	}
	public Integer getTelUsu() {
		return telUsu;
	}
	public void setTelUsu(Integer telUsu) {
		this.telUsu = telUsu;
	}
	public String getApeUsu() {
		return apeUsu;
	}
	public void setApeUsu(String apeUsu) {
		this.apeUsu = apeUsu;
	}
	public String getNomUsu() {
		return nomUsu;
	}
	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getDocIdeUsu() {
		return docIdeUsu;
	}
	public void setDocIdeUsu(String docIdeUsu) {
		this.docIdeUsu = docIdeUsu;
	}
}

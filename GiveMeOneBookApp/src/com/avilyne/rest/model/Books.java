package com.avilyne.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books {
	private Integer ideRec;
	private String titRec;
	private String editRec;
	private Integer anioEdicRec;
	private String estRec;
	
	public String getEstRec() {
		return estRec;
	}
	public void setEstRec(String estRec) {
		this.estRec = estRec;
	}
	public Integer getAnioEdicRec() {
		return anioEdicRec;
	}
	public void setAnioEdicRec(Integer anioEdicRec) {
		this.anioEdicRec = anioEdicRec;
	}
	public String getEditRec() {
		return editRec;
	}
	public void setEditRec(String editRec) {
		this.editRec = editRec;
	}
	public String getTitRec() {
		return titRec;
	}
	public void setTitRec(String titRec) {
		this.titRec = titRec;
	}
	public Integer getIdeRec() {
		return ideRec;
	}
	public void setIdeRec(Integer ideRec) {
		this.ideRec = ideRec;
	}
}


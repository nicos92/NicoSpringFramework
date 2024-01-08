package com.nicosandoval.conexionhibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalles_cliente")
public class DetallesCliente {
	
	
	// constructores
	public DetallesCliente(String web, String tel, String coment) {
		this.web = web;
		this.tel = tel;
		this.coment = coment;
	}

	public DetallesCliente() {	}
	
	
	




	// metodos
	



	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "DetallesCliente [id=" + id + ", web=" + web + ", tel=" + tel + ", coment=" + coment + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	// atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="web")
	private String web;
	
	@Column(name="tel")
	private String tel;
	
	@Column(name="coment")
	private String coment;
	
	@OneToOne(mappedBy= "detallesCliente", cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Cliente cliente;



}

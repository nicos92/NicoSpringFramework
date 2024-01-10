package com.nicosandoval.conexionhibernate;


import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

import javax.persistence.*;


@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="FECHA")
	private GregorianCalendar fecha;
	
	@Column(name="FORMA_PAGO")
	private String formaPago;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="CLIENTE_ID")
	private Cliente pedidoCliente;

	public Pedido(GregorianCalendar fecha) {
		
		this.fecha = fecha;
	}

	public Pedido() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Cliente getCliente() {
		return pedidoCliente;
	}

	public void setCliente(Cliente cliente) {
		this.pedidoCliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha.toZonedDateTime().format(DateTimeFormatter.ofPattern("d MMM uuuu")) + ", formaPago=" + formaPago + "]";
	}
	
	

	
}

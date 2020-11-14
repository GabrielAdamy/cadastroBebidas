package com.estoque.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Bebidas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String tipo;
	@NotNull
	private int qntEstoque;
	@NotNull
	private boolean alcoolica;

	public Bebidas() {
	}

	public Bebidas(long id, String tipo, int qntEstoque, boolean alcoolica) {
		this.id = id;
		this.tipo = tipo;
		this.qntEstoque = qntEstoque;
		this.alcoolica = alcoolica;
	}
	
	public long getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}
	public void setId(long id) {
		this.id = id;
	}


	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	public boolean isAlcoolica() {
		return alcoolica;
	}

	public void setAlcoolica(boolean alcoolica) {
		this.alcoolica = alcoolica;
	}

}

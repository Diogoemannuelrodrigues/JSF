package com.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundo {

	private String nome;
	private String nomeAlterado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void tranformaEmMaiusculo() {
		this.setNomeAlterado(this.getNome().toUpperCase());
	}

	public String getNomeAlterado() {
		return nomeAlterado;
	}

	public void setNomeAlterado(String nomeAlterado) {
		this.nomeAlterado = nomeAlterado;
	}

}

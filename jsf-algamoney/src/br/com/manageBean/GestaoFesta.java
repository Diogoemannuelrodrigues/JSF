package br.com.manageBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@SessionScoped
public class GestaoFesta {

	private Festa festa;
	private List<Festa> festas;
	private Festa festaSelecionado;

	public Festa getFestaSelecionado() {
		return festaSelecionado;
	}

	public void setFestaSelecionado(Festa festaSelecionado) {
		this.festaSelecionado = festaSelecionado;
	}

	public GestaoFesta() {
		this.festas = new ArrayList<Festa>();
		this.festa = new Festa();
	}

	public String obtemAjuda() {
		if (this.festas.isEmpty())
			return "ajuda?faces-redirect=true";
		else
			return "temAlgo?faces-redirect=true";
	}

	public void verificaInclusao(ActionEvent e) {

		if ((this.festa.getEmail().equals("")) && this.festa.getIdade().equals("") 
				&& this.festa.getNome().equals("")) {
			this.festa.setEmail("Sem dado cadastrado");
			this.festa.setNome("Sem dado cadastrado");
			this.festa.setIdade("Sem dado cadastrado");
		}
		if (this.festa.getEmail().equals("")) {
			this.festa.setEmail("Sem dado cadastrado");
		}
		if (this.festa.getIdade().equals("")) {
			this.festa.setIdade("Sem dado cadastrado");
		}
		if (this.festa.getNome().equals("")) {
			this.festa.setNome("Sem dado cadastrado");
		}

	}
	
	public void excluir() {
		this.festas.remove(this.festaSelecionado);
	}

	public void incluir() {
		this.festas.add(this.festa);
		this.festa = new Festa();
	}

	public List<Festa> getFestas() {
		return festas;
	}

	public Festa getFesta() {
		return festa;
	}

}

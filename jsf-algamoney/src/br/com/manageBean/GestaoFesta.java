package br.com.manageBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class GestaoFesta {

	private Festa festa;
	private List<Festa> festas;

	public GestaoFesta() {
		this.festas = new ArrayList<Festa>();
		this.festa = new Festa();
	}
	
	public String obtemAjuda() {
		if(this.festas.isEmpty())
			return "ajuda?faces-redirect=true";
			else
			return "temAlgo?faces-redirect=true";
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

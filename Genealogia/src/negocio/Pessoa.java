package negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

	private String nome;
	private Pessoa pai;
	private List<Pessoa> filhos=new ArrayList<>();
	
	public Pessoa(String nome, Pessoa pai) {
		super();
		this.nome = nome;
		this.pai = pai;
	}
	
	public abstract Pessoa cadastrarFilho(String nome, String Sexo) throws Exception ;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public List<Pessoa> getFilhos() {
		return filhos;
	}
	
}

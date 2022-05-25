package negocio;

public class Participante {

	
	private String nome;
	private String codigo;
	private int votos;
	
	public Participante(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
		this.votos = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getVotos() {
		return votos;
	}

	public void addVoto() {
		this.votos +=1;
	}
	
	
	
}

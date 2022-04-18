package modelo;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String semestre;

	public Aluno(String nome,String matricula,String semestre ) {
		this.nome=nome;
		this.matricula=matricula;
		this.semestre=semestre;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getSemestre() {
		return semestre;
	}
	
	
	
}

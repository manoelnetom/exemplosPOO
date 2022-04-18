package modelo;

public class Disciplina {
	private Aluno lista[];
	private int qtdAlunos;
	private String nome;
	private String codigo;
	
	public Disciplina(String nome, String codigo) {
		this.qtdAlunos = 0;
		this.nome = nome;
		this.codigo = codigo;
		this.lista=new Aluno[40];
	}
	
	public void addAluno(Aluno aluno) {
		if(this.getQtdAlunos()<40) {
			this.lista[this.getQtdAlunos()]=aluno;
			this.qtdAlunos++;
		}else {
			System.out.println("A disciplina está cheia");
		}
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		for(int i=0;i<this.getQtdAlunos(); i++) {
			if(aluno.getNome().equals(this.lista[i].getNome())) {
				return true;
			}
		}
		return false;
	}

	public int getQtdAlunos() {
		return this.qtdAlunos;	
	}
	
	public void listarAlunos() {
		for(int i=0;i<this.getQtdAlunos(); i++) {
			System.out.println("Nome: "+ this.lista[i].getNome() + "Matricula: "+this.lista[i].getMatricula());
		}
	}
	
	public void listarSemestreAlunos() {
		for(int i=0;i<this.getQtdAlunos(); i++) {
			System.out.println("Semestre: "+ this.lista[i].getSemestre() + "Nome: "+this.lista[i].getNome());
		}
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
	
	
	
}

package modelo;

import java.util.ArrayList;

public class Faculdade {
	
	private ArrayList<Disciplina> lista;

	public Faculdade() {
		this.lista=new ArrayList<>();
	}
	
	
	public void matricular(Disciplina disciplina, Aluno aluno) {
		for (int i = 0; i < this.lista.size(); i++) {
			if(this.lista.get(i).getCodigo().equals(disciplina.getCodigo())) {
				this.lista.get(i).addAluno(aluno);
			}
		}
	}
	
	public void getMaiorDisciplina() {
		Disciplina disciplina=new Disciplina("", "");
		
		for (int i = 0; i < this.lista.size(); i++) {
			if(disciplina.getQtdAlunos()<this.lista.get(i).getQtdAlunos()) {
				disciplina=this.lista.get(i);
			}
		}
		
		System.out.println("A disciplina com maior qtd de alunos é "+disciplina.getNome());
	}
	
	public boolean estaMariculado(Aluno aluno) {
		for (int i = 0; i < this.lista.size(); i++) {
			Disciplina disciplina = this.lista.get(i);
			if(disciplina.estaMatriculado(aluno)) {
				return true;
			}
		} 
			
		return false;
	}
	
	public void imprimeDisciplinas() {
		for (int i = 0; i < this.lista.size(); i++) {
			System.out.println("Nome:  "+this.lista.get(i).getNome()+" Codigo "+this.lista.get(i).getCodigo());
		}
		
	}

}

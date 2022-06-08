package negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import novidades.Curso;

public class OrdenaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		System.out.println( cursos.stream().filter(c->c.getAlunos()>=100).
		mapToInt(Curso::getAlunos).sum());
		

		
	}

}

	


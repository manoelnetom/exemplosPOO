package novidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("curso online");
		palavras.add("casa do amor");
		palavras.add("ifba");
		
		//Collections.sort(palavras);
		
		
		//Ordenar por tamanho da string
		//Comparator comparator=new OrdenaPorTamanho();
		
		//Comparator comparator= ;
		///Collections.sort(palavras,comparator);
		//System.out.println(palavras);
		
		//No Java8+
		//palavras.sort((o1,  o2) ->Integer.compare(o1.length(), o2.length()));
		//System.out.println(palavras);
		
		//for (String p : palavras) {
		//	System.out.println(p);
		//}
		
		palavras.forEach(System.out::println);

		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		cursos.stream()
		.filter(curso->curso.getAlunos()>=100)
		.forEach(curso->System.out.println(curso.getNome()));
		int total=cursos.stream().filter(c->c.getAlunos()>=100)
				.mapToInt(Curso::getAlunos).sum();
		
		System.out.println(total);
	}
}

package teste;

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
		
		
		//Collections.sort(palavras,comparator);
		//System.out.println(palavras);
		
		
		//palavras.sort((o1, o2)->  Integer.compare(o1.length(), o2.length()));
		//System.out.println(palavras);
		
		for (String p : palavras) {
			//System.out.println(p);
			
		}
		
		palavras.forEach((t) -> System.out.println(t));
	}
	

}



package negocio;

import java.util.Random;

public class Filha extends Pessoa{

	public Filha(String nome, Pessoa pai) {
		super(nome, pai);
	}

	@Override
	public Pessoa cadastrarFilho(String nome, String sexo)  throws Exception {
		Pessoa pessoa=null;
		if(sexo.equalsIgnoreCase("Masculino")) {
			Random r=new Random();
			int probabilidade = r.nextInt(2);
			if(probabilidade==1) {
				pessoa= new FilhoNatimorto("Natimorto "+nome, this);
			}else {
				pessoa=new Filho("Sr. "+nome, this);
			}
		}else {
			pessoa= new Filha("Sra. "+nome, this);
		}
		this.getFilhos().add(pessoa);
		return pessoa;
	}

}

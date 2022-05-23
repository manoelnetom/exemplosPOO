package negocio;

public class Filho extends Pessoa{

	public Filho(String nome, Pessoa pai) {
		super(nome, pai);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pessoa cadastrarFilho(String nome, String sexo)  throws Exception {
		Pessoa pessoa = null;
		int qtdFilhos=this.getFilhos().size();
		
		if(qtdFilhos==1) {
			pessoa = new FilhoNatimorto("Naotimorto " +nome, this);
		}else {
			if (sexo.equalsIgnoreCase("Masculino")) {
				pessoa = new Filho("Sr. "+nome, this);
			}else {
				pessoa = new Filha("Sra. "+nome, this);
			}
		}
		this.getFilhos().add(pessoa);
		
		return pessoa;
	}
	
	

}

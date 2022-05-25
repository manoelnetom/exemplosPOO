package negocio;

public class Paredao {
	private Participante primeiro;//Juliana
	private Participante segundo;//Dhomini
	
	public Paredao(Participante primeiro, Participante segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	
	
	
	public Participante getPrimeiro() {
		return primeiro;
	}



	public void setPrimeiro(Participante primeiro) {
		this.primeiro = primeiro;
	}



	public Participante getSegundo() {
		return segundo;
	}



	public void setSegundo(Participante segundo) {
		this.segundo = segundo;
	}



	private int getTotalVotos() {
		return primeiro.getVotos()+segundo.getVotos();
	}
	
	public void votaPorNome(String nome) throws Exception{
		if(primeiro.getNome().equalsIgnoreCase(nome)) {
			primeiro.addVoto();
		}else if(segundo.getNome().equalsIgnoreCase(nome)){
			segundo.addVoto();
		}else {
			throw new Exception();
		}
	}
	
	public void votaPorCodigo(String codigo) throws Exception{
		if(primeiro.getCodigo().equalsIgnoreCase(codigo)) {
			primeiro.addVoto();
		}else if(segundo.getCodigo().equalsIgnoreCase(codigo)){
			segundo.addVoto();
		}else {
			throw new Exception();
		}
	}
	
	public double percentualPrimeiro() {
		return this.getPrimeiro().getVotos()*100/this.getTotalVotos();
	}
	
	public double percentualSegundo() {
		return this.getSegundo().getVotos()*100/this.getTotalVotos();
	}
	
	public String getPerdedor() {
		if(primeiro.getVotos()<=segundo.getVotos()) {
			return primeiro.getNome();
		}else {
			return segundo.getNome();
		}
		
	}
	
}

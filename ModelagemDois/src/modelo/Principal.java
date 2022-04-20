package modelo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escola escola= new Escola();
		Professor p1=new Professor(20, 0, 30);
		escola.addFuncionario(p1);
		
		escola.addFuncionario(new Admnistrativo(30,4, 50));
		
		escola.addFuncionario(new Professor(20,0,30));
		
		System.out.println("O valor da folha é : "+escola.getValorFolha());

	}

}

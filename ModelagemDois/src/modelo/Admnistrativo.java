package modelo;

public class Admnistrativo extends Funcionario{

	public Admnistrativo(double salarioBase, int faltas, int horasExtras) {
		super(salarioBase, faltas, horasExtras);
	}

	@Override
	public double getSalario() {
		return (this.getSalarioBase()*8*(30-this.getFaltas()))+(this.getSalarioBase()*1.5*this.getHorasExtras());
	}

}

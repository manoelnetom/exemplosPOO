package modelo;

public class Professor extends Funcionario{

	public Professor(double salarioBase, int faltas, int horasExtras) {
		super(salarioBase, faltas, horasExtras);
	}

	@Override
	public double getSalario() {
		return (this.getSalarioBase()*12*8)+(this.getHorasExtras()*2.5*this.getSalarioBase());
	}

}

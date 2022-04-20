package modelo;

public abstract class Funcionario {

	private double salarioBase;
	private int faltas;
	private int horasExtras;
	//private String tipo;
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public Funcionario(double salarioBase, int faltas, int horasExtras) {
		this.salarioBase = salarioBase;
		this.faltas = faltas;
		this.horasExtras = horasExtras;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public abstract double getSalario() ;
}

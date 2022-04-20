package modelo;

import java.util.ArrayList;
import java.util.List;

/*
 * Faça um programa Orientado a Objeto em Java que calcule o salário 
 * do mês de funcionários em uma Escola e quanto será a folha 
 * de pagamento do mês. Solicite que seja informado o valor do 
 * salário base do funcionário, quantos dias este faltou de 
 * trabalho, a quantidade de horas extras efetuadas durante o 
 * mês e o tipo de Funcionário 
 * (Funcionário Administrativo ou Professor). 
 * Para os funcionários administrativos considere 
 * que o valor descontado por dia de trabalho é calculado 
 * sobre o total de 30 dias de trabalho no mês e que 
 * o valor da hora extra é 1.5 da hora normal do 
 * funcionário (tomando em consideração 30x8 horas mensais). 
 * No caso dos professores não existem descontos por causa 
 * de faltas, já que estes sempre terão de repor as 
 * aulas não ministradas. Além disso, os professores trabalham 
 * apenas 12 dias por mês com uma carga horária de 8 horas 
 * por dia e o valor da hora extra deles é 2.5 da hora normal.
 * */
public class Escola {

	private List<Funcionario> list;

	public Escola() {
		this.list=new ArrayList<>();
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.list.add(funcionario);
		System.out.println("Funcionario add com sucesso");
	}
	
	public double getValorFolha() {
		double valor=0;
		
		for (Funcionario funcionario : list) {
			valor+=funcionario.getSalario();
		}
		
		return valor;
	}
	
}

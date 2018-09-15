package com.trabalhotdd.folhapagamento;

public class Salario {
	
	private double salarioLiquido;
	private double salarioBruto;
	private double descontoInss;
	private double descontoIr;
	private Colaborador colaborador;	
		
	public Salario(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public double calculaSalarioBruto(double horasTrabalhadas) {
		return (horasTrabalhadas * colaborador.getSalarioHora()) + (50 * colaborador.getDependentes());
		//return salarioBruto;
	}
	
	public double calculaDescontoINSS(double salarioBruto) {
		if(salarioBruto <= 1000) {
			this.descontoInss = salarioBruto * 8.5 / 100;
		}
		if(salarioBruto > 1000) {
			this.descontoInss = salarioBruto * 9 / 100;
		}
		return descontoInss;
	}
	
	public double calculaDescontoIr(double salarioBruto){
		if(salarioBruto <= 500) {
			this.descontoIr = 0;
		}
		if(salarioBruto > 500 && salarioBruto <= 1000) {
			this.descontoIr = salarioBruto * 5 / 100;
		}
		if(salarioBruto > 1000) {
			this.descontoIr = salarioBruto * 7 / 100;
		}
		return descontoIr;
	}
	
	public double calculaSalarioLiquido(double salarioBruto, double descontoInss, double descontoIr) {
		this.salarioLiquido = salarioBruto - descontoInss - descontoIr;
		return salarioLiquido;
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getDescontoInss() {
		return descontoInss;
	}
	public void setDescontoInss(double descontoInss) {
		this.descontoInss = descontoInss;
	}
	
	public double getDescontoIr() {
		return descontoIr;
	}
	
	public void setDescontoIr(double descontoIr) {
		this.descontoIr = descontoIr;
	}
	
	public Colaborador getColaborador() {
		return colaborador;
	}
	
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}	 

}

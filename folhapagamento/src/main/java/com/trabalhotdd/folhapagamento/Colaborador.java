package com.trabalhotdd.folhapagamento;

public class Colaborador {
	
	private String nome;
	private double salarioHora;
	private int dependentes;
	private Salario salario;
	
	public Colaborador(String nome, double salarioHora, int dependentes) {
		this.nome = nome;
		this.salarioHora = salarioHora;
		this.dependentes = dependentes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getDependentes() {
		return dependentes;
	}		

}

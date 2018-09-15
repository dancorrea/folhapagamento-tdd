package com.trabalhotdd.folhapagamento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class SalarioTeste {

	private Colaborador joao;
	private Salario salario;
	private double salarioBruto;
	private double descontoInss;
	private double descontoIr;
	private double salarioLiquido;

	@Before
	public void init() {

		joao = new Colaborador("João Silva", 150, 3);
		salario = new Salario(joao);
		salarioBruto = salario.calculaSalarioBruto(160);
		descontoInss = salario.calculaDescontoINSS(salarioBruto);
		descontoIr = salario.calculaDescontoIr(salarioBruto);
		salarioLiquido = salario.calculaSalarioLiquido(salarioBruto, descontoInss, descontoIr);

	}

	@Test
	public void testaSalarioBruto() {
		assertEquals(24150.0, salario.calculaSalarioBruto(160), 0.0001);
	}

	@Test
	public void testaDescontoInss() {
		assertEquals(2173.50, salario.calculaDescontoINSS(salarioBruto), 0.0001);
	}

	@Test
	public void testaDescontoIr() {
		assertEquals(1690.50, salario.calculaDescontoIr(salarioBruto), 0.0001);
	}

	@Test
	public void testaSalarioBLiquido() {
		assertEquals(20286.00, salario.calculaSalarioLiquido(salarioBruto, descontoInss, descontoIr), 0.0001);
	}

}

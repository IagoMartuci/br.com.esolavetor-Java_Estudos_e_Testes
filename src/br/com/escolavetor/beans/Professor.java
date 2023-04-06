package br.com.escolavetor.beans;

public class Professor extends Pessoa {
	private float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// Recebendo parametro
	public void mostrarDadosProfessor(float salarioBruto) {
	// Sem receber parametro, usando o proprio getSalario()
	// public void mostrarDadosProfessor() {
		System.out.println(String.format("Nome do professor: %s"
				+ "\nIdade do professor: %d"
				+ "\nSalario bruto do professor: %.2f"
				+ "\nDesconto de INSS do professor: %.2f"
				+ "\nSalario liquido do professor: %.2f",
				getNome(), getIdade(), getSalario(),
				calcularDescontoInss(getSalario()),
				(getSalario() - calcularDescontoInss(getSalario()))));
	}
	
	public float calcularDescontoInss(float salarioBruto) {
		
		float descInss;
		
		if (salarioBruto > 0 && salarioBruto <= 1000)
			descInss = salarioBruto * 0.05F;
		else if (salarioBruto > 1000 && salarioBruto <= 2000)
			descInss = salarioBruto * 0.10F;
		else
			descInss = salarioBruto * 0.15F;
		
		return descInss;
	}
}

package br.com.escolavetor.beans;

public class Aluno extends Pessoa {
	private int rm;
	private float media;
	
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}
	
	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
	// Sem receber parametro, usando o getMedia()
	public void mostrarDadosAluno() {
	// Recebendo parametros
	// public void mostrarDadosAluno(float n1, float n2) {
		System.out.println(String.format("Nome do aluno: %s"
				+ "\nIdade do aluno: %d"
				+ "\nRM do aluno: %d"
				+ "\nMedia final do aluno: %.2f"
				+ "\nSituação final do aluno: %s"
				+ "\nAluno maior de idade? %b",
				getNome(), getIdade(), getRm(), getMedia(),
				mostrarSituacaoFinal(getMedia()),
				mostrarMaiorIdade(getIdade())));
				// Recebendo parametros
				// getNome(), getIdade(), getRm(),
				// calcularMediaFinal(n1, n2),
				// mostrarSituacaoFinal(calcularMediaFinal(n1, n2)),
				// mostrarMaiorIdade(getIdade())));
	}
	
	public float calcularMediaFinal(float n1, float n2) {
		float mf = (n1 + n2) / 2;
		return mf;
	}
	
	public String mostrarSituacaoFinal(float mf) {
		
		String sf;
		
		if (mf >= 5)
			sf = "Aprovado";
		else
			sf = "Reprovado";
		
		return sf;
	}
	
	public boolean mostrarMaiorIdade(int idade) {
		
		if (idade >= 18)
			return true;
		else
			return false;
	}
}

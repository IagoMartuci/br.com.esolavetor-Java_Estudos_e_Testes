package br.com.escolavetor.teste;

import javax.swing.JOptionPane;

import br.com.escolavetor.beans.Aluno;

public class TesteAluno {
	public static void InstanciarAluno() {
		// Criando um array da classe Aluno
		Aluno[] aluno = new Aluno[3];

		for (int i = 0; i < 3; i++) {
			// Instanciando a classe Aluno
			aluno[i] = new Aluno();

			aluno[i].setNome(JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "ª aluno"));
			aluno[i].setIdade(
					Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno " + aluno[i].getNome())));
			aluno[i].setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do " + aluno[i].getNome())));
			float n1 = (Float
					.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do " + aluno[i].getNome())));
			float n2 = (Float
					.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do " + aluno[i].getNome())));
			// Usando o setMedia() e o getMedia()
			// float mf = aluno[i].calcularMediaFinal(n1, n2);
			// aluno[i].setMedia(mf);
			// OU
			aluno[i].setMedia(aluno[i].calcularMediaFinal(n1, n2));
			aluno[i].mostrarDadosAluno();
			// Passando parametros
			// aluno[i].mostrarDadosAluno(n1, n2);
		}
	}
}

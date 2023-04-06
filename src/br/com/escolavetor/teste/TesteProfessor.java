package br.com.escolavetor.teste;

import javax.swing.JOptionPane;

import br.com.escolavetor.beans.Professor;

public class TesteProfessor {
	public static void InstanciarProfessor() {
		Professor[] professor = new Professor[3];
		
		for (int i = 0; i < 3; i++) {
			professor[i] = new Professor();
			
			professor[i].setNome(JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "ª professor"));
			professor[i].setIdade(
					Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor " + professor[i].getNome())));
			professor[i].setSalario(Float
					.parseFloat(JOptionPane.showInputDialog("Digito salario do professor " + professor[i].getNome())));
			// Passando parametro
			professor[i].mostrarDadosProfessor(professor[i].getSalario());
			// Sem parametro
			// professor[i].mostrarDadosProfessor();
		}
	}
}

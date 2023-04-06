package br.com.escolavetor.teste;

import javax.swing.JOptionPane;

public class TesteMenu {
	public static void Menu() {
		int opcao;

		do {
			opcao = (Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção\n" + "1 - Instaciar Aluno\n" + "2 - Instanciar Professor\n" + "0 - Sair")));

			switch (opcao) {
			case 1:
				TesteAluno.InstanciarAluno();
				break;
			case 2:
				TesteProfessor.InstanciarProfessor();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Por favor, escolha uma opção válida.");
			}
		} while (opcao != 1 && opcao != 2 && opcao != 0);
	}
}

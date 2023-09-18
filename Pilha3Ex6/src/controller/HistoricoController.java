package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.PilhaString.Pilha;

public class HistoricoController {
	
	public HistoricoController() {}
	
	public void inserirEndereco(Pilha historico, String endereco) {
		String[] validacao = endereco.split("\\.");
		if (!validacao[0].equals("http://www") || !validacao[2].contains("co"))
			JOptionPane.showMessageDialog(null, "Endereco invalido!");
		else {
			historico.push(endereco);			
			JOptionPane.showMessageDialog(null, "Endereco inserido com sucesso!");
		}		
	}
	
	public void removerEndereco(Pilha historico) throws Exception {
		if (historico.isEmpty())
			JOptionPane.showMessageDialog(null, "Historico vazio!");
		else if (historico.size() == 1)
			JOptionPane.showMessageDialog(null, "Nao e possivel remover o ultimo endereco!");
		else {
			historico.pop();
			JOptionPane.showMessageDialog(null, "Endereco removido com sucesso!");
		}	
	}
	
	public void consultarEndereco(Pilha historico) throws Exception {
		JOptionPane.showMessageDialog(null, historico.top());
	}
}

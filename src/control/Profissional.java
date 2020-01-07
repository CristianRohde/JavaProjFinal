package control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import javax.swing.JOptionPane;
import view.TCadastrarProfissional;

public class Profissional implements Salud {
	static String caminhoProfissional = new File("").getAbsolutePath() + "\\PASTASCristian\\CadastroProfissional.txt";

	public Profissional(String tipo, String nomeProf, String matricula2, String equipe2, String senha2) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoProfissional, true));
			bw.write(tipo + "#" + nomeProf + "&" + matricula2 + "*" + equipe2 + ">" + senha2);
			bw.newLine();
			bw.close();
			JOptionPane.showMessageDialog(null, "As Informaçoes foram salvas com sucesso", "CADASTRO FEITO",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "erro");
		}
	}

	public void localizarProfissional(String nomeProfissional) {
		String tipoDeProfesional;
		String nome = null;
		String matricula;
		String equipe;
		String senha;
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoProfissional));
			String linha;
			int cont = 0;
			while (br.ready()) {
				linha = br.readLine();
				if (nome.equalsIgnoreCase(nomeProfissional)) {
					tipoDeProfesional = linha.substring(0, linha.indexOf("#"));
					nome = linha.substring(linha.indexOf("#") + 1, linha.indexOf("&"));
					matricula = linha.substring(linha.indexOf("&") + 1, linha.indexOf("*"));
					equipe = linha.substring(linha.indexOf("*") + 1, linha.indexOf(">"));
					senha = linha.substring(linha.indexOf(">") + 1, linha.length());
					cont++;
				}
			}
			if (cont == 0) {
				JOptionPane.showMessageDialog(null, "O nome não foi encontrado no Arquivo ", "  REPOSTA",
						JOptionPane.ERROR_MESSAGE);
			}
			br.readLine();
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
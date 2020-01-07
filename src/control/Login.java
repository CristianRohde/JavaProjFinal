package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import view.TInicial;
import view.TLogin;

public class Login {

	private boolean confirmar = false;

	static String caminhoProfissional = new File("").getAbsolutePath() + "\\PASTASCristian\\CadastroProfissional.txt";

	public boolean verificarLogin(String nomeP, String senhaP) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoProfissional));
			String linha;

			int cont = 0;
			while (br.ready()) {
				linha = br.readLine();
				String nome = linha.substring(linha.indexOf("#") + 1, linha.indexOf("&"));
				String senha = linha.substring(linha.indexOf(">") + 1, linha.length());
				if (nome.equalsIgnoreCase(nomeP) && senha.equals(senhaP)) {

					confirmar = true;
					break;
				}
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return confirmar;
	}
}
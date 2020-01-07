package control;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import view.TExamen;
import view.TPaciente;

public class Paciente {

	private String nome;
	private String identidade;
	private String endereco;
	private String telefone;
	private String email;
	private String idade;
	private String dum;
	private String dpp;
	private String doenca;
	private String numGestacoes, risco, tipoGravidez, filhos, peso1, peso2, peso3, data1, data2, data3, data4, data5,
			data6, data7, data8, data9, data10, data11;
	private String agendamento;

	private static String caminhoPaciente = new File("").getAbsolutePath() + "\\PASTASCristian\\CadastroPaciente.txt";
	private static String caminhoEditarPaciente = new File("").getAbsolutePath()
			+ "\\PASTASCristian\\EdicaoPaciente.txt";
	private static String caminhoExamen = new File("").getAbsolutePath() + "\\PASTASCristian\\ExamenPaciente.txt";
	private static String caminhoEditarExamen = new File("").getAbsolutePath()
			+ "\\PASTASCristian\\EditarExamenPaciente.txt";
	private static String caminhoProfissional = new File("").getAbsolutePath()
			+ "\\PASTASCristian\\CadastroProfissional.txt";
	static String caminhoEitarProfissional = new File("").getAbsolutePath()
			+ "\\PASTASCristian\\EditarProfissional.txt";

	public void verificarArquivoTxt() {
		try {
			File arquivo = new File(caminhoPaciente);
			if (arquivo.exists()) {
			} else if (arquivo.createNewFile()) {
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			File arquivo = new File(caminhoEditarPaciente);
			if (arquivo.exists()) {
			} else if (arquivo.createNewFile()) {
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			File arquivo = new File(caminhoExamen);
			if (arquivo.exists()) {
			} else if (arquivo.createNewFile()) {
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			File arquivo = new File(caminhoEditarExamen);
			if (arquivo.exists()) {
			} else if (arquivo.createNewFile()) {
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			File arquivo = new File(caminhoProfissional);
			if (arquivo.exists()) {
			} else if (arquivo.createNewFile()) {
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			File arquivo = new File(caminhoEitarProfissional);
			if (arquivo.exists()) {
			} else if (arquivo.createNewFile()) {
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void cadastroPaciente(String nome, String identidade, String endereco, String telefone, String email,
			String idade, String dum, String dpp, String doenca, String numGestacoes, String risco, String tipoGravidez,
			String filhos, String peso1, String peso2, String peso3, String data1, String data2, String data3,
			String data4, String data5, String data6, String data7, String data8, String data9, String data10,
			String data11) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoPaciente, true));
			bw.write(nome + "#" + identidade + "&" + endereco + "}" + telefone + ">" + email + "<" + idade + ";" + dum
					+ ":" + dpp + "{" + doenca + "]" + numGestacoes + "=" + risco + "[" + tipoGravidez + "?" + filhos
					+ "¡" + peso1 + "¿" + peso2 + "+" + peso3 + "´" + data1 + "*" + data2 + "_" + data3 + "|" + data4
					+ "°" + data5 + "!" + data6 + "&%" + data7 + "^" + data8 + "¬" + data9 + "`" + data10 + "$#"
					+ data11);
			bw.newLine();
			bw.close();
			JOptionPane.showMessageDialog(null, "As Informaçoes foram salvas com sucesso", "CADASTRO FEITO",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void editarPaciente(String nome2, String identidade2, String endereco2, String telefone2, String email2,
			String idade2, String dum2, String dpp2, String doenca2, String numGestacoes2, String risco2,
			String tipoGravidez2, String filhos2, String peso12, String peso22, String peso32, String data1,
			String data2, String data3, String data4, String data5, String data6, String data7, String data8,
			String data9, String data10, String data11) {
		int cont = 0;
		try {
			BufferedReader arq1 = new BufferedReader(new FileReader(caminhoPaciente));
			BufferedWriter arq2 = new BufferedWriter(new FileWriter(caminhoEditarPaciente));
			String linha;

			while (arq1.ready()) {
				linha = arq1.readLine();
				String identidadeP = linha.substring(linha.indexOf("#") + 1, linha.indexOf("&"));
				if (identidadeP.equalsIgnoreCase(identidade2)) {
					cont++;
				} else {
					arq2.write(linha);
					arq2.newLine();
				}
			}
			arq1.close();
			arq2.close();
			BufferedReader arq3 = new BufferedReader(new FileReader(caminhoEditarPaciente));
			BufferedWriter arq4 = new BufferedWriter(new FileWriter(caminhoPaciente));
			String linha1;
			if (cont > 0) {
				System.out.println("Nome achado e Excluido!!!\n");// tirar
			} else
				JOptionPane.showMessageDialog(null, "A Identidade NÃO foi achado no Cadastro ", "  REPOSTA",
						JOptionPane.ERROR_MESSAGE);

			while (arq3.ready()) {
				linha1 = arq3.readLine();
				arq4.write(linha1);
				arq4.newLine();
			}
			arq3.close();
			arq4.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		if (cont > 0) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoPaciente, true));
				bw.write(nome2 + "#" + identidade2 + "&" + endereco2 + "}" + telefone2 + ">" + email2 + "<" + idade2
						+ ";" + dum2 + ":" + dpp2 + "{" + doenca2 + "]" + numGestacoes2 + "=" + risco2 + "["
						+ tipoGravidez2 + "?" + filhos2 + "¡" + peso12 + "¿" + peso22 + "+" + peso32 + "´" + data1 + "*"
						+ data2 + "_" + data3 + "|" + data4 + "°" + data5 + "!" + data6 + "&%" + data7 + "^" + data8
						+ "¬" + data9 + "`" + data10 + "$#" + data11);

				bw.newLine();
				bw.close();
				JOptionPane.showMessageDialog(null, "As Informaçoes foram salvas com sucesso", "CADASTRO FEITO",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

	public boolean localizarPaciente(String identidadePaciente) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoPaciente));
			String linha;
			int cont = 0;
			System.out.println("Procurando Nome no Arquivo Paciente !!!\n");
			while (br.ready()) {
				linha = br.readLine();
				String identidadeP = linha.substring(linha.indexOf("#") + 1, linha.indexOf("&"));
				if (identidadeP.equalsIgnoreCase(identidadePaciente)) {
					nome = linha.substring(0, linha.indexOf("#"));
					identidade = linha.substring(linha.indexOf("#") + 1, linha.indexOf("&"));
					endereco = linha.substring(linha.indexOf("&") + 1, linha.indexOf("}"));
					telefone = linha.substring(linha.indexOf("}") + 1, linha.indexOf(">"));
					email = linha.substring(linha.indexOf(">") + 1, linha.indexOf("<"));
					idade = linha.substring(linha.indexOf("<") + 1, linha.indexOf(";"));
					dum = linha.substring(linha.indexOf(";") + 1, linha.indexOf(":"));
					dpp = linha.substring(linha.indexOf(":") + 1, linha.indexOf("{"));
					doenca = linha.substring(linha.indexOf("{") + 1, linha.indexOf("]"));
					numGestacoes = linha.substring(linha.indexOf("]") + 1, linha.indexOf("="));
					risco = linha.substring(linha.indexOf("=") + 1, linha.indexOf("["));
					tipoGravidez = linha.substring(linha.indexOf("[") + 1, linha.indexOf("?"));
					filhos = linha.substring(linha.indexOf("?") + 1, linha.indexOf("¡"));
					peso1 = linha.substring(linha.indexOf("¡") + 1, linha.indexOf("¿"));
					peso2 = linha.substring(linha.indexOf("¿") + 1, linha.indexOf("+"));
					peso3 = linha.substring(linha.indexOf("+") + 1, linha.indexOf("´"));
					data1 = linha.substring(linha.indexOf("´") + 1, linha.indexOf("*"));
					data2 = linha.substring(linha.indexOf("*") + 1, linha.indexOf("_"));
					data3 = linha.substring(linha.indexOf("_") + 1, linha.indexOf("|"));
					data4 = linha.substring(linha.indexOf("|") + 1, linha.indexOf("°"));
					data5 = linha.substring(linha.indexOf("°") + 1, linha.indexOf("!"));
					data6 = linha.substring(linha.indexOf("!") + 1, linha.indexOf("&%"));
					data7 = linha.substring(linha.indexOf("&%") + 2, linha.indexOf("^"));
					data8 = linha.substring(linha.indexOf("^") + 1, linha.indexOf("¬"));
					data9 = linha.substring(linha.indexOf("¬") + 1, linha.indexOf("`"));
					data10 = linha.substring(linha.indexOf("`") + 1, linha.indexOf("$#"));
					data11 = linha.substring(linha.indexOf("$#") + 2, linha.length());

					cont++;
				}
			}
			if (cont == 0) {
				JOptionPane.showMessageDialog(null, "O nome não foi encontrado no Arquivo ", "  REPOSTA",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
			br.readLine();
			br.close();

		} catch (IOException e) {
			System.out.println(e);
		}
		return true;
	}

	public void excluirProfesional(String matricula) {
		try {
			BufferedReader arq1 = new BufferedReader(new FileReader(caminhoProfissional));
			BufferedWriter arq2 = new BufferedWriter(new FileWriter(caminhoEitarProfissional));
			String linha;
			int cont = 0;
			while (arq1.ready()) {
				linha = arq1.readLine();
				String identidadeE = linha.substring(linha.indexOf("&") + 1, linha.indexOf("*"));
				if (identidadeE.equalsIgnoreCase(matricula)) {
					cont++;
				} else {
					arq2.write(linha);
					arq2.newLine();
				}
			}
			arq1.close();
			arq2.close();
			BufferedReader arq3 = new BufferedReader(new FileReader(caminhoEitarProfissional));
			BufferedWriter arq4 = new BufferedWriter(new FileWriter(caminhoProfissional));
			String linha1;
			if (cont > 0) {
				JOptionPane.showMessageDialog(null, "Examen achado e Excluido !!!", "  REPOSTA",
						JOptionPane.INFORMATION_MESSAGE);
			} else
				JOptionPane.showMessageDialog(null, "A Identidade NÃO foi achado no Cadastro Exames ", "  REPOSTA",
						JOptionPane.ERROR_MESSAGE);

			while (arq3.ready()) {
				linha1 = arq3.readLine();
				arq4.write(linha1);
				arq4.newLine();
			}
			arq3.close();
			arq4.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public void excluirPaciente(String identidadePaciente) {
		try {
			BufferedReader arq1 = new BufferedReader(new FileReader(caminhoExamen));
			BufferedWriter arq2 = new BufferedWriter(new FileWriter(caminhoEditarExamen));
			String linha;
			int cont = 0;
			while (arq1.ready()) {
				linha = arq1.readLine();
				String identidadeE = linha.substring(0, linha.indexOf(">"));
				if (identidadeE.equalsIgnoreCase(identidadePaciente)) {
					cont++;
				} else {
					arq2.write(linha);
					arq2.newLine();
				}
			}
			arq1.close();
			arq2.close();
			BufferedReader arq3 = new BufferedReader(new FileReader(caminhoEditarExamen));
			BufferedWriter arq4 = new BufferedWriter(new FileWriter(caminhoExamen));
			String linha1;
			if (cont > 0) {
				JOptionPane.showMessageDialog(null, "Examen achado e Excluido !!!", "  REPOSTA",
						JOptionPane.INFORMATION_MESSAGE);
			} else
				JOptionPane.showMessageDialog(null, "A Identidade NÃO foi achado no Cadastro Exames ", "  REPOSTA",
						JOptionPane.ERROR_MESSAGE);

			while (arq3.ready()) {
				linha1 = arq3.readLine();
				arq4.write(linha1);
				arq4.newLine();
			}
			arq3.close();
			arq4.close();

		} catch (IOException e) {
			System.out.println(e);
		}

		try {
			BufferedReader arq1 = new BufferedReader(new FileReader(caminhoPaciente));
			BufferedWriter arq2 = new BufferedWriter(new FileWriter(caminhoEditarPaciente));
			String linha;
			int cont = 0;
			while (arq1.ready()) {
				linha = arq1.readLine();
				String identidadeP = linha.substring(linha.indexOf("#") + 1, linha.indexOf("&"));
				if (identidadeP.equalsIgnoreCase(identidadePaciente)) {
					cont++;
				} else {
					arq2.write(linha);
					arq2.newLine();
				}
			}
			arq1.close();
			arq2.close();
			BufferedReader arq3 = new BufferedReader(new FileReader(caminhoEditarPaciente));
			BufferedWriter arq4 = new BufferedWriter(new FileWriter(caminhoPaciente));
			String linha1;
			if (cont > 0) {
				JOptionPane.showMessageDialog(null, "Paciente achado e Excluido !!!", "  REPOSTA",
						JOptionPane.INFORMATION_MESSAGE);
			} else
				JOptionPane.showMessageDialog(null, "A Identidade NÃO foi achado no Cadastro ", "  REPOSTA",
						JOptionPane.ERROR_MESSAGE);

			while (arq3.ready()) {
				linha1 = arq3.readLine();
				arq4.write(linha1);
				arq4.newLine();
			}
			arq3.close();
			arq4.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getDum() {
		return dum;
	}

	public void setDum(String dum) {
		this.dum = dum;
	}

	public String getDpp() {
		return dpp;
	}

	public void setDpp(String dpp) {
		this.dpp = dpp;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getNumGestacoes() {
		return numGestacoes;
	}

	public void setNumGestacoes(String numGestacoes) {
		this.numGestacoes = numGestacoes;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public String getTipoGravidez() {
		return tipoGravidez;
	}

	public void setTipoGravidez(String tipoGravidez) {
		this.tipoGravidez = tipoGravidez;
	}

	public String getFilhos() {
		return filhos;
	}

	public void setFilhos(String filhos) {
		this.filhos = filhos;
	}

	public String getPeso1() {
		return peso1;
	}

	public void setPeso1(String peso1) {
		this.peso1 = peso1;
	}

	public String getPeso2() {
		return peso2;
	}

	public void setPeso2(String peso2) {
		this.peso2 = peso2;
	}

	public String getPeso3() {
		return peso3;
	}

	public void setPeso3(String peso3) {
		this.peso3 = peso3;
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}

	public String getData4() {
		return data4;
	}

	public void setData4(String data4) {
		this.data4 = data4;
	}

	public String getData5() {
		return data5;
	}

	public void setData5(String data5) {
		this.data5 = data5;
	}

	public String getData6() {
		return data6;
	}

	public void setData6(String data6) {
		this.data6 = data6;
	}

	public String getData7() {
		return data7;
	}

	public void setData7(String data7) {
		this.data7 = data7;
	}

	public String getData8() {
		return data8;
	}

	public void setData8(String data8) {
		this.data8 = data8;
	}

	public String getData9() {
		return data9;
	}

	public void setData9(String data9) {
		this.data9 = data9;
	}

	public String getData10() {
		return data10;
	}

	public void setData10(String data10) {
		this.data10 = data10;
	}

	public String getData11() {
		return data11;
	}

	public void setData11(String data11) {
		this.data11 = data11;
	}
}
package control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import javax.swing.JOptionPane;

import view.TRelatorio;

public class Relatorio {
	private static String caminhoPaciente = new File("").getAbsolutePath() + "\\PASTASCristian\\CadastroPaciente.txt";
	private static String caminhoEditarPaciente = new File("").getAbsolutePath()
			+ "\\PASTASCristian\\EdicaoPaciente.txt";
	private static String caminhoExamen = new File("").getAbsolutePath() + "\\PASTASCristian\\ExamenPaciente.txt";
	private static String caminhoEditarExamen = new File("").getAbsolutePath()
			+ "\\PASTASCristian\\EditarExamenPaciente.txt";

	String mes;
	String conPartos;
	String conPacientes;
	String conAltoRisco;
	String conMenorIdade;
	String conAbo;
	String conHemograma;
	String conGlicemia;
	String conUsg;
	String conUrinaEas;
	String conSifilis;
	String conHiv;
	String conHepatite;
	String conUrinocultura;
	String conToxoplasmose;
	String conCitopatologico;
	String conTotg;

	public void verificarPartos(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoPaciente));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				mes = linha.substring(linha.indexOf(":") + 4, linha.indexOf("{") - 5);
				if (mes.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conPartos = Integer.toString(cont);
	}

	public void verificarPacientes(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoPaciente));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf(";") + 3, linha.indexOf(":") - 5);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}

			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conPacientes = Integer.toString(cont);
	}

	public void altoRisco(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoPaciente));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf(";") + 3, linha.indexOf(":") - 5);
				if (pac.equalsIgnoreCase(mesHoje)) {
					String ris = linha.substring(linha.indexOf("=") + 1, linha.indexOf("["));
					System.out.println();

					if (ris.equalsIgnoreCase("Alto")) {
						cont++;
					}
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conAltoRisco = Integer.toString(cont);
	}

	public void menorIdade(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoPaciente));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf(";") + 3, linha.indexOf(":") - 5);
				if (pac.equalsIgnoreCase(mesHoje)) {
					int ida = Integer.parseInt(linha.substring(linha.indexOf("<") + 1, linha.indexOf(";")));
					System.out.println();

					if (ida < 18) {
						cont++;
					}
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conMenorIdade = Integer.toString(cont);
	}

	public void abo(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("{<") + 5, linha.indexOf("¿>") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conAbo = Integer.toString(cont);
	}

	public void hemograma(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("#&") + 5, linha.indexOf("[%") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conHemograma = Integer.toString(cont);
	}

	public void glicemia(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("!>") + 5, linha.indexOf("<<") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conGlicemia = Integer.toString(cont);
	}

	public void usg(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("##") + 5, linha.indexOf("$!") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conUsg = Integer.toString(cont);
	}

	public void urinaEas(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("$$") + 5, linha.indexOf("(!") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conUrinaEas = Integer.toString(cont);
	}

	public void sifilis(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("((") + 5, linha.indexOf("`?") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conSifilis = Integer.toString(cont);
	}

	public void hiv(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("``") + 5, linha.indexOf(")%") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conHiv = Integer.toString(cont);
	}

	public void hepatite(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("))") + 5, linha.indexOf("!_") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conHepatite = Integer.toString(cont);
	}

	public void urinocultura(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("¡¡") + 5, linha.indexOf("_´") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conUrinocultura = Integer.toString(cont);
	}

	public void toxoplasmose(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("|¿") + 5, linha.indexOf("||") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conToxoplasmose = Integer.toString(cont);
	}

	public void citopatologico(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("!!") + 5, linha.indexOf("¡!") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conCitopatologico = Integer.toString(cont);
	}

	public void totg(String mesHoje) {
		int cont = 0;
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			while (bre.ready()) {
				linha = bre.readLine();
				String pac = linha.substring(linha.indexOf("?¡") + 5, linha.indexOf("??") - 5);
				System.out.println(pac);
				if (pac.equalsIgnoreCase(mesHoje)) {
					cont++;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		conTotg = Integer.toString(cont);
	}

	public String getConMenorIdade() {
		return conMenorIdade;
	}

	public void setConMenorIdade(String conMenorIdade) {
		this.conMenorIdade = conMenorIdade;
	}

	public String getConPacientes() {
		return conPacientes;
	}

	public void setConPacientes(String conPacientes) {
		this.conPacientes = conPacientes;
	}

	public String getConPartos() {
		return conPartos;
	}

	public void setConPartos(String conPartos) {
		this.conPartos = conPartos;
	}

	public String getConAltoRisco() {
		return conAltoRisco;
	}

	public void setConAltoRisco(String conAltoRisco) {
		this.conAltoRisco = conAltoRisco;
	}

	public String getConHepatite() {
		return conHepatite;
	}

	public void setConHepatite(String conHepatite) {
		this.conHepatite = conHepatite;
	}

	public String getConHiv() {
		return conHiv;
	}

	public void setConHiv(String conHiv) {
		this.conHiv = conHiv;
	}

	public String getConSifilis() {
		return conSifilis;
	}

	public void setConSifilis(String conSifilis) {
		this.conSifilis = conSifilis;
	}

	public String getConUrinaEas() {
		return conUrinaEas;
	}

	public void setConUrinaEas(String conUrinaEas) {
		this.conUrinaEas = conUrinaEas;
	}

	public String getConUsg() {
		return conUsg;
	}

	public void setConUsg(String conUsg) {
		this.conUsg = conUsg;
	}

	public String getConGlicemia() {
		return conGlicemia;
	}

	public void setConGlicemia(String conGlicemia) {
		this.conGlicemia = conGlicemia;
	}

	public String getConHemograma() {
		return conHemograma;
	}

	public void setConHemograma(String conHemograma) {
		this.conHemograma = conHemograma;
	}

	public String getConAbo() {
		return conAbo;
	}

	public void setConAbo(String conAbo) {
		this.conAbo = conAbo;
	}

	public String getConTotg() {
		return conTotg;
	}

	public void setConTotg(String conTotg) {
		this.conTotg = conTotg;
	}

	public String getConCitopatologico() {
		return conCitopatologico;
	}

	public void setConCitopatologico(String conCitopatologico) {
		this.conCitopatologico = conCitopatologico;
	}

	public String getConToxoplasmose() {
		return conToxoplasmose;
	}

	public void setConToxoplasmose(String conToxoplasmose) {
		this.conToxoplasmose = conToxoplasmose;
	}

	public String getConUrinocultura() {
		return conUrinocultura;
	}

	public void setConUrinocultura(String conUrinocultura) {
		this.conUrinocultura = conUrinocultura;
	}
}

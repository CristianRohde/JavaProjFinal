package control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Examen {
	private String abo1T;
	private String dataAbo1t;
	private String hbHt1T;
	private String dataHbHt1t;
	private String glisemia1t;
	private String dataGlisemia1t;
	private String usg1t_1;
	private String usg1t_2;
	private String dataUsg1t;
	private String urinaEas1T;
	private String dataUrinaEas1t;
	private String sifilis1t;
	private String dataSifilis1t;
	private String hiv1t;
	private String dataHiv1t;
	private String hepatite1t;
	private String dataHepatite1t;
	private String citopatologico1t;
	private String dataCitopatologico1t;
	private String urinocultura1t;
	private String dataUrinocultura1t;
	private String toxoplasmoseIgm1T;
	private String toxoplasmoseIgh1T;
	private String dataToxoplasmose1t;
	private String basal2t;
	private String dataTotg2t;
	private String b602t;
	private String b1202t;
	private String sifilis2t;
	private String dataSifilis2t;
	private String hiv2t;
	private String dataHiv2t;
	private String hepatite2t;
	private String dataHepatite2t;
	private String hbHt3T;
	private String dataHbHt3t;
	private String glisemia3t;
	private String dataGlisemia3t;
	private String urinaEas3T;
	private String dataUrinaEas3t;
	private String sifilis3t;
	private String dataSifilis3t;
	private String hiv3t;
	private String dataHiv3t;
	private String hepatite3t;
	private String dataHepatite3t;

	private static String caminhoExamen = new File("").getAbsolutePath() + "\\PASTASCristian\\ExamenPaciente.txt";
	private static String caminhoEditarExamen = new File("").getAbsolutePath()
			+ "\\PASTASCristian\\EditarExamenPaciente.txt";

	public void cadastrarExamen(String identidade, String abo1t2, String dataAbo1T2, String hbHt1T2, String dataHbHt1T2,
			String glisemia1t2, String dataGlisemia1T2, String usg1t_12, String usg1t_22, String dataUsg1T2,
			String urinaEas1T2, String dataUrinaEas1T2, String sifilis1t2, String dataSifilis1T2, String hiv1t2,
			String dataHiv1T2, String hepatite1t2, String dataHepatite1T2, String citopatologico1t2,
			String dataCitopatologico1T2, String urinocultura1t2, String dataUrinocultura1T2, String toxoplasmoseIgm1T2,
			String toxoplasmoseIgh1T2, String dataToxoplasmose1T2, String basal2t2, String dataTotg2T2, String b602t2,
			String b1202t2, String sifilis2t2, String dataSifilis2T2, String hiv2t2, String dataHiv2T2,
			String hepatite2t2, String dataHepatite2T2, String hbHt3T2, String dataHbHt3T2, String glisemia3t2,
			String dataGlisemia3T2, String urinaEas3T2, String dataUrinaEas3T2, String sifilis3t2,
			String dataSifilis3T2, String hiv3t2, String dataHiv3T2, String hepatite3t2, String dataHepatite3T2) {

		try {
			BufferedWriter bwe = new BufferedWriter(new FileWriter(caminhoExamen, true));
			bwe.write(identidade + ">" + abo1t2 + "{<" + dataAbo1T2 + "¿>" + hbHt1T2 + "#&" + dataHbHt1T2 + "[%"
					+ glisemia1t2 + "!>" + dataGlisemia1T2 + "<<" + usg1t_12 + "#¡" + usg1t_22 + "##" + dataUsg1T2
					+ "$!" + urinaEas1T2 + "$$" + dataUrinaEas1T2 + "(!" + sifilis1t2 + "((" + dataSifilis1T2 + "`?"
					+ hiv1t2 + "``" + dataHiv1T2 + ")%" + hepatite1t2 + "))" + dataHepatite1T2 + "!_"
					+ citopatologico1t2 + "!!" + dataCitopatologico1T2 + "¡!" + urinocultura1t2 + "¡¡"
					+ dataUrinocultura1T2 + "_´" + toxoplasmoseIgm1T2 + "__" + toxoplasmoseIgh1T2 + "|¿"
					+ dataToxoplasmose1T2 + "||" + basal2t2 + "?¡" + dataTotg2T2 + "??" + b602t2 + "¿!" + b1202t2 + "¿¿"
					+ sifilis2t2 + "}" + dataSifilis2T2 + "}}" + hiv2t2 + "[#" + dataHiv2T2 + "[[" + hepatite2t2 + "]"
					+ dataHepatite2T2 + "]]" + hbHt3T2 + "´$" + dataHbHt3T2 + "´´" + glisemia3t2 + "*" + dataGlisemia3T2
					+ "**" + urinaEas3T2 + "~" + dataUrinaEas3T2 + "~~" + sifilis3t2 + "^#" + dataSifilis3T2 + "^^"
					+ hiv3t2 + "¬{" + dataHiv3T2 + "¬¬" + hepatite3t2 + "!#" + dataHepatite3T2);
			bwe.newLine();
			bwe.close();
			JOptionPane.showMessageDialog(null, "As Informaçoes foram salvas com sucesso", "EXAMENS SALVOS",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public boolean localizarExamen(String identidadePaciente) {
		try {
			BufferedReader bre = new BufferedReader(new FileReader(caminhoExamen));
			String linha;
			System.out.println("Procurando Nome no Arquivo dos Examens!!!\n");
			while (bre.ready()) {
				linha = bre.readLine();
				String identidadeE = linha.substring(0, linha.indexOf(">"));
				if (identidadeE.equalsIgnoreCase(identidadePaciente)) {
					abo1T = linha.substring(linha.indexOf(">") + 1, linha.indexOf("{<"));
					dataAbo1t = linha.substring(linha.indexOf("{<") + 2, linha.indexOf("¿>"));
					hbHt1T = linha.substring(linha.indexOf("¿>") + 2, linha.indexOf("#&"));
					dataHbHt1t = linha.substring(linha.indexOf("#&") + 2, linha.indexOf("[%"));
					glisemia1t = linha.substring(linha.indexOf("[%") + 2, linha.indexOf("!>"));
					dataGlisemia1t = linha.substring(linha.indexOf("!>") + 2, linha.indexOf("<<"));
					usg1t_1 = linha.substring(linha.indexOf("<<") + 2, linha.indexOf("#¡"));
					usg1t_2 = linha.substring(linha.indexOf("#¡") + 2, linha.indexOf("##"));
					dataUsg1t = linha.substring(linha.indexOf("##") + 2, linha.indexOf("$!"));
					urinaEas1T = linha.substring(linha.indexOf("$!") + 2, linha.indexOf("$$"));
					dataUrinaEas1t = linha.substring(linha.indexOf("$$") + 2, linha.indexOf("(!"));
					sifilis1t = linha.substring(linha.indexOf("(!") + 2, linha.indexOf("(("));
					dataSifilis1t = linha.substring(linha.indexOf("((") + 2, linha.indexOf("`?"));
					hiv1t = linha.substring(linha.indexOf("`?") + 2, linha.indexOf("``"));
					dataHiv1t = linha.substring(linha.indexOf("``") + 2, linha.indexOf(")%"));
					hepatite1t = linha.substring(linha.indexOf(")%") + 2, linha.indexOf("))"));
					dataHepatite1t = linha.substring(linha.indexOf("))") + 2, linha.indexOf("!_"));
					citopatologico1t = linha.substring(linha.indexOf("!_") + 2, linha.indexOf("!!"));
					dataCitopatologico1t = linha.substring(linha.indexOf("!!") + 2, linha.indexOf("¡!"));
					urinocultura1t = linha.substring(linha.indexOf("¡!") + 2, linha.indexOf("¡¡"));
					dataUrinocultura1t = linha.substring(linha.indexOf("¡¡") + 2, linha.indexOf("_´"));
					toxoplasmoseIgm1T = linha.substring(linha.indexOf("_´") + 2, linha.indexOf("__"));
					toxoplasmoseIgh1T = linha.substring(linha.indexOf("__") + 2, linha.indexOf("|¿"));
					dataToxoplasmose1t = linha.substring(linha.indexOf("|¿") + 2, linha.indexOf("||"));
					basal2t = linha.substring(linha.indexOf("||") + 2, linha.indexOf("?¡"));
					dataTotg2t = linha.substring(linha.indexOf("?¡") + 2, linha.indexOf("??"));
					b602t = linha.substring(linha.indexOf("??") + 2, linha.indexOf("¿!"));
					b1202t = linha.substring(linha.indexOf("¿!") + 2, linha.indexOf("¿¿"));
					sifilis2t = linha.substring(linha.indexOf("¿¿") + 2, linha.indexOf("}"));
					dataSifilis2t = linha.substring(linha.indexOf("}") + 1, linha.indexOf("}}"));
					hiv2t = linha.substring(linha.indexOf("}}") + 2, linha.indexOf("[#"));
					dataHiv2t = linha.substring(linha.indexOf("[#") + 2, linha.indexOf("[["));
					hepatite2t = linha.substring(linha.indexOf("[[") + 2, linha.indexOf("]"));
					dataHepatite2t = linha.substring(linha.indexOf("]") + 1, linha.indexOf("]]"));
					hbHt3T = linha.substring(linha.indexOf("]]") + 2, linha.indexOf("´$"));
					dataHbHt3t = linha.substring(linha.indexOf("´$") + 2, linha.indexOf("´´"));
					glisemia3t = linha.substring(linha.indexOf("´´") + 2, linha.indexOf("*"));
					dataGlisemia3t = linha.substring(linha.indexOf("*") + 1, linha.indexOf("**"));
					urinaEas3T = linha.substring(linha.indexOf("**") + 2, linha.indexOf("~"));
					dataUrinaEas3t = linha.substring(linha.indexOf("~") + 1, linha.indexOf("~~"));
					sifilis3t = linha.substring(linha.indexOf("~~") + 2, linha.indexOf("^#"));
					dataSifilis3t = linha.substring(linha.indexOf("^#") + 2, linha.indexOf("^^"));
					hiv3t = linha.substring(linha.indexOf("^^") + 2, linha.indexOf("¬{"));
					dataHiv3t = linha.substring(linha.indexOf("¬{") + 2, linha.indexOf("¬¬"));
					hepatite3t = linha.substring(linha.indexOf("¬¬") + 2, linha.indexOf("!#"));
					dataHepatite3t = linha.substring(linha.indexOf("!#") + 2, linha.length());

					break;
				}
			}
			bre.readLine();
			bre.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return true;
	}

	public void editarExames(String identidade, String abo1t2, String dataAbo1T2, String hbHt1T2, String dataHbHt1T2,
			String glisemia1t2, String dataGlisemia1T2, String usg1t_12, String usg1t_22, String dataUsg1T2,
			String urinaEas1T2, String dataUrinaEas1T2, String sifilis1t2, String dataSifilis1T2, String hiv1t2,
			String dataHiv1T2, String hepatite1t2, String dataHepatite1T2, String citopatologico1t2,
			String dataCitopatologico1T2, String urinocultura1t2, String dataUrinocultura1T2, String toxoplasmoseIgm1T2,
			String toxoplasmoseIgh1T2, String dataToxoplasmose1T2, String basal2t2, String dataTotg2T2, String b602t2,
			String b1202t2, String sifilis2t2, String dataSifilis2T2, String hiv2t2, String dataHiv2T2,
			String hepatite2t2, String dataHepatite2T2, String hbHt3T2, String dataHbHt3T2, String glisemia3t2,
			String dataGlisemia3T2, String urinaEas3T2, String dataUrinaEas3T2, String sifilis3t2,
			String dataSifilis3T2, String hiv3t2, String dataHiv3T2, String hepatite3t2, String dataHepatite3T2) {
		int cont = 0;
		try {
			BufferedReader arq1 = new BufferedReader(new FileReader(caminhoExamen));
			BufferedWriter arq2 = new BufferedWriter(new FileWriter(caminhoEditarExamen));
			String linha;

			while (arq1.ready()) {
				linha = arq1.readLine();
				String identidadeP = linha.substring(0, linha.indexOf(">"));
				if (identidadeP.equalsIgnoreCase(identidade)) {
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
				System.out.println("Nome achado e Excluido!!!\n");
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
				BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoExamen, true));
				bw.write(identidade + ">" + abo1t2 + "{<" + dataAbo1T2 + "¿>" + hbHt1T2 + "#&" + dataHbHt1T2 + "[%"
						+ glisemia1t2 + "!>" + dataGlisemia1T2 + "<<" + usg1t_12 + "#¡" + usg1t_22 + "##" + dataUsg1T2
						+ "$!" + urinaEas1T2 + "$$" + dataUrinaEas1T2 + "(!" + sifilis1t2 + "((" + dataSifilis1T2 + "`?"
						+ hiv1t2 + "``" + dataHiv1T2 + ")%" + hepatite1t2 + "))" + dataHepatite1T2 + "!_"
						+ citopatologico1t2 + "!!" + dataCitopatologico1T2 + "¡!" + urinocultura1t2 + "¡¡"
						+ dataUrinocultura1T2 + "_´" + toxoplasmoseIgm1T2 + "__" + toxoplasmoseIgh1T2 + "|¿"
						+ dataToxoplasmose1T2 + "||" + basal2t2 + "?¡" + dataTotg2T2 + "??" + b602t2 + "¿!" + b1202t2
						+ "¿¿" + sifilis2t2 + "}" + dataSifilis2T2 + "}}" + hiv2t2 + "[#" + dataHiv2T2 + "[["
						+ hepatite2t2 + "]" + dataHepatite2T2 + "]]" + hbHt3T2 + "´$" + dataHbHt3T2 + "´´" + glisemia3t2
						+ "*" + dataGlisemia3T2 + "**" + urinaEas3T2 + "~" + dataUrinaEas3T2 + "~~" + sifilis3t2 + "^#"
						+ dataSifilis3T2 + "^^" + hiv3t2 + "¬{" + dataHiv3T2 + "¬¬" + hepatite3t2 + "!#"
						+ dataHepatite3T2);
				bw.newLine();
				bw.close();
				JOptionPane.showMessageDialog(null, "As Informaçoes foram salvas com sucesso", "EDIçAO FEITA",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

	public String getDataAbo1t() {
		return dataAbo1t;
	}

	public void setDataAbo1t(String dataAbo1t) {
		this.dataAbo1t = dataAbo1t;
	}

	public String getDataHbHt1t() {
		return dataHbHt1t;
	}

	public void setDataHbHt1t(String dataHbHt1t) {
		this.dataHbHt1t = dataHbHt1t;
	}

	public String getDataGlisemia1t() {
		return dataGlisemia1t;
	}

	public void setDataGlisemia1t(String dataGlisemia1t) {
		this.dataGlisemia1t = dataGlisemia1t;
	}

	public String getDataUsg1t() {
		return dataUsg1t;
	}

	public void setDataUsg1t(String dataUsg1t) {
		this.dataUsg1t = dataUsg1t;
	}

	public String getDataUrinaEas1t() {
		return dataUrinaEas1t;
	}

	public void setDataUrinaEas1t(String dataUrinaEas1t) {
		this.dataUrinaEas1t = dataUrinaEas1t;
	}

	public String getDataSifilis1t() {
		return dataSifilis1t;
	}

	public void setDataSifilis1t(String dataSifilis1t) {
		this.dataSifilis1t = dataSifilis1t;
	}

	public String getDataHiv1t() {
		return dataHiv1t;
	}

	public void setDataHiv1t(String dataHiv1t) {
		this.dataHiv1t = dataHiv1t;
	}

	public String getDataHepatite1t() {
		return dataHepatite1t;
	}

	public void setDataHepatite1t(String dataHepatite1t) {
		this.dataHepatite1t = dataHepatite1t;
	}

	public String getDataCitopatologico1t() {
		return dataCitopatologico1t;
	}

	public void setDataCitopatologico1t(String dataCitopatologico1t) {
		this.dataCitopatologico1t = dataCitopatologico1t;
	}

	public String getDataUrinocultura1t() {
		return dataUrinocultura1t;
	}

	public void setDataUrinocultura1t(String dataUrinocultura1t) {
		this.dataUrinocultura1t = dataUrinocultura1t;
	}

	public String getDataToxoplasmose1t() {
		return dataToxoplasmose1t;
	}

	public void setDataToxoplasmose1t(String dataToxoplasmose1t) {
		this.dataToxoplasmose1t = dataToxoplasmose1t;
	}

	public String getDataTotg2t() {
		return dataTotg2t;
	}

	public void setDataTotg2t(String dataTotg2t) {
		this.dataTotg2t = dataTotg2t;
	}

	public String getDataSifilis2t() {
		return dataSifilis2t;
	}

	public void setDataSifilis2t(String dataSifilis2t) {
		this.dataSifilis2t = dataSifilis2t;
	}

	public String getDataHiv2t() {
		return dataHiv2t;
	}

	public void setDataHiv2t(String dataHiv2t) {
		this.dataHiv2t = dataHiv2t;
	}

	public String getDataHepatite2t() {
		return dataHepatite2t;
	}

	public void setDataHepatite2t(String dataHepatite2t) {
		this.dataHepatite2t = dataHepatite2t;
	}

	public String getDataHbHt3t() {
		return dataHbHt3t;
	}

	public void setDataHbHt3t(String dataHbHt3t) {
		this.dataHbHt3t = dataHbHt3t;
	}

	public String getDataGlisemia3t() {
		return dataGlisemia3t;
	}

	public void setDataGlisemia3t(String dataGlisemia3t) {
		this.dataGlisemia3t = dataGlisemia3t;
	}

	public String getDataUrinaEas3t() {
		return dataUrinaEas3t;
	}

	public void setDataUrinaEas3t(String dataUrinaEas3t) {
		this.dataUrinaEas3t = dataUrinaEas3t;
	}

	public String getDataSifilis3t() {
		return dataSifilis3t;
	}

	public void setDataSifilis3t(String dataSifilis3t) {
		this.dataSifilis3t = dataSifilis3t;
	}

	public String getDataHiv3t() {
		return dataHiv3t;
	}

	public void setDataHiv3t(String dataHiv3t) {
		this.dataHiv3t = dataHiv3t;
	}

	public String getDataHepatite3t() {
		return dataHepatite3t;
	}

	public void setDataHepatite3t(String dataHepatite3t) {
		this.dataHepatite3t = dataHepatite3t;
	}

	public String getAbo1T() {
		return abo1T;
	}

	public void setAbo1T(String abo1t) {
		abo1T = abo1t;
	}

	public String getHbHt1T() {
		return hbHt1T;
	}

	public void setHbHt1T(String hbHt1T) {
		this.hbHt1T = hbHt1T;
	}

	public String getGlisemia1t() {
		return glisemia1t;
	}

	public void setGlisemia1t(String glisemia1t) {
		this.glisemia1t = glisemia1t;
	}

	public String getUsg1t_1() {
		return usg1t_1;
	}

	public void setUsg1t_1(String usg1t_1) {
		this.usg1t_1 = usg1t_1;
	}

	public String getUsg1t_2() {
		return usg1t_2;
	}

	public void setUsg1t_2(String usg1t_2) {
		this.usg1t_2 = usg1t_2;
	}

	public String getUrinaEas1T() {
		return urinaEas1T;
	}

	public void setUrinaEas1T(String urinaEas1T) {
		this.urinaEas1T = urinaEas1T;
	}

	public String getSifilis1t() {
		return sifilis1t;
	}

	public void setSifilis1t(String sifilis1t) {
		this.sifilis1t = sifilis1t;
	}

	public String getHiv1t() {
		return hiv1t;
	}

	public void setHiv1t(String hiv1t) {
		this.hiv1t = hiv1t;
	}

	public String getHepatite1t() {
		return hepatite1t;
	}

	public void setHepatite1t(String hepatite1t) {
		this.hepatite1t = hepatite1t;
	}

	public String getCitopatologico1t() {
		return citopatologico1t;
	}

	public void setCitopatologico1t(String citopatologico1t) {
		this.citopatologico1t = citopatologico1t;
	}

	public String getUrinocultura1t() {
		return urinocultura1t;
	}

	public void setUrinocultura1t(String urinocultura1t) {
		this.urinocultura1t = urinocultura1t;
	}

	public String getToxoplasmoseIgm1T() {
		return toxoplasmoseIgm1T;
	}

	public void setToxoplasmoseIgm1T(String toxoplasmoseIgm1T) {
		this.toxoplasmoseIgm1T = toxoplasmoseIgm1T;
	}

	public String getToxoplasmoseIgh1T() {
		return toxoplasmoseIgh1T;
	}

	public void setToxoplasmoseIgh1T(String toxoplasmoseIgh1T) {
		this.toxoplasmoseIgh1T = toxoplasmoseIgh1T;
	}

	public String getBasal2t() {
		return basal2t;
	}

	public void setBasal2t(String basal2t) {
		this.basal2t = basal2t;
	}

	public String getB602t() {
		return b602t;
	}

	public void setB602t(String b602t) {
		this.b602t = b602t;
	}

	public String getB1202t() {
		return b1202t;
	}

	public void setB1202t(String b1202t) {
		this.b1202t = b1202t;
	}

	public String getSifilis2t() {
		return sifilis2t;
	}

	public void setSifilis2t(String sifilis2t) {
		this.sifilis2t = sifilis2t;
	}

	public String getHiv2t() {
		return hiv2t;
	}

	public void setHiv2t(String hiv2t) {
		this.hiv2t = hiv2t;
	}

	public String getHepatite2t() {
		return hepatite2t;
	}

	public void setHepatite2t(String hepatite2t) {
		this.hepatite2t = hepatite2t;
	}

	public String getHbHt3T() {
		return hbHt3T;
	}

	public void setHbHt3T(String hbHt3T) {
		this.hbHt3T = hbHt3T;
	}

	public String getGlisemia3t() {
		return glisemia3t;
	}

	public void setGlisemia3t(String glisemia3t) {
		this.glisemia3t = glisemia3t;
	}

	public String getUrinaEas3T() {
		return urinaEas3T;
	}

	public void setUrinaEas3T(String urinaEas3T) {
		this.urinaEas3T = urinaEas3T;
	}

	public String getSifilis3t() {
		return sifilis3t;
	}

	public void setSifilis3t(String sifilis3t) {
		this.sifilis3t = sifilis3t;
	}

	public String getHiv3t() {
		return hiv3t;
	}

	public void setHiv3t(String hiv3t) {
		this.hiv3t = hiv3t;
	}

	public String getHepatite3t() {
		return hepatite3t;
	}

	public void setHepatite3t(String hepatite3t) {
		this.hepatite3t = hepatite3t;
	}

}

package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TRelatorio extends JInternalFrame {
	private JTextField txtPartos;
	private JTextField txtPacientes;
	private JTextField txtMes;
	private JTextField txtAltoRisco;
	private JTextField txtMenorIdade;
	private JTextField txtAbo;
	private JTextField txtHemograma;
	private JTextField txtGlicemia;
	private JTextField txtUSG;
	private JTextField txtUrinaEAS;
	private JTextField txtSifilis;
	private JTextField txtHIV;
	private JTextField txtHepatite;
	private JTextField txtUrinocultura;
	private JTextField txtToxoplasmose;
	private JTextField txtCitopatologico;
	private JTextField txtTotg;

	/**
	 * Create the frame.
	 */
	public TRelatorio() {
		setBounds(0, 0, 1900, 1020);
		setTitle("    RELATORIO");
		getContentPane().setBackground(Color.CYAN);
		((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// para tirar a borda
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1900, 1020);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblCitopatologico = new JLabel("Citopatologico:");
		lblCitopatologico.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCitopatologico.setBounds(1450, 711, 165, 23);
		panel.add(lblCitopatologico);

		txtUrinocultura = new JTextField();
		txtUrinocultura.setEditable(false);
		txtUrinocultura.setHorizontalAlignment(SwingConstants.CENTER);
		txtUrinocultura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUrinocultura.setColumns(10);
		txtUrinocultura.setBounds(1622, 538, 130, 39);
		panel.add(txtUrinocultura);

		txtUrinaEAS = new JTextField();
		txtUrinaEAS.setEditable(false);
		txtUrinaEAS.setHorizontalAlignment(SwingConstants.CENTER);
		txtUrinaEAS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUrinaEAS.setColumns(10);
		txtUrinaEAS.setBounds(1622, 221, 130, 39);
		panel.add(txtUrinaEAS);

		txtHepatite = new JTextField();
		txtHepatite.setEditable(false);
		txtHepatite.setHorizontalAlignment(SwingConstants.CENTER);
		txtHepatite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHepatite.setColumns(10);
		txtHepatite.setBounds(1622, 460, 130, 39);
		panel.add(txtHepatite);

		txtToxoplasmose = new JTextField();
		txtToxoplasmose.setEditable(false);
		txtToxoplasmose.setHorizontalAlignment(SwingConstants.CENTER);
		txtToxoplasmose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtToxoplasmose.setColumns(10);
		txtToxoplasmose.setBounds(1622, 618, 130, 39);
		panel.add(txtToxoplasmose);

		JLabel lblSfilis = new JLabel("S\u00EDfilis:");
		lblSfilis.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSfilis.setBounds(1450, 305, 177, 28);
		panel.add(lblSfilis);

		JLabel lblHepatite = new JLabel("Hepatite:");
		lblHepatite.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHepatite.setBounds(1450, 465, 177, 28);
		panel.add(lblHepatite);

		JLabel lblHiv = new JLabel("HIV:");
		lblHiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHiv.setBounds(1450, 386, 177, 28);
		panel.add(lblHiv);

		JLabel lblUrinaeas = new JLabel("Urina-EAS:");
		lblUrinaeas.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUrinaeas.setBounds(1450, 226, 130, 28);
		panel.add(lblUrinaeas);

		txtCitopatologico = new JTextField();
		txtCitopatologico.setEditable(false);
		txtCitopatologico.setHorizontalAlignment(SwingConstants.CENTER);
		txtCitopatologico.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCitopatologico.setColumns(10);
		txtCitopatologico.setBounds(1622, 703, 130, 39);
		panel.add(txtCitopatologico);

		txtHIV = new JTextField();
		txtHIV.setEditable(false);
		txtHIV.setHorizontalAlignment(SwingConstants.CENTER);
		txtHIV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHIV.setColumns(10);
		txtHIV.setBounds(1622, 381, 130, 39);
		panel.add(txtHIV);

		JLabel lblUrinocultura = new JLabel("Urinocultura:");
		lblUrinocultura.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUrinocultura.setBounds(1450, 546, 177, 23);
		panel.add(lblUrinocultura);

		JLabel lblToxoplasmoseIgmigg = new JLabel("Toxoplasmose:");
		lblToxoplasmoseIgmigg.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblToxoplasmoseIgmigg.setBounds(1450, 626, 177, 23);
		panel.add(lblToxoplasmoseIgmigg);

		txtTotg = new JTextField();
		txtTotg.setEditable(false);
		txtTotg.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotg.setColumns(10);
		txtTotg.setBounds(1622, 784, 130, 39);
		panel.add(txtTotg);

		txtSifilis = new JTextField();
		txtSifilis.setEditable(false);
		txtSifilis.setHorizontalAlignment(SwingConstants.CENTER);
		txtSifilis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSifilis.setColumns(10);
		txtSifilis.setBounds(1622, 300, 130, 39);
		panel.add(txtSifilis);

		JLabel lblTotg = new JLabel("TOTG:");
		lblTotg.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotg.setBounds(1450, 792, 105, 23);
		panel.add(lblTotg);

		JLabel lblRelatorio = new JLabel("RELATORIO");
		lblRelatorio.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblRelatorio.setBounds(836, 13, 250, 51);
		panel.add(lblRelatorio);

		JLabel imgFondoRelatorio = new JLabel("");
		imgFondoRelatorio.setIcon(new ImageIcon(TRelatorio.class.getResource("/imagem/imagemMedic.jpg")));
		imgFondoRelatorio.setBounds(407, 13, 1172, 967);
		panel.add(imgFondoRelatorio);

		JLabel lblNewLabel = new JLabel("Partos:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(28, 226, 130, 28);
		panel.add(lblNewLabel);

		txtPartos = new JTextField();
		txtPartos.setEditable(false);
		txtPartos.setHorizontalAlignment(SwingConstants.CENTER);
		txtPartos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPartos.setBounds(200, 221, 130, 39);
		panel.add(txtPartos);
		txtPartos.setColumns(10);

		JButton button = new JButton("Sair");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(false);
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setBackground(new Color(240, 230, 140));
		button.setBounds(1702, 885, 165, 81);
		panel.add(button);

		JLabel lblPacientes = new JLabel("Pacientes:");
		lblPacientes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPacientes.setBounds(28, 305, 177, 28);
		panel.add(lblPacientes);

		txtPacientes = new JTextField();
		txtPacientes.setEditable(false);
		txtPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		txtPacientes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPacientes.setColumns(10);
		txtPacientes.setBounds(200, 300, 130, 39);
		panel.add(txtPacientes);

		JLabel lblMes = new JLabel("MES:");
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMes.setBounds(227, 76, 63, 28);
		panel.add(lblMes);

		txtMes = new JTextField();
		txtMes.setEditable(false);
		txtMes.setHorizontalAlignment(SwingConstants.CENTER);
		txtMes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMes.setColumns(10);
		txtMes.setBounds(200, 125, 130, 39);
		panel.add(txtMes);

		JLabel lblAltoRisco = new JLabel("Alto Risco:");
		lblAltoRisco.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAltoRisco.setBounds(28, 386, 177, 28);
		panel.add(lblAltoRisco);

		txtAltoRisco = new JTextField();
		txtAltoRisco.setEditable(false);
		txtAltoRisco.setHorizontalAlignment(SwingConstants.CENTER);
		txtAltoRisco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAltoRisco.setColumns(10);
		txtAltoRisco.setBounds(200, 381, 130, 39);
		panel.add(txtAltoRisco);

		JLabel lblMenorIdade = new JLabel("Menor Idade:");
		lblMenorIdade.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMenorIdade.setBounds(28, 465, 177, 28);
		panel.add(lblMenorIdade);

		txtMenorIdade = new JTextField();
		txtMenorIdade.setEditable(false);
		txtMenorIdade.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenorIdade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMenorIdade.setColumns(10);
		txtMenorIdade.setBounds(200, 460, 130, 39);
		panel.add(txtMenorIdade);

		JLabel lblAbo = new JLabel("ABO-RH:");
		lblAbo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAbo.setBounds(28, 546, 105, 23);
		panel.add(lblAbo);

		txtAbo = new JTextField();
		txtAbo.setEditable(false);
		txtAbo.setHorizontalAlignment(SwingConstants.CENTER);
		txtAbo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAbo.setColumns(10);
		txtAbo.setBounds(200, 538, 130, 39);
		panel.add(txtAbo);

		JLabel lblHemograma = new JLabel("Hemograma:");
		lblHemograma.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHemograma.setBounds(28, 626, 160, 23);
		panel.add(lblHemograma);

		txtHemograma = new JTextField();
		txtHemograma.setEditable(false);
		txtHemograma.setHorizontalAlignment(SwingConstants.CENTER);
		txtHemograma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHemograma.setColumns(10);
		txtHemograma.setBounds(200, 618, 130, 39);
		panel.add(txtHemograma);

		JLabel lblGlicemia = new JLabel("Glicemia:");
		lblGlicemia.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGlicemia.setBounds(28, 711, 105, 23);
		panel.add(lblGlicemia);

		txtGlicemia = new JTextField();
		txtGlicemia.setEditable(false);
		txtGlicemia.setHorizontalAlignment(SwingConstants.CENTER);
		txtGlicemia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGlicemia.setColumns(10);
		txtGlicemia.setBounds(200, 703, 130, 39);
		panel.add(txtGlicemia);

		JLabel lblUsg = new JLabel("USG:");
		lblUsg.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsg.setBounds(28, 792, 105, 23);
		panel.add(lblUsg);

		txtUSG = new JTextField();
		txtUSG.setEditable(false);
		txtUSG.setHorizontalAlignment(SwingConstants.CENTER);
		txtUSG.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUSG.setColumns(10);
		txtUSG.setBounds(200, 784, 130, 39);
		panel.add(txtUSG);

	}

	public JTextField getTxtTotg() {
		return txtTotg;
	}

	public void setTxtTotg(JTextField txtTotg) {
		this.txtTotg = txtTotg;
	}

	public JTextField getTxtHemograma() {
		return txtHemograma;
	}

	public void setTxtHemograma(JTextField txtHemograma) {
		this.txtHemograma = txtHemograma;
	}

	public JTextField getTxtGlicemia() {
		return txtGlicemia;
	}

	public void setTxtGlicemia(JTextField txtGlicemia) {
		this.txtGlicemia = txtGlicemia;
	}

	public JTextField getTxtUSG() {
		return txtUSG;
	}

	public void setTxtUSG(JTextField txtUSG) {
		this.txtUSG = txtUSG;
	}

	public JTextField getTxtUrinaEAS() {
		return txtUrinaEAS;
	}

	public void setTxtUrinaEAS(JTextField txtUrinaEAS) {
		this.txtUrinaEAS = txtUrinaEAS;
	}

	public JTextField getTxtSifilis() {
		return txtSifilis;
	}

	public void setTxtSifilis(JTextField txtSifilis) {
		this.txtSifilis = txtSifilis;
	}

	public JTextField getTxtHIV() {
		return txtHIV;
	}

	public void setTxtHIV(JTextField txtHIV) {
		this.txtHIV = txtHIV;
	}

	public JTextField getTxtHepatite() {
		return txtHepatite;
	}

	public void setTxtHepatite(JTextField txtHepatite) {
		this.txtHepatite = txtHepatite;
	}

	public JTextField getTxtUrinocultura() {
		return txtUrinocultura;
	}

	public void setTxtUrinocultura(JTextField txtUrinocultura) {
		this.txtUrinocultura = txtUrinocultura;
	}

	public JTextField getTxtToxoplasmose() {
		return txtToxoplasmose;
	}

	public void setTxtToxoplasmose(JTextField txtToxoplasmose) {
		this.txtToxoplasmose = txtToxoplasmose;
	}

	public JTextField getTxtCitopatologico() {
		return txtCitopatologico;
	}

	public void setTxtCitopatologico(JTextField txtCitopatologico) {
		this.txtCitopatologico = txtCitopatologico;
	}

	public JTextField getTextField_7() {
		return txtTotg;
	}

	public void setTextField_7(JTextField textField_7) {
		this.txtTotg = textField_7;
	}

	public JTextField getTxtAbo() {
		return txtAbo;
	}

	public void setTxtAbo(JTextField txtAbo) {
		this.txtAbo = txtAbo;
	}

	public JTextField getTxtMenorIdade() {
		return txtMenorIdade;
	}

	public void setTxtMenorIdade(JTextField txtMenorIdade) {
		this.txtMenorIdade = txtMenorIdade;
	}

	public JTextField getTxtAltoRisco() {
		return txtAltoRisco;
	}

	public void setTxtAltoRisco(JTextField txtAltoRisco) {
		this.txtAltoRisco = txtAltoRisco;
	}

	public JTextField getTxtPacientes() {
		return txtPacientes;
	}

	public void setTxtPacientes(JTextField txtPacientes) {
		this.txtPacientes = txtPacientes;
	}

	public JTextField getTxtMes() {
		return txtMes;
	}

	public void setTxtMes(JTextField txtMes) {
		this.txtMes = txtMes;
	}

	public JTextField getTxtPartos() {
		return txtPartos;
	}

	public void setTxtPartos(JTextField txtPartos) {
		this.txtPartos = txtPartos;
	}
}

package view;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Examen;
import control.Paciente;
import control.Relatorio;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JSeparator;
import javax.swing.text.MaskFormatter;
import java.awt.Font;
import javax.swing.ImageIcon;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class TPaciente extends JInternalFrame {

	private JTextField txtNomePaciente;
	private JTextField txtIdentidade;
	private JTextField txtEndereco;
	private JTextField txtEmail;
	private JTextField txtIdade;
	private JTextField txtDPP;
	private JTextField txtDoencas;
	private JTextField txtNumGestacoes;
	private JTextField txtFilhos;
	private JButton btnSalvarEdicao;
	private JFormattedTextField txtTelefone;
	private JDateChooser txtDum;
	private JButton btnCadastrarNovoPaciente;
	private TExamen examen;
	private JButton btnLocalizarPac;
	private JTextField txtPeso1Trimestre;
	private JTextField txtPeso2Trimestre;
	private JTextField txtPeso3Trimestre;
	private JComboBox cbxRisco;
	private JComboBox cbxTipoGravidez;
	private JButton btnSalvar;
	private JButton btnExcluirPaciente;
	private JFormattedTextField txtData1;
	private JFormattedTextField txtData2;
	private JFormattedTextField txtData3;
	private JFormattedTextField txtData4;
	private JFormattedTextField txtData5;
	private JFormattedTextField txtData6;
	private JFormattedTextField txtData7;
	private JFormattedTextField txtData8;
	private JFormattedTextField txtData9;
	private JFormattedTextField txtData10;
	private JFormattedTextField txtData11;
	int filas = 0;
	private JTextField txtVaginais;
	private JTextField txtCesareas;
	private JTextField txtNascVivo;
	private JTextField txtNascMorto;
	private JTextField txtObito1Semana;
	private JTextField txtObito2Semana;

	/**
	 * Create the frame.
	 */
	public TPaciente(JDesktopPane desktopPane, JMenu mnPaciente, JLabel imgMadicina, JMenuItem mntmLogin) {
		desktopPane.setBounds(0, 0, 1200, 960);
		setTitle("    CADASTRO DE PACIENTE");
		getContentPane().setBackground(Color.CYAN);
		((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// para tirar a borda
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		getContentPane().add(panel, BorderLayout.CENTER);

		JButton btnCarregarExames = new JButton("Carregar Exames");
		btnCarregarExames.setBounds(1036, 567, 196, 43);
		btnCarregarExames.setEnabled(false);
		btnCarregarExames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String identidade = txtIdentidade.getText();
				Examen ex = new Examen();
				System.out.println(identidade);
				if (ex.localizarExamen(identidade)) {
					examen = new TExamen(identidade);
					examen.getBtnSalvarCadastro().setEnabled(false);
					desktopPane.add(examen);
					examen.setVisible(true);

					setarDadosExames(ex.getAbo1T(), ex.getDataAbo1t(), ex.getHbHt1T(), ex.getDataHbHt1t(),
							ex.getGlisemia1t(), ex.getDataGlisemia1t(), ex.getUsg1t_1(), ex.getUsg1t_2(),
							ex.getDataUsg1t(), ex.getUrinaEas1T(), ex.getDataUrinaEas1t(), ex.getSifilis1t(),
							ex.getDataSifilis1t(), ex.getHiv1t(), ex.getDataHiv1t(), ex.getHepatite1t(),
							ex.getDataHepatite1t(), ex.getCitopatologico1t(), ex.getDataCitopatologico1t(),
							ex.getUrinocultura1t(), ex.getDataUrinocultura1t(), ex.getToxoplasmoseIgm1T(),
							ex.getDataToxoplasmose1t(), ex.getToxoplasmoseIgh1T(), ex.getBasal2t(), ex.getDataTotg2t(),
							ex.getB602t(), ex.getB1202t(), ex.getSifilis2t(), ex.getDataSifilis2t(), ex.getHiv2t(),
							ex.getDataHiv2t(), ex.getHepatite2t(), ex.getDataHepatite2t(), ex.getHbHt3T(),
							ex.getDataHbHt3t(), ex.getGlisemia3t(), ex.getDataGlisemia3t(), ex.getUrinaEas3T(),
							ex.getDataUrinaEas3t(), ex.getSifilis3t(), ex.getDataSifilis3t(), ex.getHiv3t(),
							ex.getDataHiv3t(), ex.getHepatite3t(), ex.getDataHepatite3t());
				}
			}
		});

		JButton btnCadastrarExames = new JButton("Cadastrar Exames");
		btnCadastrarExames.setBounds(1036, 623, 196, 43);
		btnCadastrarExames.addMouseListener(new MouseAdapter() {
			int cont = 0;

			@Override
			public void mouseClicked(MouseEvent arg0) {
				cont++;
				if (cont > 0) {
					btnCadastrarExames.setEnabled(false);
				}
			}
		});
		btnCadastrarExames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String identidadeE = txtIdentidade.getText();
				examen = new TExamen(identidadeE);
				examen.getBtnSalvarEdicao().setEnabled(false);
				desktopPane.add(examen);
				examen.setVisible(true);
				btnSalvar.setEnabled(true);
			}
		});
		panel.setLayout(null);

		txtData11 = new JFormattedTextField();
		txtData11.setEditable(false);
		txtData11.setToolTipText("Numero de Gesta\u00E7oes");
		txtData11.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData11.setEnabled(false);
		txtData11.setColumns(10);
		txtData11.setBounds(272, 767, 105, 26);
		panel.add(txtData11);

		txtData10 = new JFormattedTextField();
		txtData10.setEditable(false);
		txtData10.setToolTipText("Numero de Gesta\u00E7oes");
		txtData10.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData10.setEnabled(false);
		txtData10.setColumns(10);
		txtData10.setBounds(272, 737, 105, 26);
		panel.add(txtData10);

		txtData9 = new JFormattedTextField();
		txtData9.setEditable(false);
		txtData9.setToolTipText("Numero de Gesta\u00E7oes");
		txtData9.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData9.setEnabled(false);
		txtData9.setColumns(10);
		txtData9.setBounds(272, 707, 105, 26);
		panel.add(txtData9);

		txtData8 = new JFormattedTextField();
		txtData8.setEditable(false);
		txtData8.setToolTipText("Numero de Gesta\u00E7oes");
		txtData8.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData8.setEnabled(false);
		txtData8.setColumns(10);
		txtData8.setBounds(272, 677, 105, 26);
		panel.add(txtData8);

		txtData7 = new JFormattedTextField();
		txtData7.setEditable(false);
		txtData7.setToolTipText("Numero de Gesta\u00E7oes");
		txtData7.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData7.setEnabled(false);
		txtData7.setColumns(10);
		txtData7.setBounds(272, 646, 105, 26);
		panel.add(txtData7);

		txtData6 = new JFormattedTextField();
		txtData6.setEditable(false);
		txtData6.setToolTipText("Numero de Gesta\u00E7oes");
		txtData6.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData6.setEnabled(false);
		txtData6.setColumns(10);
		txtData6.setBounds(272, 617, 105, 26);
		panel.add(txtData6);

		txtData5 = new JFormattedTextField();
		txtData5.setEditable(false);
		txtData5.setToolTipText("Numero de Gesta\u00E7oes");
		txtData5.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData5.setEnabled(false);
		txtData5.setColumns(10);
		txtData5.setBounds(272, 587, 105, 26);
		panel.add(txtData5);

		txtData4 = new JFormattedTextField();
		txtData4.setEditable(false);
		txtData4.setToolTipText("Numero de Gesta\u00E7oes");
		txtData4.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData4.setEnabled(false);
		txtData4.setColumns(10);
		txtData4.setBounds(272, 557, 105, 26);
		panel.add(txtData4);

		txtData3 = new JFormattedTextField();
		txtData3.setEditable(false);
		txtData3.setToolTipText("Numero de Gesta\u00E7oes");
		txtData3.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData3.setEnabled(false);
		txtData3.setColumns(10);
		txtData3.setBounds(272, 527, 105, 26);
		panel.add(txtData3);

		txtData2 = new JFormattedTextField();
		txtData2.setEditable(false);
		txtData2.setToolTipText("Numero de Gesta\u00E7oes");
		txtData2.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData2.setEnabled(false);
		txtData2.setColumns(10);
		txtData2.setBounds(272, 497, 105, 26);
		panel.add(txtData2);

		txtData1 = new JFormattedTextField();
		txtData1.setEditable(false);
		txtData1.setBounds(272, 467, 105, 26);
		txtData1.setEnabled(false);
		txtData1.setToolTipText("Numero de Gesta\u00E7oes");
		txtData1.setFont(new Font("Consolas", Font.BOLD, 18));
		txtData1.setColumns(10);
		panel.add(txtData1);

		JLabel lblObito1Semana = new JLabel("Obito 1\u00B0 Semana");
		lblObito1Semana.setBounds(1036, 474, 156, 19);
		lblObito1Semana.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblObito1Semana);

		JLabel lblObito2Semana = new JLabel("Obito >1\u00B0 Semana");
		lblObito2Semana.setBounds(1036, 511, 171, 19);
		lblObito2Semana.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblObito2Semana);

		txtObito2Semana = new JTextField();
		txtObito2Semana.setEditable(false);
		txtObito2Semana.setBounds(1203, 506, 59, 26);
		txtObito2Semana.setToolTipText("Numero de Gesta\u00E7oes");
		txtObito2Semana.setFont(new Font("Consolas", Font.BOLD, 18));
		txtObito2Semana.setEnabled(false);
		txtObito2Semana.setColumns(10);
		panel.add(txtObito2Semana);

		txtObito1Semana = new JTextField();
		txtObito1Semana.setEditable(false);
		txtObito1Semana.setBounds(1203, 470, 59, 26);
		txtObito1Semana.setFont(new Font("Consolas", Font.BOLD, 18));
		txtObito1Semana.setEnabled(false);
		txtObito1Semana.setColumns(10);
		panel.add(txtObito1Semana);

		JLabel lblNascidosVivos = new JLabel("Nasc Vivos:");
		lblNascidosVivos.setBounds(1036, 400, 114, 19);
		lblNascidosVivos.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblNascidosVivos);

		txtNascVivo = new JTextField();
		txtNascVivo.setEditable(false);
		txtNascVivo.setBounds(1148, 395, 59, 26);
		txtNascVivo.setFont(new Font("Consolas", Font.BOLD, 18));
		txtNascVivo.setEnabled(false);
		txtNascVivo.setColumns(10);
		panel.add(txtNascVivo);

		JLabel lblNascMorto = new JLabel("Nasc Morto:");
		lblNascMorto.setBounds(1036, 437, 114, 19);
		lblNascMorto.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblNascMorto);

		txtNascMorto = new JTextField();
		txtNascMorto.setEditable(false);
		txtNascMorto.setBounds(1148, 431, 59, 26);
		txtNascMorto.setToolTipText("Numero de Gesta\u00E7oes");
		txtNascMorto.setFont(new Font("Consolas", Font.BOLD, 18));
		txtNascMorto.setEnabled(false);
		txtNascMorto.setColumns(10);
		panel.add(txtNascMorto);

		txtCesareas = new JTextField();
		txtCesareas.setEditable(false);
		txtCesareas.setBounds(1315, 431, 59, 26);
		txtCesareas.setToolTipText("Numero de Gesta\u00E7oes");
		txtCesareas.setFont(new Font("Consolas", Font.BOLD, 18));
		txtCesareas.setEnabled(false);
		txtCesareas.setColumns(10);
		panel.add(txtCesareas);

		JLabel lblVaginais = new JLabel("Vaginais:");
		lblVaginais.setBounds(1219, 401, 100, 18);
		lblVaginais.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblVaginais);

		txtVaginais = new JTextField();
		txtVaginais.setEditable(false);
		txtVaginais.setBounds(1315, 395, 59, 26);
		txtVaginais.setFont(new Font("Consolas", Font.BOLD, 18));
		txtVaginais.setEnabled(false);
		txtVaginais.setColumns(10);
		panel.add(txtVaginais);

		JLabel lblCesareas = new JLabel("Ces\u00E1reas:");
		lblCesareas.setBounds(1219, 437, 114, 19);
		lblCesareas.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblCesareas);

		JLabel lblData = new JLabel("Datas de Agendamentos:");
		lblData.setBounds(43, 472, 247, 19);
		lblData.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblData);

		JCalendar calendar = new JCalendar();
		calendar.setBounds(1507, 650, 401, 252);
		calendar.setFont(new Font("Consolas", Font.BOLD, 18));

		panel.add(calendar);

		txtPeso3Trimestre = new JTextField();
		txtPeso3Trimestre.setBounds(218, 413, 85, 31);
		txtPeso3Trimestre.setFont(new Font("Consolas", Font.BOLD, 18));
		txtPeso3Trimestre.setEnabled(false);
		txtPeso3Trimestre.setEditable(false);
		txtPeso3Trimestre.setColumns(10);
		panel.add(txtPeso3Trimestre);

		txtPeso1Trimestre = new JTextField();
		txtPeso1Trimestre.setBounds(218, 321, 85, 31);
		txtPeso1Trimestre.setFont(new Font("Consolas", Font.BOLD, 18));
		txtPeso1Trimestre.setEnabled(false);
		txtPeso1Trimestre.setEditable(false);
		txtPeso1Trimestre.setColumns(10);
		panel.add(txtPeso1Trimestre);

		txtPeso2Trimestre = new JTextField();
		txtPeso2Trimestre.setBounds(218, 367, 85, 31);
		txtPeso2Trimestre.setFont(new Font("Consolas", Font.BOLD, 18));
		txtPeso2Trimestre.setEnabled(false);
		txtPeso2Trimestre.setEditable(false);
		txtPeso2Trimestre.setColumns(10);
		panel.add(txtPeso2Trimestre);

		JLabel lblPeso3Trimestre = new JLabel("Peso 3\u00B0 Trimestre:");
		lblPeso3Trimestre.setBounds(33, 411, 186, 34);
		lblPeso3Trimestre.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblPeso3Trimestre);

		JLabel lblPeso2Trimestre = new JLabel("Peso 2\u00B0 Trimestre:");
		lblPeso2Trimestre.setBounds(33, 365, 186, 34);
		lblPeso2Trimestre.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblPeso2Trimestre);

		JLabel lblPeso1Trimestre = new JLabel("Peso 1\u00B0 Trimestre:");
		lblPeso1Trimestre.setBounds(33, 319, 185, 34);
		lblPeso1Trimestre.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblPeso1Trimestre);
		btnCadastrarExames.setFont(new Font("Consolas", Font.BOLD, 18));
		btnCadastrarExames.setEnabled(false);
		panel.add(btnCadastrarExames);
		btnCarregarExames.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(btnCarregarExames);

		cbxRisco = new JComboBox();
		cbxRisco.setBounds(1209, 225, 165, 31);
		cbxRisco.setEnabled(false);
		cbxRisco.setModel(new DefaultComboBoxModel(new String[] { "---SELECIONE---", "Baixo", "Intermedio", "Alto" }));
		panel.add(cbxRisco);

		JLabel lblTipoDeGravidez = new JLabel("Tipo de Gravidez:");
		lblTipoDeGravidez.setBounds(1036, 277, 175, 29);
		lblTipoDeGravidez.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblTipoDeGravidez);

		cbxTipoGravidez = new JComboBox();
		cbxTipoGravidez.setBounds(1209, 274, 165, 31);
		cbxTipoGravidez.setEnabled(false);
		cbxTipoGravidez.setModel(new DefaultComboBoxModel(
				new String[] { "---SELECIONE---", "\u00DAnico", "Gemelar", "Tripla ou mais" }));
		panel.add(cbxTipoGravidez);

		JLabel lblNome = new JLabel("Nome:*");
		lblNome.setBounds(33, 85, 88, 34);
		lblNome.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblNome);

		txtNomePaciente = new JTextField();
		txtNomePaciente.setBounds(162, 89, 387, 26);
		txtNomePaciente.setFont(new Font("Consolas", Font.BOLD, 18));
		txtNomePaciente.setEnabled(false);
		txtNomePaciente.setEditable(false);
		panel.add(txtNomePaciente);
		txtNomePaciente.setColumns(10);

		JLabel lblIdentidade = new JLabel("Identidade:*");
		lblIdentidade.setBounds(33, 211, 173, 22);
		lblIdentidade.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblIdentidade);

		txtIdentidade = new JTextField();
		txtIdentidade.setBounds(162, 209, 237, 26);
		txtIdentidade.setFont(new Font("Consolas", Font.BOLD, 18));
		txtIdentidade.setEnabled(false);
		txtIdentidade.setEditable(false);
		panel.add(txtIdentidade);
		txtIdentidade.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(162, 128, 387, 26);
		txtEndereco.setFont(new Font("Consolas", Font.BOLD, 18));
		txtEndereco.setEnabled(false);
		txtEndereco.setEditable(false);
		txtEndereco.setColumns(10);
		panel.add(txtEndereco);

		txtTelefone = new JFormattedTextField();
		txtTelefone.setBounds(162, 248, 237, 26);
		txtTelefone.setFont(new Font("Consolas", Font.BOLD, 18));
		txtTelefone.setEnabled(false);
		txtTelefone.setEditable(false);
		panel.add(txtTelefone);
		setBounds(0, 0, 1924, 967);
		formatarCampos();

		JLabel lblEndereco = new JLabel("Endere\u00E7o:*");
		lblEndereco.setBounds(33, 137, 123, 21);
		lblEndereco.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblEndereco);

		JLabel lblTelefone = new JLabel("Celular:*");
		lblTelefone.setBounds(33, 249, 105, 25);
		lblTelefone.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblTelefone);

		JLabel lblEmail = new JLabel("E-mail:*");
		lblEmail.setBounds(33, 171, 123, 27);
		lblEmail.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(162, 167, 387, 26);
		txtEmail.setFont(new Font("Consolas", Font.BOLD, 18));
		txtEmail.setEditable(false);
		txtEmail.setEnabled(false);
		panel.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblIdade = new JLabel("Idade:*");
		lblIdade.setBounds(33, 287, 91, 19);
		lblIdade.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setBounds(162, 283, 141, 26);
		txtIdade.setFont(new Font("Consolas", Font.BOLD, 18));
		txtIdade.setEditable(false);
		txtIdade.setEnabled(false);
		panel.add(txtIdade);
		txtIdade.setColumns(10);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(1141, 834, 141, 68);
		btnSalvar.setBackground(Color.PINK);
		btnSalvar.setToolTipText(
				"Para \"Salvar\" primeiro Clicar em \"Cadastrar Exames\"\r\ne logo em \"Salvar Cadastro\"");
		btnSalvar.setFont(new Font("Consolas", Font.BOLD, 20));
		btnSalvar.setEnabled(false);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNomePaciente.getText();
				String identidade = txtIdentidade.getText();
				String endereco = txtEndereco.getText();
				String telefone = txtTelefone.getText();
				String email = txtEmail.getText();
				String idade = txtIdade.getText();
				String dia = Integer.toString(txtDum.getCalendar().get(Calendar.DAY_OF_MONTH));
				String mes = Integer.toString(txtDum.getCalendar().get(Calendar.MONTH));
				String ano = Integer.toString(txtDum.getCalendar().get(Calendar.YEAR));
				String dum = (dia + "/" + mes + "/" + ano);
				String dpp = txtDPP.getText();
				String doenca = txtDoencas.getText();
				String numGestacoes = txtNumGestacoes.getText();
				String risco = cbxRisco.getSelectedItem().toString();
				String tipoGravidez = cbxTipoGravidez.getSelectedItem().toString();
				String filhos = txtFilhos.getText();
				String peso1 = txtPeso1Trimestre.getText();
				String peso2 = txtPeso2Trimestre.getText();
				String peso3 = txtPeso3Trimestre.getText();
				String data1 = txtData1.getText();
				String data2 = txtData2.getText();
				String data3 = txtData3.getText();
				String data4 = txtData4.getText();
				String data5 = txtData5.getText();
				String data6 = txtData6.getText();
				String data7 = txtData7.getText();
				String data8 = txtData8.getText();
				String data9 = txtData9.getText();
				String data10 = txtData10.getText();
				String data11 = txtData11.getText();

				if (nome.equals("") || identidade.equals("") || endereco.equals("") || telefone.equals("")
						|| email.equals("") || idade.equals("") || dum.equals("") || dpp.equals("")
						|| doenca.equals("")) {

					JOptionPane.showMessageDialog(null, "Não foi preenchido todos os campos Obrigatorios * ",
							"    PREENCHER", JOptionPane.ERROR_MESSAGE);
				} else {
					Paciente cadPaciente = new Paciente();
					cadPaciente.cadastroPaciente(nome, identidade, endereco, telefone, email, idade, dum, dpp, doenca,
							numGestacoes, risco, tipoGravidez, filhos, peso1, peso2, peso3, data1, data2, data3, data4,
							data5, data6, data7, data8, data9, data10, data11);
					txtNomePaciente.setText("");
					txtIdentidade.setText("");
					txtEndereco.setText("");
					txtTelefone.setText("");
					txtEmail.setText("");
					txtIdade.setText("");
					txtDum.setDateFormatString("");
					txtDPP.setText("");
					txtDoencas.setText("");
					txtNascVivo.setText("");
					txtVaginais.setText("");
					txtNascMorto.setText("");
					txtCesareas.setText("");
					txtObito1Semana.setText("");
					txtObito2Semana.setText("");
					btnSalvar.setEnabled(false);
					btnCadastrarExames.setEnabled(false);
					btnLocalizarPac.setEnabled(true);
					cbxRisco.setSelectedItem("---SELECIONE---");
					cbxTipoGravidez.setSelectedItem("---SELECIONE---");
					txtFilhos.setText("");
					txtPeso1Trimestre.setText("");
					txtPeso2Trimestre.setText("");
					txtPeso3Trimestre.setText("");
					txtNumGestacoes.setText("");
					txtData3.setText("");
					txtData2.setText("");
					txtData1.setText("");
					txtData4.setText("");
					txtData5.setText("");
					txtData6.setText("");
					txtData7.setText("");
					txtData8.setText("");
					txtData9.setText("");
					txtData10.setText("");
					txtData11.setText("");

					txtNomePaciente.setEditable(false);
					txtNomePaciente.setEnabled(false);
					txtIdentidade.setEditable(false);
					txtIdentidade.setEnabled(false);
					txtEndereco.setEditable(false);
					txtEndereco.setEnabled(false);
					txtTelefone.setEditable(false);
					txtTelefone.setEnabled(false);
					txtEmail.setEditable(false);
					txtEmail.setEnabled(false);
					txtIdade.setEditable(false);
					txtIdade.setEnabled(false);
					txtDum.setEnabled(false);
					txtDPP.setEditable(false);
					txtDPP.setEnabled(false);
					txtDoencas.setEditable(false);
					txtDoencas.setEnabled(false);
					btnSalvarEdicao.setEnabled(false);
					btnCadastrarNovoPaciente.setEnabled(true);
					txtFilhos.setEditable(false);
					txtPeso1Trimestre.setEditable(false);
					txtPeso2Trimestre.setEditable(false);
					txtPeso3Trimestre.setEditable(false);
					txtNumGestacoes.setEditable(false);
					btnCarregarExames.setEnabled(false);
					btnExcluirPaciente.setEnabled(true);
					txtData3.setEnabled(false);
					txtData2.setEnabled(false);
					txtData1.setEnabled(false);
					txtData4.setEnabled(false);
					txtData5.setEnabled(false);
					txtData6.setEnabled(false);
					txtData7.setEnabled(false);
					txtData8.setEnabled(false);
					txtData9.setEnabled(false);
					txtData10.setEnabled(false);
					txtData11.setEnabled(false);

					cbxRisco.setEditable(false);
					cbxRisco.setEnabled(false);
					cbxTipoGravidez.setEditable(false);
					cbxTipoGravidez.setEnabled(false);
					txtNascVivo.setEnabled(false);
					txtNascVivo.setEditable(false);
					txtVaginais.setEnabled(false);
					txtVaginais.setEditable(false);
					txtNascMorto.setEnabled(false);
					txtNascMorto.setEditable(false);
					txtCesareas.setEnabled(false);
					txtCesareas.setEditable(false);
					txtObito1Semana.setEnabled(false);
					txtObito1Semana.setEditable(false);
					txtObito2Semana.setEnabled(false);
					txtObito2Semana.setEditable(false);
				}
			}
		});
		panel.add(btnSalvar);

		JLabel lblDum = new JLabel("DUM:*");
		lblDum.setBounds(1036, 92, 77, 20);
		lblDum.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblDum);

		JLabel lblDpp = new JLabel("DPP:*");
		lblDpp.setBounds(1036, 137, 91, 22);
		lblDpp.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblDpp);

		txtDPP = new JTextField();
		txtDPP.setBounds(1148, 132, 226, 31);
		txtDPP.setFont(new Font("Consolas", Font.BOLD, 18));
		txtDPP.setToolTipText("Fazer click para mostrar data de Parto");
		txtDPP.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				Calendar cal = txtDum.getCalendar();
				cal.add(Calendar.WEEK_OF_MONTH, 40); // Calculo da data do parto
				System.out.println(cal.getTime());
				int dia = cal.getTime().getDate();
				int mes = cal.getTime().getMonth() + 1;
				int ano = cal.getTime().getYear() + 1900;
				txtDPP.setText(String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano));
			}
		});
		txtDPP.setEnabled(false);
		txtDPP.setEditable(false);
		txtDPP.setColumns(10);
		panel.add(txtDPP);

		JLabel lblDoencas = new JLabel("Doen\u00E7as:*");
		lblDoencas.setBounds(1037, 184, 91, 19);
		lblDoencas.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblDoencas);

		txtDoencas = new JTextField();
		txtDoencas.setBounds(1148, 178, 226, 31);
		txtDoencas.setFont(new Font("Consolas", Font.BOLD, 18));
		txtDoencas.setEnabled(false);
		txtDoencas.setEditable(false);
		txtDoencas.setColumns(10);
		panel.add(txtDoencas);

		JLabel lblNumeroDeGestacoes = new JLabel("Gesta\u00E7oes:");
		lblNumeroDeGestacoes.setBounds(1036, 363, 114, 19);
		lblNumeroDeGestacoes.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblNumeroDeGestacoes);

		txtNumGestacoes = new JTextField();
		txtNumGestacoes.setBounds(1148, 357, 59, 26);
		txtNumGestacoes.setToolTipText("Numero de Gesta\u00E7oes");
		txtNumGestacoes.setFont(new Font("Consolas", Font.BOLD, 18));
		txtNumGestacoes.setEditable(false);
		txtNumGestacoes.setEnabled(false);
		txtNumGestacoes.setColumns(10);
		panel.add(txtNumGestacoes);

		txtFilhos = new JTextField();
		txtFilhos.setBounds(1148, 321, 59, 26);
		txtFilhos.setFont(new Font("Consolas", Font.BOLD, 18));
		txtFilhos.setEditable(false);
		txtFilhos.setEnabled(false);
		txtFilhos.setColumns(10);
		panel.add(txtFilhos);

		JLabel lblRisco = new JLabel("Tipo de Risco:");
		lblRisco.setBounds(1036, 232, 141, 21);
		lblRisco.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblRisco);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(1791, 13, 105, 43);
		btnSair.setForeground(Color.RED);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSair.setIcon(new ImageIcon(TPaciente.class.getResource("/imagem/Sair1.png")));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				show(false);
				mnPaciente.setEnabled(false);
				imgMadicina.setVisible(true);
				mntmLogin.setEnabled(true);
			}
		});
		panel.add(btnSair);

		btnLocalizarPac = new JButton("Localizar Paciente");
		btnLocalizarPac.setBounds(72, 838, 257, 64);
		btnLocalizarPac.setBackground(Color.MAGENTA);
		btnLocalizarPac.setFont(new Font("Consolas", Font.BOLD, 20));
		btnLocalizarPac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String identidadePaciente = JOptionPane.showInputDialog(null, "Digite à Identidade do Paciente");
				Paciente p = new Paciente();
				if (p.localizarPaciente(identidadePaciente)) { // metodo para botar os txt em enable/editable e carregar
																// as informacoes do paciente
					setarDados(p.getNome(), p.getIdentidade(), p.getEndereco(), p.getTelefone(), p.getEmail(),
							p.getIdade(), p.getDum(), p.getDpp(), p.getDoenca(), p.getNumGestacoes(), p.getRisco(),
							p.getTipoGravidez(), p.getFilhos(), p.getPeso1(), p.getPeso2(), p.getPeso3(), p.getData1(),
							p.getData2(), p.getData3(), p.getData4(), p.getData5(), p.getData6(), p.getData7(),
							p.getData8(), p.getData9(), p.getData10(), p.getData11());
					btnSalvarEdicao.setEnabled(true);
					txtIdentidade.setEditable(false);
					txtDum.setEnabled(true);
					btnCadastrarNovoPaciente.setEnabled(false);
					btnCarregarExames.setEnabled(true);
					txtPeso1Trimestre.setEnabled(true);
					txtPeso1Trimestre.setEditable(true);
					txtPeso2Trimestre.setEnabled(true);
					txtPeso2Trimestre.setEditable(true);
					txtPeso3Trimestre.setEnabled(true);
					txtPeso3Trimestre.setEditable(true);
					txtFilhos.setEnabled(true);
					txtFilhos.setEditable(true);
					btnExcluirPaciente.setEnabled(false);
					txtData3.setEnabled(true);
					txtData2.setEnabled(true);
					txtData1.setEnabled(true);
					txtData4.setEnabled(true);
					txtData5.setEnabled(true);
					txtData6.setEnabled(true);
					txtData7.setEnabled(true);
					txtData8.setEnabled(true);
					txtData9.setEnabled(true);
					txtData10.setEnabled(true);
					txtData11.setEnabled(true);
					cbxRisco.setEditable(true);
					cbxRisco.setEnabled(true);
					cbxTipoGravidez.setEditable(true);
					cbxTipoGravidez.setEnabled(true);
					txtNascVivo.setEnabled(true);
					txtNascVivo.setEditable(true);
					txtVaginais.setEnabled(true);
					txtVaginais.setEditable(true);
					txtNascMorto.setEnabled(true);
					txtNascMorto.setEditable(true);
					txtCesareas.setEnabled(true);
					txtCesareas.setEditable(true);
					txtObito1Semana.setEnabled(true);
					txtObito1Semana.setEditable(true);
					txtObito2Semana.setEnabled(true);
					txtObito2Semana.setEditable(true);
					txtNumGestacoes.setEnabled(true);
					txtNumGestacoes.setEditable(true);
					txtData3.setEditable(true);
					txtData2.setEditable(true);
					txtData1.setEditable(true);
					txtData4.setEditable(true);
					txtData5.setEditable(true);
					txtData6.setEditable(true);
					txtData7.setEditable(true);
					txtData8.setEditable(true);
					txtData9.setEditable(true);
					txtData10.setEditable(true);
					txtData11.setEditable(true);
				}
			}
		});
		panel.add(btnLocalizarPac);

		btnCadastrarNovoPaciente = new JButton("Cadastrar Novo Paciente");
		btnCadastrarNovoPaciente.setBounds(370, 838, 305, 64);
		btnCadastrarNovoPaciente.setBackground(Color.MAGENTA);
		btnCadastrarNovoPaciente.setFont(new Font("Consolas", Font.BOLD, 20));
		btnCadastrarNovoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNomePaciente.setEditable(true);
				txtNomePaciente.setEnabled(true);
				txtIdentidade.setEditable(true);
				txtIdentidade.setEnabled(true);
				txtEndereco.setEditable(true);
				txtEndereco.setEnabled(true);
				txtTelefone.setEditable(true);
				txtTelefone.setEnabled(true);
				txtEmail.setEditable(true);
				txtEmail.setEnabled(true);
				txtIdade.setEditable(true);
				txtIdade.setEnabled(true);
				txtDum.setEnabled(true);
				btnCadastrarExames.setEnabled(true);
				txtDPP.setEditable(true);
				txtDPP.setEnabled(true);
				txtDoencas.setEditable(true);
				txtDoencas.setEnabled(true);
				btnLocalizarPac.setEnabled(false);
				btnCarregarExames.setEnabled(false);
				cbxRisco.setEditable(true);
				cbxRisco.setEnabled(true);
				cbxTipoGravidez.setEditable(true);
				cbxTipoGravidez.setEnabled(true);
				txtFilhos.setEditable(true);
				txtPeso1Trimestre.setEditable(true);
				txtPeso2Trimestre.setEditable(true);
				txtPeso3Trimestre.setEditable(true);
				txtNumGestacoes.setEditable(true);
				txtFilhos.setEnabled(true);
				txtPeso1Trimestre.setEnabled(true);
				txtPeso2Trimestre.setEnabled(true);
				txtPeso3Trimestre.setEnabled(true);
				txtNumGestacoes.setEnabled(true);
				btnExcluirPaciente.setEnabled(false);
				btnCadastrarNovoPaciente.setEnabled(false);
				txtData3.setEnabled(true);
				txtData2.setEnabled(true);
				txtData1.setEnabled(true);
				txtData4.setEnabled(true);
				txtData5.setEnabled(true);
				txtData6.setEnabled(true);
				txtData7.setEnabled(true);
				txtData8.setEnabled(true);
				txtData9.setEnabled(true);
				txtData10.setEnabled(true);
				txtData11.setEnabled(true);
				txtNascVivo.setEnabled(true);
				txtNascVivo.setEditable(true);
				txtVaginais.setEnabled(true);
				txtVaginais.setEditable(true);
				txtNascMorto.setEnabled(true);
				txtNascMorto.setEditable(true);
				txtCesareas.setEnabled(true);
				txtCesareas.setEditable(true);
				txtObito1Semana.setEnabled(true);
				txtObito1Semana.setEditable(true);
				txtObito2Semana.setEnabled(true);
				txtObito2Semana.setEditable(true);
				txtData3.setEditable(true);
				txtData2.setEditable(true);
				txtData1.setEditable(true);
				txtData4.setEditable(true);
				txtData5.setEditable(true);
				txtData6.setEditable(true);
				txtData7.setEditable(true);
				txtData8.setEditable(true);
				txtData9.setEditable(true);
				txtData10.setEditable(true);
				txtData11.setEditable(true);

			}
		});
		panel.add(btnCadastrarNovoPaciente);

		JSeparator separator = new JSeparator();
		separator.setBounds(158, 601, -51, -28);
		panel.add(separator);

		btnSalvarEdicao = new JButton("Salvar Edi\u00E7\u00E3o");
		btnSalvarEdicao.setBounds(1293, 834, 202, 68);
		btnSalvarEdicao.setBackground(Color.PINK);
		btnSalvarEdicao.setFont(new Font("Consolas", Font.BOLD, 20));
		btnSalvarEdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Paciente cadPaciente = new Paciente();
				String nome = txtNomePaciente.getText();
				String identidade = txtIdentidade.getText();
				String endereco = txtEndereco.getText();
				String telefone = txtTelefone.getText();
				String email = txtEmail.getText();
				String idade = txtIdade.getText();
				String dum = txtDum.getDateFormatString();
				String dpp = txtDPP.getText();
				String doenca = txtDoencas.getText();
				String numGestacoes = txtNumGestacoes.getText();
				String risco = cbxRisco.getSelectedItem().toString();
				String tipoGravidez = cbxTipoGravidez.getSelectedItem().toString();
				String filhos = txtFilhos.getText();
				String peso1 = txtPeso1Trimestre.getText();
				String peso2 = txtPeso2Trimestre.getText();
				String peso3 = txtPeso3Trimestre.getText();
				String data1 = txtData1.getText();
				String data2 = txtData2.getText();
				String data3 = txtData3.getText();
				String data4 = txtData4.getText();
				String data5 = txtData5.getText();
				String data6 = txtData6.getText();
				String data7 = txtData7.getText();
				String data8 = txtData8.getText();
				String data9 = txtData9.getText();
				String data10 = txtData10.getText();
				String data11 = txtData11.getText();

				Paciente ediPaciente = new Paciente();
				ediPaciente.editarPaciente(nome, identidade, endereco, telefone, email, idade, dum, dpp, doenca,
						numGestacoes, risco, tipoGravidez, filhos, peso1, peso2, peso3, data1, data2, data3, data4,
						data5, data6, data7, data8, data9, data10, data11);
				txtNomePaciente.setText("");
				txtIdentidade.setText("");
				txtEndereco.setText("");
				txtTelefone.setText("");
				txtEmail.setText("");
				txtIdade.setText("");
				txtDum.setDateFormatString("");
				txtDPP.setText("");
				txtDoencas.setText("");
				cbxRisco.setSelectedItem("---SELECIONE---");
				cbxTipoGravidez.setSelectedItem("---SELECIONE---");
				txtFilhos.setText("");
				txtPeso1Trimestre.setText("");
				txtPeso2Trimestre.setText("");
				txtPeso3Trimestre.setText("");
				txtNumGestacoes.setText("");
				txtNascVivo.setText("");
				txtVaginais.setText("");
				txtNascMorto.setText("");
				txtCesareas.setText("");
				txtObito1Semana.setText("");
				txtObito2Semana.setText("");
				txtData3.setText("");
				txtData2.setText("");
				txtData1.setText("");
				txtData4.setText("");
				txtData5.setText("");
				txtData6.setText("");
				txtData7.setText("");
				txtData8.setText("");
				txtData9.setText("");
				txtData10.setText("");
				txtData11.setText("");
				txtNomePaciente.setEditable(false);
				txtNomePaciente.setEnabled(false);
				txtIdentidade.setEditable(false);
				txtIdentidade.setEnabled(false);
				txtEndereco.setEditable(false);
				txtEndereco.setEnabled(false);
				txtTelefone.setEditable(false);
				txtTelefone.setEnabled(false);
				txtEmail.setEditable(false);
				txtEmail.setEnabled(false);
				txtIdade.setEditable(false);
				txtIdade.setEnabled(false);
				txtDum.setEnabled(false);
				txtDPP.setEditable(false);
				txtDPP.setEnabled(false);
				txtDoencas.setEditable(false);
				txtDoencas.setEnabled(false);
				btnSalvarEdicao.setEnabled(false);
				btnCadastrarNovoPaciente.setEnabled(true);
				txtFilhos.setEditable(false);
				txtPeso1Trimestre.setEditable(false);
				txtPeso2Trimestre.setEditable(false);
				txtPeso3Trimestre.setEditable(false);
				txtNumGestacoes.setEditable(false);
				btnCarregarExames.setEnabled(false);
				txtData3.setEnabled(false);
				txtData2.setEnabled(false);
				txtData1.setEnabled(false);
				txtData4.setEnabled(false);
				txtData5.setEnabled(false);
				txtData6.setEnabled(false);
				txtData7.setEnabled(false);
				txtData8.setEnabled(false);
				txtData9.setEnabled(false);
				txtData10.setEnabled(false);
				txtData11.setEnabled(false);
				cbxRisco.setEditable(false);
				cbxRisco.setEnabled(false);
				cbxTipoGravidez.setEditable(false);
				cbxTipoGravidez.setEnabled(false);
				txtNascVivo.setEnabled(false);
				txtNascVivo.setEditable(false);
				txtVaginais.setEnabled(false);
				txtVaginais.setEditable(false);
				txtNascMorto.setEnabled(false);
				txtNascMorto.setEditable(false);
				txtCesareas.setEnabled(false);
				txtCesareas.setEditable(false);
				txtObito1Semana.setEnabled(false);
				txtObito1Semana.setEditable(false);
				txtObito2Semana.setEnabled(false);
				txtObito2Semana.setEditable(false);
			}
		});
		btnSalvarEdicao.setEnabled(false);
		panel.add(btnSalvarEdicao);

		JLabel lblCadastroDePaciente = new JLabel("PACIENTE");
		lblCadastroDePaciente.setBounds(749, 0, 364, 46);
		lblCadastroDePaciente.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblCadastroDePaciente);

		JLabel lblFilhos = new JLabel("Filhos:");
		lblFilhos.setBounds(1036, 327, 85, 18);
		lblFilhos.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(lblFilhos);

		txtDum = new JDateChooser();
		txtDum.setBounds(1149, 85, 226, 31);
		txtDum.setFont(new Font("Consolas", Font.BOLD, 18));
		panel.add(txtDum);
		txtDum.setEnabled(false);

		JLabel imgPaciente = new JLabel("");
		imgPaciente.setBounds(12, 45, 998, 780);
		imgPaciente.setIcon(new ImageIcon(TPaciente.class.getResource("/imagem/imagemPaciente.jpg")));
		panel.add(imgPaciente);

		JLabel label = new JLabel("");
		label.setBounds(1219, 45, 689, 780);
		label.setIcon(new ImageIcon(TPaciente.class.getResource("/imagem/imaGravida.jpg")));
		panel.add(label);

		btnExcluirPaciente = new JButton("Excluir Paciente");
		btnExcluirPaciente.setBounds(687, 834, 222, 68);
		btnExcluirPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String senhaGerente = JOptionPane.showInputDialog("Gerente digite a Senha para Deletar Paciente");
				if (senhaGerente.equals("123456")) {
					String identidadePaciente = JOptionPane
							.showInputDialog("Digite a Identidade do Paciente para Deletar");
					Paciente paci = new Paciente();
					paci.excluirPaciente(identidadePaciente);
				}
			}
		});
		btnExcluirPaciente.setToolTipText(
				"Para \"Salvar\" primeiro Clicar em \"Cadastrar Exames\"\r\ne logo em \"Salvar Cadastro\"");
		btnExcluirPaciente.setFont(new Font("Consolas", Font.BOLD, 20));
		btnExcluirPaciente.setBackground(Color.PINK);
		panel.add(btnExcluirPaciente);

		JButton btnRelatorio = new JButton("Relatorio");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String mes = JOptionPane.showInputDialog("Digite o mes que deseja, com numeros");

				Relatorio rela = new Relatorio();
				rela.verificarPartos(mes);
				rela.verificarPacientes(mes);
				rela.altoRisco(mes);
				rela.menorIdade(mes);
				rela.abo("0" + mes);
				rela.hemograma("0" + mes);
				rela.glicemia("0" + mes);
				rela.usg("0" + mes);
				rela.urinaEas("0" + mes);
				rela.sifilis("0" + mes);
				rela.hiv("0" + mes);
				rela.hepatite("0" + mes);
				rela.urinocultura("0" + mes);
				rela.toxoplasmose("0" + mes);
				rela.citopatologico("0" + mes);
				rela.totg("0" + mes);

				TRelatorio TelaRela = new TRelatorio();
				desktopPane.add(TelaRela);
				TelaRela.setVisible(true);

				TelaRela.getTxtPartos().setText(rela.getConPartos());
				TelaRela.getTxtMes().setText(mes);
				TelaRela.getTxtPacientes().setText(rela.getConPacientes());
				TelaRela.getTxtAltoRisco().setText(rela.getConAltoRisco());
				TelaRela.getTxtMenorIdade().setText(rela.getConMenorIdade());
				TelaRela.getTxtAbo().setText(rela.getConAbo());
				TelaRela.getTxtHemograma().setText(rela.getConHemograma());
				TelaRela.getTxtGlicemia().setText(rela.getConGlicemia());
				TelaRela.getTxtUSG().setText(rela.getConUsg());
				TelaRela.getTxtUrinaEAS().setText(rela.getConUrinaEas());
				TelaRela.getTxtSifilis().setText(rela.getConSifilis());
				TelaRela.getTxtHIV().setText(rela.getConHiv());
				TelaRela.getTxtHepatite().setText(rela.getConHepatite());
				TelaRela.getTxtUrinocultura().setText(rela.getConUrinocultura());
				TelaRela.getTxtToxoplasmose().setText(rela.getConToxoplasmose());
				TelaRela.getTxtCitopatologico().setText(rela.getConCitopatologico());
				TelaRela.getTxtTotg().setText(rela.getConTotg());
			}
		});
		btnRelatorio.setToolTipText(
				"Para \"Salvar\" primeiro Clicar em \"Cadastrar Exames\"\r\ne logo em \"Salvar Cadastro\"");
		btnRelatorio.setFont(new Font("Consolas", Font.BOLD, 20));
		btnRelatorio.setBackground(Color.PINK);
		btnRelatorio.setBounds(921, 834, 208, 68);
		panel.add(btnRelatorio);
		setVisible(true);
	}

	private void formatarCampos() {
		try {
			MaskFormatter maskTel = new MaskFormatter("(##)####-####");
			maskTel.install(txtTelefone);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData4);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData5);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData6);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData7);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData8);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData9);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData10);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter maskTe = new MaskFormatter("##/##/####");
			maskTe.install(txtData11);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void setarDados(String nome, String identidade, String endereco, String telefone, String email, String idade,
			String dum, String dpp, String doenca, String numGestacoes, String risco, String tipoGravidez,
			String filhos, String peso1, String peso2, String peso3, String data1, String data2, String data3,
			String data4, String data5, String data6, String data7, String data8, String data9, String data10,
			String data11) {
		txtNomePaciente.setEditable(true);
		txtNomePaciente.setEnabled(true);
		txtIdentidade.setEditable(true);
		txtIdentidade.setEnabled(true);
		txtEndereco.setEditable(true);
		txtEndereco.setEnabled(true);
		txtTelefone.setEditable(true);
		txtTelefone.setEnabled(true);
		txtEmail.setEditable(true);
		txtEmail.setEnabled(true);
		txtIdade.setEditable(true);
		txtIdade.setEnabled(true);
		txtDPP.setEditable(true);
		txtDPP.setEnabled(true);
		txtDoencas.setEditable(true);
		txtDoencas.setEnabled(true);
		txtFilhos.setEditable(true);
		txtPeso1Trimestre.setEditable(true);
		txtPeso2Trimestre.setEditable(true);
		txtPeso3Trimestre.setEditable(true);
		txtNumGestacoes.setEditable(true);
		txtNomePaciente.setText(nome);
		txtIdentidade.setText(identidade);
		txtEndereco.setText(endereco);
		txtTelefone.setText(telefone);
		txtEmail.setText(email);
		txtIdade.setText(idade);
		txtDum.setDateFormatString(dum);
		txtDPP.setText(dpp);
		txtDoencas.setText(doenca);
		cbxRisco.setSelectedItem(risco);
		cbxTipoGravidez.setSelectedItem(tipoGravidez);
		txtFilhos.setText(filhos);
		txtPeso1Trimestre.setText(peso1);
		txtPeso2Trimestre.setText(peso2);
		txtPeso3Trimestre.setText(peso3);
		txtNumGestacoes.setText(numGestacoes);
		txtData1.setText(data1);
		txtData2.setText(data2);
		txtData3.setText(data3);
		txtData4.setText(data4);
		txtData5.setText(data5);
		txtData6.setText(data6);
		txtData7.setText(data7);
		txtData8.setText(data8);
		txtData9.setText(data9);
		txtData10.setText(data10);
		txtData11.setText(data11);

	}

	public void setarDadosExames(String abo1T, String DataAbo1t, String hbHt1T, String DataHbHt1t, String glisemia1t,
			String DataGlisemia1t, String usg1t_1, String usg1t_2, String DataUsg1t, String urinaEas1T,
			String DataUrinaEas1t, String sifilis1t, String DataSifilis1t, String hiv1t, String dataHiv1t,
			String hepatite1t, String DataHepatite1t, String citopatologico1t, String DataCitopatologico1t,
			String urinocultura1t, String DataUrinocultura1t, String toxoplasmoseIgm1T, String DataToxoplasmose1t,
			String toxoplasmoseIgh1T, String basal2t, String DataTotg2t, String b602t, String b1202t, String sifilis2t,
			String DataSifilis2t, String hiv2t, String DataHiv2t, String hepatite2t, String DataHepatite2t,
			String hbHt3T, String DataHbHt3t, String glisemia3t, String DataGlisemia3t, String urinaEas3T,
			String DataUrinaEas3t, String sifilis3t, String DataSifilis3t, String hiv3t, String DataHiv3t,
			String hepatite3t, String DataHepatite3t) {
		examen.getTxtAbo1T().setText(abo1T);
		examen.getTxtDataAbo1T().setText(DataAbo1t);
		examen.getTxtHbHt1T().setText(hbHt1T);
		examen.getTxtDataHbHt1T().setText(DataHbHt1t);
		examen.getTxtGlisemia1T().setText(glisemia1t);
		examen.getTxtDataGlisemia1T().setText(DataGlisemia1t);
		examen.getTxtUsg1T_1().setText(usg1t_1);
		examen.getTxtUsg1T_2().setText(usg1t_2);
		examen.getTxtDataUsg1T().setText(DataUsg1t);
		examen.getTxtUrinaEas1T().setText(urinaEas1T);
		examen.getTxtDataUrinaEas1T().setText(DataUrinaEas1t);
		examen.getTxtSifilis1T().setText(sifilis1t);
		examen.getTxtDataSifilis1T().setText(DataSifilis1t);
		examen.getTxtHiv1T().setText(hiv1t);
		examen.getTxtDataHiv1T().setText(dataHiv1t);
		examen.getTxtHepatite1T().setText(hepatite1t);
		examen.getTxtDataHepatite1T().setText(DataHepatite1t);
		examen.getTxtCitopatologico1T().setText(citopatologico1t);
		examen.getTxtDataCitopatologico1T().setText(DataCitopatologico1t);
		examen.getTxtUrinocultura1T().setText(urinocultura1t);
		examen.getTxtDataUrinocultura1T().setText(DataUrinocultura1t);
		examen.getTxtToxoplasmoseIgm1T().setText(toxoplasmoseIgm1T);
		examen.getTxtDataToxoplasmose1T().setText(DataToxoplasmose1t);
		examen.getTxtToxoplasmoseIgh1T().setText(toxoplasmoseIgh1T);
		examen.getTxtBasal2T().setText(basal2t);
		examen.getTxtDataTotg2T().setText(DataTotg2t);
		examen.getTxt602T().setText(b602t);
		examen.getTxt1202T().setText(b1202t);
		examen.getTxtSifilis2T().setText(sifilis2t);
		examen.getTxtDataSifilis2T().setText(DataSifilis2t);
		examen.getTxtHiv2T().setText(hiv2t);
		examen.getTxtDataHiv2T().setText(DataHiv2t);
		examen.getTxtHepatite2T().setText(hepatite2t);
		examen.getTxtDataHepatite2T().setText(DataHepatite2t);
		examen.getTxtHbHt3T().setText(hbHt3T);
		examen.getTxtDataHbHt3T().setText(DataHbHt3t);
		examen.getTxtGlisemia3T().setText(glisemia3t);
		examen.getTxtDataGlisemia3T().setText(DataGlisemia3t);
		examen.getTxtUrinaEas3T().setText(urinaEas3T);
		examen.getTxtDataUrinaEas3T().setText(DataUrinaEas3t);
		examen.getTxtSifilis3T().setText(sifilis3t);
		examen.getTxtDataSifilis3T().setText(DataSifilis3t);
		examen.getTxtHiv3T().setText(hiv3t);
		examen.getTxtDataHiv3T().setText(DataHiv3t);
		examen.getTxtHepatite3T().setText(hepatite3t);
		examen.getTxtDataHepatite3T().setText(DataHepatite3t);
	}
}
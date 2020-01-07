package view;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import control.Paciente;
import control.Profissional;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TCadastrarProfissional extends JInternalFrame {
	public JTextField txtNomeProfesional;
	public JTextField txtMatricula;
	public JTextField txtEquipe;
	public JComboBox cbbTipoProfesional;
	public JTextField txtSenha1;
	public JTextField txtSenha2;
	String caminho;
	JButton btnCadastrarProfesional;
	JButton btnExcluirProfessional;

	/**
	 * Create the frame.
	 */
	public TCadastrarProfissional(JLabel imgMadicina) {
		setTitle("         CADASTRO DE PROFESIONAL");
		setBounds(10, 10, 1900, 1020);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// para tirar a borda

		JLabel lblTipoDeProfesional = new JLabel("Tipo de Profesional:");
		lblTipoDeProfesional.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTipoDeProfesional.setBounds(66, 145, 184, 22);
		panel.add(lblTipoDeProfesional);

		cbbTipoProfesional = new JComboBox();
		cbbTipoProfesional.setFont(new Font("Tahoma", Font.BOLD, 18));
		cbbTipoProfesional
				.setModel(new DefaultComboBoxModel(new String[] { "---SELECIONE---", "Medico/a", "Enfermeiro/a" }));
		cbbTipoProfesional.setBounds(312, 145, 226, 22);
		panel.add(cbbTipoProfesional);

		JLabel lblNomeProfesional = new JLabel("Nome:");
		lblNomeProfesional.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNomeProfesional.setBounds(66, 216, 173, 22);
		panel.add(lblNomeProfesional);

		txtNomeProfesional = new JTextField();
		txtNomeProfesional.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNomeProfesional.setToolTipText("Digite o Nome Completo");
		txtNomeProfesional.setBounds(312, 216, 226, 22);
		panel.add(txtNomeProfesional);
		txtNomeProfesional.setColumns(10);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMatricula.setBounds(66, 291, 173, 22);
		panel.add(lblMatricula);

		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtMatricula.setToolTipText("CRM ou COREME");
		txtMatricula.setBounds(312, 291, 226, 22);
		panel.add(txtMatricula);
		txtMatricula.setColumns(10);

		JLabel lblEquipe = new JLabel("Equipe:");
		lblEquipe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEquipe.setBounds(66, 379, 173, 22);
		panel.add(lblEquipe);

		txtEquipe = new JTextField();
		txtEquipe.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEquipe.setBounds(312, 379, 226, 22);
		panel.add(txtEquipe);
		txtEquipe.setColumns(10);

		btnCadastrarProfesional = new JButton("Cadastrar");
		btnCadastrarProfesional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtSenha1.getText().equalsIgnoreCase(txtSenha2.getText())) {
					String profesao = cbbTipoProfesional.getSelectedItem().toString();
					if (txtNomeProfesional.getText().equalsIgnoreCase("") || txtMatricula.getText().equalsIgnoreCase("")
							|| txtEquipe.getText().equalsIgnoreCase("") || profesao.equals("---SELECIONE---")
							|| txtSenha1.getText().equalsIgnoreCase("") || txtSenha2.getText().equalsIgnoreCase("")) {
						JOptionPane.showMessageDialog(null, "Não foi preenchido todos os campos ", "    PREENCHER",
								JOptionPane.ERROR_MESSAGE);
					} else {
						String tipo = cbbTipoProfesional.getSelectedItem().toString();
						String nomeProf = txtNomeProfesional.getText();
						String matricula = txtMatricula.getText();
						String equipe = txtEquipe.getText();
						String senha = txtSenha2.getText();
						Profissional cadastroPro = new Profissional(tipo, nomeProf, matricula, equipe, senha);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Digite Senhas Iguais ", "    SENHAS",
							JOptionPane.ERROR_MESSAGE);
				}
				cbbTipoProfesional.setSelectedItem("---SELECIONE---");
				txtNomeProfesional.setText("");
				txtMatricula.setText("");
				txtEquipe.setText("");
				txtSenha1.setText("");
				txtSenha2.setText("");
			}
		});
		btnCadastrarProfesional.setBounds(398, 844, 173, 62);
		panel.add(btnCadastrarProfesional);

		JButton btnVoltarProfesional = new JButton("Voltar");
		btnVoltarProfesional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(false);
				imgMadicina.setVisible(true);
			}
		});
		btnVoltarProfesional.setBounds(731, 844, 173, 62);
		panel.add(btnVoltarProfesional);

		txtSenha1 = new JTextField();
		txtSenha1.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSenha1.setToolTipText("Digite uma senha ");
		txtSenha1.setColumns(10);
		txtSenha1.setBounds(312, 466, 226, 22);
		panel.add(txtSenha1);

		JLabel lblSenha1 = new JLabel("Senha:");
		lblSenha1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSenha1.setBounds(66, 466, 173, 22);
		panel.add(lblSenha1);

		JLabel lblSenha2 = new JLabel("Senha");
		lblSenha2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSenha2.setBounds(66, 551, 173, 22);
		panel.add(lblSenha2);

		txtSenha2 = new JTextField();
		txtSenha2.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSenha2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtSenha1.getText().equalsIgnoreCase(txtSenha2.getText())) {
				} else {
					JOptionPane.showMessageDialog(null, "Digite Senhas Iguais ", "    SENHAS",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		txtSenha2.setToolTipText("Digite de novo a Senha");
		txtSenha2.setColumns(10);
		txtSenha2.setBounds(312, 551, 226, 22);
		panel.add(txtSenha2);

		JLabel lblNewLabel = new JLabel("CADASTRO DE PROFESIONAL");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(744, 13, 347, 38);
		panel.add(lblNewLabel);

		btnExcluirProfessional = new JButton("Excluir Professional");
		btnExcluirProfessional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String senhaGerente = JOptionPane.showInputDialog("Gerente digite a Senha para Deletar Profesional");
				if (senhaGerente.equals("123456")) {
					String matricula = JOptionPane.showInputDialog("Digite a Matricula do Profesional para Deletar");
					Paciente paci = new Paciente();
					paci.excluirProfesional(matricula);
				}
			}
		});
		btnExcluirProfessional.setBounds(1066, 844, 173, 62);
		panel.add(btnExcluirProfessional);

		JLabel imgProfissional = new JLabel("");
		imgProfissional.setIcon(new ImageIcon(TCadastrarProfissional.class.getResource("/imagem/profissional.png")));
		imgProfissional.setBounds(724, 143, 819, 592);
		panel.add(imgProfissional);
		setVisible(true);
	}
}
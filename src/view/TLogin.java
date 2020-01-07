package view;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import control.Login;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class TLogin extends JInternalFrame {

	private JDesktopPane desktopPane;

	public JTextField txtNome;
	private JPasswordField pswSenha;

	/**
	 * Create the frame.
	 * 
	 * @param imgMadicina
	 * @param imgMadicina
	 */
	public TLogin(JDesktopPane desktopPane, JMenu mnPaciente, JLabel imgMadicina, JMenuItem mntmLogin) {

		this.desktopPane = desktopPane;
		setTitle("Login");
		setBounds(350, 150, 600, 425);

		((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// para tirar a borda

		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.activeCaptionBorder);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
		lblNome.setBounds(42, 105, 80, 26);
		panel.add(lblNome);

		txtNome = new JTextField();
		txtNome.setText("cris");
		txtNome.setToolTipText("Usuario digite Nome Completo ");
		txtNome.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
		txtNome.setColumns(10);
		txtNome.setBounds(132, 104, 330, 29);
		panel.add(txtNome);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
		lblSenha.setBounds(42, 165, 80, 22);
		panel.add(lblSenha);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nomeP = txtNome.getText();
				String senhaP = new String(pswSenha.getPassword());

				if (txtNome.getText().isEmpty() || pswSenha.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Não foi preenchido todos os campos ", "    PREENCHER",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Login login = new Login();
					if (login.verificarLogin(nomeP, senhaP)) {
						TPaciente pac = new TPaciente(desktopPane, mnPaciente, imgMadicina, mntmLogin);
						pac.setBounds(0, 0, 1900, 960);
						desktopPane.add(pac);
						mnPaciente.setEnabled(true);
						imgMadicina.setVisible(false);
						dispose();
						txtNome.setText("");
						pswSenha.setText("");
						mntmLogin.setEnabled(false);
					} else {
						JOptionPane.showMessageDialog(null, "Erro de Login", "Erro de Login",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnLogin.setBounds(166, 264, 108, 72);
		panel.add(btnLogin);

		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(286, 264, 108, 72);
		panel.add(btnSair);

		pswSenha = new JPasswordField();
		pswSenha.setText("123");
		pswSenha.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
		pswSenha.setBounds(132, 162, 330, 29);
		panel.add(pswSenha);

		JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setIcon(new ImageIcon(TLogin.class.getResource("/imagem/Login.png")));
		lblImagem.setBounds(241, 0, 98, 93);
		panel.add(lblImagem);
	}
}
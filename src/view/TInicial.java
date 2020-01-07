package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.Paciente;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Toolkit;

public class TInicial extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JInternalFrame tAtual = null;
	private JLabel imgMadicina;
	private TLogin login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TInicial frame = new TInicial();
					frame.setVisible(true);
					Paciente paci = new Paciente();
					paci.verificarArquivoTxt();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TInicial() {

		setFocusTraversalPolicyProvider(true);
		setTitle("MedicGestante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(10, 10, d.width, d.height);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		setJMenuBar(menuBar);

		JMenu mnLogin = new JMenu("Login     ");
		mnLogin.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		menuBar.add(mnLogin);

		JMenu mnPaciente = new JMenu("Paciente     ");
		mnPaciente.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		menuBar.add(mnPaciente);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		mntmSair.setIcon(new ImageIcon(TInicial.class.getResource("/imagem/Sair1.png")));
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(login);
				login.setVisible(true);
			}
		});
		mnLogin.add(mntmLogin);
		mnLogin.add(mntmSair);

		JMenuItem mntmCadastroDePaciente = new JMenuItem("Cadastro de Paciente");
		mntmCadastroDePaciente.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		mntmCadastroDePaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				TPaciente tpaciente = new TPaciente(desktopPane, mnPaciente, imgMadicina, mntmLogin);
				tpaciente.setFocusable(true);
				desktopPane.add(tpaciente);
			}
		});
		mnPaciente.add(mntmCadastroDePaciente);

		JMenu mnFuncionrios = new JMenu("Funcion\u00E1rios     ");
		mnFuncionrios.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		menuBar.add(mnFuncionrios);

		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCadastrarProfissional cadProf = new TCadastrarProfissional(imgMadicina);
				desktopPane.add(cadProf);
				cadProf.setVisible(true);
				cadProf.btnExcluirProfessional.setEnabled(false);
				imgMadicina.setVisible(false);
			}
		});
		mntmCadastrar.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		mnFuncionrios.add(mntmCadastrar);

		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TCadastrarProfissional cadProf = new TCadastrarProfissional(imgMadicina);
				desktopPane.add(cadProf);
				cadProf.setVisible(true);
				cadProf.txtEquipe.setEnabled(false);
				cadProf.txtMatricula.setEnabled(false);
				cadProf.txtNomeProfesional.setEnabled(false);
				cadProf.txtSenha1.setEnabled(false);
				cadProf.txtSenha2.setEnabled(false);
				cadProf.cbbTipoProfesional.setEnabled(false);
				cadProf.btnCadastrarProfesional.setEnabled(false);
				imgMadicina.setVisible(false);
			}
		});
		mntmExcluir.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		mnFuncionrios.add(mntmExcluir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, "name_252675681504407");
		desktopPane.setLayout(null);

		imgMadicina = new JLabel("");

		login = new TLogin(desktopPane, mnPaciente, imgMadicina, mntmLogin);
		login.setSize(600, 425);
		login.setLocation(691, 307);
		desktopPane.add(login);
		login.setVisible(true);

		imgMadicina.setHorizontalAlignment(SwingConstants.CENTER);
		imgMadicina.setIcon(new ImageIcon(TInicial.class.getResource("/imagem/imagemMedic.jpg")));
		imgMadicina.setBounds(350, 70, 1172, 817);
		desktopPane.add(imgMadicina);

		mnPaciente.setEnabled(false);

		JMenuItem mntmLocalizarPaciente = new JMenuItem("Localizar Paciente");
		mntmLocalizarPaciente.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		mnPaciente.add(mntmLocalizarPaciente);
		setVisible(true);
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.MaskFormatter;

import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import control.Examen;
import control.Paciente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.Calendar;
import javax.swing.JTextField;

public class TExamen extends JInternalFrame {

	private final JPanel contentPanel = new JPanel();
	private final JLabel lblImagenFondo = new JLabel("");
	private JTextField txtSifilis1T;
	private JTextField txtHiv1T;
	private JTextField txtSifilis2T;
	private JTextField txtHiv2T;
	private JTextField txtSifilis3T;
	private JTextField txtHiv3T;
	private JTextField txtAbo1T;
	private JTextField txtHbHt1T;
	private JTextField txtGlisemia1T;
	private JTextField txtUsg1T_1;
	private JTextField txtUsg1T_2;
	private JTextField txtUrinaEas1T;
	private JTextField txtUrinocultura1T;
	private JTextField txtToxoplasmoseIgh1T;
	private JTextField txtToxoplasmoseIgm1T;
	private JTextField txtHepatite1T;
	private JTextField txtHepatite2T;
	private JTextField txtHepatite3T;
	private JTextField txtCitopatologico1T;
	private JTextField txtBasal2T;
	private JTextField txt602T;
	private JTextField txt1202T;
	private JTextField txtHbHt3T;
	private JTextField txtGlisemia3T;
	private JTextField txtUrinaEas3T;
	private String iconSifilis1T = "0";
	private JButton btnSalvarEdicao;
	private JButton btnSalvarCadastro;
	private String dataAbo1T;
	private String dataHbHt1T;
	private String dataGlisemia1T;
	private String dataUsg1T;
	private String dataUrinaEas1T;
	private String dataSifilis1T;
	private String dataHiv1T;
	private String dataHepatite1T;
	private String dataCitopatologico1T;
	private String dataUrinocultura1T;
	private String dataToxoplasmose1T;
	private String dataTotg2T;
	private String dataSifilis2T;
	private String dataHiv2T;
	private String dataHepatite2T;
	private String dataHbHt3T;
	private String dataGlisemia3T;
	private String dataUrinaEas3T;
	private String dataSifilis3T;
	private String dataHiv3T;
	private String dataHepatite3T;
	private String dataAbo1T2;
	private String dataHbHt1T2;
	private String dataGlisemia1T2;
	private String dataUsg1T2;
	private String dataUrinaEas1T2;
	private String dataSifilis1T2;
	private String dataHiv1T2;
	private String dataHepatite1T2;
	private String dataCitopatologico1T2;
	private String dataUrinocultura1T2;
	private String dataToxoplasmose1T2;
	private String dataTotg2T2;
	private String dataSifilis2T2;
	private String dataHiv2T2;
	private String dataHepatite2T2;
	private String dataHbHt3T2;
	private String dataGlisemia3T2;
	private String dataUrinaEas3T2;
	private String dataSifilis3T2;
	private String dataHiv3T2;
	private String dataHepatite3T2;
	private JFormattedTextField txtDataAbo1T;
	private JFormattedTextField txtDataHbHt1T;
	private JFormattedTextField txtDataGlisemia1T;
	private JFormattedTextField txtDataUsg1T;
	private JFormattedTextField txtDataUrinaEas1T;
	private JFormattedTextField txtDataSifilis1T;
	private JFormattedTextField txtDataHiv1T;
	private JFormattedTextField txtDataHepatite1T;
	private JFormattedTextField txtDataUrinocultura1T;
	private JFormattedTextField txtDataToxoplasmose1T;
	private JFormattedTextField txtDataCitopatologico1T;
	private JFormattedTextField txtDataTotg2T;
	private JFormattedTextField txtDataHbHt3T;
	private JFormattedTextField txtDataGlisemia3T;
	private JFormattedTextField txtDataUrinaEas3T;
	private JFormattedTextField txtDataSifilis2T;
	private JFormattedTextField txtDataHiv2T;
	private JFormattedTextField txtDataHepatite2T;
	private JFormattedTextField txtDataHepatite3T;
	private JFormattedTextField txtDataHiv3T;
	private JTextField txtDataSifilis3T;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_1;
	private JButton btnSifilis1T;
	private JLabel lblNewLabel;

	public void setBtnSalvarCadastro(JButton btnSalvarCadastro) {
		this.btnSalvarCadastro = btnSalvarCadastro;
	}

	public TExamen(String identidade) {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, 1920, 960);
		((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// para tirar a borda
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btnHiv1T = new JButton("");
		btnHiv1T.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnHiv1T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
			}
		});
		{
			lblNewLabel = new JLabel("OK");

			lblNewLabel.setBounds(67, 278, 56, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			label_1 = new JLabel("Data");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			label_1.setBounds(1477, 25, 56, 16);
			contentPanel.add(label_1);
		}
		{
			label_3 = new JLabel("Data");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			label_3.setBounds(511, 24, 56, 16);
			contentPanel.add(label_3);
		}
		{
			JLabel label = new JLabel("URINOCULTURA:");
			label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			label.setBounds(82, 523, 128, 18);
			contentPanel.add(label);
		}
		{
			label_2 = new JLabel("Data");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			label_2.setBounds(391, 373, 56, 16);
			contentPanel.add(label_2);
		}

		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setBounds(571, 706, 56, 16);
		contentPanel.add(lblData);

		txtDataHiv3T = new JFormattedTextField();
		txtDataHiv3T.setColumns(10);
		txtDataHiv3T.setBounds(389, 930, 95, 22);
		contentPanel.add(txtDataHiv3T);
		formatarCampos();

		txtDataHiv2T = new JFormattedTextField();
		txtDataHiv2T.setColumns(10);
		txtDataHiv2T.setBounds(389, 654, 95, 22);
		contentPanel.add(txtDataHiv2T);
		formatarCampos();

		txtDataSifilis3T = new JTextField();
		txtDataSifilis3T.setColumns(10);
		txtDataSifilis3T.setBounds(59, 930, 95, 22);
		contentPanel.add(txtDataSifilis3T);

		txtDataHepatite3T = new JFormattedTextField();
		txtDataHepatite3T.setColumns(10);
		txtDataHepatite3T.setBounds(937, 930, 95, 22);
		contentPanel.add(txtDataHepatite3T);
		formatarCampos();

		txtDataSifilis2T = new JFormattedTextField();
		txtDataSifilis2T.setColumns(10);
		txtDataSifilis2T.setBounds(59, 654, 95, 22);
		contentPanel.add(txtDataSifilis2T);
		formatarCampos();

		txtDataHbHt3T = new JFormattedTextField();
		txtDataHbHt3T.setColumns(10);
		txtDataHbHt3T.setBounds(557, 730, 95, 22);
		contentPanel.add(txtDataHbHt3T);
		formatarCampos();

		txtDataGlisemia3T = new JFormattedTextField();
		txtDataGlisemia3T.setColumns(10);
		txtDataGlisemia3T.setBounds(557, 777, 95, 22);
		contentPanel.add(txtDataGlisemia3T);
		formatarCampos();

		txtDataTotg2T = new JFormattedTextField();
		txtDataTotg2T.setColumns(10);
		txtDataTotg2T.setBounds(389, 402, 95, 22);
		contentPanel.add(txtDataTotg2T);
		formatarCampos();

		txtDataUrinaEas3T = new JFormattedTextField();
		txtDataUrinaEas3T.setColumns(10);
		txtDataUrinaEas3T.setBounds(557, 820, 95, 22);
		contentPanel.add(txtDataUrinaEas3T);
		formatarCampos();

		txtDataHepatite2T = new JFormattedTextField();
		txtDataHepatite2T.setColumns(10);
		txtDataHepatite2T.setBounds(937, 654, 95, 22);
		contentPanel.add(txtDataHepatite2T);
		formatarCampos();
		{
			txtDataHbHt1T = new JFormattedTextField();
			txtDataHbHt1T.setColumns(10);
			txtDataHbHt1T.setBounds(496, 91, 95, 22);
			contentPanel.add(txtDataHbHt1T);
			formatarCampos();
		}
		{
			txtDataUrinaEas1T = new JFormattedTextField();
			txtDataUrinaEas1T.setColumns(10);
			txtDataUrinaEas1T.setBounds(496, 236, 95, 22);
			contentPanel.add(txtDataUrinaEas1T);
			formatarCampos();
		}
		{
			txtDataUsg1T = new JFormattedTextField();
			txtDataUsg1T.setColumns(10);
			txtDataUsg1T.setBounds(496, 165, 95, 22);
			contentPanel.add(txtDataUsg1T);
			formatarCampos();
		}
		{
			txtDataUrinocultura1T = new JFormattedTextField();
			txtDataUrinocultura1T.setColumns(10);
			txtDataUrinocultura1T.setBounds(1462, 56, 95, 22);
			contentPanel.add(txtDataUrinocultura1T);
			formatarCampos();
		}
		{
			txtDataHepatite1T = new JFormattedTextField();
			txtDataHepatite1T.setColumns(10);
			txtDataHepatite1T.setBounds(937, 307, 95, 22);
			contentPanel.add(txtDataHepatite1T);
			formatarCampos();
		}
		{
			txtDataToxoplasmose1T = new JFormattedTextField();
			txtDataToxoplasmose1T.setColumns(10);
			txtDataToxoplasmose1T.setBounds(1462, 91, 95, 22);
			contentPanel.add(txtDataToxoplasmose1T);
			formatarCampos();
		}
		{
			txtDataGlisemia1T = new JFormattedTextField();
			txtDataGlisemia1T.setColumns(10);
			txtDataGlisemia1T.setBounds(496, 126, 95, 22);
			contentPanel.add(txtDataGlisemia1T);
			formatarCampos();
		}
		{
			txtDataSifilis1T = new JFormattedTextField();
			txtDataSifilis1T.setColumns(10);
			txtDataSifilis1T.setBounds(59, 307, 95, 22);
			contentPanel.add(txtDataSifilis1T);
			formatarCampos();
		}
		{
			txtDataCitopatologico1T = new JFormattedTextField();
			txtDataCitopatologico1T.setColumns(10);
			txtDataCitopatologico1T.setBounds(1462, 126, 95, 22);
			contentPanel.add(txtDataCitopatologico1T);
			formatarCampos();
		}
		{
			txtDataHiv1T = new JFormattedTextField();
			txtDataHiv1T.setColumns(10);
			txtDataHiv1T.setBounds(389, 307, 95, 22);
			contentPanel.add(txtDataHiv1T);
			formatarCampos();
		}

		JLabel lblExames = new JLabel("Exames");
		lblExames.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblExames.setBounds(674, -4, 136, 63);
		contentPanel.add(lblExames);

		txtDataAbo1T = new JFormattedTextField();
		txtDataAbo1T.setBounds(496, 56, 95, 22);
		contentPanel.add(txtDataAbo1T);
		txtDataAbo1T.setColumns(10);
		formatarCampos();
		{
			txtUrinaEas3T = new JTextField();
			txtUrinaEas3T.setBounds(250, 820, 273, 22);
			contentPanel.add(txtUrinaEas3T);
			txtUrinaEas3T.setColumns(10);
		}
		{
			txtGlisemia3T = new JTextField();
			txtGlisemia3T.setBounds(250, 777, 273, 22);
			contentPanel.add(txtGlisemia3T);
			txtGlisemia3T.setColumns(10);
		}
		{
			txtHbHt3T = new JTextField();
			txtHbHt3T.setBounds(250, 730, 273, 22);
			contentPanel.add(txtHbHt3T);
			txtHbHt3T.setColumns(10);
		}

		JLabel label_5 = new JLabel("Hb/Ht");
		label_5.setToolTipText("Hemograma Hb/Ht");
		label_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		label_5.setBounds(100, 728, 54, 23);
		contentPanel.add(label_5);

		JLabel label_4 = new JLabel("Urina-EAS:");
		label_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		label_4.setBounds(102, 818, 136, 23);
		contentPanel.add(label_4);

		JLabel lblGlicemiaDeJejum = new JLabel("Glicemia de Jejum:");
		lblGlicemiaDeJejum.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblGlicemiaDeJejum.setBounds(102, 775, 136, 23);
		contentPanel.add(lblGlicemiaDeJejum);

		txt1202T = new JTextField();
		txt1202T.setColumns(10);
		txt1202T.setBounds(212, 472, 136, 22);
		contentPanel.add(txt1202T);

		txt602T = new JTextField();
		txt602T.setColumns(10);
		txt602T.setBounds(212, 437, 136, 22);
		contentPanel.add(txt602T);

		txtBasal2T = new JTextField();
		txtBasal2T.setBounds(212, 402, 136, 22);
		contentPanel.add(txtBasal2T);
		txtBasal2T.setColumns(10);

		JLabel lblMin_1 = new JLabel("120 min:");
		lblMin_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblMin_1.setBounds(154, 474, 56, 16);
		contentPanel.add(lblMin_1);

		JLabel lblMin = new JLabel("60 min:");
		lblMin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblMin.setBounds(154, 439, 56, 16);
		contentPanel.add(lblMin);

		JLabel lblBasal2T = new JLabel("Basal:");
		lblBasal2T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblBasal2T.setBounds(154, 403, 56, 16);
		contentPanel.add(lblBasal2T);

		JLabel lblTotg2T = new JLabel("TOTG:");
		lblTotg2T.setToolTipText("Curva Glucemia 3 dosagem");
		lblTotg2T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblTotg2T.setBounds(100, 402, 56, 16);
		contentPanel.add(lblTotg2T);

		JLabel lblCitopatologico = new JLabel("Citopatologico:");
		lblCitopatologico.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblCitopatologico.setBounds(920, 130, 179, 18);
		contentPanel.add(lblCitopatologico);

		JLabel lblHepatite3T = new JLabel("Hepatite B-C");
		lblHepatite3T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblHepatite3T.setBounds(835, 928, 95, 23);
		contentPanel.add(lblHepatite3T);

		txtHepatite3T = new JTextField();
		txtHepatite3T.setColumns(10);
		txtHepatite3T.setBounds(1039, 930, 34, 22);
		contentPanel.add(txtHepatite3T);

		JButton btnHepatite3T = new JButton("");
		btnHepatite3T.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHepatite3T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
			}
		});
		btnHepatite3T.setForeground(Color.RED);
		btnHepatite3T.setBackground(Color.RED);
		btnHepatite3T.setBounds(1080, 928, 26, 25);
		contentPanel.add(btnHepatite3T);
		{
			JLabel lblHepatite1T = new JLabel("Hepatite B-C");
			lblHepatite1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblHepatite1T.setBounds(835, 305, 95, 23);
			contentPanel.add(lblHepatite1T);
		}
		{
			JButton btnHepatite1T = new JButton("");
			btnHepatite1T.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					btnHepatite1T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
				}
			});
			btnHepatite1T.setForeground(Color.RED);
			btnHepatite1T.setBackground(Color.RED);
			btnHepatite1T.setBounds(1080, 304, 26, 25);
			contentPanel.add(btnHepatite1T);
		}
		{
			txtHepatite1T = new JTextField();
			txtHepatite1T.setColumns(10);
			txtHepatite1T.setBounds(1039, 307, 34, 22);
			contentPanel.add(txtHepatite1T);
		}
		{
			JLabel lblHepatite2T = new JLabel("Hepatite B-C");
			lblHepatite2T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblHepatite2T.setBounds(835, 652, 95, 23);
			contentPanel.add(lblHepatite2T);
		}
		{
			txtHepatite2T = new JTextField();
			txtHepatite2T.setColumns(10);
			txtHepatite2T.setBounds(1039, 654, 34, 22);
			contentPanel.add(txtHepatite2T);
		}
		{
			JButton btnHepatite2T = new JButton("");
			btnHepatite2T.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnHepatite2T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
				}
			});
			btnHepatite2T.setForeground(Color.RED);
			btnHepatite2T.setBackground(Color.RED);
			btnHepatite2T.setBounds(1080, 654, 26, 25);
			contentPanel.add(btnHepatite2T);
		}
		{
			txtToxoplasmoseIgm1T = new JTextField();
			txtToxoplasmoseIgm1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtToxoplasmoseIgm1T.setColumns(10);
			txtToxoplasmoseIgm1T.setBounds(1092, 91, 156, 22);
			contentPanel.add(txtToxoplasmoseIgm1T);
		}

		txtAbo1T = new JTextField();
		txtAbo1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAbo1T.setBounds(194, 56, 286, 22);
		contentPanel.add(txtAbo1T);
		txtAbo1T.setColumns(10);
		{
			txtUrinaEas1T = new JTextField();
			txtUrinaEas1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtUrinaEas1T.setColumns(10);
			txtUrinaEas1T.setBounds(194, 236, 286, 22);
			contentPanel.add(txtUrinaEas1T);
		}
		{
			txtUrinocultura1T = new JTextField();
			txtUrinocultura1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtUrinocultura1T.setColumns(10);
			txtUrinocultura1T.setBounds(1092, 56, 356, 22);
			contentPanel.add(txtUrinocultura1T);
		}
		{
			txtHbHt1T = new JTextField();
			txtHbHt1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtHbHt1T.setBounds(194, 91, 286, 22);
			contentPanel.add(txtHbHt1T);
			txtHbHt1T.setColumns(10);
		}
		{
			txtToxoplasmoseIgh1T = new JTextField();
			txtToxoplasmoseIgh1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtToxoplasmoseIgh1T.setColumns(10);
			txtToxoplasmoseIgh1T.setBounds(1294, 91, 156, 22);
			contentPanel.add(txtToxoplasmoseIgh1T);
		}
		{
			txtGlisemia1T = new JTextField();
			txtGlisemia1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtGlisemia1T.setColumns(10);
			txtGlisemia1T.setBounds(234, 126, 245, 22);
			contentPanel.add(txtGlisemia1T);
		}
		{
			txtUsg1T_1 = new JTextField();
			txtUsg1T_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtUsg1T_1.setColumns(10);
			txtUsg1T_1.setBounds(194, 165, 286, 22);
			contentPanel.add(txtUsg1T_1);
		}
		{
			txtUsg1T_2 = new JTextField();
			txtUsg1T_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtUsg1T_2.setColumns(10);
			txtUsg1T_2.setBounds(194, 195, 286, 22);
			contentPanel.add(txtUsg1T_2);
		}
		{
			JLabel label = new JLabel("");
			label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			label.setBounds(557, 130, 179, 18);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("");
			label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			label.setBounds(557, 156, 179, 18);
			contentPanel.add(label);
		}
		{
			JLabel lblUrinocultura1T = new JLabel("URINOCULTURA:");
			lblUrinocultura1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblUrinocultura1T.setBounds(920, 56, 128, 18);
			contentPanel.add(lblUrinocultura1T);
		}
		{
			JLabel lblHiv3T = new JLabel("HIV:");
			lblHiv3T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblHiv3T.setBounds(343, 928, 34, 23);
			contentPanel.add(lblHiv3T);
		}
		{
			txtSifilis3T = new JTextField();
			txtSifilis3T.setColumns(10);
			txtSifilis3T.setBounds(157, 930, 34, 22);
			contentPanel.add(txtSifilis3T);
		}
		{
			JButton btnSifilis3T = new JButton("");
			btnSifilis3T.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnSifilis3T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
				}
			});
			btnSifilis3T.setForeground(Color.RED);
			btnSifilis3T.setBackground(Color.RED);
			btnSifilis3T.setBounds(194, 927, 26, 25);
			contentPanel.add(btnSifilis3T);
		}
		{
			JButton btnHiv3T = new JButton("");
			btnHiv3T.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnHiv3T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
				}
			});
			btnHiv3T.setForeground(Color.RED);
			btnHiv3T.setBackground(Color.RED);
			btnHiv3T.setBounds(530, 926, 26, 25);
			contentPanel.add(btnHiv3T);
		}
		{
			JLabel lblSfilis3T = new JLabel("S\u00EDfilis:");
			lblSfilis3T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblSfilis3T.setBounds(12, 929, 45, 23);
			contentPanel.add(lblSfilis3T);
		}
		{
			txtHiv3T = new JTextField();
			txtHiv3T.setColumns(10);
			txtHiv3T.setBounds(490, 930, 34, 22);
			contentPanel.add(txtHiv3T);
		}
		{
			txtSifilis2T = new JTextField();
			txtSifilis2T.setColumns(10);
			txtSifilis2T.setBounds(157, 654, 34, 22);
			contentPanel.add(txtSifilis2T);
		}
		{
			txtHiv2T = new JTextField();
			txtHiv2T.setColumns(10);
			txtHiv2T.setBounds(490, 654, 34, 22);
			contentPanel.add(txtHiv2T);
		}
		{
			JLabel lblSfilis2T = new JLabel("S\u00EDfilis:");
			lblSfilis2T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblSfilis2T.setBounds(12, 652, 45, 23);
			contentPanel.add(lblSfilis2T);
		}
		{
			JLabel lblHiv2T = new JLabel("HIV:");
			lblHiv2T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblHiv2T.setBounds(343, 652, 34, 23);
			contentPanel.add(lblHiv2T);
		}
		{
			JButton btnHiv2T = new JButton("");
			btnHiv2T.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnHiv2T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
				}
			});
			btnHiv2T.setForeground(Color.RED);
			btnHiv2T.setBackground(Color.RED);
			btnHiv2T.setBounds(530, 654, 26, 25);
			contentPanel.add(btnHiv2T);
		}
		{
			JButton btnSifilis2T = new JButton("");
			btnSifilis2T.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnSifilis2T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
				}
			});
			btnSifilis2T.setForeground(Color.RED);
			btnSifilis2T.setBackground(Color.RED);
			btnSifilis2T.setBounds(194, 654, 26, 25);
			contentPanel.add(btnSifilis2T);
		}
		{
			txtHiv1T = new JTextField();
			txtHiv1T.setColumns(10);
			txtHiv1T.setBounds(490, 307, 34, 22);
			contentPanel.add(txtHiv1T);
		}

		txtSifilis1T = new JTextField();
		txtSifilis1T.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = txtSifilis1T.getText();
				if (s.equals("")) {
				} else {
					btnSifilis1T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));

				}
			}
		});
		txtSifilis1T.setBounds(157, 307, 34, 22);
		contentPanel.add(txtSifilis1T);
		txtSifilis1T.setColumns(10);
		btnHiv1T.setBackground(Color.RED);
		btnHiv1T.setForeground(Color.RED);
		btnHiv1T.setBounds(530, 304, 26, 25);
		contentPanel.add(btnHiv1T);

		btnSifilis1T = new JButton("");
		btnSifilis1T.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				btnSifilis1T.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Imagenok1.jpg")));
				iconSifilis1T = "1";
			}
		});
		btnSifilis1T.setForeground(Color.RED);
		btnSifilis1T.setBackground(Color.RED);
		btnSifilis1T.setBounds(194, 304, 26, 25);
		contentPanel.add(btnSifilis1T);
		{
			JLabel lblSfilis1T = new JLabel("S\u00EDfilis:");
			lblSfilis1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblSfilis1T.setBounds(12, 305, 45, 23);
			contentPanel.add(lblSfilis1T);
		}
		{
			JLabel lblHiv1T = new JLabel("HIV:");
			lblHiv1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblHiv1T.setBounds(343, 305, 34, 23);
			contentPanel.add(lblHiv1T);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBackground(Color.ORANGE);
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBounds(810, 0, 2, 979);
			contentPanel.add(separator);
		}
		{
			JLabel lblUrinaeas1T = new JLabel("Urina-EAS:");
			lblUrinaeas1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblUrinaeas1T.setBounds(102, 234, 136, 23);
			contentPanel.add(lblUrinaeas1T);
		}
		{
			JLabel lblHemograma1T = new JLabel("Hb/Ht");
			lblHemograma1T.setToolTipText("Hemograma Hb/Ht");
			lblHemograma1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblHemograma1T.setBounds(100, 89, 54, 23);
			contentPanel.add(lblHemograma1T);
		}
		{
			JLabel lblUSG1T = new JLabel("USG Obst:");
			lblUSG1T.setToolTipText("Ultrassonografia Obstetrica \r\nIG USG + Peso Fetal + Placenta + Liquido \r\n");
			lblUSG1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblUSG1T.setBounds(100, 179, 74, 23);
			contentPanel.add(lblUSG1T);
		}
		{
			JLabel lblGlicemia1T = new JLabel("Glicemia de Jejum:");
			lblGlicemia1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblGlicemia1T.setBounds(100, 124, 136, 23);
			contentPanel.add(lblGlicemia1T);
		}
		{
			JLabel lblToxoplasmose1T = new JLabel("Toxoplasmose IgM/IgG:");
			lblToxoplasmose1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblToxoplasmose1T.setBounds(920, 89, 168, 23);
			contentPanel.add(lblToxoplasmose1T);
		}
		{
			JLabel lblAbo1T = new JLabel("ABO-RH:");
			lblAbo1T.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			lblAbo1T.setBounds(100, 54, 74, 23);
			contentPanel.add(lblAbo1T);
		}
		{
			JLabel lblTrimentre_1 = new JLabel("3\u00B0 Trimentre");
			lblTrimentre_1.setForeground(Color.RED);
			lblTrimentre_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
			lblTrimentre_1.setBounds(0, 702, 123, 23);
			contentPanel.add(lblTrimentre_1);
		}
		{
			JLabel lblTrimentre_2 = new JLabel("2\u00B0 Trimentre");
			lblTrimentre_2.setForeground(Color.RED);
			lblTrimentre_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
			lblTrimentre_2.setBounds(0, 366, 123, 23);
			contentPanel.add(lblTrimentre_2);
		}
		{
			JLabel lblTrimentre = new JLabel("1\u00B0 Trimentre");
			lblTrimentre.setForeground(Color.RED);
			lblTrimentre.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
			lblTrimentre.setBounds(0, 0, 123, 23);
			contentPanel.add(lblTrimentre);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBackground(Color.ORANGE);
			separator.setBounds(0, 695, 1904, 2);
			contentPanel.add(separator);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBackground(Color.ORANGE);
			separator.setBounds(0, 351, 1904, 2);
			contentPanel.add(separator);
		}
		lblImagenFondo.setForeground(Color.ORANGE);
		lblImagenFondo.setIcon(new ImageIcon(TExamen.class.getResource("/imagem/Examen1.jpg")));
		lblImagenFondo.setBounds(0, -31, 812, 1065);
		contentPanel.add(lblImagenFondo);

		txtCitopatologico1T = new JTextField();
		txtCitopatologico1T.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCitopatologico1T.setColumns(10);
		txtCitopatologico1T.setBounds(1092, 126, 358, 22);
		contentPanel.add(txtCitopatologico1T);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnSalvarCadastro = new JButton("Salvar Cadastro");
				btnSalvarCadastro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String abo1T = txtAbo1T.getText();
						dataAbo1T = txtDataAbo1T.getText();
						String hbHt1T = txtHbHt1T.getText();
						dataHbHt1T = txtDataHbHt1T.getText();
						String glisemia1T = txtGlisemia1T.getText();
						dataGlisemia1T = txtDataGlisemia1T.getText();
						String usg1T_1 = txtUsg1T_1.getText();
						String usg1T_2 = txtUsg1T_2.getText();
						dataUsg1T = txtDataUsg1T.getText();
						String urinaEas1T = txtUrinaEas1T.getText();
						dataUrinaEas1T = txtDataUrinaEas1T.getText();
						String sifilis1T = txtSifilis1T.getText();
						dataSifilis1T = txtDataSifilis1T.getText();
						String hiv1T = txtHiv1T.getText();
						dataHiv1T = txtDataHiv1T.getText();
						String hepatite1T = txtHepatite1T.getText();
						dataHepatite1T = txtDataHepatite1T.getText();
						String citopatologico1T = txtCitopatologico1T.getText();
						dataCitopatologico1T = txtDataCitopatologico1T.getText();
						String urinocultura1T = txtUrinocultura1T.getText();
						dataUrinocultura1T = txtDataUrinocultura1T.getText();
						String toxoplasmoseIgm1T = txtToxoplasmoseIgm1T.getText();
						String toxoplasmoseIgh1T = txtToxoplasmoseIgh1T.getText();
						dataToxoplasmose1T = txtDataToxoplasmose1T.getText();
						String basal2T = txtBasal2T.getText();
						dataTotg2T = txtDataTotg2T.getText();
						String b602T = txt602T.getText();
						String b1202T = txt1202T.getText();
						String sifilis2T = txtSifilis2T.getText();
						dataSifilis2T = txtDataSifilis2T.getText();
						String hiv2T = txtHiv2T.getText();
						dataHiv2T = txtDataHiv2T.getText();
						String hepatite2T = txtHepatite2T.getText();
						dataHepatite2T = txtDataHepatite2T.getText();
						String hbHt3T = txtHbHt3T.getText();
						dataHbHt3T = txtDataHbHt3T.getText();
						String glisemia3T = txtGlisemia3T.getText();
						dataGlisemia3T = txtDataGlisemia3T.getText();
						String urinaEas3T = txtUrinaEas3T.getText();
						dataUrinaEas3T = txtDataUrinaEas3T.getText();
						String sifilis3T = txtSifilis3T.getText();
						dataSifilis3T = txtDataSifilis3T.getText();
						String hiv3T = txtHiv3T.getText();
						dataHiv3T = txtDataHiv3T.getText();
						String hepatite3T = txtHepatite3T.getText();
						dataHepatite3T = txtDataHepatite3T.getText();

						Examen examenPac = new Examen();

						examenPac.cadastrarExamen(identidade, abo1T, dataAbo1T, hbHt1T, dataHbHt1T, glisemia1T,
								dataGlisemia1T, usg1T_1, usg1T_2, dataUsg1T, urinaEas1T, dataUrinaEas1T, sifilis1T,
								dataSifilis1T, hiv1T, dataHiv1T, hepatite1T, dataHepatite1T, citopatologico1T,
								dataCitopatologico1T, urinocultura1T, dataUrinocultura1T, toxoplasmoseIgm1T,
								toxoplasmoseIgh1T, dataToxoplasmose1T, basal2T, dataTotg2T, b602T, b1202T, sifilis2T,
								dataSifilis2T, hiv2T, dataHiv2T, hepatite2T, dataHepatite2T, hbHt3T, dataHbHt3T,
								glisemia3T, dataGlisemia3T, urinaEas3T, dataUrinaEas3T, sifilis3T, dataSifilis3T, hiv3T,
								dataHiv3T, hepatite3T, dataHepatite3T);
						show(false);
					}
				});

				JLabel lblCalendario = new JLabel("Calendario\u2192");
				buttonPane.add(lblCalendario);

				JDateChooser dateChooserCalendario = new JDateChooser();
				dateChooserCalendario.setFont(new Font("Consolas", Font.BOLD, 18));
				buttonPane.add(dateChooserCalendario);
				{
					btnSalvarEdicao = new JButton("Salvar Edi\u00E7ao");
					btnSalvarEdicao.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							String abo1T = txtAbo1T.getText();
							dataAbo1T2 = txtDataAbo1T.getText();
							String hbHt1T = txtHbHt1T.getText();
							dataHbHt1T2 = txtDataHbHt1T.getText();
							String glisemia1T = txtGlisemia1T.getText();
							dataGlisemia1T2 = txtDataGlisemia1T.getText();
							String usg1T_1 = txtUsg1T_1.getText();
							String usg1T_2 = txtUsg1T_2.getText();
							dataUsg1T2 = txtDataUsg1T.getText();
							String urinaEas1T = txtUrinaEas1T.getText();
							dataUrinaEas1T2 = txtDataUrinaEas1T.getText();
							String sifilis1T = txtSifilis1T.getText();
							dataSifilis1T2 = txtDataSifilis1T.getText();
							String hiv1T = txtHiv1T.getText();
							dataHiv1T2 = txtDataHiv1T.getText();
							String hepatite1T = txtHepatite1T.getText();
							dataHepatite1T2 = txtDataHepatite1T.getText();
							String citopatologico1T = txtCitopatologico1T.getText();
							dataCitopatologico1T2 = txtDataCitopatologico1T.getText();
							String urinocultura1T = txtUrinocultura1T.getText();
							dataUrinocultura1T2 = txtDataUrinocultura1T.getText();
							String toxoplasmoseIgm1T = txtToxoplasmoseIgm1T.getText();
							String toxoplasmoseIgh1T = txtToxoplasmoseIgh1T.getText();
							dataToxoplasmose1T2 = txtDataToxoplasmose1T.getText();
							String basal2T = txtBasal2T.getText();
							dataTotg2T2 = txtDataTotg2T.getText();
							String b602T = txt602T.getText();
							String b1202T = txt1202T.getText();
							String sifilis2T = txtSifilis2T.getText();
							dataSifilis2T2 = txtDataSifilis2T.getText();
							String hiv2T = txtHiv2T.getText();
							dataHiv2T2 = txtDataHiv2T.getText();
							String hepatite2T = txtHepatite2T.getText();
							dataHepatite2T2 = txtDataHepatite2T.getText();
							String hbHt3T = txtHbHt3T.getText();
							dataHbHt3T2 = txtDataHbHt3T.getText();
							String glisemia3T = txtGlisemia3T.getText();
							dataGlisemia3T2 = txtDataGlisemia3T.getText();
							String urinaEas3T = txtUrinaEas3T.getText();
							dataUrinaEas3T2 = txtDataUrinaEas3T.getText();
							String sifilis3T = txtSifilis3T.getText();
							dataSifilis3T2 = txtDataSifilis3T.getText();
							String hiv3T = txtHiv3T.getText();
							dataHiv3T2 = txtDataHiv3T.getText();
							String hepatite3T = txtHepatite3T.getText();
							dataHepatite3T2 = txtDataHepatite3T.getText();

							Examen examenPac = new Examen();
							examenPac.editarExames(identidade, abo1T, dataAbo1T2, hbHt1T, dataHbHt1T2, glisemia1T,
									dataGlisemia1T2, usg1T_1, usg1T_2, dataUsg1T2, urinaEas1T, dataUrinaEas1T2,
									sifilis1T, dataSifilis1T2, hiv1T, dataHiv1T2, hepatite1T, dataHepatite1T2,
									citopatologico1T, dataCitopatologico1T2, urinocultura1T, dataUrinocultura1T2,
									toxoplasmoseIgm1T, toxoplasmoseIgh1T, dataToxoplasmose1T2, basal2T, dataTotg2T2,
									b602T, b1202T, sifilis2T, dataSifilis2T2, hiv2T, dataHiv2T2, hepatite2T,
									dataHepatite2T2, hbHt3T, dataHbHt3T2, glisemia3T, dataGlisemia3T2, urinaEas3T,
									dataUrinaEas3T2, sifilis3T, dataSifilis3T2, hiv3T, dataHiv3T2, hepatite3T,
									dataHepatite3T2);
							show(false);
						}
					});
					{
						JButton btnSair = new JButton("Sair");
						btnSair.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								show(false);
							}
						});
						buttonPane.add(btnSair);
						btnSair.setBackground(new Color(240, 230, 140));
						btnSair.setFont(new Font("Dialog", Font.BOLD, 20));
					}
					btnSalvarEdicao.setFont(new Font("Dialog", Font.BOLD, 20));
					btnSalvarEdicao.setActionCommand("OK");
					buttonPane.add(btnSalvarEdicao);
				}
				btnSalvarCadastro.setFont(new Font("Dialog", Font.BOLD, 20));
				btnSalvarCadastro.setActionCommand("OK");
				buttonPane.add(btnSalvarCadastro);
				getRootPane().setDefaultButton(btnSalvarCadastro);
			}
		}
	}

	private void formatarCampos() {
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataAbo1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHbHt1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataGlisemia1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataUsg1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataUrinaEas1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataSifilis1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHiv1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHepatite1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataCitopatologico1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataUrinocultura1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataToxoplasmose1T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataTotg2T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataSifilis2T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHiv2T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHepatite2T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHbHt3T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataGlisemia3T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataUrinaEas3T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHiv3T);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			MaskFormatter mas = new MaskFormatter("##/##/####");
			mas.install(txtDataHepatite3T);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public String getDataAbo1T() {
		return dataAbo1T;
	}

	public void setDataAbo1T(String dataAbo1T) {
		this.dataAbo1T = dataAbo1T;
	}

	public String getDataHbHt1T() {
		return dataHbHt1T;
	}

	public void setDataHbHt1T(String dataHbHt1T) {
		this.dataHbHt1T = dataHbHt1T;
	}

	public String getDataGlisemia1T() {
		return dataGlisemia1T;
	}

	public void setDataGlisemia1T(String dataGlisemia1T) {
		this.dataGlisemia1T = dataGlisemia1T;
	}

	public String getDataUsg1T() {
		return dataUsg1T;
	}

	public void setDataUsg1T(String dataUsg1T) {
		this.dataUsg1T = dataUsg1T;
	}

	public String getDataUrinaEas1T() {
		return dataUrinaEas1T;
	}

	public void setDataUrinaEas1T(String dataUrinaEas1T) {
		this.dataUrinaEas1T = dataUrinaEas1T;
	}

	public String getDataSifilis1T() {
		return dataSifilis1T;
	}

	public void setDataSifilis1T(String dataSifilis1T) {
		this.dataSifilis1T = dataSifilis1T;
	}

	public String getDataHiv1T() {
		return dataHiv1T;
	}

	public void setDataHiv1T(String dataHiv1T) {
		this.dataHiv1T = dataHiv1T;
	}

	public String getDataHepatite1T() {
		return dataHepatite1T;
	}

	public void setDataHepatite1T(String dataHepatite1T) {
		this.dataHepatite1T = dataHepatite1T;
	}

	public String getDataCitopatologico1T() {
		return dataCitopatologico1T;
	}

	public void setDataCitopatologico1T(String dataCitopatologico1T) {
		this.dataCitopatologico1T = dataCitopatologico1T;
	}

	public String getDataUrinocultura1T() {
		return dataUrinocultura1T;
	}

	public void setDataUrinocultura1T(String dataUrinocultura1T) {
		this.dataUrinocultura1T = dataUrinocultura1T;
	}

	public String getDataToxoplasmose1T() {
		return dataToxoplasmose1T;
	}

	public void setDataToxoplasmose1T(String dataToxoplasmose1T) {
		this.dataToxoplasmose1T = dataToxoplasmose1T;
	}

	public String getDataTotg2T() {
		return dataTotg2T;
	}

	public void setDataTotg2T(String dataTotg2T) {
		this.dataTotg2T = dataTotg2T;
	}

	public String getDataSifilis2T() {
		return dataSifilis2T;
	}

	public void setDataSifilis2T(String dataSifilis2T) {
		this.dataSifilis2T = dataSifilis2T;
	}

	public String getDataHiv2T() {
		return dataHiv2T;
	}

	public void setDataHiv2T(String dataHiv2T) {
		this.dataHiv2T = dataHiv2T;
	}

	public String getDataHepatite2T() {
		return dataHepatite2T;
	}

	public void setDataHepatite2T(String dataHepatite2T) {
		this.dataHepatite2T = dataHepatite2T;
	}

	public String getDataHbHt3T() {
		return dataHbHt3T;
	}

	public void setDataHbHt3T(String dataHbHt3T) {
		this.dataHbHt3T = dataHbHt3T;
	}

	public String getDataGlisemia3T() {
		return dataGlisemia3T;
	}

	public void setDataGlisemia3T(String dataGlisemia3T) {
		this.dataGlisemia3T = dataGlisemia3T;
	}

	public String getDataUrinaEas3T() {
		return dataUrinaEas3T;
	}

	public void setDataUrinaEas3T(String dataUrinaEas3T) {
		this.dataUrinaEas3T = dataUrinaEas3T;
	}

	public String getDataSifilis3T() {
		return dataSifilis3T;
	}

	public void setDataSifilis3T(String dataSifilis3T) {
		this.dataSifilis3T = dataSifilis3T;
	}

	public String getDataHiv3T() {
		return dataHiv3T;
	}

	public void setDataHiv3T(String dataHiv3T) {
		this.dataHiv3T = dataHiv3T;
	}

	public String getDataHepatite3T() {
		return dataHepatite3T;
	}

	public void setDataHepatite3T(String dataHepatite3T) {
		this.dataHepatite3T = dataHepatite3T;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JTextField getTxtSifilis1T() {
		return txtSifilis1T;
	}

	public void setTxtSifilis1T(JTextField txtSifilis1T) {
		this.txtSifilis1T = txtSifilis1T;
	}

	public JTextField getTxtHiv1T() {
		return txtHiv1T;
	}

	public void setTxtHiv1T(JTextField txtHiv1T) {
		this.txtHiv1T = txtHiv1T;
	}

	public JTextField getTxtSifilis2T() {
		return txtSifilis2T;
	}

	public void setTxtSifilis2T(JTextField txtSifilis2T) {
		this.txtSifilis2T = txtSifilis2T;
	}

	public JTextField getTxtHiv2T() {
		return txtHiv2T;
	}

	public void setTxtHiv2T(JTextField txtHiv2T) {
		this.txtHiv2T = txtHiv2T;
	}

	public JTextField getTxtSifilis3T() {
		return txtSifilis3T;
	}

	public void setTxtSifilis3T(JTextField txtSifilis3T) {
		this.txtSifilis3T = txtSifilis3T;
	}

	public JTextField getTxtHiv3T() {
		return txtHiv3T;
	}

	public void setTxtHiv3T(JTextField txtHiv3T) {
		this.txtHiv3T = txtHiv3T;
	}

	public JTextField getTxtHbHt1T() {
		return txtHbHt1T;
	}

	public void setTxtHbHt1T(JTextField txtHbHt1T) {
		this.txtHbHt1T = txtHbHt1T;
	}

	public JTextField getTxtGlisemia1T() {
		return txtGlisemia1T;
	}

	public void setTxtGlisemia1T(JTextField txtGlisemia1T) {
		this.txtGlisemia1T = txtGlisemia1T;
	}

	public JTextField getTxtUsg1T_1() {
		return txtUsg1T_1;
	}

	public void setTxtUsg1T_1(JTextField txtUsg1T_1) {
		this.txtUsg1T_1 = txtUsg1T_1;
	}

	public JTextField getTxtUsg1T_2() {
		return txtUsg1T_2;
	}

	public void setTxtUsg1T_2(JTextField txtUsg1T_2) {
		this.txtUsg1T_2 = txtUsg1T_2;
	}

	public JTextField getTxtUrinaEas1T() {
		return txtUrinaEas1T;
	}

	public void setTxtUrinaEas1T(JTextField txtUrinaEas1T) {
		this.txtUrinaEas1T = txtUrinaEas1T;
	}

	public JTextField getTxtUrinocultura1T() {
		return txtUrinocultura1T;
	}

	public void setTxtUrinocultura1T(JTextField txtUrinocultura1T) {
		this.txtUrinocultura1T = txtUrinocultura1T;
	}

	public JTextField getTxtToxoplasmoseIgh1T() {
		return txtToxoplasmoseIgh1T;
	}

	public void setTxtToxoplasmoseIgh1T(JTextField txtToxoplasmoseIgh1T) {
		this.txtToxoplasmoseIgh1T = txtToxoplasmoseIgh1T;
	}

	public String getDataAbo1T2() {
		return dataAbo1T2;
	}

	public void setDataAbo1T2(String dataAbo1T2) {
		this.dataAbo1T2 = dataAbo1T2;
	}

	public String getDataHbHt1T2() {
		return dataHbHt1T2;
	}

	public void setDataHbHt1T2(String dataHbHt1T2) {
		this.dataHbHt1T2 = dataHbHt1T2;
	}

	public String getDataGlisemia1T2() {
		return dataGlisemia1T2;
	}

	public void setDataGlisemia1T2(String dataGlisemia1T2) {
		this.dataGlisemia1T2 = dataGlisemia1T2;
	}

	public String getDataUsg1T2() {
		return dataUsg1T2;
	}

	public void setDataUsg1T2(String dataUsg1T2) {
		this.dataUsg1T2 = dataUsg1T2;
	}

	public String getDataUrinaEas1T2() {
		return dataUrinaEas1T2;
	}

	public void setDataUrinaEas1T2(String dataUrinaEas1T2) {
		this.dataUrinaEas1T2 = dataUrinaEas1T2;
	}

	public String getDataSifilis1T2() {
		return dataSifilis1T2;
	}

	public void setDataSifilis1T2(String dataSifilis1T2) {
		this.dataSifilis1T2 = dataSifilis1T2;
	}

	public String getDataHiv1T2() {
		return dataHiv1T2;
	}

	public void setDataHiv1T2(String dataHiv1T2) {
		this.dataHiv1T2 = dataHiv1T2;
	}

	public String getDataHepatite1T2() {
		return dataHepatite1T2;
	}

	public void setDataHepatite1T2(String dataHepatite1T2) {
		this.dataHepatite1T2 = dataHepatite1T2;
	}

	public String getDataCitopatologico1T2() {
		return dataCitopatologico1T2;
	}

	public void setDataCitopatologico1T2(String dataCitopatologico1T2) {
		this.dataCitopatologico1T2 = dataCitopatologico1T2;
	}

	public String getDataUrinocultura1T2() {
		return dataUrinocultura1T2;
	}

	public void setDataUrinocultura1T2(String dataUrinocultura1T2) {
		this.dataUrinocultura1T2 = dataUrinocultura1T2;
	}

	public String getDataToxoplasmose1T2() {
		return dataToxoplasmose1T2;
	}

	public void setDataToxoplasmose1T2(String dataToxoplasmose1T2) {
		this.dataToxoplasmose1T2 = dataToxoplasmose1T2;
	}

	public String getDataTotg2T2() {
		return dataTotg2T2;
	}

	public void setDataTotg2T2(String dataTotg2T2) {
		this.dataTotg2T2 = dataTotg2T2;
	}

	public String getDataSifilis2T2() {
		return dataSifilis2T2;
	}

	public void setDataSifilis2T2(String dataSifilis2T2) {
		this.dataSifilis2T2 = dataSifilis2T2;
	}

	public String getDataHiv2T2() {
		return dataHiv2T2;
	}

	public void setDataHiv2T2(String dataHiv2T2) {
		this.dataHiv2T2 = dataHiv2T2;
	}

	public String getDataHepatite2T2() {
		return dataHepatite2T2;
	}

	public void setDataHepatite2T2(String dataHepatite2T2) {
		this.dataHepatite2T2 = dataHepatite2T2;
	}

	public String getDataHbHt3T2() {
		return dataHbHt3T2;
	}

	public void setDataHbHt3T2(String dataHbHt3T2) {
		this.dataHbHt3T2 = dataHbHt3T2;
	}

	public String getDataGlisemia3T2() {
		return dataGlisemia3T2;
	}

	public void setDataGlisemia3T2(String dataGlisemia3T2) {
		this.dataGlisemia3T2 = dataGlisemia3T2;
	}

	public String getDataUrinaEas3T2() {
		return dataUrinaEas3T2;
	}

	public void setDataUrinaEas3T2(String dataUrinaEas3T2) {
		this.dataUrinaEas3T2 = dataUrinaEas3T2;
	}

	public String getDataSifilis3T2() {
		return dataSifilis3T2;
	}

	public void setDataSifilis3T2(String dataSifilis3T2) {
		this.dataSifilis3T2 = dataSifilis3T2;
	}

	public String getDataHiv3T2() {
		return dataHiv3T2;
	}

	public void setDataHiv3T2(String dataHiv3T2) {
		this.dataHiv3T2 = dataHiv3T2;
	}

	public String getDataHepatite3T2() {
		return dataHepatite3T2;
	}

	public void setDataHepatite3T2(String dataHepatite3T2) {
		this.dataHepatite3T2 = dataHepatite3T2;
	}

	public JTextField getTxtDataAbo1T() {
		return txtDataAbo1T;
	}

	public void setTxtDataAbo1T(JFormattedTextField txtDataAbo1T) {
		this.txtDataAbo1T = txtDataAbo1T;
	}

	public JTextField getTxtDataHbHt1T() {
		return txtDataHbHt1T;
	}

	public void setTxtDataHbHt1T(JFormattedTextField txtDataHbHt1T) {
		this.txtDataHbHt1T = txtDataHbHt1T;
	}

	public JTextField getTxtDataGlisemia1T() {
		return txtDataGlisemia1T;
	}

	public void setTxtDataGlisemia1T(JFormattedTextField txtDataGlisemia1T) {
		this.txtDataGlisemia1T = txtDataGlisemia1T;
	}

	public JTextField getTxtDataUsg1T() {
		return txtDataUsg1T;
	}

	public void setTxtDataUsg1T(JFormattedTextField txtDataUsg1T) {
		this.txtDataUsg1T = txtDataUsg1T;
	}

	public JTextField getTxtDataUrinaEas1T() {
		return txtDataUrinaEas1T;
	}

	public void setTxtDataUrinaEas1T(JFormattedTextField txtDataUrinaEas1T) {
		this.txtDataUrinaEas1T = txtDataUrinaEas1T;
	}

	public JTextField getTxtDataSifilis1T() {
		return txtDataSifilis1T;
	}

	public void setTxtDataSifilis1T(JFormattedTextField txtDataSifilis1T) {
		this.txtDataSifilis1T = txtDataSifilis1T;
	}

	public JTextField getTxtDataHiv1T() {
		return txtDataHiv1T;
	}

	public void setTxtDataHiv1T(JFormattedTextField txtDataHiv1T) {
		this.txtDataHiv1T = txtDataHiv1T;
	}

	public JTextField getTxtDataHepatite1T() {
		return txtDataHepatite1T;
	}

	public void setTxtDataHepatite1T(JFormattedTextField txtDataHepatite1T) {
		this.txtDataHepatite1T = txtDataHepatite1T;
	}

	public JTextField getTxtDataUrinocultura1T() {
		return txtDataUrinocultura1T;
	}

	public void setTxtDataUrinocultura1T(JFormattedTextField txtDataUrinocultura1T) {
		this.txtDataUrinocultura1T = txtDataUrinocultura1T;
	}

	public JTextField getTxtDataToxoplasmose1T() {
		return txtDataToxoplasmose1T;
	}

	public void setTxtDataToxoplasmose1T(JFormattedTextField txtDataToxoplasmose1T) {
		this.txtDataToxoplasmose1T = txtDataToxoplasmose1T;
	}

	public JTextField getTxtDataCitopatologico1T() {
		return txtDataCitopatologico1T;
	}

	public void setTxtDataCitopatologico1T(JFormattedTextField txtDataCitopatologico1T) {
		this.txtDataCitopatologico1T = txtDataCitopatologico1T;
	}

	public JTextField getTxtDataTotg2T() {
		return txtDataTotg2T;
	}

	public void setTxtDataTotg2T(JFormattedTextField txtDataTotg2T) {
		this.txtDataTotg2T = txtDataTotg2T;
	}

	public JTextField getTxtDataHbHt3T() {
		return txtDataHbHt3T;
	}

	public void setTxtDataHbHt3T(JFormattedTextField txtDataHbHt3T) {
		this.txtDataHbHt3T = txtDataHbHt3T;
	}

	public JTextField getTxtDataGlisemia3T() {
		return txtDataGlisemia3T;
	}

	public void setTxtDataGlisemia3T(JFormattedTextField txtDataGlisemia3T) {
		this.txtDataGlisemia3T = txtDataGlisemia3T;
	}

	public JTextField getTxtDataUrinaEas3T() {
		return txtDataUrinaEas3T;
	}

	public void setTxtDataUrinaEas3T(JFormattedTextField txtDataUrinaEas3T) {
		this.txtDataUrinaEas3T = txtDataUrinaEas3T;
	}

	public JTextField getTxtDataSifilis2T() {
		return txtDataSifilis2T;
	}

	public void setTxtDataSifilis2T(JFormattedTextField txtDataSifilis2T) {
		this.txtDataSifilis2T = txtDataSifilis2T;
	}

	public JTextField getTxtDataHiv2T() {
		return txtDataHiv2T;
	}

	public void setTxtDataHiv2T(JFormattedTextField txtDataHiv2T) {
		this.txtDataHiv2T = txtDataHiv2T;
	}

	public JTextField getTxtDataHepatite2T() {
		return txtDataHepatite2T;
	}

	public void setTxtDataHepatite2T(JFormattedTextField txtDataHepatite2T) {
		this.txtDataHepatite2T = txtDataHepatite2T;
	}

	public JTextField getTxtDataHepatite3T() {
		return txtDataHepatite3T;
	}

	public void setTxtDataHepatite3T(JFormattedTextField txtDataHepatite3T) {
		this.txtDataHepatite3T = txtDataHepatite3T;
	}

	public JTextField getTxtDataHiv3T() {
		return txtDataHiv3T;
	}

	public void setTxtDataHiv3T(JFormattedTextField txtDataHiv3T) {
		this.txtDataHiv3T = txtDataHiv3T;
	}

	public JTextField getTxtDataSifilis3T() {
		return txtDataSifilis3T;
	}

	public void setTxtDataSifilis3T(JTextField txtDataSifilis3T) {
		this.txtDataSifilis3T = txtDataSifilis3T;
	}

	public JTextField getTxtToxoplasmoseIgm1T() {
		return txtToxoplasmoseIgm1T;
	}

	public void setTxtToxoplasmoseIgm1T(JTextField txtToxoplasmoseIgm1T) {
		this.txtToxoplasmoseIgm1T = txtToxoplasmoseIgm1T;
	}

	public JTextField getTxtHepatite1T() {
		return txtHepatite1T;
	}

	public void setTxtHepatite1T(JTextField txtHepatite1T) {
		this.txtHepatite1T = txtHepatite1T;
	}

	public JTextField getTxtHepatite2T() {
		return txtHepatite2T;
	}

	public void setTxtHepatite2T(JTextField txtHepatite2T) {
		this.txtHepatite2T = txtHepatite2T;
	}

	public JTextField getTxtHepatite3T() {
		return txtHepatite3T;
	}

	public void setTxtHepatite3T(JTextField txtHepatite3T) {
		this.txtHepatite3T = txtHepatite3T;
	}

	public JTextField getTxtCitopatologico1T() {
		return txtCitopatologico1T;
	}

	public void setTxtCitopatologico1T(JTextField txtCitopatologico1T) {
		this.txtCitopatologico1T = txtCitopatologico1T;
	}

	public JTextField getTxtBasal2T() {
		return txtBasal2T;
	}

	public void setTxtBasal2T(JTextField txtBasal2T) {
		this.txtBasal2T = txtBasal2T;
	}

	public JTextField getTxt602T() {
		return txt602T;
	}

	public void setTxt602T(JTextField txt602t) {
		txt602T = txt602t;
	}

	public JTextField getTxt1202T() {
		return txt1202T;
	}

	public void setTxt1202T(JTextField txt1202t) {
		txt1202T = txt1202t;
	}

	public JTextField getTxtHbHt3T() {
		return txtHbHt3T;
	}

	public void setTxtHbHt3T(JTextField txtHbHt3T) {
		this.txtHbHt3T = txtHbHt3T;
	}

	public JTextField getTxtGlisemia3T() {
		return txtGlisemia3T;
	}

	public void setTxtGlisemia3T(JTextField txtGlisemia3T) {
		this.txtGlisemia3T = txtGlisemia3T;
	}

	public JTextField getTxtUrinaEas3T() {
		return txtUrinaEas3T;
	}

	public void setTxtUrinaEas3T(JTextField txtUrinaEas3T) {
		this.txtUrinaEas3T = txtUrinaEas3T;
	}

	public String getIconSifilis1T() {
		return iconSifilis1T;
	}

	public void setIconSifilis1T(String iconSifilis1T) {
		this.iconSifilis1T = iconSifilis1T;
	}

	public JTextField getTxtAbo1T() {
		return txtAbo1T;
	}

	public void setTxtAbo1T(JTextField txtAbo1T) {
		this.txtAbo1T = txtAbo1T;
	}

	public JButton getBtnSalvarEdicao() {
		return btnSalvarEdicao;
	}

	public void setBtnSalvarEdicao(JButton btnSalvarEdicao) {
		this.btnSalvarEdicao = btnSalvarEdicao;
	}

	public JButton getBtnSalvarCadastro() {
		return btnSalvarCadastro;
	}
}

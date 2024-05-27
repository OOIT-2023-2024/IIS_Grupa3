package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroupBoja = new ButtonGroup();
	private JLabel lblCrvenaBoja;
	private JLabel lblPlavaBoja;
	private JLabel lblZutaBoja;
	private JList<String> lstBoje;
	private JScrollPane scrollPane;
	private DefaultListModel<String> dlm = 
			new DefaultListModel<String>();
	private JPanel pnlNorth;
	private JLabel lblNaslov;
	private JPanel pnlSouth;
	private JButton btnKlik;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmTest() {
		setTitle("Probni frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JToggleButton tglbtnCrvenaBoja = new JToggleButton("Crvena boja");
		tglbtnCrvenaBoja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCrvenaBoja.setForeground(Color.RED);
				lblPlavaBoja.setForeground(Color.black);
				lblZutaBoja.setForeground(Color.black);
				
				dlm.addElement(lblCrvenaBoja.getText());
			}
		});
		buttonGroupBoja.add(tglbtnCrvenaBoja);
		GridBagConstraints gbc_tglbtnCrvenaBoja = new GridBagConstraints();
		gbc_tglbtnCrvenaBoja.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnCrvenaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvenaBoja.gridx = 0;
		gbc_tglbtnCrvenaBoja.gridy = 0;
		pnlCenter.add(tglbtnCrvenaBoja, gbc_tglbtnCrvenaBoja);
		
		lblCrvenaBoja = new JLabel("Crvena boja");
		GridBagConstraints gbc_lblCrvenaBoja = new GridBagConstraints();
		gbc_lblCrvenaBoja.anchor = GridBagConstraints.WEST;
		gbc_lblCrvenaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvenaBoja.gridx = 1;
		gbc_lblCrvenaBoja.gridy = 0;
		pnlCenter.add(lblCrvenaBoja, gbc_lblCrvenaBoja);
		
		JToggleButton tglbtnPlavaBoja = new JToggleButton("Plava boja");
		tglbtnPlavaBoja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCrvenaBoja.setForeground(Color.black);
				lblPlavaBoja.setForeground(Color.red);
				lblZutaBoja.setForeground(Color.black);
				dlm.addElement(lblPlavaBoja.getText());
			}
		});
		buttonGroupBoja.add(tglbtnPlavaBoja);
		GridBagConstraints gbc_tglbtnPlavaBoja = new GridBagConstraints();
		gbc_tglbtnPlavaBoja.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnPlavaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlavaBoja.gridx = 0;
		gbc_tglbtnPlavaBoja.gridy = 1;
		pnlCenter.add(tglbtnPlavaBoja, gbc_tglbtnPlavaBoja);
		
		lblPlavaBoja = new JLabel("Plava boja");
		GridBagConstraints gbc_lblPlavaBoja = new GridBagConstraints();
		gbc_lblPlavaBoja.anchor = GridBagConstraints.WEST;
		gbc_lblPlavaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlavaBoja.gridx = 1;
		gbc_lblPlavaBoja.gridy = 1;
		pnlCenter.add(lblPlavaBoja, gbc_lblPlavaBoja);
		
		JToggleButton tglbtnZutaBoja = new JToggleButton("Zuta boja");
		tglbtnZutaBoja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCrvenaBoja.setForeground(Color.black);
				lblPlavaBoja.setForeground(Color.black);
				lblZutaBoja.setForeground(Color.red);
				
				dlm.addElement(lblZutaBoja.getText());
			}
		});
		buttonGroupBoja.add(tglbtnZutaBoja);
		GridBagConstraints gbc_tglbtnZutaBoja = new GridBagConstraints();
		gbc_tglbtnZutaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZutaBoja.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnZutaBoja.gridx = 0;
		gbc_tglbtnZutaBoja.gridy = 2;
		pnlCenter.add(tglbtnZutaBoja, gbc_tglbtnZutaBoja);
		
		lblZutaBoja = new JLabel("Zuta boja");
		GridBagConstraints gbc_lblZutaBoja = new GridBagConstraints();
		gbc_lblZutaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblZutaBoja.anchor = GridBagConstraints.WEST;
		gbc_lblZutaBoja.gridx = 1;
		gbc_lblZutaBoja.gridy = 2;
		pnlCenter.add(lblZutaBoja, gbc_lblZutaBoja);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		pnlCenter.add(scrollPane, gbc_scrollPane);
		
		lstBoje = new JList<String>();
		scrollPane.setViewportView(lstBoje);
		lstBoje.setModel(dlm);
		
		pnlNorth = new JPanel();
		pnlNorth.setBackground(new Color(0, 255, 0));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		lblNaslov = new JLabel("Zadatak 1");
		lblNaslov.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnlNorth.add(lblNaslov);
		
		pnlSouth = new JPanel();
		pnlSouth.setBackground(new Color(255, 128, 0));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		btnKlik = new JButton("Klikni me");
		btnKlik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Antistres dugme :)",
						"Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		pnlSouth.add(btnKlik);
	}

}

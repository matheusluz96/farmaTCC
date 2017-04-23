package farmaTCC;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main extends JFrame {

	JFrame frmFarma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmFarma.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frmFarma = new JFrame();
		frmFarma.setResizable(false);
		frmFarma.setTitle("Farma\r\n");
		frmFarma.setBounds(100, 100, 600, 390);
		frmFarma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 374, 98, 0};
		gridBagLayout.rowHeights = new int[] {35, 35, 35, 35, 35, 35, 35, 35, 35, 35};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		frmFarma.getContentPane().setLayout(gridBagLayout);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnClientesInativos = new JButton("Clientes inativos");
		btnClientesInativos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnClientesAtivos = new JButton("Clientes ativos");
		btnClientesAtivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientesAtivos frmAtivos = new ClientesAtivos();
				frmAtivos.setVisible(true);
				frmFarma.setVisible(false);
				
			}
		});
		GridBagConstraints gbc_btnClientesAtivos = new GridBagConstraints();
		gbc_btnClientesAtivos.fill = GridBagConstraints.BOTH;
		gbc_btnClientesAtivos.insets = new Insets(0, 0, 5, 0);
		gbc_btnClientesAtivos.gridx = 2;
		gbc_btnClientesAtivos.gridy = 5;
		frmFarma.getContentPane().add(btnClientesAtivos, gbc_btnClientesAtivos);
		GridBagConstraints gbc_btnClientesInativos = new GridBagConstraints();
		gbc_btnClientesInativos.fill = GridBagConstraints.BOTH;
		gbc_btnClientesInativos.insets = new Insets(0, 0, 5, 0);
		gbc_btnClientesInativos.gridx = 2;
		gbc_btnClientesInativos.gridy = 6;
		frmFarma.getContentPane().add(btnClientesInativos, gbc_btnClientesInativos);
		
		JButton btnEncomendas = new JButton("Encomendas");
		GridBagConstraints gbc_btnEncomendas = new GridBagConstraints();
		gbc_btnEncomendas.fill = GridBagConstraints.BOTH;
		gbc_btnEncomendas.insets = new Insets(0, 0, 5, 0);
		gbc_btnEncomendas.gridx = 2;
		gbc_btnEncomendas.gridy = 7;
		frmFarma.getContentPane().add(btnEncomendas, gbc_btnEncomendas);
		
		JButton btnPromocao = new JButton("Promo\u00E7\u00F5es");
		GridBagConstraints gbc_btnPromocao = new GridBagConstraints();
		gbc_btnPromocao.fill = GridBagConstraints.BOTH;
		gbc_btnPromocao.insets = new Insets(0, 0, 5, 0);
		gbc_btnPromocao.gridx = 2;
		gbc_btnPromocao.gridy = 8;
		frmFarma.getContentPane().add(btnPromocao, gbc_btnPromocao);
		GridBagConstraints gbc_btnEstoque = new GridBagConstraints();
		gbc_btnEstoque.fill = GridBagConstraints.BOTH;
		gbc_btnEstoque.gridx = 2;
		gbc_btnEstoque.gridy = 9;
		frmFarma.getContentPane().add(btnEstoque, gbc_btnEstoque);
	}


}

package farmaTCC;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Panel;


public  class Main extends JFrame implements WindowListener {

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
		frmFarma.setResizable(true);
		frmFarma.setTitle("Farma\r\n");
		frmFarma.setBounds(100, 100, 600, 390);
		frmFarma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 374, 98, 0};
		gridBagLayout.rowHeights = new int[] {35, 35, 35, 35, 35, 35, 35, 35, 35, 35};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		frmFarma.getContentPane().setLayout(gridBagLayout);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estoque estoque = new Estoque();
				estoque.setVisible(true);
				frmFarma.setVisible(false);
				
			}
		});
		
		JButton btnClientesInativos = new JButton("Clientes inativos");
		btnClientesInativos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientesInativos frmInativos = new ClientesInativos();
				frmInativos.setVisible(true);
				frmFarma.setVisible(false);
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
		
		
		
		try {
			Image img = ImageIO.read(new File("background.jpg"));
			
		} catch (IOException e1) {
			
			
		}
		
		Panel panel = new Panel();
		panel.setForeground(Color.DARK_GRAY);
		panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridheight = 9;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		frmFarma.getContentPane().add(panel, gbc_panel);
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
		btnEncomendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encomendas encomendas = new Encomendas();
				encomendas.setVisible(true);
				frmFarma.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnEncomendas = new GridBagConstraints();
		gbc_btnEncomendas.fill = GridBagConstraints.BOTH;
		gbc_btnEncomendas.insets = new Insets(0, 0, 5, 0);
		gbc_btnEncomendas.gridx = 2;
		gbc_btnEncomendas.gridy = 7;
		frmFarma.getContentPane().add(btnEncomendas, gbc_btnEncomendas);
		
		JButton btnPromocao = new JButton("Promo\u00E7\u00F5es");
		btnPromocao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Promocoes promo = new Promocoes();
				promo.setVisible(true);
				frmFarma.setVisible(false);
			}
		});
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


	
	public void windowClosing(WindowEvent e) {
		frmFarma.setVisible(true);
		
	}


	
	public void windowClosed(WindowEvent e) {
		
		
	}

	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}

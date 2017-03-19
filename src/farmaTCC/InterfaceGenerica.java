package farmaTCC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class InterfaceGenerica {

	private JFrame frmInterfaceGenerica;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGenerica window = new InterfaceGenerica();
					window.frmInterfaceGenerica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceGenerica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfaceGenerica = new JFrame();
		frmInterfaceGenerica.setTitle("Interface generica");
		frmInterfaceGenerica.setForeground(Color.WHITE);
		frmInterfaceGenerica.setFont(new Font("Arial", Font.PLAIN, 12));
		frmInterfaceGenerica.setBounds(100, 100, 450, 300);
		frmInterfaceGenerica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		
		JButton btnDeletar = new JButton("Remover");
		
		JButton btnAdicionar = new JButton("Adicionar");
		
		JButton button_3 = new JButton("Fechar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmInterfaceGenerica.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(130)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(button_3)
					.addGap(55)
					.addComponent(btnAdicionar)
					.addGap(79)
					.addComponent(btnDeletar))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3)
						.addComponent(btnAdicionar)
						.addComponent(btnDeletar)))
		);
		frmInterfaceGenerica.getContentPane().setLayout(groupLayout);
	}
}

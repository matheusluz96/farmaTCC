package farmaTCC;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.DropMode;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;
import java.awt.Cursor;


public class ClientesAtivos extends Main {

	private JPanel contentPane;


	public ClientesAtivos() {
		setResizable(false);
		
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{297, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		String[] data = {"one", "two", "three", "four", "one", "two", "three", "four", "one", "two", "three", "four",};
		
		JList<String> list = new JList();
		list.setModel(new AbstractListModel() {
			public int getSize() {
				return data.length;
			}
			public Object getElementAt(int index) {
				return data[index];
			}
		});
		JScrollPane listScroller = new JScrollPane(list);
		list.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		list.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		list.setVisibleRowCount(10);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setDropMode(DropMode.ON);
		list.setMinimumSize(new Dimension(200, 200));
		list.setMaximumSize(new Dimension(200, 200));
		list.setBackground(Color.LIGHT_GRAY);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBounds(new Rectangle(400, 400, 0, 0));
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 4;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		listScroller.setPreferredSize(new Dimension(250, 80));
		contentPane.add(listScroller, gbc_list);
		
		
	
		

		

		
		
		JButton btnNewButton_2 = new JButton("Remover Cliente");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 2;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Adicionar Cliente");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 3;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Voltar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFarma.setVisible(true);
				dispose();
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.gridx = 2;
		gbc_btnNewButton_4.gridy = 4;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
	}

}

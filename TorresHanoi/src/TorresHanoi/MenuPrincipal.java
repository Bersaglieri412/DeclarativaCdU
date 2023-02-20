package TorresHanoi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultFocusManager;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MenuPrincipal extends JFrame {

	private int opcion;
	private JPanel contentPane;
	private JButton btn;
	private JButton btn1;
	public static void main(String[] args) {
		MenuPrincipal m = new MenuPrincipal();
		m.setVisible(true);
	}
	
	public MenuPrincipal() {
		setResizable(false);
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		DefaultListModel<String> modelo1 = new DefaultListModel<>();
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorresHanoiManual tm = new TorresHanoiManual();
				tm.setVisible(true);
				Window ventana = DefaultFocusManager.getCurrentManager().getActiveWindow();
				ventana.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(158, 81, 172, 44);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Torres de Hanoi");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(91, 10, 299, 61);
		getContentPane().add(lblNewLabel);
		
		JButton btnSolucin = new JButton("Solución");
		btnSolucin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TorresHanoiAutomatico ta = new TorresHanoiAutomatico();
	               ta.setVisible(true);   
	               Window ventana = DefaultFocusManager.getCurrentManager().getActiveWindow();
					ventana.dispose();
			}
		});
		btnSolucin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSolucin.setBounds(158, 149, 172, 44);
		getContentPane().add(btnSolucin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window ventana = DefaultFocusManager.getCurrentManager().getActiveWindow();
				ventana.dispose();
				
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSalir.setBounds(158, 310, 172, 44);
		getContentPane().add(btnSalir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"3", "4", "5", "6"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(158, 252, 172, 29);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Número de torres");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(158, 203, 172, 29);
		getContentPane().add(lblNewLabel_1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		btn = new JButton("Resolver manualmente");
		btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	      
            }
        });
	}
}

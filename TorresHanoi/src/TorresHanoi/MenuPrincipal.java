package TorresHanoi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Point;

public class MenuPrincipal extends JFrame {

	private int opcion;
	private JPanel contentPane;
	private JButton btn;
	private JButton btn1;
	
	public MenuPrincipal() {
		setResizable(false);
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		DefaultListModel<String> modelo1 = new DefaultListModel<>();
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Jugar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(158, 81, 172, 44);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Torres de Hanoi");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(91, 10, 299, 61);
		getContentPane().add(lblNewLabel);
		
		JButton btnSolucin = new JButton("Solución");
		btnSolucin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSolucin.setBounds(158, 149, 172, 44);
		getContentPane().add(btnSolucin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSalir.setBounds(158, 222, 172, 44);
		getContentPane().add(btnSalir);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		btn = new JButton("Resolver manualmente");
		btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Interfaz i = new Interfaz();
               i.setVisible(true);         
            }
        });
	}
}

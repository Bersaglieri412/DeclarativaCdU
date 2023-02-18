package TorresHanoi;

import java.util.*;
import org.jpl7.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TorresHanoiManual extends JFrame {
	private String rutaManual = "C:\\Users\\mohae\\Desktop\\2º Semestre\\Programación declarativa\\Trabajo teórico\\Programa\\torreshanoimanual.pl";
	private JList<String> lista1;
	private JList<String> lista2;
	private JList<String> lista3;
	private JPanel contentPane;
	private JButton btn2_1;
	private JButton btn2_3;
	private JButton btn3_1;
	private JButton btn3_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TorresHanoiManual frame = new TorresHanoiManual();
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
	public TorresHanoiManual() {
		
		String[] datos = {"           [------]          ", "         [--------]         ","        [----------]        "};
		lista1 = new JList<>();
		DefaultListModel<String> modelo1 = new DefaultListModel<>();
        for (int i = 0; i < datos.length; i++) {
            modelo1.addElement(datos[i]);
        }
        lista1.setModel(modelo1);
		lista2 = new JList<>();
		lista3 = new JList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblTitulo = new JLabel("TORRES HANOI");
		JLabel lblVictoria = new JLabel("VICTORIA");
		lblVictoria.setVisible(false);
		lblVictoria.setForeground(new Color(255, 0, 0));
		
		JList list1 = lista1;
		list1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JList list2 = lista2;
		list2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JList list3 = lista3;
		list3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btn1_2 = new JButton("1 --> 2");
		btn1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               MoverElemento(lista1, lista2);
               ComprobarVictoria(lblVictoria);
            }
        });
		
		JButton btn1_3 = new JButton("1 --> 3");
		btn1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoverElemento(lista1, lista3);
                ComprobarVictoria(lblVictoria);
            }
        });
		
		btn2_1 = new JButton("2 --> 1");
		btn2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	MoverElemento(lista2, lista1);
            	ComprobarVictoria(lblVictoria);
            }
        });
		
		
		btn2_3 = new JButton("2 --> 3");
		btn2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoverElemento(lista2, lista3);
                ComprobarVictoria(lblVictoria);
            }
        });
		
		btn3_1 = new JButton("3 --> 1");
		btn3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoverElemento(lista3, lista1);
                ComprobarVictoria(lblVictoria);
            }
        });
		
		btn3_2 = new JButton("3 --> 2");
		btn3_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoverElemento(lista3, lista2);
                ComprobarVictoria(lblVictoria);
            }
        });
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btn1_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn1_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
							.addGap(62)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btn2_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn2_3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
							.addGap(69)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btn3_2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn3_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(lista1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lista2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(164)
									.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(lista3, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(40)
									.addComponent(lblVictoria, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lista1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lista2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addComponent(lista3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblVictoria, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1_2)
						.addComponent(btn2_1)
						.addComponent(btn3_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1_3)
						.addComponent(btn2_3)
						.addComponent(btn3_2))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private void MoverElemento(JList listaorigen, JList listadestino) {
		 // Crea un DefaultListModel con los datos actuales de la lista
		if(ComprobarMovimiento(listaorigen, listadestino)) {
        DefaultListModel<String> modelo_origen = new DefaultListModel<>();
        DefaultListModel<String> modelo_destino = new DefaultListModel<>();
        for (int i = 0; i < listaorigen.getModel().getSize(); i++) {
            modelo_origen.addElement((String)listaorigen.getModel().getElementAt(i));
        }
        for (int i = 0; i < listadestino.getModel().getSize(); i++) {
        	modelo_destino.addElement((String) listadestino.getModel().getElementAt(i));
        }
        modelo_destino.add(0, (String)listaorigen.getModel().getElementAt(0));
        modelo_origen.remove(0);
        // Agrega el nuevo elemento al modelo
        

        // Establece el nuevo modelo en la lista
        listaorigen.setModel(modelo_origen);
        listadestino.setModel(modelo_destino);
		}   
	}
	private void ComprobarVictoria(JLabel lblVictoria) {
		Query q1 = new Query("consult", new Term[] {new Atom(rutaManual)});
	     if (q1.hasSolution()) {
	    	 if (lista3.getModel().getSize()>0) {
		    	 String string_query = "victoria([";
		    	 for (int i = 0; i < lista3.getModel().getSize()-1; i++) {
		    		 string_query += (String)lista3.getModel().getElementAt(i) + ",";
		    	 }
		    	 string_query += (String)lista3.getModel().getElementAt(lista3.getModel().getSize()-1)+"]).";
		    	 Query query = new Query(string_query);
			     if (query.hasSolution()) {
			    	 lblVictoria.setVisible(true);
			     }
	    	 }
	     }
	     else {
	    	 System.out.println("RUTA DE COMPROBAR VICTORIA INCORRECTA");
	     }
	}
	private boolean ComprobarMovimiento(JList listaorigen, JList listadestino) {
		boolean MovimientoCorrecto = false;
		if (listadestino.getModel().getSize() == 0) {
			MovimientoCorrecto = true;
		}
		else if (listaorigen.getModel().getSize() == 0){
			MovimientoCorrecto = false;
		}
		else {
		     String elemento_origen = ((String)listaorigen.getModel().getElementAt(0)).replaceAll(" ","");
		     String elemento_destino = ((String)listadestino.getModel().getElementAt(0)).replaceAll(" ","");
		     //Consulta con prolog:
		     Query q1 = new Query("consult", new Term[] {new Atom(rutaManual)});
		     if (q1.hasSolution()) {
		         //System.out.println("Archivo cargado correctamente");
		    	 String string_query = "valido("+elemento_origen+","+elemento_destino+").";
			     Query query = new Query(string_query);
			     MovimientoCorrecto = query.hasSolution();
		     } else {
		         System.out.println("RUTA DE COMPROBAR MOVIMIENTO INCORRECTA");
		    	 MovimientoCorrecto = false;
		     }

		    
		}
		
		
		return MovimientoCorrecto;
	}
}

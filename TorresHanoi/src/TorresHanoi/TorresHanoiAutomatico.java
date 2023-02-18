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

public class TorresHanoiAutomatico extends JFrame {
	private String rutaManual = "C:\\Users\\mohae\\eclipse-workspace\\ProgramacionDeclarativa\\TorresHanoi\\TorresHanoi\\torreshanoimanual.pl";
	private String rutaAutomatica = "C:\\Users\\mohae\\eclipse-workspace\\ProgramacionDeclarativa\\TorresHanoi\\TorresHanoi\\torreshanoiautomatico.pl";
	private JList<String> lista1;
	private JList<String> lista2;
	private JList<String> lista3;
	private JPanel contentPane;
	private int numMovimientos;
	private int contador;
	private String [] resultadosAutomatico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TorresHanoiAutomatico frame = new TorresHanoiAutomatico();
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
	public TorresHanoiAutomatico() {
		resultadosAutomatico = listaResultado();
		System.out.println("----------");

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
		numMovimientos = resultadosAutomatico.length;
		contador = 0;
		JButton btnSiguiente = new JButton("Siguiente paso");
		btnSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	numMovimientos--;
        		String cadena = (String) resultadosAutomatico[contador++];
        		cadena = cadena.substring(1, cadena.length()-1);
        		System.out.println(cadena);
        		String origen = cadena.split(" ")[0];
        		String destino = cadena.split(" ")[1];
        		if (origen.equals("A") && destino.equals("B")) {
        			MoverElemento(lista1, lista2);
        		}
        		else if (origen.equals("A") && destino.equals("C")) {
        			MoverElemento(lista1, lista3);
        		}
        		else if (origen.equals("B") && destino.equals("A")) {
        			MoverElemento(lista2, lista1);
        		}
        		else if (origen.equals("B") && destino.equals("C")) {
        			MoverElemento(lista2, lista3);
        		}
        		else if (origen.equals("C") && destino.equals("A")) {
        			MoverElemento(lista3, lista1);
        		}
        		else if (origen.equals("C") && destino.equals("B")) {
        			MoverElemento(lista3, lista2);
        		}

            	if (numMovimientos <= 0) {
            		btnSiguiente.setEnabled(false);
            		lblVictoria.setVisible(true);
            	}
            	
            }
        });
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
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
									.addComponent(lblVictoria, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(179)
							.addComponent(btnSiguiente)))
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
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(btnSiguiente)
					.addGap(53))
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
	public String [] listaResultado() {
		String[] listamovimientos = null;
		Query q1 = 
				new Query(
				"consult",
				new Term[] {new Atom(rutaAutomatica)}
				);
		System.out.println( "consult " + (q1.hasSolution() ? "succeeded" : "failed"));

		int discos = 3;
        String t2 = "hanoi("+discos+", 'A', 'C', 'B', Movimientos)";
        Query q2 = new Query(t2);
        if (q2.hasSolution()) {
            // Se obtiene el resultado de la consulta
            Term movimientos = q2.oneSolution().get("Movimientos");
            Term[] termArray = movimientos.toTermArray();
            listamovimientos = new String[termArray.length];
            for (int i = 0; i < termArray.length; i++) {
                listamovimientos[i] = termArray[i].toString();
            }
        } else {
            System.out.println("No se encontraron soluciones.");
        }
        return listamovimientos;
     }
}

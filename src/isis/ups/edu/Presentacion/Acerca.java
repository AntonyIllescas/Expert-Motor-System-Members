
package isis.ups.edu.Presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;


import javax.swing.JDialog;
import javax.swing.JTextArea;

/**
 * @author Antony
 */
public class Acerca extends JDialog {
	private static final long serialVersionUID = 1774744837269464589L;

	public Acerca() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300, 300));
		setTitle("               *** Simulador ***");
		JTextArea texto = new JTextArea();
		texto.setEditable(false);
		String msg = "\n   ** Test - Funciones - Motrices (1.0.1) **\n" + "\n               ** DESARROLLADOR **\n"
				+ "               * Jose Illescas\n" 
                                + "               * Oscar Mora\n" 
                                + "\n               *** CREADO EN ***\n"
				+ "                * Java Netbeans\"8.0.1\"\n" 
				+ "                * Diciembre 18, 2018";
		texto.setText(msg);
		getContentPane().add(texto, BorderLayout.CENTER);
		setResizable(false);
		pack();
	}

   
}

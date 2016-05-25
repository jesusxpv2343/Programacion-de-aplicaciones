package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * @author Jesus
 *
 */

public class ViewMain extends JFrame{
	private JButton btnAreas = new JButton("Areas");
	private JButton btnPerimetros = new JButton("Perimetros");
	
	private Container c = getContentPane();
	/**
	 * Constructor por defecto
	 */
	public ViewMain(){
		super.setTitle("Áreas y perimetros");
		super.setSize(320,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		
		ventana();	
	}
	
	private void ventana(){
		c.setLayout(null);
		
		btnAreas.setBounds(10, 100 , 290, 40);
		btnPerimetros.setBounds(10, 200, 290, 40);

		c.add(btnAreas);
		c.add(btnPerimetros);
	}
	
	/**
	 * 
	 * @param e establece el objeto de la clase ActionListener
	 */
	public void onClickAreas(ActionListener e) {
		btnAreas.addActionListener(e);
	}
	/**
	 * 
	 * @return devuelve el objeto del boton btnAreas
	 */
	public JButton getBtnAreas() {
		return btnAreas;
	}
	/**
	 * 
	 * @param e establece el obbjeto de la clase ActionListener
	 */
	public void onClickPerimetros(ActionListener e) {
		btnPerimetros.addActionListener(e);
	}
	/**
	 * 
	 * @return devuelve el objeto del boton btnPerimetros
	 */
	public JButton getBtnPerimetros() {
		return btnPerimetros;
	}
}

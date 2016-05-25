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
public class ViewOptionArea extends JFrame{
	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnRectagulo = new JButton("Rectangulo");
	private JButton btnTriangulo = new JButton("Triangulo");
	private JButton btnCirculo = new JButton("Circulo");
	
	private Container c = getContentPane();
	/**
	 * Constructor por defecto
	 */
	public ViewOptionArea(){
		super.setTitle("Areas");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		
		contenido();
	}

	private void contenido(){
		c.setLayout(null);
		
		btnCuadrado.setBounds(10, 60, 300, 50);
		btnRectagulo.setBounds(10, 140, 300, 50);
		btnTriangulo.setBounds(10, 220, 300, 50);
		btnCirculo.setBounds(10, 300, 300, 50);
		
		c.add(btnCuadrado);
		c.add(btnRectagulo);
		c.add(btnTriangulo);
		c.add(btnCirculo);
	}

	/**
	 * 
	 * @return devuelve el objeto del boton btnCuadrado
	 */
	public JButton getBtnCuadrado() {
		return btnCuadrado;
	}
	/**
	 * 
	 * @return devuelve el objeto del boton btnRectangulo
	 */
	public JButton getBtnRectagulo() {
		return btnRectagulo;
	}
	/**
	 * 
	 * @return devuelve el objeto del boton btnTriangulo
	 */
	public JButton getBtnTriangulo() {
		return btnTriangulo;
	}
	/**
	 * 
	 * @return devuelve el objeto del boton btnCirculo
	 */
	public JButton getBtnCirculo() {
		return btnCirculo;
	}
	/**
	 * 
	 * @param e establece el objeto del boton btnCuadrado en formato ActionListener
	 */
	public void onClickCuadrado(ActionListener e) {
		this.btnCuadrado.addActionListener(e);
	}
	/**
	 * 
	 * @param e establece el objeto del boton btnRectangulo en formato ActionListener
	 */
	public void onclickRectagulo(ActionListener e) {
		this.btnRectagulo.addActionListener(e);
	}
	/**
	 * 
	 * @param e establece el objeto del boton btnTriangulo en formato ActionListener
	 */
	public void onClickTriangulo(ActionListener e) {
		this.btnTriangulo.addActionListener(e);
	}
	/**
	 * 
	 * @param e establece el objeto del boton btnCirculo en formato ActionListener
	 */
	public void onClickCirculo(ActionListener e) {
		this.btnCirculo.addActionListener(e);
	}
}

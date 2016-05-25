package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 * 
 * @author Jesus
 *
 */
public class ViewPerimTrian extends JFrame {
	
	private JLabel lbLado1 = new JLabel("Lado A");
	private JLabel lbLado2 = new JLabel("Lado B");
	private JLabel lbLado3 = new JLabel("Lado C");
	private JLabel lbRespueta = new JLabel("Respuesta");
	
	private JTextField txtLado1 = new JTextField();
	private JTextField txtLado2 = new JTextField();
	private JTextField txtLado3 = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	/**
	 * Construtor por defecto
	 */
	public ViewPerimTrian(){
		super();
		super.setTitle("Perimetro triangulo");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		contenido();
	}

	private void contenido() {
		c.setLayout(null);
		
		lbLado1.setBounds(10, 10, 300, 30);
		txtLado1.setBounds(10, 50, 300, 30);
		
		lbLado2.setBounds(10, 90, 300, 30);
		txtLado2.setBounds(10, 130, 300, 30);
		
		lbLado3.setBounds(10, 170, 300, 30);
		txtLado3.setBounds(10, 210, 300, 30);
		
		lbRespueta.setBounds(10, 250, 300, 30);
		lbRespueta.setHorizontalAlignment(SwingConstants.CENTER);
		lbRespueta.setVerticalAlignment(SwingConstants.CENTER);
		
		btnCalcular.setBounds(10, 290 , 300, 30);
		
		c.add(lbLado1);
		c.add(txtLado1);
		
		c.add(lbLado2);
		c.add(txtLado2);
		
		c.add(lbLado3);
		c.add(txtLado3);
		
		c.add(lbRespueta);
		
		c.add(btnCalcular);
	}

	
	/**
	 * 
	 * @return devuelve el lado1 de la figura en formato String
	 */
	public String getTxtLado1() {
		return txtLado1.getText();
	}
	/**
	 * 
	 * @return devuelve el lado2 de la figura en formato String
	 */
	public String getTxtLado2() {
		return txtLado2.getText();
	}
	/**
	 * 
	 * @return devuelve el lado3 de la figura en formato String
	 */
	public String getTxtLado3() {
		return txtLado3.getText();
	}
	/**
	 * 
	 * @return devuelve el objeto del boton btnCalcular
	 */
	public JButton getBtnCalcular() {
		return btnCalcular;
	}
	/**
	 * 
	 * @param e establece objeto de la clase ActionListener
	 */
	public void onClickCalcuar(ActionListener e) {
		this.btnCalcular.addActionListener(e);
	}
	/**
	 * 
	 * @param lbRespueta estalece respuesta del calculo en formato String
	 */
	public void setLbRespueta(String lbRespueta) {
		this.lbRespueta.setText(lbRespueta);
	}
	/**
	 * Metodo limpia caja
	 */
	public void limpiar(){
		txtLado1.setText(null);
		txtLado2.setText(null);
		txtLado3.setText(null);
		lbRespueta.setText("Respuesta");
	}
	/**
	 * 
	 * @param error establece el error en formato String
	 */
	public void mensajeError(String error){
		JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
	}

}

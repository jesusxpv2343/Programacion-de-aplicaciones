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
public class ViewPerimRect extends JFrame{
	private JLabel lbBase = new JLabel("Base");
	private JLabel lbALtura = new JLabel("Altura");
	private JLabel lbRespueta = new JLabel("Respuesta");
	
	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	/**
	 * Constructor pór defecto
	 */
	public ViewPerimRect(){
		super();
		super.setTitle("Perimetro rectangulo");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		contenido();
	}

	private void contenido() {
		c.setLayout(null);
		
		lbBase.setBounds(10, 10, 300, 30);
		txtBase.setBounds(10, 50, 300, 30);
		
		lbALtura.setBounds(10, 90, 300, 30);
		txtAltura.setBounds(10, 130, 300, 30);
		
		lbRespueta.setBounds(10, 170, 300, 30);
		lbRespueta.setHorizontalAlignment(SwingConstants.CENTER);
		lbRespueta.setVerticalAlignment(SwingConstants.CENTER);
		
		btnCalcular.setBounds(10, 210 , 300, 30);
		
		c.add(lbBase);
		c.add(txtBase);
		
		c.add(lbALtura);
		c.add(txtAltura);
		
		
		c.add(lbRespueta);
		
		c.add(btnCalcular);
	}

	
	/**
	 * 
	 * @return devuelve la base de la figura en formato String
	 */
	public String getTxtBase() {
		return txtBase.getText();
	}
	/**
	 * 
	 * @return devuelve la altura de la figura en formato String
	 */
	public String getTxtAltura() {
		return txtAltura.getText();
	}
	/**
	 * 
	 * @return devuelve objeto del boton btnCalcular
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
	 * @param lbRespueta establece la respuesta de la operacion en formato String
	 */
	public void setLbRespueta(String lbRespueta) {
		this.lbRespueta.setText(lbRespueta);
	}
	/**
	 * Metodo limpia caja
	 */
	public void limpiar(){
		txtAltura.setText(null);
		txtBase.setText(null);
		lbRespueta.setText("Respuesta");
	}
	/**
	 * 
	 * @param error establece error en formato String
	 */
	public void mensajeError(String error){
		JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
	}	
}

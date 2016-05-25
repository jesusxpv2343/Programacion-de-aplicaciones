package Vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * 
 * @author Jesus
 *
 */
public class Ventana  extends JFrame{
	private JLabel lbN1 = new JLabel("Número 1");
	private JLabel lbN2 = new JLabel("Número 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField  txtN1 = new JTextField();
	private JTextField  txtN2 = new JTextField();
	
	private JButton btnSuma = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMultiplicacion = new JButton("X");
	private JButton btnDivicion = new JButton("÷");
	
	private Container c = getContentPane();
	
	public Ventana() {
		super.setTitle("Calculadora");
		super.setSize(320,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		
		lbN1.setBounds(10, 10, 300, 30);
		txtN1.setBounds(10, 40, 300, 30);
		
		lbN2.setBounds(10, 70, 300, 30);
		txtN2.setBounds(10, 100, 300, 30);
		
		btnSuma.setBounds(20, 150 , 50, 50);
		btnResta.setBounds(90, 150, 50, 50);
		btnMultiplicacion.setBounds(160 , 150, 50, 50);
		btnDivicion.setBounds(230, 150, 50, 50);

		lbResultado.setBounds(10, 220, 300, 30);
				
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMultiplicacion);
		c.add(btnDivicion);
		
		c.add(lbResultado);
		
	}
	/**
	 * 
	 * @return retorna el valor de la primer caja
	 */
	public String getSN1(){
		return txtN1.getText();
	}
	/**
	 * 
	 * @return retorna el valor de la segunda caja
	 */	
	public String getSN2(){
		return txtN2.getText();
	}
	/**
	 *
	 * @param resultado de la operacion el formato String
	 */
	public void setLbResultado(String resultado) {
		lbResultado.setText(resultado);
	}
	/**
	 * 
	 * @param e establece el parametro en formato ActionListener
	 */
	public void onClickSuma(ActionListener e){
		btnSuma.addActionListener(e);
	}
	/**
	 * 
	 * @param e establece el parametro en formato ActionListener
	 */
	public void onClickResta(ActionListener e){
		btnResta.addActionListener(e);
	}
	/**
	 * 
	 * @param e establece el parametro en formato ActionListener
	 */
	public void onClickMultiplicacion(ActionListener e){
		btnMultiplicacion.addActionListener(e);
	}
	/**
	 * 
	 * @param e establece el parametro en formato ActionListener
	 */
	public void onClickDividir(ActionListener e){
		btnDivicion.addActionListener(e);
	}
	/**
	 * 
	 * @param error establece el parametro error en formato String
	 */
	public void mensajeError(String error){
		JOptionPane.showMessageDialog(this, error, "Error" , JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * 
	 * @return la action del boton btnSuma
	 */
	public JButton getBtnSuma() {
		return btnSuma;
	}
	/**
	 * 
	 * @return la action del boton btnResta
	 */
	public JButton getBtnResta() {
		return btnResta;
	}
	/**
	 * 
	 * @return la action del boton btnMultiplicacion
	 */
	public JButton getBtnMultiplicacion() {
		return btnMultiplicacion;
	}
	/**
	 * 
	 * @return la action del boton btnDivicion
	 */
	public JButton getBtnDivicion() {
		return btnDivicion;
	}

	/**
	 * Metodo limpia cajas 
	 */
	public void limpiarCajas(){
		txtN1.setText(null);
		txtN2.setText(null);
		lbResultado.setText("Respuesta");
	}

	
	
}

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
public class ViewAreaCirc extends JFrame{

	private JLabel lbRadio = new JLabel("Radio");
	private JLabel lbRespueta = new JLabel("Respuesta");
	
	private JTextField txtRadio = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	/**
	 * Constructor por defecto
	 */
	public ViewAreaCirc(){
		super();
		super.setTitle("Area circulo");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		contenido();
	}

	private void contenido() {
		c.setLayout(null);
		
		lbRadio.setBounds(10, 10, 300, 30);
		txtRadio.setBounds(10, 50, 300, 30);
		
		lbRespueta.setBounds(10, 90, 300, 30);
		lbRespueta.setHorizontalAlignment(SwingConstants.CENTER);
		lbRespueta.setVerticalAlignment(SwingConstants.CENTER);
		
		btnCalcular.setBounds(10, 130 , 300, 30);
		
		
		
		c.add(lbRadio);
		c.add(txtRadio);
		
		c.add(lbRespueta);
		
		c.add(btnCalcular);
	}
	
	/**
	 * 
	 * @return devuelve el valor de la caja txtRadio 
	 */
	public String getTxtRadio() {
		return txtRadio.getText();
	}

	/**
	 * 
	 * @return devuelve el objeto del boton btnCalcuar
	 */
	public JButton getBtnCalcuar() {
		return btnCalcular;
	}
	/**
	 * 
	 * @param e establece accion del boton en formato ActionListener
	 */
	public void onClickCalcuar(ActionListener e) {
		this.btnCalcular.addActionListener(e);
	}
	/**
	 * 
	 * @param lbRespueta establece el valor del lbRespuesta en formato String
	 */
	public void setLbRespueta(String lbRespueta) {
		this.lbRespueta.setText(lbRespueta);
	}
	/**
	 * Metodo limpia cajas
	 */
	public void limpiar(){
		txtRadio.setText(null);
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

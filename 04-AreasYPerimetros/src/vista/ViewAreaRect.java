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
public class ViewAreaRect extends JFrame{
	private JLabel lbAltura= new JLabel("Altura");
	private JLabel lbBase= new JLabel("Base");
	private JLabel lbRespueta = new JLabel("Respuesta");
	
	private JTextField txtAltura = new JTextField();
	private JTextField txtBase = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	/**
	 * Constructor por defecto
	 */
	public ViewAreaRect(){
		super();
		super.setTitle("Area Rectangulo");
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
		
		lbAltura.setBounds(10, 90, 300, 30);
		txtAltura.setBounds(10, 130 , 300, 30);
		
		lbRespueta.setBounds(10, 170, 300, 30);
		lbRespueta.setHorizontalAlignment(SwingConstants.CENTER);
		lbRespueta.setVerticalAlignment(SwingConstants.CENTER);
		
		btnCalcular.setBounds(10, 210 , 300, 30);
		
		c.add(lbBase);
		c.add(txtBase);
		
		c.add(lbAltura);
		c.add(txtAltura);
		
		c.add(lbRespueta);
		
		c.add(btnCalcular);
	}
	/**
	 * 
	 * @param lbRespueta establece respuesta en formato String
	 */
	public void setLbRespueta(String lbRespueta) {
		this.lbRespueta.setText(lbRespueta);
	}
	/**
	 * 
	 * @return devuelve el objeto del boton btnCalcular
	 */
	public JButton getBtnCalcuar() {
		return btnCalcular;
	}
	/**
	 * 
	 * @param e establece el objeto de la Clase ActionListener
	 */
	public void onClickCalcuar(ActionListener e) {
		this.btnCalcular.addActionListener(e);
	}
	/**
	 * 
	 * @return devulve el valor de la caja txtAltura en formato String
	 */
	public String getTxtAltura() {
		return txtAltura.getText();
	}
	/**
	 * 
	 * @return devulve el valor de la caja txtBase en formato String
	 */
	public String getTxtBase() {
		return txtBase.getText();
	}
	/**
	 * Metodo limpia cajas
	 */
	public void limpiar(){
		txtAltura.setText(null);
		txtBase.setText(null);
		lbRespueta.setText("Respuesta");
	}
	/**
	 * 
	 * @param error estalece el error en formato String
	 */
	public void mensajeError(String error){
		JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
	}

	
	
	
}

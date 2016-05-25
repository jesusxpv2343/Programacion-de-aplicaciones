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
public class ViewAreaCuad extends JFrame {
	private JLabel lbLado = new JLabel("Lado");
	private JLabel lbRespueta = new JLabel("Respuesta");
	
	private JTextField txtLado = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	/**
	 * Constructor por defecto
	 */
	public ViewAreaCuad(){
		super();
		super.setTitle("Area cuadrado");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		contenido();
	}

	private void contenido() {
		c.setLayout(null);
		
		lbLado.setBounds(10, 10, 300, 30);
		txtLado.setBounds(10, 50, 300, 30);
		
		lbRespueta.setBounds(10, 90, 300, 30);
		lbRespueta.setHorizontalAlignment(SwingConstants.CENTER);
		lbRespueta.setVerticalAlignment(SwingConstants.CENTER);
		
		btnCalcular.setBounds(10, 130 , 300, 30);
		
		c.add(lbLado);
		c.add(txtLado);
		
		c.add(lbRespueta);
		
		c.add(btnCalcular);
	}

	/**
	 * 
	 * @return el valor de la caja en formato String
	 */
	public String getTxtLado() {
		return txtLado.getText();
	}
	/**
	 * 
	 * @return devuelve la clase del boton btnCalcular
	 */
	public JButton getBtnCalcuar() {
		return btnCalcular;
	}
	/**
	 * 
	 * @param e establece el objeto de la clase ActionListener
	 */
	public void onClickCalcuar(ActionListener e) {
		this.btnCalcular.addActionListener(e);
	}
	/**
	 * 
	 * @param lbRespueta establece el valor en formato String
	 */
	public void setLbRespueta(String lbRespueta) {
		this.lbRespueta.setText(lbRespueta);
	}
	/**
	 * 
	 * @param error estbalece el error en formato String
	 */
	public void mensajeError(String error){
		JOptionPane.showMessageDialog(this,error, "Error", JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Metodo limpia caja
	 */
	public void limpiar(){
		txtLado.setText(null);
		lbRespueta.setText("Respuesta");
	}

}

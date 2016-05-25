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
public class ViewPerimCirc extends JFrame {
	
	private JLabel lbRadio = new JLabel("Radio");
	private JLabel lbRespueta = new JLabel("Respuesta");
	
	private JTextField txtRadio = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c = getContentPane();
	/**
	 * Contructor por defecto
	 */
	public ViewPerimCirc(){
		super();
		super.setTitle("Perimetro circulo");
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
	 * @return devuelve el radio de la figura en formato String
	 */
	public String getTxtRadio() {
		return txtRadio.getText();
	}
	/**
	 * 
	 * @return devuelve el objeto de boton btnCalcular
	 */
	public JButton getBtnCalcular() {
		return btnCalcular;
	}
	/**
	 * 
	 * @param e estalece el objeto en formato ActionListener
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
		txtRadio.setText(null);
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

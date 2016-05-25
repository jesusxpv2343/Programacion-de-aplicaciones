package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ViewOptionArea;
import vista.ViewOptionPerim;
import vista.ViewMain;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerMain implements ActionListener {
	private ViewMain viewMain = new ViewMain();
	
	/**
	 * 
	 * @param viewMain establece parametro de la clase ViewMain
	 */
	public ControllerMain(ViewMain viewMain){
		super();
		this.viewMain=viewMain;
		
		viewMain.onClickAreas(this);
		viewMain.onClickPerimetros(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == viewMain.getBtnAreas()){
			//viewMain.dispose();
				
			ViewOptionArea viewFiguras = new ViewOptionArea();
			ControllerOptionArea controlFiguras = new ControllerOptionArea(viewFiguras);
			
			viewFiguras.setVisible(true);
						
		}else if(e.getSource() == viewMain.getBtnPerimetros()){
			//viewMain.dispose();
						
			ViewOptionPerim viewFiguras = new ViewOptionPerim();
			ControllerOptionPerim controlFiguras = new ControllerOptionPerim(viewFiguras);
			
			viewFiguras.setVisible(true);
		}
		
	}

}

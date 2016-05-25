package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewAreaCirc;
import vista.ViewAreaCuad;
import vista.ViewAreaRect;
import vista.ViewAreaTrian;
import vista.ViewOptionArea;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerOptionArea implements ActionListener {
	private ViewOptionArea viewOptionArea = new ViewOptionArea();
	/**
	 * 
	 * @param viewOptionArea establece objeto de la clase ViewOptionArea
	 */
	public ControllerOptionArea(ViewOptionArea viewOptionArea) {
		super();
		this.viewOptionArea=viewOptionArea;
		
		viewOptionArea.onClickCuadrado(this);
		viewOptionArea.onclickRectagulo(this);
		viewOptionArea.onClickTriangulo(this);
		viewOptionArea.onClickCirculo(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewOptionArea.getBtnCuadrado()){
			ViewAreaCuad viewAreaCuadrado = new ViewAreaCuad();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerAreaCuad controllerAreaCuad = new ControllerAreaCuad(viewAreaCuadrado,modellCalculos);
			viewAreaCuadrado.setVisible(true);
			//viewOptionArea.dispose();
			
		}else if(e.getSource()==viewOptionArea.getBtnRectagulo()){
			ViewAreaRect viewAreaRectangulo = new ViewAreaRect();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerAreaRect controllerAreaRect = new ControllerAreaRect(viewAreaRectangulo,modellCalculos);
			viewAreaRectangulo.setVisible(true);
			//viewOptionArea.dispose();
			
		}else if(e.getSource()==viewOptionArea.getBtnTriangulo()){
			ViewAreaTrian viewAreaTriangulo = new ViewAreaTrian();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerAreaTrian controllerAreaTrian = new ControllerAreaTrian(viewAreaTriangulo, modellCalculos);
			viewAreaTriangulo.setVisible(true);
			//viewOptionArea.dispose();
			
		}else if(e.getSource()==viewOptionArea.getBtnCirculo()){
			ViewAreaCirc viewAreaCirculo = new ViewAreaCirc();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerAreaCirc controllerAreaCirc = new ControllerAreaCirc(viewAreaCirculo, modellCalculos);
			viewAreaCirculo.setVisible(true);
			//viewOptionArea.dispose();
		}
		
	}

}

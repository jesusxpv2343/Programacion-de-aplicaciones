package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModellCalculos;
import vista.ViewOptionPerim;
import vista.ViewPerimCirc;
import vista.ViewPerimCuad;
import vista.ViewPerimRect;
import vista.ViewPerimTrian;
/**
 * 
 * @author Jesus
 *
 */
public class ControllerOptionPerim implements ActionListener{
	ViewOptionPerim viewOptionPerim = new ViewOptionPerim();
	/**
	 * 
	 * @param viewOptionPerimetro establece objeto de la clase ViewOptionPerim
	 */
	public ControllerOptionPerim(ViewOptionPerim viewOptionPerimetro){
		super();
		this.viewOptionPerim=viewOptionPerimetro;
		
		viewOptionPerimetro.onClickCuadrado(this);
		viewOptionPerimetro.onclickRectagulo(this);
		viewOptionPerimetro.onClickTriangulo(this);
		viewOptionPerimetro.onClickCirculo(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewOptionPerim.getBtnCuadrado()){
			ViewPerimCuad viewPeriCuadrado = new ViewPerimCuad();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerPerimCuad controller = new ControllerPerimCuad(viewPeriCuadrado,modellCalculos);
			viewPeriCuadrado.setVisible(true);
			//viewOptionPerim.dispose();
			
		}else if(e.getSource()==viewOptionPerim.getBtnRectagulo()){
			ViewPerimRect viewPerimRect = new ViewPerimRect();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerPerimRect  controllerPerimRect = new ControllerPerimRect(viewPerimRect,modellCalculos);
			viewPerimRect.setVisible(true);
			//viewOptionPerim.dispose();
			
		}else if(e.getSource()==viewOptionPerim.getBtnTriangulo()){
			ViewPerimTrian viewPerimTrian = new ViewPerimTrian();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerPerimTrian controllerPerimTrian = new ControllerPerimTrian(viewPerimTrian,modellCalculos);
			viewPerimTrian.setVisible(true);
			//viewOptionPerim.dispose();
			
		}else if(e.getSource()==viewOptionPerim.getBtnCirculo()){
			ViewPerimCirc viewPerimCirc = new ViewPerimCirc();
			ModellCalculos modellCalculos = new ModellCalculos();
			ControllerPerimCirc controllerPerimCirc = new ControllerPerimCirc(viewPerimCirc,modellCalculos);
			viewPerimCirc.setVisible(true);
			//viewOptionPerim.dispose();
		}
		
	}

}

package controlador;

import javax.swing.JFrame;

import vista.VistaBorrarCategoria;
import vista.VistaBorrarSerie;
//import vista.VistaBorrarSerie;
import vista.VistaCrearCategoria;
import vista.VistaCrearSerie;
import vista.VistaCrearVineta;
import vista.VistaPrincipal;
import vista.VistaSeries;

public class CreadorVentanas {

	public static void crearVentanaCC(VistaSeries vs) {
		JFrame ventana = new JFrame ("Crear Categor�a");
		ventana.setIconImage(VistaPrincipal.getIconImage());
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		VistaCrearCategoria vcc = new VistaCrearCategoria();
		ControladorCrearCategoria ccc = new ControladorCrearCategoria(vcc,vs);
		vcc.controlador(ccc);
		
		ventana.setContentPane(vcc);
		ventana.pack();
		ventana.setVisible(true);
		//ventana.setBounds(0,0,400,200);
		ventana.setSize(400,200);
		ventana.setLocationRelativeTo(null);
	}
	
	public static void crearVentanaBC(VistaSeries vs) {
		JFrame ventana = new JFrame ("Borrar Categoria");
		ventana.setIconImage(VistaPrincipal.getIconImage());
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		VistaBorrarCategoria vbc = new VistaBorrarCategoria();
		ControladorBorrarCategoria cbc = new ControladorBorrarCategoria(vbc,vs);
		vbc.controlador(cbc);
		
		ventana.setContentPane(vbc);
		ventana.pack();
		ventana.setVisible(true);
		//ventana.setBounds(0,0,400,200);
		ventana.setSize(400,200);
		ventana.setLocationRelativeTo(null);
		
	}
	
	public static void crearVentanaCS(VistaSeries vs) {

		VistaCrearSerie vcs = new VistaCrearSerie();
		ControladorCrearSerie ccs = new ControladorCrearSerie(vcs,vs);
		vcs.controlador(ccs);
	
	}

	
	public static void crearVentanaBS(VistaSeries vs) {
		
		VistaBorrarSerie vbs = new VistaBorrarSerie();
		ControladorBorrarSerie cbs = new ControladorBorrarSerie(vbs, vs);
		vbs.controlador(cbs);
	}
	
	public static void crearVentanaCV(VistaSeries vs) {
		JFrame ventana = new JFrame ("Crear Vi�eta");
		ventana.setIconImage(VistaPrincipal.getIconImage());
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		VistaCrearVineta vcv = new VistaCrearVineta();
		ControladorCrearVineta ccv = new ControladorCrearVineta(vcv);
		vcv.controlador(ccv);
				
		ventana.setContentPane(vcv);
		ventana.pack();
		ventana.setVisible(true);
		ventana.setSize(600,400);
		ventana.setLocationRelativeTo(null);
	}

}

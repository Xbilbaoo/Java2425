package ud6.jarduera2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JTable;

import ud6.jarduera2.models.Futbolista;
import ud6.jarduera2.models.ddbb.FutbolistaConnect;
import ud6.jarduera2.view.FutbolistaFrame;

public class FutbolistaController {

	private FutbolistaFrame view;
	private FutbolistaConnect model;

	public FutbolistaController(FutbolistaFrame view, FutbolistaConnect model) {

		this.view = view;
		this.model = model;

	}

	public void showPlayers() {
		List<Futbolista> futbolistaList = model.getFutbolistak();
		String[] columns = { "NAN", "Izena", "Abizena", "Soldata", "IDTaldea" };
		Object[][] data = new Object[futbolistaList.size()][5];

		for (int i = 0; i < futbolistaList.size(); i++) {

			data[i][0] = futbolistaList.get(i).getNan();
			data[i][1] = futbolistaList.get(i).getIzena();
			data[i][2] = futbolistaList.get(i).getAbizena();
			data[i][3] = futbolistaList.get(i).getSoldata();
			data[i][4] = futbolistaList.get(i).getIdTaldea();

		}
		view.setContentPane(view.showData(data, columns));
		view.setVisible(true);

	}

	public Object[] searchPlayerID(String eskaera) {

		Futbolista fut = model.getFutbolistaIDtik(eskaera);
		Object[] data = new Object[5];

		data[0] = fut.getNan();
		data[1] = fut.getIzena();
		data[2] = fut.getAbizena();
		data[3] = fut.getSoldata();
		data[4] = fut.getIdTaldea();
		
		return data;
		
	}
	
	public void createPlayer() {
		
	}

}

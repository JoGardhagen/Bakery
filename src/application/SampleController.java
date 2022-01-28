package application;

import com.gardhagen.joakim.bakery.cakes.Cakes;
import com.gardhagen.joakim.bakery.cakes.WigelsBakery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class SampleController {
	@FXML
	private Button orderBtn;
	@FXML
	private RadioButton PrincessCake,ChoclateCake,ShrovetideBun;
	
	public void orderNow(ActionEvent event) {
		orderBtnClicked();
	}
	public void orderBtnClicked() {
		WigelsBakery wb = new WigelsBakery();// frabrik Instance för bageriet
		if(PrincessCake.isSelected()) {
			Cakes cake = wb.orderCake("Princess Cake");
			System.out.println(cake.getName()+"\n\n");
		}
		if(ChoclateCake.isSelected()) {
			Cakes cake3 = wb.orderCake("Choclate Cake");
			System.out.println(cake3.getName());
		}
		if(ShrovetideBun.isSelected()) {
			Cakes cake2 = wb.orderCake("Shrovetide Bun");
			System.out.println(cake2.getName()+"\n\n");
		}
		
		
	}
	
	
}

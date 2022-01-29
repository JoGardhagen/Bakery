package application;

import com.gardhagen.joakim.bakery.cakes.Cakes;
import com.gardhagen.joakim.bakery.cakes.WigelsBakery;
import com.gardhagen.joakim.customer.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	private Button orderBtn;
	@FXML
	private RadioButton PrincessCake,ChoclateCake,ShrovetideBun;
	@FXML
	private TextField customerField;
	@FXML
	private Label orderLable;
	
	WigelsBakery wb = new WigelsBakery();// frabrik Instance för bageriet
	public void orderNow(ActionEvent event) throws InterruptedException {
		orderBtnClicked();
	}
	public void orderBtnClicked() throws InterruptedException {
		String custName = customerField.getText();
		Customer cust = new Customer(custName);
		wb.attach(cust);
		
		if(PrincessCake.isSelected()) {
		
			Cakes cake = wb.orderCake("Princess Cake");
			System.out.println(cake.getName()+" "+cust.getName()+"\n\n");
			orderLable.setText(cust.getName() + " Ordered "+ cake.getName());
		}
		if(ChoclateCake.isSelected()) {
		
			Cakes cake = wb.orderCake("Choclate Cake");
			System.out.println(cake.getName()+" "+cust.getName()+"\n\n");
			orderLable.setText(cust.getName() + " Ordered "+ cake.getName());
		}
		if(ShrovetideBun.isSelected()) {
			
			Cakes cake = wb.orderCake("Shrovetide Bun");
			System.out.println(cake.getName()+" "+cust.getName()+"\n\n");
			orderLable.setText(cust.getName() + " Ordered "+ cake.getName());
		}
//		Thread.sleep(200);
//		wb.notifyAll();
		
	}
	
	
}

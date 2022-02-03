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
	private Label orderLable,orderIsDoneLabel;
	
	WigelsBakery wb = new WigelsBakery();// frabrik Instance för bageriet
	String cakeDone = "Cake is now done,";
	public void orderNow(ActionEvent event) throws InterruptedException {
		orderBtnClicked();
	}
	public void orderBtnClicked() throws InterruptedException {
		String custName = customerField.getText();
		Customer cust = new Customer(custName);
		wb.addCustomerToList(cust);
		if(PrincessCake.isSelected()) {
		
			Cakes cake = wb.orderCake("Princess Cake");
//			wb.attach(wb.);
//			System.out.println(cake.getName()+" "+cust.getName()+"\n\n");
			orderLable.setText(cust.getName() + " Ordered "+ cake.getName());
//			orderLable.setText(BakingPipeline.super().cake.);
			if(cake.isBaked()) {
				wb.notifyUpdate(cakeDone);
				orderIsDoneLabel.setText(wb.VD.message+" "+cake.getName()+", "+cust.getName());
			}
			
		}
		if(ChoclateCake.isSelected()) {
		
			Cakes cake = wb.orderCake("Choclate Cake");
//			System.out.println(cake.getName()+" "+cust.getName()+"\n\n");
			orderLable.setText(cust.getName() + " Ordered "+ cake.getName());
			if(cake.isBaked()) {
				wb.notifyUpdate(cakeDone);	
				orderIsDoneLabel.setText(wb.VD.message+" "+cake.getName()+", "+cust.getName());
			}
		}
		if(ShrovetideBun.isSelected()) {
			
			Cakes cake = wb.orderCake("Shrovetide Bun");
//			System.out.println(cake.getName()+" "+cust.getName()+"\n\n");
			orderLable.setText(cust.getName() + " Ordered "+ cake.getName());
			if(cake.isBaked()) {
				wb.notifyUpdate(cakeDone);
				orderIsDoneLabel.setText(wb.VD.message+" "+cake.getName()+", "+cust.getName());
			}
		}
	
		wb.printCustomerList();
		
	}
	
	
}

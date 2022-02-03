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
	private RadioButton PrincessCake, ChoclateCake, ShrovetideBun;
	@FXML
	private TextField customerField;
	@FXML
	private Label orderLable, orderIsDoneLabel;

	WigelsBakery wigelsBakery = new WigelsBakery();// frabrik Instance för bageriet
	String cakeDone = "Cake is now done,";

	public void orderNow(ActionEvent event) throws InterruptedException {
		orderBtnClicked();
	}
	// när användaren har valt 1 av 3 alternativ och tryckt på knappen anropas denna method:
	public void orderBtnClicked() throws InterruptedException {
		String custName = customerField.getText();// sparar det användaren har skrivit in som kund;
		Customer cust = new Customer(custName);// skapar en kund med det sparade värdet
		wigelsBakery.addCustomerToList(cust);// lägger in kunden i en kund lista 
		if (PrincessCake.isSelected()) {
			
			Cakes cake = wigelsBakery.orderCake("Princess Cake");
			orderLable.setText(cust.getName() + " Ordered " + cake.getName());
			if (cake.isBaked()) {
				wigelsBakery.notifyUpdate(cakeDone);//tillhör Observer Mönstret
				orderIsDoneLabel.setText(wigelsBakery.VD.message + " " + cake.getName() + ", " + cust.getName());
			}

		}
		if (ChoclateCake.isSelected()) {

			Cakes cake = wigelsBakery.orderCake("Choclate Cake");
			orderLable.setText(cust.getName() + " Ordered " + cake.getName());
			if (cake.isBaked()) {
				wigelsBakery.notifyUpdate(cakeDone);//tillhör Observer Mönstret
				orderIsDoneLabel.setText(wigelsBakery.VD.message + " " + cake.getName() + ", " + cust.getName());
			}
		}
		if (ShrovetideBun.isSelected()) {

			Cakes cake = wigelsBakery.orderCake("Shrovetide Bun");
			orderLable.setText(cust.getName() + " Ordered " + cake.getName());
			if (cake.isBaked()) {
				wigelsBakery.notifyUpdate(cakeDone);//tillhör Observer Mönstret
				orderIsDoneLabel.setText(wigelsBakery.VD.message + " " + cake.getName() + ", " + cust.getName());
			}
		}
		// skriver ut kunder från listan, kommentera in om man vill ha den
//		wigelsBakery.printCustomerList();

	}

}

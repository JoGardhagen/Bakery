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

	WigelsBakery wigelsBakery = new WigelsBakery();// frabrik Instance f�r bageriet
	String cakeDone = "Cake is now done,";

	public void orderNow(ActionEvent event) throws InterruptedException {
		orderBtnClicked();
	}
	// n�r anv�ndaren har valt 1 av 3 alternativ och tryckt p� knappen anropas denna method:
	public void orderBtnClicked() throws InterruptedException {
		String custName = customerField.getText();// sparar det anv�ndaren har skrivit in som kund;
		Customer cust = new Customer(custName);// skapar en kund med det sparade v�rdet
		wigelsBakery.addCustomerToList(cust);// l�gger in kunden i en kund lista 
		if (PrincessCake.isSelected()) {
			
			Cakes cake = wigelsBakery.orderCake("Princess Cake");
			orderLable.setText(cust.getName() + " Ordered " + cake.getName());
			if (cake.isBaked()) {
				wigelsBakery.notifyUpdate(cakeDone);//tillh�r Observer M�nstret
				orderIsDoneLabel.setText(wigelsBakery.VD.message + " " + cake.getName() + ", " + cust.getName());
			}

		}
		if (ChoclateCake.isSelected()) {

			Cakes cake = wigelsBakery.orderCake("Choclate Cake");
			orderLable.setText(cust.getName() + " Ordered " + cake.getName());
			if (cake.isBaked()) {
				wigelsBakery.notifyUpdate(cakeDone);//tillh�r Observer M�nstret
				orderIsDoneLabel.setText(wigelsBakery.VD.message + " " + cake.getName() + ", " + cust.getName());
			}
		}
		if (ShrovetideBun.isSelected()) {

			Cakes cake = wigelsBakery.orderCake("Shrovetide Bun");
			orderLable.setText(cust.getName() + " Ordered " + cake.getName());
			if (cake.isBaked()) {
				wigelsBakery.notifyUpdate(cakeDone);//tillh�r Observer M�nstret
				orderIsDoneLabel.setText(wigelsBakery.VD.message + " " + cake.getName() + ", " + cust.getName());
			}
		}
		// skriver ut kunder fr�n listan, kommentera in om man vill ha den
//		wigelsBakery.printCustomerList();

	}

}

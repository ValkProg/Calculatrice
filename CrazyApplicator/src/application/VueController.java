package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VueController {

	
	double number1 = 0;
	double number2 = 0;
	double result = 0;
	
	String op = "";
	
	@FXML
	private TextField txtResult;
	
	public void getValue(ActionEvent e) {
		String value = ((Button)e.getSource()).getText();
		txtResult.setText(txtResult.getText() + value);
	}


	public void getOperator(ActionEvent e) {
		String operator = ((Button)e.getSource()).getText();

		op = operator;
		number1 = Float.parseFloat(txtResult.getText());
		txtResult.setText("");
	}
	
	public void result(ActionEvent e) {
		
		number2 = Float.parseFloat(txtResult.getText());
		
		switch(op) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				result = number1 / number2;
				break;
		}
		String resultText = Double.toString(result);
		txtResult.setText(resultText);
	}
	
	public void refresh(ActionEvent e) {
		txtResult.setText("");
		op = "";
		number1 = 0;
		number2 = 0;
	}
	
}

package application;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController implements Initializable {
	
	
	
	@FXML
	Button btnLoadName;
	@FXML
	Button btnClearNames;
	@FXML
	Button btnShuffle;
	
	@FXML
	JFXTextField txtNames;
	
	
	@FXML
	Label lblNumber1;
	@FXML
	Label lblNumber2;
	@FXML
	Label lblNumber3;
	@FXML
	Label lblNumber4;
	@FXML
	Label lblNumber5;
	@FXML
	Label lblNumber6;
	@FXML
	Label lblNumber7;
	@FXML
	Label lblNumber8;
	@FXML
	Label lblNumber9;
	@FXML
	Label lblNumber10;
	@FXML
	Label lblNumber11;
	@FXML
	Label lblNumber12;
	@FXML
	Label lblNumber13;
	@FXML
	Label lblNumber14;
	@FXML
	Label lblNumber15;
	@FXML
	Label lblNumber16;
	@FXML
	Label lblNumber17;
	@FXML
	Label lblNumber18;

	@FXML
	JFXTextArea textArea;
	@FXML
	JFXTextArea txtArea1;
	@FXML
	JFXTextArea txtArea2;
	
	
	ArrayList<String> names = new ArrayList<String>();
	@FXML
	public void btnLoadName(ActionEvent event) throws IOException {
		textArea.appendText(txtNames.getText()+"\n");
		names.add(txtNames.getText());
		txtNames.clear();
	}
	@FXML
	public void btnClearNames(ActionEvent event) {
		textArea.clear();
		names.clear();
		lblNumber1.setText("");
		lblNumber2.setText("");
		lblNumber3.setText("");
		lblNumber4.setText("");
		lblNumber5.setText("");
		lblNumber6.setText("");
		lblNumber7.setText("");
		lblNumber8.setText("");
		lblNumber9.setText("");
		lblNumber10.setText("");
		lblNumber11.setText("");
		lblNumber12.setText("");
		lblNumber13.setText("");
		lblNumber14.setText("");
		lblNumber15.setText("");
		lblNumber16.setText("");
		lblNumber17.setText("");
		lblNumber18.setText("");
		
	}
	@FXML
	public void btnShuffle(ActionEvent event) {
		
		
		
			
			
//			names.add("Lucky");
//			names.add("Berlindah");
//			names.add("Master Mind");
//			names.add("Pro");
//			names.add("OB");
//			names.add("Lehlogonolo");
//			names.add("Ryan");
//			names.add("Lungile");
//			names.add("Precilla");
//			names.add("Teboho");
//			names.add("Sizwe");
//			names.add("Thulani");
//			names.add("Tshepiso");
//			names.add("Mthokozisi");
//			names.add("Mapeiso");
//			names.add("KB");
//			names.add("Mphoentle");
//			names.add("Terrance");

		
		Collections.shuffle(names);
		//txtArea1.setText(names.get(0));
		lblNumber1.setText(names.get(0));
		lblNumber2.setText(names.get(1));
		lblNumber3.setText(names.get(2));
		lblNumber4.setText(names.get(3));
		lblNumber5.setText(names.get(4));
		lblNumber6.setText(names.get(5));
		lblNumber7.setText(names.get(6));
		lblNumber8.setText(names.get(7));
		lblNumber9.setText(names.get(8));
		lblNumber10.setText(names.get(9));
		lblNumber11.setText(names.get(10));
		lblNumber12.setText(names.get(11));
		lblNumber13.setText(names.get(12));
		lblNumber14.setText(names.get(13));
		lblNumber15.setText(names.get(14));
		lblNumber16.setText(names.get(15));
		lblNumber17.setText(names.get(16));
		lblNumber18.setText(names.get(17));
		}
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}

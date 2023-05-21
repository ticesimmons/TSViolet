package application;

import Externals.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class MainPageController {
	
	private double runStatus;
	
	@FXML
	private Button buttonResetTheThing;
	
	@FXML
	private Button buttonRun;
	
	@FXML
	private Button buttonCommit;
	
	@FXML
	private Button buttonHelp;
	
	@FXML
	private ProgressBar barRunStatus;
	
	@FXML
	private TextField pathTextField;
	
	@SuppressWarnings("rawtypes")
	@FXML 
	private ComboBox pathBox;
	
	
	public void initialize() throws FileNotFoundException {
		fillComboBoxFromFile(pathBox);
	}
	
	@FXML
	public void resetSession() {
		// reset values
	}
	
	@FXML
	public void run() {
		XLFeeler Feeler = new XLFeeler();
		Feeler.read();
	}
	
	@FXML
	public void commitPath() {
		// commit a new path to a text file	
		try {
			FileWriter fw = new FileWriter("paths.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(pathTextField.getText() + "\n"); //should be the text in the path text field		
			bw.close();
			pathTextField.clear();
			
			fillComboBoxFromFile(pathBox); 
		} catch (IOException e) {
			System.out.println("Unable to write to file");
			e.printStackTrace();
		}
	}
	
	/**
	 * used to update the running status of the current session
	 * 
	 * @param status
	 */
	public void updateRunStatus(double runStatus) {
		this.runStatus = runStatus;
	}
	
	/**
	 * this should be equal to the status bars value
	 * 
	 * @return the current sessions running status
	 */
	public double getRunStatus() {
		return runStatus;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	/**
	 * fills the combo box from the paths file
	 * 
	 * @param natComboBox
	 * @throws FileNotFoundException
	 */
	@FXML
	public static void fillComboBoxFromFile(ComboBox natComboBox) throws FileNotFoundException {
		
		Scanner fileIn = new Scanner(new File("paths.txt"));
		
		while (fileIn.hasNext()) {
			String currentPath = fileIn.nextLine();
			natComboBox.getItems().add(currentPath);
		}
		fileIn.close();
	}
	
	
	public String getInputPathText() {
		return pathTextField.getText();
	}
	
	public String getCurrentPath() {
		return pathBox.getValue().toString();
	}
	
	
	@SuppressWarnings("rawtypes")
	public ComboBox getPathBox() {
		return pathBox;
	}
}

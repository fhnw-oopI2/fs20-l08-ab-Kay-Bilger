package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	StringProperty titleProperty;
	StringProperty buttonTitleProperty;

	public PresentationModel(){
		this.buttonTitleProperty = new SimpleStringProperty("Hello World");
		this.titleProperty = new SimpleStringProperty("JavaFX Application");
	}
	
}

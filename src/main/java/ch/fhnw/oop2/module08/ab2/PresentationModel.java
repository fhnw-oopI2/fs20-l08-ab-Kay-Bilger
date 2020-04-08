package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	StringProperty title;
	StringProperty buttonTitle;

	public PresentationModel(){
		this.buttonTitle = new SimpleStringProperty(ButtonStates.On.toString());
		this.title= new SimpleStringProperty("Toggle Application");
	}
	
	public void switchButtonStates() {
		if (getButtonTitle() == ButtonStates.On.toString()) {
			setButtonTitle(ButtonStates.Off.toString());
		}
		else setButtonTitle(ButtonStates.On.toString());
	}

	public String getTitle() {
		return title.get();
	}
	
	public StringProperty titleProperty() {
		return title;
	}

	public void setTitle(String title) {
		this.title.set(title);
	}

	public String getButtonTitle() {
		return buttonTitle.get();
	}
	
	public StringProperty buttonTitleProperty() {
		return buttonTitle;
	}

	public void setButtonTitle(String buttonTitle) {
		this.buttonTitle.set(buttonTitle);
	}

	
}

package ch.fhnw.oop2.module08.ab2;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {

	private Button button;
	
	public ApplicationUI(PresentationModel model) {
		initializeControls(model);
		layoutControls();
	}
	
	private void initializeControls(PresentationModel model) {
		this.button = new Button();
		this.button.textProperty().bind(model.buttonTitle);
		this.button.setOnAction(e -> model.switchButtonStates());
		
	}

	private void layoutControls() {
		this.getChildren().add(button);
	}
}

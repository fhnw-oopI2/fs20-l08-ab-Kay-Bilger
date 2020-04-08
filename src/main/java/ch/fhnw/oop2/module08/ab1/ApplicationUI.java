package ch.fhnw.oop2.module08.ab1;

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
		button.textProperty().bind(model.buttonTitleProperty);
	}

	private void layoutControls() {
		this.getChildren().add(button);
	}
}

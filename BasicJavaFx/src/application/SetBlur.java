package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

	class SetBlur {

		@FXML
		private ImageView bosque;

		@FXML
		public void initialize() {
			bosque.setEffect(new GaussianBlur(10));
		}
		
	}
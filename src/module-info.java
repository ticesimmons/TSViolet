module JavafxSceneBuilder {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.apache.poi.poi;
	requires org.apache.poi.ooxml;
	
	opens application to javafx.graphics, javafx.fxml;
}

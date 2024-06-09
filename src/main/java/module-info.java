module com.montenegro.hospital {
	requires javafx.controls;
	requires javafx.fxml;
	
	
	opens com.montenegro.hospital to javafx.fxml;
	exports com.montenegro.hospital;
	exports com.montenegro.hospital.controller;
	opens com.montenegro.hospital.controller to javafx.fxml;
}
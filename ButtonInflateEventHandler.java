package ca.utoronto.utm.balloonmvc;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ButtonInflateEventHandler implements EventHandler<ActionEvent>{
	Balloon b;
	public ButtonInflateEventHandler(Balloon b) {
		this.b = b;
	}
	
	public void handle(ActionEvent event) {
		this.b.roll(); 
	}
}

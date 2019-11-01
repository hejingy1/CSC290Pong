package ca.utoronto.utm.balloonmvc;

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

/**
 * We extend JLabel as a view on a Balloon
 * @author arnold
 *
 */

public class GUIView extends HBox implements Observer {
	private Button roll = new Button("Roll Dice");
	private Balloon a = new Balloon();
	
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
		
	public GUIView() {
		this.setPadding(new Insets(10));
		this.setHeight(5);
		tf1.setPrefColumnCount(10);
		tf2.setPrefColumnCount(10);
		tf1.setEditable(false);
		tf2.setEditable(false);
		this.getChildren().add(roll);
		this.getChildren().add(tf1);
		this.getChildren().add(tf2);
		roll.setOnAction(new ButtonInflateEventHandler(a));
	}
	
	@Override
	public void update(Observable o) {
		Balloon b = (Balloon)o;
		tf1.setText(b.getDiceValue1()+"");
		tf2.setText(b.getDiceValue2()+"");
	}
	
}


import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Client extends Application {
	private final TextField beef=new TextField();
	private final TextField ham=new TextField();
	private final TextField chicken=new TextField();
	private TextField vegetables = new TextField();
	private TextField onion = new TextField();
	private TextField carrot = new TextField();
	private TextField tomato = new TextField();
	private TextField lettece = new TextField();
	private final Text text1 =new Text();
	private final Text text2 =new Text();
	private Button inProgress=new Button();
	private Button doneBtn=new Button();
	private ArrayList<TextField>texts = new ArrayList<TextField>();
	//Adding a Label
			
	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox();
		//setting the texts
		beef.setText("Beef");
		ham.setText("ham");
		chicken.setText("chicken");
		vegetables.setText("vegtables");
		text1.setText("How many unit");
		text2.setText("How many unit");
		inProgress.setText("inProgress");
		doneBtn.setText("Done");
		onion.setText("onion");
		carrot.setText("carrot");
		tomato.setText("tomato");
		lettece.setText("lettece");
		//add to hbox the buttons,text,and the textfield 
		HBox vegetableBox = new HBox();
		vegetableBox.setPadding(new Insets(20,20,20,20));
		vegetableBox.getChildren().addAll(vegetables,text1);
		HBox beefBox = new HBox();
		beefBox.setPadding(new Insets(20,20,20,20));
		beefBox.getChildren().addAll(beef,text2,inProgress,doneBtn);
		HBox hamBox = new HBox();
		hamBox.setPadding(new Insets(20,20,20,20));
		hamBox.getChildren().addAll(ham);
		HBox chickenBox = new HBox();
		chickenBox.setPadding(new Insets(20,20,20,20));
		chickenBox.getChildren().addAll(chicken);
		HBox onionBox = new HBox();
		onionBox.setPadding(new Insets(20,20,20,20));
		onionBox.getChildren().add(onion);
		HBox carrotBox = new HBox();
		carrotBox.setPadding(new Insets(20,20,20,20));
		carrotBox.getChildren().add(carrot);
		HBox tomatoBox = new HBox();
		tomatoBox.getChildren().add(tomato);
		tomatoBox.setPadding(new Insets(20,20,20,20));
		HBox letteceBox = new HBox();
		letteceBox.setPadding(new Insets(20,20,20,20));
		letteceBox.getChildren().add(lettece);
		//adding text to hbox
		root.getChildren().addAll(beefBox, hamBox,chickenBox,vegetableBox,onionBox,carrotBox,tomatoBox,letteceBox);
		
		Button confirmBtn = new Button("confirm");
		Button deleteBtn= new Button("delete");
		Button chooseButton = new Button("choose");
		HBox controller = new HBox();
		
		//adding buttons to hbox
		controller.getChildren().addAll(confirmBtn, deleteBtn,chooseButton);
		
		//adding both hboxes to vbox
		root.getChildren().addAll(controller);
		
		//adding vbox to scene
		Scene scene = new Scene(root,500,600);
		
		//Adding a Label
		 stage.setTitle("dimmu Burger");
		stage.setScene(scene);
		stage.show();
		//Defining the Name text field
			
		
	}
	public static void main(String[] args) {
		Application.launch(args);
		}

}

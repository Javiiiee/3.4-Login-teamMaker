/**
 * Author - Javier Bonilla
 * Application - Login interface with team assigning program if logged in
 * License to the public
 */
//Import all the javafx imports neccessary
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Login extends Application {
	@Override
	public void start(Stage primaryStage){
	/**
	 * first create correct username and password
	 */
	String username = new String("Javiiiee");
	String password = new String("csc200");
	/**
	 * follow by creating a while loop, the limit beign 3, remember to set initial count to 0
	 */
		int count = 0;
		final int LIMIT = 3;
		while(count < LIMIT){
	/**
	 * next, i created the first couple of textInpuDialogs to prompt the user for an username and password input
	 */
	TextInputDialog one = new TextInputDialog();
	one.setTitle("Login");
	one.setContentText("Enter Username");
	Optional<String> user = one.showAndWait();

	TextInputDialog two = new TextInputDialog();
	two.setTitle("Login:");
	two.setContentText("Enter password");
	Optional<String> pass = two.showAndWait();
		count++;
	 
	Boolean verification = new Boolean(user.get().equals(username)&&(pass.get().equals(password)));
	/** 
	 * the first if statement was set up thanks to a boolent truth or false statement, it will run another 
	 * textinputdialog prompting for a total number of players if input matches the already set up username and password
	 */
	if(verification == true){
	TextInputDialog uno = new TextInputDialog();
	uno.setTitle("Group Application");
	uno.setContentText("Enter total number of people");
	Optional<String> all = uno.showAndWait();

	double total = Double.parseDouble(all.get());


	if((11<= total)&&(total<=55)){
	
		double teamsize = (total/11);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Team Maker");
		alert.setHeaderText("your total numbers of players is " + total);
		alert.setContentText("your team size is " + teamsize);
		alert.show();

	}else if ((3<=total)&&(total<11)){
		double teamsize2 = (total/3);

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Team Maker");
		alert.setHeaderText("your total number of players is " + total);
		alert.setContentText("you can make " + teamsize2 + " number of teams");
		alert.show();
	}else{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Team Maker");
		alert.setHeaderText("The total must be greater than 3");
		alert.setContentText("Please try again");
		alert.show();
	}
	/**if the boolean statement is false and input dont match the set up variables, then an alert dialog will pop up prompting the user
	 * to try again
	 */
	} if(verification == false){
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("login");
		alert.setContentText("Incorect, try again");
		alert.show();
	}else{
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Login");
		alert.setHeaderText("Contact Administrator");
		alert.show();
	}
		}

	
	
	}
} 

import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.*;
import javafx.application.Application;
import javax.swing.*;
import java.awt.*;
/**
 * converts a person's height in cm to feet and inches
 * @author Patrick H.
 * @since 2017-9-19
 *@version 1.0
 */

public class HeightJFX extends Application {

	public void start(Stage primaryStage) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		TextInputDialog heightprompt = new TextInputDialog();
		heightprompt.setTitle("HeightJFX");
		heightprompt.setHeaderText("Height converter for cm to ft/in");
		heightprompt.setContentText("Please enter your height in cm");
		heightprompt.setX(450);
		heightprompt.setY(10);
		heightprompt.showAndWait();
		//creates Javafx prompt

		JFrame f = new JFrame();
		f.setLocation(50,300);
		f.setVisible(true);
		//creates j frame to change location of j option pane

		String heightorig2 = JOptionPane.showInputDialog(f, "Please enter your height in cm");
		//creates j option pane prompt

		String heightorig = heightprompt.getResult();
		double heightcm = Double.parseDouble(heightorig);
		double heightindbl = (heightcm * 0.39);
		int heightinint = (int) heightindbl;
		int heightft = (heightinint/12);
		int heightrem = (heightft%12);
		//logic used in javafx prompts

		double heightcm2 = Double.parseDouble(heightorig2);
		double heightindbl2 = (heightcm2 * 0.39);
		int heightinint2 = (int) heightindbl2;
		int heightft2 = (heightinint2/12);
		int heightrem2 = (heightft2%12);
		//logic used in j option pane prompts

		Alert heightresult = new Alert(Alert.AlertType.INFORMATION);
		heightresult.setTitle("HeightJFX");
		heightresult.setHeaderText("Your height in imperial is: " + heightft + "ft, " + heightrem + "in.");
		heightresult.setContentText("Thank you");
		heightresult.setX(450);
		heightresult.setY(500);
		heightresult.showAndWait();
		//output of java fx prompt

		f.setLocation(1000,300);
		JOptionPane.showMessageDialog(f, "your height in imperial is: " + heightft2 + "ft, " + heightrem2 + "in." );
		System.exit(0);
		//output for j option pane prompts and exits program
	}
}
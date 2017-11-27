/**
 * 
 */
package view;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Gives a player statistic view
 * @author SA
 */
public class
PlayerStatisticsView{

	
	VBox playerBox = null;
	Label actorName = null;

	TextArea status = null;
	Label countriesWon = null;

	
	/**
	 * 
	 */
	public PlayerStatisticsView() {
		this.playerBox = new VBox();
		playerBox.setPadding(new Insets(5));
		this.actorName = new Label();
		setFontColor(actorName, "#0076a3");
		HBox profilepicContainer = new HBox(); 
		
		profilepicContainer.getChildren().add(actorName);

		this.status = new TextArea();
		this.status.setMinHeight(140);
		this.countriesWon = new Label();
		setFontColor(countriesWon, "#F44336");

		this.playerBox.getChildren().add(profilepicContainer);
		this.playerBox.getChildren().add(status);
		this.playerBox.getChildren().add(countriesWon);
	}
	
	
	
	/**
	 * @param label the label you want to color
	 * @param color is a type of String example: "red" or "#333"
	 */
	public void setFontColor(Label label,String color){
		label.setFont(new Font("Cambria", 14));
		label.setTextFill(Color.web(color));
		label.setPadding(new Insets(10));
	}
	
	/**
	 * @return the playerBox
	 */
	public VBox getPlayerBox() {
		return playerBox;
	}
	/**
	 * @param playerBox the playerBox to set
	 */
	public void setPlayerBox(VBox playerBox) {
		this.playerBox = playerBox;
	}
	/**
	 * @return the actorName
	 */
	public Label getActorName() {
		return actorName;
	}
	/**
	 * @param actorName the actorName to set
	 */
	public void setActorName(String actorName) {
		this.actorName.setText(actorName);
	}
	
	/**
	 * @return the {@link #status} on current player
	 */
	public TextArea getCurrentStatus() {
		return status;
	}
	
	
	/**
	 * @return {@link String} the text on {@link #countriesWon} of current player
	 */
	public String getContriesWon() {
		return this.countriesWon.getText();
	}
	
	/**
	 * @param status the status of present player
	 */
	public void setCurrentStatus(String status) {
		this.status.setText(this.status.getText()+" \n "+status);
	}
	
	/**
	 * @param countriesWon the countriesWon to set
	 */
	public void setCountriesWon(String countriesWon) {
		this.countriesWon.setText(countriesWon);
	}



	/**
	 * 
	 */
	public void clearStatus() {
		this.status.setText("");	
	}



	/**
	 * @return {@link #countriesWon} Label which contains details of 
	 * countries own by player
	 */
	public Label getContriesWonLabel() {
		return this.countriesWon;		
	}


	
	
}

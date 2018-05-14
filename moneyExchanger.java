import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

class storage{
    private int twoDollar;
    private int oneDollar;
    private int twentyFiveCents;
    private int tenCents;
    private int fiveCents;

    public storage(){
        twoDollar = 0;
        oneDollar = 0;
        twentyFiveCents = 0;
        tenCents = 0;
        fiveCents = 0;
    }
    public storage(int a, int b, int c, int d, int e){
        this.twoDollar = a;
        this.oneDollar = b;
        this.twentyFiveCents = c;
        this.tenCents = d;
        this.fiveCents = e;
    }
    public double sum(){
//        return (double) twoDollar * 2 + (double) oneDollar + twentyFiveCents * 0.25 + tenCents * 0.1 + fiveCents * 0.05;
        return twoDollar * 2 + oneDollar + twentyFiveCents *0.25 + tenCents * 0.1 + fiveCents * 0.05;
    }
    public String toString(){
        return "We Currently have" + this.sum();
    }
}

    class address extends Pane{
        public address(String title){
            Pane innerPane = new Pane();
            innerPane.setStyle("-fx-background-color: white; " +
                    "-fx-border-color: gray; " +
                    "-fx-padding: 4 4;");
            Label label1 = new Label("Two Dollar:");
            label1.relocate(10, 20);
            label1.setPrefSize(80, 30);
            Label label2 = new Label("One Dollar:");
            label2.relocate(10, 55);
            label2.setPrefSize(80, 30);
            Label label3 = new Label("25 Cents:");
            label3.relocate(10, 90);
            label3.setPrefSize(80, 30);
            Label label4 = new Label("10 Cents:");
            label4.relocate(10, 125);
            label4.setPrefSize(80, 30);
            Label label5 = new Label("5 Cents:");
            label5.relocate(10, 160);
            label5.setPrefSize(80, 30);
            Label label6 = new Label("Current Amt:");
            label6.relocate(10,195 );
            label6.setPrefSize(80,30 );
            TextField nameField = new TextField();
            nameField.relocate(100, 20);
            nameField.setPrefSize(300, 30);
            TextField streetField = new TextField();
            streetField.relocate(100, 55);
            streetField.setPrefSize(300, 30);
            TextField cityField = new TextField();
            cityField.relocate(100, 90);
            cityField.setPrefSize(300, 30);
            TextField provinceField = new TextField();
            provinceField.relocate(100, 125);
            provinceField.setPrefSize(300, 30);
            TextField postalField = new TextField();
            postalField.relocate(100, 160);
            postalField.setPrefSize(300, 30);
            TextField totalMoney  = new TextField();
            totalMoney.relocate(100,195);
            totalMoney.setPrefSize(300,30);
            totalMoney.setPromptText("0");
            //Button Click
            Button aButton = new Button("Calculate !");
            aButton.relocate(180, 230);

            aButton.setOnAction(e->{
                System.out.println("Call UPDATE METHOD");
            });
// Add all labels and textfields to the pane
            innerPane.getChildren().addAll(label1, label2, label3, label4, label5,label6,
                    nameField, streetField, cityField, provinceField, postalField,totalMoney,aButton);
// Make a title for border and add it as well as inner pane to main pane
            Label titleLabel = new Label(); // Title to be placed onto border
            titleLabel.setText(title); // Incoming constructor parameter
            titleLabel.setStyle("-fx-background-color: white; \n" +
                    "-fx-translate-y: -8; \n" +
                    "-fx-translate-x: 10;");
            getChildren().addAll(innerPane, titleLabel);
        }
    }





public class moneyExchanger extends Application {
    public static void main(String[] args) {
        launch(args);
        storage a = new storage(1,1,1,1,1);


    }
    public void start(Stage primaryStage) {

        Pane aPane = new Pane();
        // Add the drop-down list


        // Now add an AddressPane
        address myPanel = new address("Money Exchanger");
        myPanel.relocate(10,50);
        aPane.getChildren().add(myPanel);
        primaryStage.setTitle("Money Exchanger"); // Set title of window
        primaryStage.setResizable(false); // Make it non-resizable
        primaryStage.setScene(new Scene(aPane, 420,330)); // Set size of window
        primaryStage.show();

    }
}

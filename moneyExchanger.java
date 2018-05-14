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
        return (double) twoDollar * 2 + (double) oneDollar +(double) twentyFiveCents *0.25 + (double) tenCents * 0.1 +(double) fiveCents * 0.05;
    }
    public String toString(){
        return "We Currently have " + this.sum();
    }
}

    class address extends Pane{
        private int aTwo = 0;
        private int aOne = 0;
        private int aTwentyFive = 0;
        private int aTen = 0;
        private int aFive = 0;
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
            TextField twoDollar = new TextField();
            twoDollar.relocate(100, 20);
            twoDollar.setPromptText("0");
            twoDollar.setPrefSize(300, 30);
            twoDollar.setPromptText("0");
            twoDollar.setOnAction(event -> {
                if (twoDollar.getText() != null && !twoDollar.getText().isEmpty() &&isNumeric(twoDollar.getText())){
                    System.out.println(123);
                    aTwo = Integer.parseInt(twoDollar.getText());
                    System.out.println(Integer.parseInt(twoDollar.getText()));
                    //update method
                }
            });

            TextField oneDollar = new TextField();
            oneDollar.relocate(100, 55);
            oneDollar.setPrefSize(300, 30);
            oneDollar.setPromptText("0");
            oneDollar.setOnAction(event -> {
                if (oneDollar.getText() != null && !oneDollar.getText().isEmpty() &&isNumeric(oneDollar.getText())){
                    System.out.println(123);
                    aOne = Integer.parseInt(oneDollar.getText());
                    //update method
                }
            });

            TextField twentyFiveCents = new TextField();
            twentyFiveCents.relocate(100, 90);
            twentyFiveCents.setPrefSize(300, 30);
            twentyFiveCents.setPromptText("0");
            twentyFiveCents.setOnAction(event -> {
                if (twentyFiveCents.getText() != null && !twentyFiveCents.getText().isEmpty() &&isNumeric(twentyFiveCents.getText())){
                    System.out.println(123);
                    aTwentyFive = Integer.parseInt(twentyFiveCents.getText());
                    //update method
                }
            });

            TextField tenCents = new TextField();
            tenCents.relocate(100, 125);
            tenCents.setPrefSize(300, 30);
            tenCents.setPromptText("0");
            tenCents.setOnAction(event -> {
                if (tenCents.getText() != null && !tenCents.getText().isEmpty() && isNumeric(tenCents.getText())){
                    System.out.println(123);
                    aTen = Integer.parseInt(tenCents.getText());
                }
            });


            TextField fiveCents = new TextField();
            fiveCents.relocate(100, 160);
            fiveCents.setPrefSize(300, 30);
            fiveCents.setPromptText("0");
            fiveCents.setOnAction(event -> {
                if (fiveCents.getText() != null &&!fiveCents.getText().isEmpty() && isNumeric(fiveCents.getText())){
                    System.out.println(123);
                    aFive = Integer.parseInt(fiveCents.getText());
                }
            });



            TextField totalMoney  = new TextField();
            totalMoney.relocate(100,195);
            totalMoney.setPrefSize(300,30);
            totalMoney.setPromptText("0");
            //Button Click
            Button aButton = new Button("Calculate !");
            aButton.relocate(180, 230);

            aButton.setOnAction(e->{
                System.out.println("Call UPDATE METHOD");
                storage a = new storage(aTwo,aOne,aTwentyFive,aTen,aFive);
                System.out.println(a);
                totalMoney.setText(a.toString());
            });
// Add all labels and textfields to the pane
            innerPane.getChildren().addAll(label1, label2, label3, label4, label5,label6,
                    twoDollar, oneDollar, twentyFiveCents, tenCents, fiveCents,totalMoney,aButton);
// Make a title for border and add it as well as inner pane to main pane
            Label titleLabel = new Label(); // Title to be placed onto border
            titleLabel.setText(title); // Incoming constructor parameter
            titleLabel.setStyle("-fx-background-color: white; \n" +
                    "-fx-translate-y: -8; \n" +
                    "-fx-translate-x: 10;");
            getChildren().addAll(innerPane, titleLabel);
        }
        public boolean isNumeric(String str)
        {
            return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
        }
        public int amtCoins(int amt){
            return amt;
        }
    }





public class moneyExchanger extends Application {
    public static void main(String[] args) {
        launch(args);
        storage a = new storage(3,3,3,3,3);
        System.out.println(a);

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

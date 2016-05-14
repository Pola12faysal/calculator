package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;
public class form_event extends Application {	
    TextArea textarea;
    String display = "";
    String call_process = "";
    boolean isSquare = false;
    boolean isOpen = false;
    int countOpen = 0;
    int countClose = 0;

    @Override
    public void start(Stage primaryStage) {
    	Rectangle2D rect=Screen.getPrimary().getVisualBounds();
    	double widthlistner = rect.getWidth();//widthlistner=800;
    	double heightlistner = rect.getHeight();	//heightlistner=800;
    	double buttonwidth=(widthlistner-40)/6;
    	double buttonheight=(heightlistner-40)/6;
    	Pane root = new Pane();

        textarea = new TextArea();
    
        root.getChildren().add(textarea) ;

        Button seven = new Button("7");
      
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "7";
                   call_process += "7";
                    textarea.setText(display);
                }
            }
        });
        root.getChildren().add(seven);

        Button eight = new Button("8");
      
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "8";
                   call_process += "8";
                    textarea.setText(display);
                }
            }
        });
        root.getChildren().add(eight);

        Button nine = new Button("9");
       
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "9";
                   call_process += "9";
                    textarea.setText(display);
                }
            }
        });
        root.getChildren().add(nine);
        Button four = new Button("4");
    
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "4";
                   call_process += "4";
                    textarea.setText(display);
                }
            }
        });
        root.getChildren().add(four);

        Button five = new Button("5");
     
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "5";
                   call_process += "5";
                    textarea.setText(display);
                }
            }
        });
        root.getChildren().add(five);

        Button six = new Button("6");
    
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "6";
                   call_process += "6";
                    textarea.setText(display);
                }
            }
        });
        root.getChildren().add(six);
        Button one = new Button("1");
       
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "1";
                   call_process += "1";
                    textarea.setText(display);
                }
            }
        });
        root.getChildren().add(one);

        Button two = new Button("2");
     
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "2";
                   call_process += "2";
                    textarea.setText(display);
                }

            }
        });
        root.getChildren().add(two);

        Button three = new Button("3");
       
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                  display += "3";
                   call_process += "3";
                    textarea.setText(display);

                }
            }

        });
        root.getChildren().add(three);
        Button zero = new Button("0");
      
        zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {

                  display += "0";
                   call_process += "0";
                    textarea.setText(display);

                }
            }
        });
        root.getChildren().add(zero);

        Button point = new Button(".");
      
        point.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {

                  display += ".";
                   call_process += ".";
                    textarea.setText(display);
                }

            }
        });
        root.getChildren().add(point);        
        Scene scene = new Scene(root);
     
        primaryStage.setTitle(" Calculator");
     
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
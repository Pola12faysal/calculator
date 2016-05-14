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
    	StackPane root = new StackPane();

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

        Button division = new Button("/");
     
        division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = display.charAt(display.length() - 1);
                if (Character.isDigit(ch) || ch == ')') {
                  display += "/";
                   call_process += "/";
                    textarea.setText(display);
                    isSquare = false;
                }
            }
        });
        root.getChildren().add(division);

        Button delete = new Button("←");
    
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = ' ';
                if (!display.equals("")) {
                    ch = display.charAt(display.length() - 1);
                }
           
                String str = textarea.getText();
                String newStr = str.substring(0, display.length() - 1);
              display = newStr;
               call_process =call_process.substring(0,call_process.length() - 1);
                textarea.setText(display);
            }
        });
        root.getChildren().add(delete);

        Button reset = new Button("reset");
       
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textarea.setText("");
              display = "";
               call_process = "";
               
            }
        });

        root.getChildren().add(reset);

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

        Button multiplication = new Button("*");
     
        multiplication.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = display.charAt(display.length() - 1);
                if (Character.isDigit(ch) || ch == ')') {
                  display += "*";
                   call_process += "*";
                    textarea.setText(display);
                    isSquare = false;
                }
            }
        });
        root.getChildren().add(multiplication);

        Button openPar = new Button("(");
      
        openPar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch1 = ' ';
                if (!display.equals("")) {
                    ch1 = display.charAt(display.length() - 1);
                }
                if (((!Character.isDigit(ch1) && isSquare == false) && ch1 != ')') || ch1 == ' ') {
                  display += "(";
                   call_process += "(";
                    textarea.setText(display);
                    isOpen = true;
                  countOpen++;
                }
            }
        });
        root.getChildren().add(openPar);

        Button closePar = new Button(")");
      
        closePar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isOpen) {
                  display += ")";
                   call_process += ")";
                    textarea.setText(display);
                    countClose++;
                }
            }
        });
        root.getChildren().add(closePar);

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

        Button minus = new Button("-");
      
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              display += "-";
               call_process += "-";
                textarea.setText(display);
                isSquare = false;
               }
            }
        );
        root.getChildren().add(minus);

        Button square = new Button("X^2");
       
        square.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char lastChar = display.charAt(display.length() - 1);
                if (Character.isDigit(lastChar)) {
                    String number = "";
                    String swapNumber = "";
                    String str = textarea.getText();
                    for (int i = str.length() - 1; i >= 0; i--) {
                        char ch = str.charAt(i);
                        if (Character.isDigit(ch)) {
                            number += ch;
                        } else {
                            break;
                        }
                    }
                    for (int i = number.length() - 1; i >= 0; i--) {
                        char ch = number.charAt(i);
                        swapNumber += ch;
                    }
                   call_process += "*" + swapNumber;
                  display += "^2";
                    textarea.setText(display);
                    isSquare = true;
                }
            }
        });
        root.getChildren().add(square);

        Button squareRoot = new Button("√");
      
        squareRoot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	textarea.setText(textarea.getText()+"√");

              display+="√";
              call_process +="√";
            	
            }
        });
        root.getChildren().add(squareRoot);

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

        Button mod = new Button("%");
       
        mod.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

              display += "%";
               call_process += "%";
                textarea.setText(display);
       
            }
        });
        root.getChildren().add(mod);

        Button add = new Button("+");
      
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                char ch = display.charAt(display.length() - 1);
                if (Character.isDigit(ch) || ch == ')') {
                  display += "+";
                   call_process += "+";
                    textarea.setText(display);
                    isSquare = false;
                }
            }
        });
        root.getChildren().add(add);

        Button equal = new Button("=");
      
        equal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (countClose != countOpen) {
                    textarea.setText("error expression");
                  display = "";
                   call_process = "";
                } else {

                    process ev = new process();
                    try {
						 call_process = ev.brackets( call_process);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    textarea.setText( call_process);
                  display = "";
                   call_process = "";
                }
            }
        });
        
        Scene scene = new Scene(root);
     
        primaryStage.setTitle(" Calculator");
     
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
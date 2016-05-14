package cal;
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
import main.java.form_event.process;

public class form_event extends Application {
	
    public class process {

	}

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
        textarea.setFont(new Font(70));
        textarea.setPrefSize(25+6*buttonwidth,2* buttonheight);
        textarea.relocate(5,5);
		   delete.setPrefSize(buttonwidth,buttonheight);
		  seven.setPrefSize(buttonwidth,buttonheight);
		   six.setPrefSize(buttonwidth,buttonheight);
		   five.setPrefSize(buttonwidth,buttonheight);
		   four.setPrefSize(buttonwidth,buttonheight);
		   three.setPrefSize(buttonwidth,buttonheight);
		   two.setPrefSize(buttonwidth,buttonheight);
		   one.setPrefSize(buttonwidth,buttonheight);
		   zero.setPrefSize(buttonwidth,buttonheight);
		   eight.setPrefSize(buttonwidth,buttonheight);
		   nine.setPrefSize(buttonwidth,buttonheight);
		   division.setPrefSize(buttonwidth,buttonheight);
		   multiplication.setPrefSize(buttonwidth,buttonheight);
		   openPar.setPrefSize(buttonwidth,buttonheight);
		   closePar.setPrefSize(buttonwidth,buttonheight);
		   minus.setPrefSize(buttonwidth,buttonheight);
		   squareRoot.setPrefSize(buttonwidth,buttonheight);
		   equal.setPrefSize(buttonwidth*2+5,buttonheight);
		   add.setPrefSize(buttonwidth,buttonheight);
		   mod.setPrefSize(buttonwidth,buttonheight);
		   square.setPrefSize(buttonwidth,buttonheight);
		   point.setPrefSize(buttonwidth,buttonheight);
		   //text.relocate(0,0);
		   seven.relocate(5,2*buttonheight+10);
		   four.relocate(5,3*buttonheight+15);
		   one.relocate(5,4*buttonheight+20);
		   zero.relocate(5,5*buttonheight+25);
		   eight.relocate(10+buttonwidth,2*buttonheight+10);
		   five.relocate(10+buttonwidth,3*buttonheight+15);
		   two.relocate(10+buttonwidth,4*buttonheight+20);
		   point.relocate(10+buttonwidth,5*buttonheight+25);
		   nine.relocate(15+buttonwidth*2,2*buttonheight+10);
		   six.relocate(15+buttonwidth*2,3*buttonheight+15);
		   three.relocate(15+buttonwidth*2,4*buttonheight+20);
		   mod.relocate(15+buttonwidth*2,5*buttonheight+25);
		   division.relocate(20+buttonwidth*3,2*buttonheight+10);
		   minus.relocate(20+buttonwidth*3,3*buttonheight+15);
		   multiplication.relocate(20+buttonwidth*3,4*buttonheight+20);
		   add.relocate(20+buttonwidth*3,5*buttonheight+25);
		   delete.relocate(25+4*buttonwidth,2*buttonheight+10);
		   openPar.relocate(25+4*buttonwidth,3*buttonheight+15);
		   square.relocate(25+4*buttonwidth,4*buttonheight+20);
		   equal.relocate(25+4*buttonwidth,5*buttonheight+25);
		
		   closePar.relocate(30+5*buttonwidth,3*buttonheight+15);
		   squareRoot.relocate(30+5*buttonwidth,4*buttonheight+20);
		   reset.relocate(30+5*buttonwidth,2*buttonheight+10);
		   	reset.setPrefSize(buttonwidth, buttonheight);
		   	
        root.getChildren().add(equal);
        
        Scene scene = new Scene(root,widthlistner,heightlistner);
     
        primaryStage.setTitle(" Calculator");
     
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
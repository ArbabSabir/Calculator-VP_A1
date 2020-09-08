package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {
    private BorderPane root;
    private HBox hBox1,hBox2,hBox3,hBox4,hBox5,hBox6;
    private VBox vBox;
    private Label resultLb;

    private  Button btnc,btnxp2,btnsqrt,btnde,btn7,btn8,btn9,btnmu,btn4,btn5,btn6,btnab,btn1,btn2,btn3,btnpl,btnruff,btn0,btndo,btneq;

    double temp;
    boolean plus,minis,divid,multi;

    @Override
    public void start(Stage primaryStage) throws Exception{
        plus=false;
        minis=false;
        divid=false;
        multi=false;

        hBox1 = new HBox();
        hBox2 = new HBox();
        hBox3 = new HBox();
        hBox4 = new HBox();
        hBox5 = new HBox();
        hBox6 = new HBox();
        resultLb= new Label("0");
        vBox = new VBox();
        root = new BorderPane();
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnc = new Button("C");
        btnde= new Button("/");
        btnmu=new Button("X");
        btndo = new Button(".");
        btnpl = new Button("+");
        btnab = new Button("-");
        btnruff = new Button("+/-");
        btnxp2 = new Button("X^2");
        btnsqrt = new Button("Sqrt");
        btneq = new Button("=");
        AtomicReference<Double> temp = new AtomicReference<>((double) 0);


        resultLb.setFont(new Font(40));

        btn1.setPrefWidth(120);
        btn1.setPrefHeight(60);

        btn2.setPrefWidth(120);
        btn2.setPrefHeight(60);

        btn3.setPrefWidth(120);
        btn3.setPrefHeight(60);

        btn4.setPrefWidth(120);
        btn4.setPrefHeight(60);

        btn5.setPrefWidth(120);
        btn5.setPrefHeight(60);

        btn6.setPrefWidth(120);
        btn6.setPrefHeight(60);

        btn7.setPrefWidth(120);
        btn7.setPrefHeight(60);

        btn8.setPrefWidth(120);
        btn8.setPrefHeight(60);

        btn9.setPrefWidth(120);
        btn9.setPrefHeight(60);

        btn0.setPrefWidth(120);
        btn0.setPrefHeight(60);

        btnc.setPrefWidth(120);
        btnc.setPrefHeight(60);

        btnde.setPrefWidth(120);
        btnde.setPrefHeight(60);

        btnruff.setPrefWidth(120);
        btnruff.setPrefHeight(60);

        btnde.setPrefWidth(120);
        btnde.setPrefHeight(60);

        btnmu.setPrefWidth(120);
        btnmu.setPrefHeight(60);

        btnab.setPrefWidth(120);
        btnab.setPrefHeight(60);

        btnpl.setPrefWidth(120);
        btnpl.setPrefHeight(60);

        btneq.setPrefWidth(120);
        btneq.setPrefHeight(60);

        btndo.setPrefWidth(120);
        btndo.setPrefHeight(60);

        btnsqrt.setPrefWidth(120);
        btnsqrt.setPrefHeight(60);

        btnxp2.setPrefWidth(120);
        btnxp2.setPrefHeight(60);

        hBox1.getChildren().addAll(resultLb);
        hBox1.setAlignment(Pos.BASELINE_RIGHT);
        hBox2.getChildren().addAll(btnc,btnxp2,btnsqrt,btnde);
        hBox3.getChildren().addAll(btn7,btn8,btn9,btnmu);
        hBox4.getChildren().addAll(btn4,btn5,btn6,btnab);
        hBox5.getChildren().addAll(btn1,btn2,btn3,btnpl);
        hBox6.getChildren().addAll(btnruff,btn0,btndo,btneq);

        vBox.getChildren().addAll(hBox1,hBox2,hBox3,hBox4,hBox5,hBox6);
        root.setCenter(vBox);

        OnClick(btn1,"1");
        OnClick(btn2,"2");
        OnClick(btn3,"3");
        OnClick(btn4,"4");
        OnClick(btn5,"5");
        OnClick(btn6,"6");
        OnClick(btn7,"7");
        OnClick(btn8,"8");
        OnClick(btn9,"9");
        OnClick(btndo,".");
        OnClick(btn0,"0");
        OnClickAc(btnc,"C");
        OnClickAc(btnmu,"X");
        OnClickAc(btnde,"/");
        OnClickAc(btnab,"-");
        OnClickAc(btnpl,"+");
        OnClickAc(btneq,"=");
        OnClickAc(btnsqrt,"sqrt");
        OnClickAc(btnxp2,"xp2");





        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator - 181380037- M Arbab Sabir");
        primaryStage.show();

    }

    void OnClick(Button btn,String str){
        btn.setOnAction(e->{
            String label=resultLb.getText();


            if(label.equals("0")){
                resultLb.setText(str);
            }
            else {
                resultLb.setText(label + str);
            }
        });

    }

    void OnClickAc(Button btn,String str){
        btn.setOnAction(e->{

            if(str.equals("+")){
                temp=Double.parseDouble(resultLb.getText());
                resultLb.setText("");
                plus=true;

            }
            else if (str.equals("-")){
                temp=Double.parseDouble(resultLb.getText());
                resultLb.setText("");
                minis=true;

            }
            else if (str.equals("/")){
                temp=Double.parseDouble(resultLb.getText());
                resultLb.setText("");
                divid=true;

            }
            else if (str.equals("X")){
                temp=Double.parseDouble(resultLb.getText());
                resultLb.setText("");
                multi=true;

            }

            else if (str.equals("sqrt")){
                temp=Double.parseDouble(resultLb.getText());
                double ans=Math.sqrt(temp);
                resultLb.setText(""+ans);


            }
            else  if (str.equals("xp2")){
                temp=Double.parseDouble(resultLb.getText());
                double ans=Math.pow(2,temp);
                resultLb.setText(""+ans);
            }
            else if (str.equals("C")){
                resultLb.setText("0");
                plus=false;
                minis=false;
                divid=false;
                multi=false;
            }
            else if (str.equals("=")){
                if(plus==true){

                    double second=Double.parseDouble(resultLb.getText());
                    double ans=temp+second;
                    resultLb.setText(""+ans);
                }
                else  if (minis==true){
                    double second=Double.parseDouble(resultLb.getText());
                    double ans=temp-second;
                    resultLb.setText(""+ans);
                }
                else  if (multi==true){
                    double second=Double.parseDouble(resultLb.getText());
                    double ans=temp*second;
                    resultLb.setText(""+ans);
                }
                else  if (divid==true) {
                    double second = Double.parseDouble(resultLb.getText());
                    double ans = temp / second;
                    String infinti = ""+ans;
                    if (infinti.equals("Infinity")){
                        resultLb.setText("0");
                    }
                    else {
                        resultLb.setText(infinti);
                    }
                }
            }






        });

    }



    public static void main(String[] args) {
        launch(args);
    }
}

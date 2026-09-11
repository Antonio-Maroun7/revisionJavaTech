package com.amigoscode.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Hello1Controller {

    @FXML
    private Label msgText;

    @FXML
    protected void onGreetingButtonClick(ActionEvent event){
          String lbl =((Button)event.getTarget()).getText();
          if(lbl.equals("Hello")){
               msgText.setText("Welcome To Our Website");
          }else{
               msgText.setText("Have a Safe Trip");
          }
    }

}

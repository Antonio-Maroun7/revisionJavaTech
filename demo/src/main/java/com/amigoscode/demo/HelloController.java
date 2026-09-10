package com.amigoscode.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label msgText;

    @FXML
 protected  void onGreetingButtonClick(ActionEvent event){
    String lbl =((Button)event.getTarget()).getText();
       if(lbl.equals("Hello!")){
           msgText.setText("Welcome To our Website");
       }else{
           msgText.setText(("Have a Safe Trip"));
       }
    }
}

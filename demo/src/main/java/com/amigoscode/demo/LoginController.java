package com.amigoscode.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField PasswordField;

    @FXML
   private Label msgLabel;

    @FXML
   private void handleLogin(){
   String userName = userNameField.getText();
   String password = PasswordField.getText();

   if(userName.equals("Antonio") && password.equals("1234")){
       msgLabel.setText("Login successful!");
   }else{
       msgLabel.setText("Invalid UserName or password");
   }
    }

    @FXML
    private void handleClear(){
        userNameField.clear();
        PasswordField.clear();
        msgLabel.setText("");
    }

}

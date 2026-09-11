package com.amigoscode.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField PasswordField;

    @FXML
   private Label msgLabel;

    @FXML
   private void handleLogin() throws IOException {
   String userName = userNameField.getText();
   String password = PasswordField.getText();

   if(userName.equals("Antonio") && password.equals("1234")){
      SceneManager.switchScene("home-view.fxml");
   }else{
       msgLabel.setText("Invalid UserName or password");
      SceneManager.switchScene("registartion-view.fxml");

   }
    }

    @FXML
    private void handleRegister()throws IOException{
        SceneManager.switchScene("register-view.fxml");
    }


    @FXML
    private void handleClear(){
        userNameField.clear();
        PasswordField.clear();
        msgLabel.setText("");
    }

}

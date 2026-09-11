package com.amigoscode.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class RegisterController {
    @FXML
    private TextField FirstNameField;

    @FXML
    private TextField LastNameField;
    @FXML
    private TextField UserNameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ToggleGroup genderToggleGroup;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private DatePicker birthdayPicker;

    @FXML
    private  Label msgLabel;

    @FXML
    private void handleRegistration(){
        String firstName = FirstNameField.getText().trim();
        String lastName = LastNameField.getText().trim();
        String userName = UserNameField.getText().trim();
        String gender = getSelectedGender();
        String password = passwordField.getText();
        LocalDate birthdayDate = birthdayPicker.getValue();

        if(firstName.isEmpty() || lastName.isEmpty() || userName.isEmpty() ||
                password.isEmpty() || birthdayDate == null){
            msgLabel.setText("Please fill in all these fields!");
            return;
        }
        if(password.length() < 4){
            msgLabel.setText("Password must be at least 4 characters!");
            return;
        }
        if(gender == null){
            msgLabel.setText("Please select your gender!");
            return;
        }
            msgLabel.setText("Registration completed\n"+"Welcome " + firstName + " " + lastName + ", you are registered!");




    }
    @FXML
    public  void clear(){
        FirstNameField.clear();
        LastNameField.clear();
        UserNameField.clear();
        passwordField.clear();

        birthdayPicker.setValue(null);
        genderToggleGroup.selectToggle(null);
        msgLabel.setText("");


    }
    @FXML
    private String getSelectedGender(){
        RadioButton selected = (RadioButton) genderToggleGroup.getSelectedToggle();
        return selected == null ? null : selected.getText();
    }



}

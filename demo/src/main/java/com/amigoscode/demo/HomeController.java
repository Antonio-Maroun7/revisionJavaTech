package com.amigoscode.demo;

import javafx.fxml.FXML;

import java.io.IOException;

public class HomeController {

    @FXML
    private void handleLogout() throws IOException {
        SceneManager.switchScene("login-view.fxml");
    }

    @FXML
    private void handleStudent() throws  IOException{
        SceneManager.switchScene("students-view.fxml");
    }

    @FXML
    private  void handleCourses() throws  IOException{
        System.out.println("Handle Courses clicked");
    }

    @FXML
    private void handleReports()throws IOException{
        System.out.println("Handle Reports clicked");
    }
}

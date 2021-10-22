package ru.mirea.task8.t2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String adress = in.next();

        in.close();

        FileInputStream inputstream = new FileInputStream(adress);
        Image image = new Image(inputstream);
            //C:\Users\DENIS\Pictures\2.jpg



        ImageView imageView = new ImageView(image);

        Group root = new Group(imageView);

        Scene scene = new Scene(root ,320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {


        launch();
    }
}
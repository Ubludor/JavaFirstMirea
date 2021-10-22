package ru.mirea.task8.t1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.concurrent.ThreadLocalRandom;

public class Main extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Canvas canvas = new Canvas(800,600);
        GraphicsContext context=canvas.getGraphicsContext2D();

        drawShapes(context);

        Group group = new Group();
        Scene scene = new Scene(group,800,600);

        group.getChildren().add(canvas);

        primaryStage.setTitle("Different shapes");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc){



        for(int i=0;i<20;i++) {
            int rand= ThreadLocalRandom.current().nextInt(0, 2);
            int x = ThreadLocalRandom.current().nextInt(0, 600);
            int y = ThreadLocalRandom.current().nextInt(0, 600);
            int w =  ThreadLocalRandom.current().nextInt(10, 100);
            int h =  ThreadLocalRandom.current().nextInt(10, 100);
            int red= ThreadLocalRandom.current().nextInt(0, 255);
            int blue=ThreadLocalRandom.current().nextInt(0, 255);
            int green=ThreadLocalRandom.current().nextInt(0, 255);
            gc.setFill(Color.rgb(red,green,blue));
            if(rand==0) {

                gc.fillRoundRect(x,y,w,h,0,0);
            }
            else
            {
             gc.fillOval(x,y,w,h);
            }

        }
    }
}
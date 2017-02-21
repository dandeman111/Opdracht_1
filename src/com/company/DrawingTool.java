package com.company;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/**
 * Created by dande on 21-2-2017.
 */
public class DrawingTool extends Application {

    private Canvas canvas;
    private JavaFxPaintable javaFxPaintable;
    private Drawing drawing;
    private GraphicsContext gp;

    public DrawingTool(Drawing drawing) {
        this.canvas = new Canvas();
        gp = canvas.getGraphicsContext2D();
        this.javaFxPaintable = new JavaFxPaintable(gp);
        this.drawing = drawing;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }


}

package com.company;

public class Main {

    public static void main(String[] args) {
     Drawing d = new Drawing("Drawing1");

     d.addDrawingItem(new Oval(new Point(1,1),10,10,1, Color.GREEN));
     Point[] vertices = new Point[5];
     vertices[0] = new Point(1,1);
        vertices[1] = new Point(10,13);
        vertices[2] = new Point(11,14);
        vertices[3] = new Point(12,15);
        vertices[4] = new Point(13,15);

     d.addDrawingItem(new Polygon(vertices,2,vertices[0],13,15, Color.BLUE));

     d.addDrawingItem(new PaintedText("Test","Arial",new Point(1,1),10,10, Color.BLACK));

     d.addDrawingItem(new Image(new Point(1,1),10,10));

        System.out.println(d.toString());
    }
}

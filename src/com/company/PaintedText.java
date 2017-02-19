package com.company;

/**
 * Created by dande on 14-2-2017.
 */
public class PaintedText extends DrawingItem {
    private String content;
    private String fontName;
    private Point anchor;
    private double width;
    private double height;

    public PaintedText(String content, String fontName, Point anchor, double width, double height, Color color) {
        this.content = content;
        this.fontName = fontName;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        super.color = color;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Point getAnchor() {
        return anchor;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public String toString(){
        return anchor.toString() + " painted text "+ color;
    }
}

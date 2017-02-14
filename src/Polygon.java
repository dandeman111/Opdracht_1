/**
 * Created by dande on 14-2-2017.
 */
public class Polygon extends DrawingItem {
    private Point[] vertices;
    private double weight;

    @Override
    public Point getAnchor() {
        return null;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

}

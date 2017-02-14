import com.company.Color;

/**
 * Created by dande on 14-2-2017.
 */
public abstract class DrawingItem {
    private Color color;
    private DrawingItem previousState;

    public DrawingItem getPreviousState() {
        return previousState;
    }

    public void setPreviousState(DrawingItem previousState) {
        this.previousState = previousState;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract public Point getAnchor();
    abstract public double getWidth();
    abstract public double getHeight();

}

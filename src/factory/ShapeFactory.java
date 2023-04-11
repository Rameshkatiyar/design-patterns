package factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        switch (type) {
            case "circle": return new Circle();
            case "square": return new Square();
            default: return null;
        }
    }
}

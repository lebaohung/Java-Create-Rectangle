public class Rectangle {
    double width, height;

    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(double width, double height) {
        return width * height;
    }

    public double getParameter(double width, double height) {
        return 2 * (width + height);
    }

    public void display() {
        System.out.printf("The Rectangle with " +
                        "width " + width
                        + " and height " + height
                        + ", has area is " + getArea(width, height)
                        + ", and parameter is " + getParameter(width,height));
    }
}

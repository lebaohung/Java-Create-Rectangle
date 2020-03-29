import java.util.Scanner;
public class testRectangle {
    static double width;
    static double height;

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter width : ");
        width = scanner.nextDouble();
        System.out.print("Please enter height : ");
        height = scanner.nextDouble();
    }

    public static void main(String[] args) {
        inputData();
        Rectangle newRectangle = new Rectangle(width,height);
        newRectangle.display();
    }
}

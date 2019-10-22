package interfaceResizeable;

public class mainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Square(4, "blue", false);

        for (int i = 0 ;i<shapes.length;i++){
            System.out.println(shapes[i]);
            shapes[i].resize(getRandom()/100);

        }
    }

    public static int getRandom() {
        return (int) (Math.random() * 100) + 1;

    }
}

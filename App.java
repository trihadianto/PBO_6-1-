import bangundatar.*;
import shape.*;

public class App {
    public static void main(String[] args) {
        Persegi A = new Persegi(5);
        Square B = new Square(10);

        A.getInfo();
        A.setPaper();
        A.print();
        B.getInfo();
        B.setPaper();
        B.print();
    }
}

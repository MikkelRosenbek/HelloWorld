package objects;

public class RectangleRun {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
            room1.setWidth(15);
            room1.setLength(30);
            double areaRoom1 = room1.calculateArea();
        System.out.println(areaRoom1);

            Rectangle room2 = new Rectangle(25,65);
            double areaRoom2 = room2.calculateArea();
        System.out.println(areaRoom2);




    }
}

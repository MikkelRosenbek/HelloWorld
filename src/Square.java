public class Square {
    double sideLenOne;
    double sideLenTwo;

    public Square(double sideLenOne, double sideLenTwo) {
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
    }
    public double findArea() {
        return sideLenOne * sideLenTwo;
    }
    public void hvilkenSlagsFirkant() {
        if (sideLenOne==sideLenTwo){
            System.out.println("Det er kvadrat");
        } else {
            System.out.println("Det er et rektangel");
        }
}
}

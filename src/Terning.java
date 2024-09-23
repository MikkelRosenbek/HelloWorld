import java.util.Random;

public class Terning {

    private final int MAX = 6;
    private int faceValue;
    Random randomGenerator = new Random();

    public Terning() {
        faceValue = randomGenerator.nextInt(MAX)+1;
    }

    public void roll() {
        faceValue = randomGenerator.nextInt(MAX)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }

}

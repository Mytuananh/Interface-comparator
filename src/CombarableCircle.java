import java.util.Arrays;

public class CombarableCircle {
    public static void main(String[] args) {
    CCircle[] cCircles = new CCircle[3];
    cCircles[0] = new CCircle(3.6);
    cCircles[1] = new CCircle();
    cCircles[2] = new CCircle("blue", false, 3.5);
        System.out.println("Pre-sorted:");
        for (CCircle cCircle: cCircles) {
            System.out.println(cCircle);
        }
        Arrays.sort(cCircles);

        System.out.println("After-sorted:");
        for (CCircle cCircle: cCircles) {
            System.out.println(cCircle);
        }
    }
}

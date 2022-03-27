import static java.lang.Math.*;

public class D_TestRadDegreeSinCos {
    // menggunakan fungsi toDegrees(), toRadians(). sin(), dan cos()
    public static void main(String[] args) {
        //value of PI in degrees
        double rad = PI;
        System.out.println(toDegrees(rad));
        //value of PI/2 in degrees
        rad = PI / 2;
        System.out.println(toDegrees(rad));
        //value of PI/3 in degrees
        rad = PI / 3;
        System.out.println(toDegrees(rad));
        //value of PI/4 in degrees
        rad = PI / 4;
        System.out.println(toDegrees(rad));
        System.out.println("Sin 90 derajat adalah" + sin(toRadians(90)));
        System.out.println("Cos 60 derajat adalah " + cos(toRadians(60)));

    }
}
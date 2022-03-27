import static java. lang. Math .round;
public class A_TestRound {
 public static void main(String[] args) {
     //: membulatkan ke desimal terdekat menggunakan [ungsi round
     double varDouble = 2.73;
     long roundResult = round(varDouble);
     System.out.printf("Pembulatan round %.2f adalah %d\n", varDouble, roundResult);
     varDouble = 2.49;
     roundResult = round(varDouble);
     System.out.printf("pembulatan floor %.2f adalah %d\n", varDouble, roundResult);
 }

    }

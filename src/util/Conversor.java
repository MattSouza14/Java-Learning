package util;

public class Conversor {
    public static final double IOF = 6.0;

    public static double DolarToReal(double DolarValue, double DolarQuantity) {
        double Result = DolarValue * DolarQuantity * (1 + (IOF / 100));

        return Result;
    }
//teste

}

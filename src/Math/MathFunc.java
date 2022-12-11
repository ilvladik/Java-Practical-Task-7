package Math;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double val, double degree) {
        return Math.pow(val, degree);
    }

    @Override
    public double absComplex(double a, double b) {
        return Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
    }

    @Override
    public double PI() {
        return Math.PI;
    }

    public double calcSquare(double x) {
        return PI() * pow(x, 2);
    }
}

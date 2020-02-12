public class Complex {
    private double one;
    private double two;
    public Complex(double a){
        one = a;
        two = 0.0;
    }
    public Complex(double a, double b){
        one = a;
        two = b;
    }
    public double abs(){
        double c = Math.sqrt((one*one) + (two*two));
        return c;
    }
}

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
        return Math.sqrt((one*one) + (two*two));
    }
    public Complex add(Complex other){
        double a = other.one;
        double b = other.two;
        double c = one + a;
        double d = two + b;
        Complex e = new Complex(c,d);
        return e;
    }
    public String toString(Complex other){
        double a = other.one;
        double b = other.two;
        String c = a + "+" + b + "i";
        return c;
    }
    public static void main(String[] args){
        Complex test = new Complex(3,2);
        System.out.println(test.abs());
        Complex test2 = new Complex(3);
        System.out.println(test2.abs());
        Complex test3 = new Complex(4,2);
        System.out.println(test.toString());
        System.out.println(test2.toString());
        System.out.println(test.add(test2));
        System.out.println(test3.add(test2));
    }
}


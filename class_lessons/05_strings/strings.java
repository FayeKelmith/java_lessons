import java.math.*;

class Complex{
    private double a,b;

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Complex(double a){
        this(a,0);
    }

    public Complex(){
        this(0,0);
    }

    double[] getNumber(){

        return new double[]{this.a, this.b};
    }
}
class Strings{
    public static void main(String[] args){
        String name = "John";
        String anotherName = new String("John");
        System.out.println(name.equals(anotherName));

        System.out.println(new BigDecimal("2.3458", new  MathContext(2)));
    }
}
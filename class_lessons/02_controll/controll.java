class Bicycle{

    public int gear;
    public int speed;

    public static void identifier(){
        System.out.println("Static function in Bicycle");
    }

    Bicycle(int gear, int speed){
        System.out.println("Bicycle created");
        this.gear = gear;
        this.speed = speed;
    }

    public void braking(int decrement){
        speed -= decrement;
    }

    public void accelerate(int increment){
        speed += increment;
    }
}
class Control{
    public static void main(String[] args){
        System.out.println("Hello world");
        Bicycle bike = new Bicycle(0, 0);
        bike.accelerate(10);
        System.out.println(bike.speed);
        Bicycle.identifier();
    }
}
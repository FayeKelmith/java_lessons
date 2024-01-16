class Lamp{
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Light is ON");
    }

    void turnOff(){
        isOn = false;
        System.out.println("Light is OFF");
    }
}
class OOP{

    public static void main(String args[]){

        Lamp lamp = new Lamp();
        //System.out.println("OOP time");

        lamp.turnOn();

        if(lamp.isOn == true)
            System.out.println("Lamp is on");
        else    
            System.out.println("Lamp is off");
    }
}